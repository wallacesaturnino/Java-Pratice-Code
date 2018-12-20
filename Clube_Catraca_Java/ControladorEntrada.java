public interface ControladorEntrada {
  
  public boolean entrada(Pessoa pessoa);
  public boolean entrada(Animal animal);
  public boolean saida(Pessoa pessoa);
  public boolean saida(Animal animal);
  public String identificar(Pessoa pessoa);
  public String identificar(Animal animal);
  
}