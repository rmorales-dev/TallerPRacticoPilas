import java.util.Scanner;
import java.util.Stack;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<ObjURL> pila = new Stack<>();
        Metodos m = new Metodos();

        boolean continuar = true;

        while (continuar) {

            System.out.println("Bienvenidos al navegador");
            System.out.println("Que desea realizar");
            System.out.println("1) Ir a una URL");
            System.out.println("2) Retroceder una URL");
            System.out.println("3) Mostrar historial");
            System.out.println("4) para ver la URL actual");
            System.out.println("5) Salir");

            int opt = m.ValidarEntero(sc);
            System.out.println();    

            switch (opt) {

                case 1:
                    pila = m.IngresarURL(pila, sc, m);
                    break;

                case 2:
                    pila = m.Retroceder(pila);
                    System.out.println();
                    break;

                case 3:
                    m.MostrarHistorial(pila);
                    break;

                case 4:
                    m.MostrarUrlActual(pila);
                    break;

                case 5:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;

                default:
                    System.out.println("Esta opcion no existe");
                    break;
            }
        }

        sc.close();
    }
}
