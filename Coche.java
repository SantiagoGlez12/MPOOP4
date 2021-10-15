class Coche{
  //Seccion de atributos
  String color;
  String marca;
  int numPuertas;
  int anio;
  int potencia;
  boolean automatico;
  //Seccion de constructores
  public Coche(){

  }
  public Coche(String marca, int anio, String color, int numPuertas, boolean automatico, int potencia){
    this.marca = marca;
    this.anio = anio;
    this.color = color;
    this.numPuertas =  numPuertas;
    this.automatico = automatico;
    this.potencia = potencia;
  }
  //Seccion de metodos
  public void encender(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy encendiendo");
  }

  public void avanzar(boolean avanza){
    if(avanza){
      System.out.println("Estoy avanzando a 10 km/h");
    }else{
      System.out.println("Voy a 0 km/h");
    }
  }

  public void apagar(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy apagadome");
  }

  public void frenar(boolean frena){
    if (frena){
      System.out.println("Estoy frenando");
    }else{
      System.out.println("No estoy frenando");
    }
  }

  public void abrirPuertas(int numPuertasAAbrir){
    if(numPuertasAAbrir > numPuertas){
      System.out.println("El numero de puertas a abrir es mayor al numero de puertas del coche");
    }else{
      System.out.println("Abriendo "+numPuertasAAbrir+" puertas");
    }
  }

  @Override
  public String toString(){
    return "Coche{"+"marca="+marca+" anio="+anio+" color="+color+" numPuertas="+numPuertas+" automatico"+automatico+" potencia="+potencia+"}";
  }
}
