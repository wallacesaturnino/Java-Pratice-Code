import java.util.ArrayList;
import java.util.List;

public class Pessoa {
  private Pessoa socio;
  private List<Pessoa> dependentes;
  private int countDependentes;
  private List<Animal> animais;
  private int countAnimais;
  private TipoVinculo vinculo;
  private String identificacao;
  
  public Pessoa(TipoVinculo vinculo) {
    dependentes = new ArrayList();
    animais = new ArrayList();
    this.vinculo = vinculo;
  }
  
  public Pessoa(TipoVinculo vinculo, Pessoa socio) {
    dependentes = new ArrayList();
    animais = new ArrayList();
    this.vinculo = vinculo;
    this.socio = socio;
    socio.adicionarDependente(this);
  }
  
  public void setIdentificacao(String id) {

    switch(this.vinculo) {
    case SC :
        if(id.length() != 8) {
          System.out.println("Id do sócio deve ser de 8 caracteres!");
          break;
        } else {
          this.identificacao = id;
        }
    break;
    case CV :
        if(id.length() != 11) {
          System.out.println("Id do convidado deve ser de um CPF de 11 caracteres!");
          break;
        } else {
          this.identificacao = id;
        }
    break;
    case DP :
        if(id.length() != 4) {
          System.out.println("Id do dependente deve ser de 4 caracteres!");
          break;
        } else {
          this.identificacao = id;
        }
    break;
    }
  }
  
  public String getIdentificacao() {
    return this.identificacao;
  }
  
  public boolean adicionarDependente(Pessoa dependente) {
    if(this.countDependentes < 10) {
      this.dependentes.add(dependente);
      this.countDependentes++;
      return true;
    }
  return false;
  }
  
  public List<Pessoa> consultarDependentes() {
    return this.dependentes;
  }
  
  public boolean adicionarAnimal(Animal animal) {
    if(this.countAnimais < 5) {
      this.animais.add(animal);
      this.countAnimais++;
      return true;
    }
  return false;
  }
  
  public List<Animal> consultarAnimais() {
    return this.animais;
  }
  
  public boolean equals(Object obj) {
    Pessoa outra = (Pessoa) obj;
    return this.identificacao.equals(outra.getIdentificacao());
  }
  
  public Pessoa getSocio() {
    return this.socio;
  }
  
  public TipoVinculo getVinculo() {
    return this.vinculo;
  }
  
  public String toString() {
    switch(this.vinculo) {
    case SC :
      return this.identificacao;
    case CV :
      return this.socio.getIdentificacao()+"C"+this.identificacao;
    default :
      return this.socio.getIdentificacao()+"D"+this.identificacao;
    }
  }
}