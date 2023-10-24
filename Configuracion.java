package Combate;

import java.util.Random;
import java.util.Scanner;

public class Configuracion {

    /*Archivo donde se define ataques y defensa del Boss y User*/

private static final Random random = new Random();


// Todos los rangos de valores se pueden cambiar desde aqui

    //*ATAQUES BUENOS BOSS
        public static final int ATAQUE_BUENO_BOSS01 = random.nextInt(65 - 30) + 30; 
        public static final int ATAQUE_BUENO_BOSS02 = random.nextInt(50) + 25;
    //!ATAQUES MALOS BOSS
        public static final int ATAQUE_MALO_BOSS01 = random.nextInt(25 - 15) + 15;
        public static final int ATAQUE_MALO_BOSS02 = random.nextInt(15 - 5) + 5;

    
    //*ATAQUES BUENOS USER
        public static final int ATAQUE_BUENO_USER01 = random.nextInt(60 - 30) + 30;
        public static final int ATAQUE_BUENO_USER02 = random.nextInt(50) + 25;
    //!ATAQUES MALOS USER
        public static final int ATAQUE_MALO_USER01 = random.nextInt(25 - 15) + 15;
        public static final int ATAQUE_MALO_USER02 = random.nextInt(15 - 5) + 5;


    //**DEFENSA */
    /*
    ?La defensa se definira en programacion si buena o mala para el USER
    ?en principio solo necesitamos un valor, este luego se restará o se sumará
    ?dependiendo si lo Tomas o lo Lanzas.
     */
        public static final int DEFENSA = random.nextInt(25 - 15) + 15;

  /*
   * BOSS
   */
        public static final String[] PROFESORES_NOMBRE_BOSS = {"paco","guilla","lidia","david","jesus"};

    
    /*
    *
    VIDAS [la vida va a cambiar por eso son variables]
    */
        public static int vida_user=100;
        public static int vida_boss=100;


    //*METODOS */

        public static int barra_vida_user(int a){
            a = (int) (a * 10 / vida_user);
            System.out.println("User:    [" + "#".repeat(a)  + " ".repeat(10 - a )  + "]");
            return a;
        }
        public static int barra_vida_boss(int a){
            a = (int) (a * 10 / vida_boss);
            System.out.println("User:    [" + "#".repeat(a)  + " ".repeat(10 - a )  + "]");
            return a;
        }
        //void para funciones que no deven devolver nada
        public static void limpiarPantalla() {
            System.out.println(LIMPIAR_CMD_MACOS);
            System.out.println(LIMPIAR_CMD_WINDOW);
        }
        public static void continuar(Scanner sc) {
            System.out.println(ANSI_PURPLE + "Pulsa Enter para continuar" + ANSI_RESET);
            sc.nextLine();
            limpiarPantalla();
        }
    
        

    //*COLORES TEXTO --> No toques*/
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";
        public static final String ANSI_RESET = "\u001B[0m";

        //Subraya el texto
        public static final String SUBRAYA = "-";

    //**LIMPIA CMD --> No toques*/
        public static final String LIMPIAR_CMD_WINDOW = "\033[H\033[2J";
        public static final String LIMPIAR_CMD_MACOS = "\u001b[2J";


}
