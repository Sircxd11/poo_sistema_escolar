public class Main {
    public static void main(String[] args) {
        Estudiante alumno = new Estudiante("Marcus Kaleb Garces Pagovich", 20, "2470229", "Ingeniería en Sistemas Inteligentes");
        Profesor docente = new Profesor("Cuevas Ricardo Román", 30, "POO (Programación Orientada a Objetos)", "Grupo I2");

        System.out.println("Información del estudiante:");
        alumno.yourself();

        System.out.println("\nInformación del profesor:");
        docente.yourself();
    }
}
