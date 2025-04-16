public class Person {
    protected String nombre;
    protected int edad;

    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void yourself() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}