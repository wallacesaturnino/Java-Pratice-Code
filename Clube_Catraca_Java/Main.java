public class Main {
  public static void main(String[] args) {
    Clube clube = new Clube();
    Catraca ctr = new Catraca(clube);
    
    Pessoa sc1 = new Pessoa(TipoVinculo.SC);
    Pessoa sc2 = new Pessoa(TipoVinculo.SC);
    sc1.setIdentificacao("a1s2d3d4");
    sc2.setIdentificacao("a4s3d2f1");
    
    clube.adicionarSocio(sc1);
    clube.adicionarSocio(sc2);
    
    Pessoa dp1 = new Pessoa(TipoVinculo.DP, sc1);
    dp1.setIdentificacao("a1s2");
    
    Animal an1 = new Animal(sc2, TipoAnimal.GT);
    an1.setIdentificacao("A1");
    
    
    if(ctr.entrada(sc1)) {
      System.out.println("Pessoa: "+sc1.toString()+" Entrou no clube.");
    }
    
    if(ctr.entrada(dp1)) {
      System.out.println("Pessoa: "+dp1.toString()+" Entrou no clube.");
    }
    
    if(ctr.entrada(an1)) {
      System.out.println("Animal: "+an1.toString()+" Entrou no clube.");
    }
    
    System.out.println("\nLista de Visitantes no Clube: ");
    for(Pessoa vs : clube.getVisitantes()) {
      System.out.println("  - "+vs.toString());
    }
    
    System.out.println("\nLista de Animais no clube: ");
    for(Animal an : clube.getAnimais()) {
      System.out.println("  - "+an.toString());
    }
    
    if(ctr.saida(sc2)) {
      System.out.println("Pessoa: "+sc2.toString()+" Saiu do Clube.");
    } else {
      System.out.println("Pessoa: "+sc2.toString()+" Não entrou no clube hoje.");
    }
    
    System.out.println("\nLista de Visitantes no Clube: ");
    for(Pessoa vs : clube.getVisitantes()) {
      System.out.println("  - "+vs.toString());
    }
    
    System.out.println("\nLista de Animais no clube: ");
    for(Animal an : clube.getAnimais()) {
      System.out.println("  - "+an.toString());
    }
    
  }
}