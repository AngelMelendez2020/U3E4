package Tarea2pila;


public class MetodosPilas {
    Nodo mayor, menor;
    int tam1,tam2;

    public void ingresar(int n,int n1) {
        Nodo nodoA = new Nodo(n,n1);
        if (tam1 == 0) {
            nodoA.siguiente = mayor;
            mayor = nodoA;
            tam1++;
        } else if (nodoA.num > mayor.num) {
            nodoA.siguiente = mayor;
            mayor = nodoA;
            tam1++;
        } else {
            Nodo nodoB = new Nodo(n,n1);
            nodoB.siguiente = menor;
            menor = nodoB;
            tam2++;
        }
    }

    public void borrarA() {
        if (mayor == null) {
            System.out.println("Pila A vacía");
        } else {
            mayor = mayor.siguiente;
            tam1--;
        }
    }

    public void mostrarA() {
        if (mayor != null) {
            System.out.println("Pila A: ");
            Nodo recorre = mayor;
            while (recorre != null) {
                System.out.print(" <-- "+recorre.num +" ["+recorre.p+"]");
                recorre = recorre.siguiente;
            }
            System.out.println("");
        }
    }

    public void mostrarB() {
        if (menor != null) {
            System.out.println("Pila B: ");
            Nodo recorre = menor;
            while (recorre != null) {
                System.out.print(" <-- "+recorre.num+" ["+recorre.p+"]");
                recorre = recorre.siguiente;
            }
            System.out.println("");
        }
    }
}
