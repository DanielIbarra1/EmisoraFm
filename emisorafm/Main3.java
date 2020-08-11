package emisorafm;

import java.util.Scanner;

public class Main3 {
    
    public static void main(String[] args) {
        Fm ob1 = new Fm();
        ob1.setMHz(80);
        Scanner in = new Scanner (System.in);
        int opc;
        do{
            System.out.println("1) Subir MHz");
            System.out.println("2) Bajar Mhz");
            System.out.println("3) Mostrar MHz");
            System.out.println("4) Salir");
            System.out.print("\n Digite una opcion a realizar: ");opc = in.nextInt();
            switch(opc){
                case 1: System.out.println("\nAumento de frecuencia en 0.5"); ob1.up(); ob1.controlador(); break;
                case 2: System.out.println("\nDisminución de la frecuencia en 0.5");ob1.down(); ob1.controlador(); break;
                case 3: System.out.println("\nFrecuencia actual de: "+ob1.display()); break;
                case 4: break;
                default : System.out.println("No se reconoce, intente otra vez.");
            }
        }while(opc != 4);
    }
    
}