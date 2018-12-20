public class Animal {
  private Pessoa socio;
  private TipoAnimal tipo;
  private String identificacao;
  
  Animal(Pessoa socio, TipoAnimal tipo) {
    this.socio = socio;
    this.tipo = tipo;
    socio.adicionarAnimal(this);
  }
  
  public void setIdentificacao(String id) {
    if(id.length() != 2) {
      System.out.println("Id do Animal deve ser de 2 caracteres!");
    } else {
      this.identificacao = id;
    }
  }
  
  public String getIdentificacao() {
    return this.identificacao;
  }
  
  public Pessoa getSocio() {
    return this.socio;
  }
  
  public boolean equals(Object obj) {
    Animal outro = (Animal) obj;
    return this.identificacao.equals(outro.getIdentificacao());
  }
  
  public String toString() {
    return this.socio.getIdentificacao()+"A"+this.identificacao;
  }
  
  
}