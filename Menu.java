import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<ObjURL> pila = new Stack<>();
        Metodos m = new Metodos();
        boolean continuar = true;
        while (continuar) {
            System.out.println("bienvenidos al navegador");
            System.out.println("Que desea realizar");
            System.out.println("1) Ir a una URL ");
            System.out.println("2) Retroceder una URL ");
            System.out.println("3) Mostrar historial ");
            System.out.println("4) Salir ");
            int opt = m.ValidarEntero(sc);
            switch (opt) {
                case 1:
                    pila = m.IngresarURL(pila, sc, m);
                    break;
                case 2:
                    m.Retroceder(pila);
                    System.out.println();
                    break;
                case 3:
                    pila = m.MostrarHistorial(pila);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;

                default:
                    System.out.println("esta opcion no existe");
                    break;
            }
        }
    }
}