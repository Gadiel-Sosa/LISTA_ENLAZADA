import java.util.LinkedList;

class Main {

    public static void main(String[] args) {

        LinkedList<Object> lista = new LinkedList<>();

        lista.add("Palabra");
        lista.add(5);
        lista.add(17);
        lista.add("palabra 2");

        lista.removeLast();

        System.out.println("El tamaño de la lista es: " + lista.size());
        System.out.println(lista.getLast());  
    }
}
