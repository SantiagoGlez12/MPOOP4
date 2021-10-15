class Main {
  public static void main(String[] args) {
    
    Coche coche1 = new Coche();
    coche1.anio = 2020;
    coche1.automatico = true;
    coche1.color = "blanco";
    coche1.marca = "Nissan";
    coche1.numPuertas = 5;
    coche1.potencia = 150;
    coche1.encender();
    coche1.avanzar(true);
    coche1.frenar(true);
    coche1.apagar();
    coche1.abrirPuertas(6);
    System.out.println("*********");
    Coche coche2 = new Coche("Mazda", 2021, "negro", 3, false, 200);
    coche2.encender();
    coche2.avanzar(false);
    coche2.frenar(false);
    coche2.apagar();
    coche2.abrirPuertas(5);

    System.out.println("*********");
    System.out.println(coche1);
    System.out.println(coche2);

    System.out.println("*********");
    Perro perro1 = new Perro("Rex",(float) 5.8, 2, 6, "Chihuahua", false); //-> to cast / casteo
    Perro perro2 = new Perro("Firulais", 6.4f, 6, 10, "Puddle", true);
    System.out.println(perro1);
    System.out.println(perro2);

    System.out.println("*********");
    Profesor profesor1 = new Profesor("Juan", "Doctor", "Algebra", 65, true);
    profesor1.darClase(true);
    profesor1.horas(3);
    profesor1.calificando("tareas");
    profesor1.escribir();
    profesor1.calificacion(6.6f);
    System.out.println(profesor1);
    
  }
}
