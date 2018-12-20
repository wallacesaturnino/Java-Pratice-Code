public class Catraca implements ControladorEntrada{
  private static final String COD = "XPTO";
  private Clube clube;
  
  Catraca(Clube clube) {
    this.clube = clube;
  }
  
  public boolean entrada(Pessoa pessoa) {
    
    if(identificar(pessoa).equals(this.COD+pessoa.toString()) &&
        clube.adicionarVisitante(pessoa)) {
      return true;
    }
    return false;
  }
  
  public boolean entrada(Animal animal) {
    if(identificar(animal).equals(this.COD+animal.toString()) &&
        clube.adicionarAnimal(animal)) {
      return true;
    }
    return false;
  }
  
  public boolean saida(Pessoa pessoa) {
    return clube.removerVisitante(pessoa);
  }
    
  public boolean saida(Animal animal) {
    return clube.removerAnimal(animal);
  }
  
  public String identificar(Pessoa pessoa) {
    if(pessoa.getVinculo() == TipoVinculo.SC) {
      if(clube.getSocios().contains(pessoa)) {
        return this.COD+pessoa.toString();
      }
      return pessoa.toString();
    }
    
    if(clube.getSocios().contains(pessoa.getSocio())) {
      return this.COD+pessoa.toString();
    }
    return pessoa.toString();
  }
  
  public String identificar(Animal animal) {
    if(clube.getSocios().contains(animal.getSocio())) {
      return this.COD+animal.toString();
    }
    return animal.toString();
  }
}