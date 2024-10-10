package Modelos;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {
    private Conversor conversor = new Conversor();

    public void menu(){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        while(opcion!=7){
            System.out.println("""
                    ***********************************************
                    Sea bienvenido/a al conversor de monedas =)
                    """);
            System.out.println("""
                    ↓↓↓↓↓ Estas son las opciones ↓↓↓↓↓
                    1) Dolar a peso argentino
                    2) Peso argentino a dolar
                    3) Dolar a real brasileño
                    4) Real brasileño a dolar
                    5) Dolar a peso colombiano
                    6) Peso colombiano a dolar
                    7) Salir
                    Ingrese una opcion valida
                    ***********************************************""");
            opcion = entrada.nextInt();

            switch (opcion){

                case 1: //Dolar a peso argentino
                    System.out.println("Ingrese el valor que desea convertir");
                    opcion("USD","ARS", entrada.nextBigDecimal() );
                    break;
                case 2: //Peso argentino a dolar
                    System.out.println("Ingrese el valor que desea convertir");
                    opcion("ARS","USD", entrada.nextBigDecimal() );
                    break;
                case 3: //Dolar a real brasileño
                    System.out.println("Ingrese el valor que desea convertir");
                    opcion("USD","BRL", entrada.nextBigDecimal() );
                    break;
                case 4: //Real brasileño a dolar
                    System.out.println("Ingrese el valor que desea convertir");
                    opcion("BRL","USD", entrada.nextBigDecimal() );
                    break;
                case 5: //Dolar a peso colombiano
                    System.out.println("Ingrese el valor que desea convertir");
                    opcion("USD","COP", entrada.nextBigDecimal() );
                    break;
                case 6: //Peso colombiano a dolar
                    System.out.println("Ingrese el valor que desea convertir");
                    opcion("COP","USD", entrada.nextBigDecimal() );
                    break;
                case 7: //Salir
                    System.out.println("¡Adios!");
                    break;
                default:
                    System.out.println("¡Opcion invalida! Comience de nuevo");
                    break;

            }
            System.out.println("Presione enter para continuar");
            entrada.nextLine(); entrada.nextLine(); //Puestos para que la conversion se muestre directamente sin que sea tapado por el menu
        }
    }

    public void opcion(String base, String objetivo, BigDecimal valor){
        conversor.construir(base, objetivo);
        conversor.conversion(valor);
    }
}