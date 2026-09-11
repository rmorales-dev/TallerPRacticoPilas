import java.util.Scanner;
import java.util.Stack;

public class Metodos {

    public String ValidarString(Scanner sc) {
        while (!sc.hasNext()) {
            System.out.println("Ingrese un valor valido de texto");
            sc.next();
        }
        return sc.next();
    }

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Ingrese un numero valido");
            sc.next();
        }
        return sc.nextInt();
    }

    public Stack<ObjURL> IngresarURL(Stack<ObjURL> pila, Scanner sc, Metodos m) {
        boolean continuar = true;

        while (continuar) {

            System.out.println("Ingrese la URL que desea ir: ");
            String url = m.ValidarString(sc);

            System.out.println("Ingrese el titulo de la pagina: ");
            String titulo = m.ValidarString(sc);

            System.out.println("Ingrese la fecha actual: ");
            String fecha = m.ValidarString(sc);

            ObjURL o = new ObjURL(fecha, titulo, url);

            pila.push(o);

            System.out.println("Presione 1 si desea ir a otra URL, para salir presione 2");
            int opt = m.ValidarEntero(sc);

            if (opt == 2) {
                continuar = false;
            }
        }

        return pila;
    }

    public Stack<ObjURL> Retroceder(Stack<ObjURL> pila) {
        if (!pila.empty()) {
            pila.pop();
        }

        return pila;
    }

    public void MostrarHistorial(Stack<ObjURL> pila) {
        for (ObjURL o : pila) {
            System.out.println(o.getUrl());
        }
    }
    
    public void MostrarUrlActual(Stack<ObjURL> pila) {
        if (!pila.empty()) {
            ObjURL o = pila.peek();
            System.out.println("La pagina actual es: " + o.getUrl());
        } else {
            System.out.println("No hay paginas visitadas aun");
            System.out.println();
        }
    }

}

