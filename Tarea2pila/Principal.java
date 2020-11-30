package Tarea2pila;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        MetodosPilas pila=new MetodosPilas();
        boolean si = true;
        int op;
        int num=0,n=0;
        System.out.println("Inserta 10 numeros automaticos del 1-10");
        System.out.println("imprime así \"numgenerado [en qué momento ingreso] -->\" por ejemplo 10 [1]");
        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1.Insertar dato");
            System.out.println("2.Borrar dato");
            System.out.println("3.Mostrar dato");
            System.out.println("4.salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    for (int i = 1; i <=10; i++) {
                        num=(int) (Math.random()*10+1);
                        pila.ingresar(num,n);
                        n++;
                    }
                    break;
                case 2:
                    pila.borrarA();
                    break;
                case 3:
                    pila.mostrarA();
                    pila.mostrarB();
                    break;
                case 4:
                    si = false;
                    break;

            }
        } while (si);
    }
    
}
