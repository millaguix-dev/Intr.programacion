public class SegundaParte{
    
public static void main(String[] args) {
    coche micoche= new coche();
    micoche.añadirpuerta();
    micoche.añadirpuerta();
    System.out.println(micoche.puertascoche);
}



   static class coche{
       int puertascoche=0;

       void añadirpuerta()
       {
           this.puertascoche++;

       }
   }
}

