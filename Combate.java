package Combate;

//Importo todas las constantes y funciones
import static Combate.Configuracion.*;

import java.util.Random;
import java.util.Scanner;



public class Combate {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int vida_actualizada_boss = vida_boss;
      int vida_actualizada_user = vida_user;
      
      //Texto para el subrayado
      String TXT_INTRODUCCION= "Introducción" ;
      String TXT_EXPLICACION= "Explicación" ;
      String TXT_BIENVENIDA= "🎃 Bienvenido, es hora de conocernos 🎃 ";
      /* 
      *Podemos hacer que escriban sus nombres y darle un numero del 1 al 5 para que 
      *su mini-juego sea totalmente aleatorio más adelante, esto puede servir como introducion
      */
      System.out.println(ANSI_PURPLE + TXT_BIENVENIDA + "\n" + SUBRAYA.repeat(TXT_BIENVENIDA.length())+ ANSI_RESET);

      String[]jugadores = new String[5];
       for (int i = 1 ; i <= 5 ; i++){ 
         //Bolean inicial
         boolean nombreConfirmado = false;
            
         while (!nombreConfirmado) {
             System.out.println(ANSI_BLUE + "Nombres del Jugador " + i + ": ");
             String nombres = sc.nextLine();

             System.out.println("¿Estás seguro de que tu nombre es " + nombres + "? [S/N]: ");
             String check = sc.nextLine().toLowerCase();

             if (check.equals("s")) {
                 System.out.println("Jugador " + i + " registrado con nombre: " + nombres);
                 jugadores[i - 1] = nombres;
                 nombreConfirmado = true;  // Confirmación exitosa, salir del bucle
                  //Se limpia pantalla
                  limpiarPantalla();
             } else if (check.equals("n")) {
                 System.out.println(ANSI_RED + "Por favor, ingresa de nuevo el nombre." + ANSI_RESET);
             } else {
                 System.out.println(ANSI_RED + "Respuesta no válida. Por favor, ingresa 'S' o 'N'." + ANSI_RESET);
             }
         }
      }

    //**INTRODUCCION */

    System.out.println("\n"+ANSI_BLUE + TXT_INTRODUCCION + "\n" + SUBRAYA.repeat(TXT_INTRODUCCION.length()));
    System.out.println("\n¡El Instituto Cesur está en peligro! Hay un asesino que esta matando a "+
                        "estudiantes en el instituto y solo tú y tus amigos podéis detenerlo.");
    System.out.println("\n" + TXT_EXPLICACION + "\n" + SUBRAYA.repeat(TXT_EXPLICACION.length())+
                        "\n\n¡Para encontrar al asesino, tendréis que completar cinco minijuegos."+
                        " Cada minijuego os dará un dato que os será útil" + ANSI_RED + " [MUY IMPORTANTE APUNTAR]." + ANSI_RESET);
   
   //*presiona continuar y limpia la pantalla
    continuar(sc);
   //*ELECCION DE EQUIPOS A CADA JUGADOR */
   aleatorizarArray(jugadores);//ahora los nombres son aleatorios
   //lo muestro
   for (int i = 1 ; i<=5;i++){
      System.out.println(ANSI_BLUE + "Minijuego " + ANSI_RESET + i + "---> " + ANSI_PURPLE + jugadores[i-1] + ANSI_RESET);
   }
   System.out.println("\n");
    continuar(sc);
   
   }


   //*METODOS RAPIDOS */
   //NOMBRE PERSONAJES
   public static void personajes(Scanner sc){
      System.out.println("Cual es tu nombre: ");
      String jugador01=sc.nextLine();
      System.out.println("Jugador"+ATAQUE_BUENO_BOSS01 + "Registrado con nombre: "+ jugador01 );
   }

   public static void aleatorizarArray(String[] arr) {
        Random rand = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);

            // Intercambiar los elementos en las posiciones 'i' y 'index'
            String temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
      }
}