
package POO;

public class EjercicioTema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.SetEdad(15);
        persona.SetNombre("Carlos");
        persona.SetTelefono("0424-903-7061");

        System.out.printf("El nombre es: %s\n",persona.GetNombre());
        System.out.printf("La edad es: %d años\n",persona.GetEdad());
        System.out.printf("El número de teléfono es: %s\n",persona.GetTelefono());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void SetEdad(int edad) {
        this.edad = edad;
    }

    public int GetEdad() {
        return edad;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String GetNombre() {
        return nombre;
    }

    public void SetTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String GetTelefono() {
        return telefono;
    }

}