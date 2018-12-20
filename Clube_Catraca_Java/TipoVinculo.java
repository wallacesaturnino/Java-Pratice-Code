public enum TipoVinculo {
  SC("Sócio"), DP("Dependente"), CV("Convidado");
  
  public String vinculo;
  
  TipoVinculo(String vinculo) {
    this.vinculo = vinculo;
  }
}