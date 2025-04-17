public class Estudiante extends Person {
    private String matricula;
    private String carrera;

    public Estudiante(String nombre, int edad, String matricula, String carrera) {
        super(nombre, edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    @Override
    public void yourself() {
        super.yourself();
        System.out.println("Estudio " + carrera + " y mi matrícula es " + matricula + ".");
    }
}