import java.util.ArrayList;
import java.util.List;

public class Clube {
  private List<Pessoa> socios;
  private List<Pessoa> visitantes;
  private List<Animal> animais;
  private static final int CAPACIDADE_PESSOA = 1000;
  private static final int CAPACIDADE_ANIMAL = 100;
  private int lotacaoPessoa;
  private int lotacaoAnimal;
  
  Clube() {
    socios = new ArrayList();
    visitantes = new ArrayList();
    animais = new ArrayList();
  }
  
  public boolean adicionarVisitante(Pessoa visitante) {
    if(this.lotacaoPessoa < this.CAPACIDADE_PESSOA) {
      this.visitantes.add(visitante);
      this.lotacaoPessoa++;
      return true;
    }
    return false;
  }
  
  public boolean removerVisitante(Pessoa visitante) {
    if(this.visitantes.contains(visitante)) {
      this.visitantes.remove(visitante);
      this.lotacaoPessoa--;
      return true;
    }
  return false;
  }
  
  public List<Pessoa> getVisitantes() {
    return this.visitantes;
  }
  
  public boolean adicionarAnimal(Animal animal) {
    if(this.lotacaoAnimal < this.CAPACIDADE_ANIMAL) {
      this.animais.add(animal);
      this.lotacaoAnimal++;
      return true;
    }
  return false;
  }
  
  public boolean removerAnimal(Animal animal) {
    if(this.animais.contains(animal)) {
      this.animais.remove(animal);
      this.lotacaoAnimal--;
      return true;
    }
  return false;
  }
  
  public List<Animal> getAnimais() {
    return this.animais;
  }
  
  public void adicionarSocio(Pessoa socio) {
    this.socios.add(socio);
  }
  
  public void removerSocio(Pessoa socio) {
    this.socios.remove(socio);
  }
  
  public List<Pessoa> getSocios() {
    return this.socios;
  }
}