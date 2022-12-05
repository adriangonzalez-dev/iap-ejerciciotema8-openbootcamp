public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();

        persona.setEdad(20);
        persona.setNombre("Adrian");
        persona.setTelefono(1165326532);

        System.out.println("El nombre es: " + persona.getNombre());
        System.out.println("Su edad es: " + persona.getEdad());
        System.out.println("Su telefono es: " + persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    /* Setters */
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    /* Getters */
    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }
}
