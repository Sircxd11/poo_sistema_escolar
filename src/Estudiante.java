public class Estudiante extends Person {
    private String idEstudiante;
    private String programaAcademico;

    public Estudiante(String nombre, int edad, String idEstudiante, String programaAcademico) {
        super(nombre, edad);
        this.idEstudiante = idEstudiante;
        this.programaAcademico = programaAcademico;
    }

    @Override
    public void yourself() {
        super.yourself();
        System.out.println("Estoy cursando la carrera de " + programaAcademico + " y mi ID es " + idEstudiante + ".");
    }
}
