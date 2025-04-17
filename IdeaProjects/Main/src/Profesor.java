public class Profesor extends Person {
    private String especialidad;
    private String grupoAsignado;

    public Profesor(String nombre, int edad, String especialidad, String grupoAsignado) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.grupoAsignado = grupoAsignado;
    }

    @Override
    public void yourself() {
        super.yourself();
        System.out.println("Soy profesor de " + especialidad + " y estoy asignado al grupo " + grupoAsignado + ".");
    }
}