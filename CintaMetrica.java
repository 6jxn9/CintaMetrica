import java.util.Scanner;

/**
 * Convertir unidades
 *
 * @author E.T.
 * @author Garfield
 * @version 6.1.5
 */
public class CintaMetrica {

	//Se declaran unas constantes que son valores fijos que no van a cambiar en el programa
	public static final double CM_POR_PULGADA = 2.54;
	public static final int PUL_POR_PIE = 12;

     /**
      * Método principal.
      *
      * @param args argumentos de main()
      */
      public static void main(String[] args) {
      double resultao; // variable de número real
      int pies, pulgadas; // variable para números enteros
      Scanner valor = new Scanner(System.in);

       // Recogida de datos y presentación de resultado en centímetros desde el método preparado
       System.out.print("Indicar a continuación la cantidad de pies: ");
       pies = valor.nextInt();
       System.out.print("Indicar a continuación la catidad de pulgadas: ");
       pulgadas = valor.nextInt();
       resultao = A_metro(pies, pulgadas);
       System.out.printf("El resultado es %.2f cm\n", resultao);
    }
      
      /**
       * Convierte una longitud en pies y pulgadas a centímetros.
       *
       * @param pies cuántos pies
       * @param pulgadas cuantas pulgadas
       * @return en centímetros
       */
      public static double A_metro(int pies, int pulgadas) {
      int total = pies * PUL_POR_PIE + pulgadas;
      return total * CM_POR_PULGADA;
      }
}

