public class Profesor extends Person {
    private String areaDocente;
    private String grupo;

    public Profesor(String nombre, int edad, String areaDocente, String grupo) {
        super(nombre, edad);
        this.areaDocente = areaDocente;
        this.grupo = grupo;
    }

    @Override
    public void yourself() {
        super.yourself();
        System.out.println("Imparto clases en el área de " + areaDocente + " y tengo a mi cargo el grupo " + grupo + ".");
    }
}
