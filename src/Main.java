import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ConversionDeMoneda consulta = new ConversionDeMoneda();
        boolean menu = true;
        double valor;
        double resultado;
        int opc;
        Moneda moneda;

        while(menu){

            consulta.mostrarMenu();
            System.out.println("Elige una opción valida: ");
            opc = teclado.nextInt();

            switch (opc){
                case 1:
                    moneda = consulta.conversionDeMoneda("USD");
                    //System.out.println(moneda);
                    System.out.println("Ingrese e valor que desea convertir");
                    valor = teclado.nextDouble();
                    resultado = consulta.operacionDeCambio(valor, moneda.conversionRates().get("ARS"));
                    System.out.println( valor + " USD ==> " + resultado + " ARS");
                    break;
                case 2 :
                    moneda = consulta.conversionDeMoneda("ARS");
                    //System.out.println(moneda);
                    System.out.println("Ingrese e valor que desea convertir");
                    valor = teclado.nextDouble();
                    resultado = consulta.operacionDeCambio(valor, moneda.conversionRates().get("USD"));
                    System.out.println( valor + " ARS ==> " + resultado + " USD");
                    break;
                case 3 :
                    moneda = consulta.conversionDeMoneda("USD");
                    //System.out.println(moneda);
                    System.out.println("Ingrese e valor que desea convertir");
                    valor = teclado.nextDouble();
                    resultado = consulta.operacionDeCambio(valor, moneda.conversionRates().get("BRL"));
                    System.out.println( valor + " USD ==> " + resultado + " BRL");
                    break;
                case 4 :
                    moneda = consulta.conversionDeMoneda("BRL");
                    //System.out.println(moneda);
                    System.out.println("Ingrese e valor que desea convertir");
                    valor = teclado.nextDouble();
                    resultado = consulta.operacionDeCambio(valor, moneda.conversionRates().get("USD"));
                    System.out.println( valor + " BRL ==> " + resultado + " USD");
                    break;
                case 5 :
                    moneda = consulta.conversionDeMoneda("USD");
                    //System.out.println(moneda);
                    System.out.println("Ingrese e valor que desea convertir");
                    valor = teclado.nextDouble();
                    resultado = consulta.operacionDeCambio(valor, moneda.conversionRates().get("COP"));
                    System.out.println( valor + " USD ==> " + resultado + " COP");
                    break;
                case 6 :
                    moneda = consulta.conversionDeMoneda("COP");
                    //System.out.println(moneda);
                    System.out.println("Ingrese e valor que desea convertir");
                    valor = teclado.nextDouble();
                    resultado = consulta.operacionDeCambio(valor, moneda.conversionRates().get("USD"));
                    System.out.println( valor + " COP ==> " + resultado + " USD");
                    break;
                case 7 :
                        menu = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
        System.out.println("Finalizo el programa");
    }
}
