package EjercicioTema4;

public class EjercicioTema4 {
    public static void main(String[] args) {
        int numeroif=7,numerowhile=-1,numerofor=0,numerodowhile=1,estacion=1;
        iff(numeroif);
        fwhile(numerowhile);
        fdowhile(numerodowhile);
        ffor(numerofor);
        fswitch(estacion);

       

        

        

        

}

static void iff(int a)
{
    if(a<0)
    {
        System.out.println("El numero es negativo");
    }
    if(a==0)
    {
        System.out.println("El numero es 0");
    }
    if(a>0)
    {
        System.out.println("El numero es positivo");
    }

}

static void fwhile(int a)
{
    while(a < 3);
        {
            a++;
            System.out.println(a);

        }

}

static void fdowhile(int a)
{
    do
        {
            System.out.println(a);
            a++;

        }while(a==1);

}

static void ffor(int a)
{
    for(a=0;a<=3;a++)
        {
            System.out.println(a);
            a++;
        }

}

static void fswitch(int a)
{
    while(a<5){
        switch(a)
        {
            case 1: System.out.println("\nEstás en la primera estación del año.\n");
            a++;break;
            case 2: System.out.println("Estás en la segunda estación del año.\n");
            a++;break;
            case 3: System.out.println("Estás en la tercera estación del año.\n");
            a++;break;
            case 4: System.out.println("Estás en la cuarta estación del año.\n");
            a++;break;
            default: System.out.println("No te encuentras dentro de ninguna estación\n");
            break;

        }

    
    }
}

}
