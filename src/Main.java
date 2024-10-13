import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaJsonMonedas consulta = new ConsultaJsonMonedas();
        System.out.println("Bienvenid@ al conversor de monedas ****");

        while (true) {
            System.out.println();
            System.out.println("Indique 1 para convertir de Dolar ---->>> Peso argentino");
            System.out.println("Indique 2 para convertir de Peso argentino ---->>> Dolar");
            System.out.println("Indique 3 para convertir de Dolar ---->>> Real brasileño");
            System.out.println("Indique 4 para convertir de Real brasileño ---->>> Dolar");
            System.out.println("Indique 5 para convertir de Dolar---->>> Peso Colombiano");
            System.out.println("Indique 6 para convertir de Peso colombiano---->>> Dolar");
            System.out.println("Indique 7 para salir");

            try {
                int numeromoneda = Integer.valueOf(scanner.nextLine());
                if (numeromoneda >= 1 && numeromoneda <= 6) {
                    TipoMoneda tipoMoneda = new TipoMoneda(numeromoneda);
                    tipoMoneda.ConvertirMoneda();
                    System.out.println("Indique el valor que desea convertir");
                    var valor= scanner.nextLine();
                    valor= valor.replace(',', '.');
                    var valorMoneda = new BigDecimal(valor);
                    CalculoMoneda calculoMoneda = new CalculoMoneda(valorMoneda);
                    Monedas monedas = consulta.consulta(tipoMoneda.getMonedaOriginal(),
                            tipoMoneda.getMonedaConvertir());
                    calculoMoneda.GenerarValorMoneda(monedas);
                    System.out.println("El valor: " + valorMoneda + " de " +
                            tipoMoneda.monedaOriginal + " corresponde al valor de " +
                            calculoMoneda.valorConvertido + " en " + tipoMoneda.monedaConvertir);
                    System.out.println(monedas);

                } else if (numeromoneda==0 || numeromoneda>7) {
                    System.out.println("El numero " + numeromoneda + " no hace parte del menú");
                }
                    else{
                        System.out.println("Saliendo...");
                        break;
                    }

            } catch (NumberFormatException e){
                System.out.println("No fue posible realizar la conversión, se espera un valor numérico" +
                        " " + e.getMessage());
            }
            catch (RuntimeException e) {
            System.out.println(e.getMessage());
            }

        }


    }
}