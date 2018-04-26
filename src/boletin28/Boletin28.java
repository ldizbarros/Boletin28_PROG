package boletin28;

public class Boletin28 {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Pepe",8, "A Estrada", 15);
 
        alumno1.amosar();
        alumno1.cambiarNota(9);
        alumno1.cambiarNumero(20);
        alumno1.amosar();
    }
}
