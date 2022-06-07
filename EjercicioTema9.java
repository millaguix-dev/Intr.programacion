
package POO;

class EjercicioTema9 {
    public static void main(String[] args) {
        Cliente cliente=new Cliente();
        cliente.setEdad(15);
        cliente.setNombre("Liliana Pereira");
        cliente.setTelefono("0426-383-6895");
        cliente.setCredito(20000);
        System.out.println("Su nombre es: "+ cliente.getNombre());
        System.out.println("Su edad es: "+ cliente.getEdad());
        System.out.println("Su número de teléfono es: "+ cliente.getTelefono());
        System.out.println("Tomo un credito por: "+cliente.getCredito()+"$");
        Trabajador trabajador=new Trabajador();
        trabajador.setEdad(20);
        trabajador.setNombre("Carlos Millan");
        trabajador.setTelefono("0424-903-7061");
        trabajador.setSalario(50000);
        System.out.println("Su nombre es: "+ trabajador.getNombre());
        System.out.println("Su edad es: "+ trabajador.getEdad());
        System.out.println("Su número de teléfono es: "+ trabajador.getTelefono());
        System.out.println("Su salario es de: "+trabajador.getSalario()+"$ P/Y");
  
    }
}

class Personaa{
    int edad;
    String nombre;
    String telefono;

public void setEdad(int edad){
    this.edad=edad;   
}
public int getEdad(){ 
    return edad;
}

public void setNombre(String nombre){
    this.nombre=nombre;
}
public String getNombre(){
    return nombre;
}

public void setTelefono(String telefono){
    this.telefono=telefono;
}
public String getTelefono(){
    return telefono;
}

}

class Cliente extends Personaa{
 double credito;

 public void setCredito(double credito){
     this.credito=credito;
 }

 public double getCredito(){
     return credito;
 }
}

class Trabajador extends Personaa{
double salario;

public void setSalario(double salario){
    this.salario=salario;
}

public double getSalario(){
    return salario;
}
 
}
