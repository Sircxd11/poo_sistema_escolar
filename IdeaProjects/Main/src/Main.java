public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Garces Pagovich Marcus Kaleb", 20, "2470229", "ISI");
        Profesor profesor = new Profesor("Ricardo Roman Cuevas", 30, "Programación Orientada a Objetos", "I2");

        estudiante.yourself();
        System.out.println();
        profesor.yourself();
    }
}