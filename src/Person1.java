
public class Person {
    public String nombre;
    public int edad;

    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void yourself() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.\n ");
    }
}
