/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_juliocarcamo;
import java.util.Scanner;
/**
 *
 * @author jucec
 */
public class Examen1P1_JulioCarcamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    boolean continuarMenu = true;
    int opcionMenuprincipal = 0;
    
    while (continuarMenu){
        System.out.println("  ==MENU==  ");
        System.out.println("1. BINARIO");
        System.out.println("2. ESTRELLA DE DAVID");
        System.out.println("3. SALIR");
        int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    string pusle = new string();
                    string minum = new string();

                    System.out.println("Ingrese cadena 1");
                    sc.nextInt();
                    
                    System.out.println("Ingrese cadena 2");
                    sc.nextInt();
 
                    break;
                    
                case 2:
                    System.out.println("Ingrese un tamagno");
                     int num = sc.nextInt();
                    for(int i = 0; i<num; i++){
                                for(int j = 0; j<num; j++){
                                    if(i==0 || j == i || j == num-i-1){
                                        System.out.print("*");
                                    }
                                    else{
                                        System.out.print(" ");
                                    }
                                }
                                System.out.println("");

                            }
                              
                            
                    
                        
                break;

         }
      }
          
   }
}
    
       



    


   
