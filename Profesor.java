class Profesor{
  String nombre;
  String titulo;
  String materia;
  int edad;
  boolean dificil;

  public Profesor(){}
  
  public Profesor(String nombre, String titulo, String materia, int edad, boolean dificil){
    this.nombre = nombre;
    this.titulo = titulo;
    this.materia = materia;
    this.edad = edad;
    this.dificil = dificil;
  }

  public void darClase(boolean clase){
    if (clase){
      System.out.println("Soy "+nombre+" y estoy dando clase de "+materia);
    }else{
      System.out.println("No estoy dando clase de "+materia);
    }
  }

  public void horas(int horas){
    System.out.println("Soy el profesor y he dado "+horas+" horas de clase");
  }

  public void calificando(String calificando){
    System.out.println("Estoy calificando "+calificando);
  }

  public void escribir(){
    System.out.println("Estoy escribiendo en el pizarron");
  }

  public void calificacion(float promedio){
    System.out.println("El promedio de mi clase de "+materia+" fue "+promedio);
  }

  @Override
  public String toString(){
    return "Profesor{"+"nombre="+nombre+" titulo="+titulo+" materia ="+materia+" edad ="+edad+" dificultad="+dificil+"}";
  }

}
