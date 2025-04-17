public class Persons {
    protected String nombre;
    protected int edad;

    public Persons(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }
    public void yourself(){
        System.out.println("Mi nombre es "+ nombre+ " tengo " + edad + " años." + "  Un placer conocerlos :) ");
    }
}
