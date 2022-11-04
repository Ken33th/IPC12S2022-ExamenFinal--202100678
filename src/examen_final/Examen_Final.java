/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_final;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Examen_Final {

    
    public static void main(String[] args) {
       
      int menu;
      
        Scanner leer=new Scanner(System.in);       
        System.out.println("--------BIENVENIDO--------");
        System.out.println("**************************");
        System.out.println("*          MENU          *");
        System.out.println("* 1. Ejercicio 1         *");
        System.out.println("* 2. Ejercicio 2         *");
        System.out.println("* 3. Ejercicio 3         *");
        System.out.println("* 4. Salir               *");
        System.out.println("**************************");
        menu=leer.nextInt();
       
        switch(menu)
        {
            case 1:
                ejercicio1();
                break;
            case 2:
               ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                salir();
                break; 
        }// fin switch menu principal
        if (menu>4)
        {
            System.out.println("Opcion no disponible, por favor intente de nuevo");
            principal();
        }
        
    }
    
    
    static void principal()
    {
        
        int menu;
      
        Scanner leer=new Scanner(System.in);       
        System.out.println("**************************");
        System.out.println("*          MENU          *");
        System.out.println("* 1. Ejercicio 1         *");
        System.out.println("* 2. Ejercicio 2         *");
        System.out.println("* 3. Ejercicio 3         *");
        System.out.println("* 4. Salir               *");
        System.out.println("**************************");
        menu=leer.nextInt();
       
        switch(menu)
        {
            case 1:
                ejercicio1();
                break;
            case 2:
               ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                salir();
                break; 
        }// fin switch menu principal
        if (menu>4)
        {
            System.out.println("Opcion no disponible, por favor intente de nuevo");
            principal();
        }
        
        
        
    }//fin principal
    
    
    static void ejercicio1()
    {
       
        int num1;
        int num2;
        int op;
        
        
        Scanner leer=new Scanner(System.in);    
        System.out.println("Escriba un numero");
        num1=leer.nextInt();
        System.out.println("Escriba un numero");
        num2=leer.nextInt();
       
        
        if (num1==num2){
            System.out.println("Los numeros son iguales");
        }
        
        if (num1>num2){
            System.out.println("El numero mayor es: " +num1);
        }
        
        if (num2>num1){
            System.out.println("El numero mayor es: " +num2);
        }
        
        
        System.out.println("Desea repetir?");
        System.out.println("1. Si");
        System.out.println("2. No");
        
        op=leer.nextInt();
        
        switch (op) {
            case 1:
                ejercicio1();
                break;
            case 2:
                principal();
                break;
                  
        }
        
        
        
        

    }//fin ejercicio1
    
    
    static void ejercicio2()
    {
     
           int numimpar;
  
        
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Escriba un numero impar para hacer la piramide");
        numimpar=leer.nextInt();
        leer.close();
        
        System.out.println();
        for(int j = 1; j <= numimpar-j+1; j++){
            
            for(int i = 1; i<=numimpar; i++){
                System.out.println(" ");

            
            
            
            }
            for(int k=1; k<=(j*2)-1; k++){
                System.out.println("*");
        }
    }
        
        System.out.println();
        
        
    }//fin ejercicio2
    
    
    static void ejercicio3()
    {
        
    }//fin ejercicio3
    
    
    static void salir()
    {
        
    }//fin salir
    
    
    
}
