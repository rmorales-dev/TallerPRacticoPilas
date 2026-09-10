import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public String ValidarString(Scanner sc) {
        while (!sc.hasNext()) {
            System.out.println("Ingrese un valor valido texto");
            sc.next();
        }
        return sc.next();
    }

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("ingrese un numero valido");
            sc.nextInt();
        }
        return sc.nextInt();
    }

    public Stack<ObjURL> IngresarURL(Stack<ObjURL> pila, Scanner sc, Metodos m) {
        boolean continuar = true;
        while (continuar) {
            ObjURL o = new ObjURL();
            System.out.println("ingrese la URL que desea ir: ");
            o.setURL(m.ValidarString(sc));
            System.out.println("Ingrese el titulo de la pagina: ");
            o.setTitulo(m.ValidarString(sc));
            System.out.println("ingrese la fecha actual: ");
            o.setFecha(m.ValidarString(sc));
            System.out.println("Presione 1 si desea ir a otra url, para salir presione 2");
            int opt = m.ValidarEntero(sc);
            if (opt == 2) {
                continuar = false;
            }
            return pila;
        }
    }

    public Stack<ObjURL> Retroceder(Stack<ObjURL> pila) {
        pila.pop();
        return pila;
    }

    public void MostrarHistorial(Stack<ObjURL> pila) {
        for (ObjURL o : pila) {
            System.out.println(((ObjURL) o).getURL());
        }
    }
}
