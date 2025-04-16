public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Cristian Eduardo Trujillo Martínez", 20, "2470242", "Ingeniería en Sistemas Inteligentes");
        Profesor profesor = new Profesor("Ricardo Roman Cuevas", 30, "Programación Orientada a Objetos", "I2");

        estudiante.yourself();
        System.out.println();
        profesor.yourself();
    }
}