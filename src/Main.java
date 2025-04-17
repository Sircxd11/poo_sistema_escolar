public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Jose Emmanuel Guerrero Ramirez", 18, "2470231", "Ingeniería en Sistemas Inteligentes");
        Profesor profesor = new Profesor("Ricardo Roman Cuevas", 30, "Programación Orientada a Objetos", "I2");

        estudiante.yourself();
        System.out.println();
        profesor.yourself();
    }
}
