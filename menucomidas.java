import java.util.Scanner;

public class Restaurante
{
    public static double TOTALPAGO = 0;  // Variable Global
    public static String COMIDAS="";   //Comidas  solicitadas
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg)
    {
        int op = 0;     // Variable  Local
        do
        {
           op = MostrarMenu(); //  esta  funcion me  devuelve  un valor  entero
        }while (op != 0);
        System.out.println("Usted  debe  cancelar la  suma de: "+ TOTALPAGO);
        System.out.println("por  consumo de: " + COMIDAS);
    }
    // funcion del menu
    private static int MostrarMenu()
    {
        int opx = 0;
        do {
            System.out.println("┌─────────────────────────────────┐");
            System.out.println("│         MENU PRINCIPAL          │▒");
            System.out.println("│---------------------------------│▒");
            System.out.println("│         1: COMIDA PRINCIPAL     │▒");
            System.out.println("│         2: POSTRES              │▒");
            System.out.println("│         3: BEBIDAS              │▒");
            System.out.println("│---------------------------------│▒");
            System.out.println("│         0: SALIR                │▒");
            System.out.println("└─────────────────────────────────┘▒");
            System.out.println(" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            try {
                opx = sc.nextInt();
            }catch(Exception e)
            {
                System.out.println("Error!,  digite  correctamente  el  valor  entre  0-3");
                opx = 6;
            }

        } while (opx <0 & opx >3);
        switch (opx)
        {
            case 1:  MenuComidas();
                 break;
            case 2:  System.out.println("Postres");
                break;
            case 3:  System.out.println("Bebidas");
                break;
        }
        return opx;
    }
    // Menu de  comidas
    private static void MenuComidas()
    {
        int opx = 0;
        do {
            System.out.println("┌─────────────────────────────────┐");
            System.out.println("│         COMIDA PRINCIPAL        │▒");
            System.out.println("│---------------------------------│▒");
            System.out.println("│   1: SOPA DE MANI               │▒");
            System.out.println("│   2: MAJADITO                   │▒");
            System.out.println("│   3: SALPICON DE POLLO          │▒");
            System.out.println("│   4: RAPI                       │▒");
            System.out.println("│   5: KEPERI                     │▒");
            System.out.println("│---------------------------------│▒");
            System.out.println("│         0: SALIR                │▒");
            System.out.println("└─────────────────────────────────┘▒");
            System.out.println(" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            try {
                opx = sc.nextInt();
            }catch(Exception e)
            {
                System.out.println("Error!,  digite  correctamente  el  valor  entre  0-5");
                opx = 6;
            }

        } while (opx <0 & opx >5);
        int cantidad=0;
        
        switch (opx)
        {
            case 1: cantidad = CantidadProducto("Sopa de Mani");
                    TOTALPAGO = TOTALPAGO + 20 * cantidad;   // Sopa  de mani
                    COMIDAS = COMIDAS.concat( String.valueOf(cantidad) + " - Sopa de mani \n");
                    break;
            case 2: TOTALPAGO = TOTALPAGO + 25 * CantidadProducto("Majadito");   // Majadito
                    COMIDAS = COMIDAS.concat("Majadito \n");
                    break;
            case 3: TOTALPAGO = TOTALPAGO + 25 * CantidadProducto("Salpicon de pollo");    // Salpicon de pollo
                    COMIDAS = COMIDAS.concat("Salpicon de pollo \n");
                    break;
            case 4: TOTALPAGO = TOTALPAGO + 40 * CantidadProducto("Rapi");    // Rapi
                    COMIDAS = COMIDAS.concat("Rapi \n");
                    break;
            case 5: TOTALPAGO = TOTALPAGO + 40 * CantidadProducto("Keperi");    //  Keperi
                    COMIDAS = COMIDAS.concat("Keperi \n");
                    break;
        }
    }
    //  Solicitar cantidad de productos
    private static int CantidadProducto(String titulo)
    {
        int cantidad=0;
        try {
            System.out.println("Ingrese  cantidad de " + titulo);
            cantidad = sc.nextInt();
        }catch(Exception e)
        {
            System.out.println("Error!,  digite  un valor  entero");
            cantidad = 0;
        }
        return cantidad;
    }
}
