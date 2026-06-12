public class main {
    public static void main(String[] args) {
        //AB a = new AB();

        //a.insertarraiz(5);
        //a.insertar(5, 10, false);
        //a.insertar(10, 2, true);
        //a.inorden();
        //a.anchura();

        abo b = new abo();
        b.insertar(5);
        b.insertar(10);
        b.insertar(9);

        b.inorden();

        b = b.eliminar(5);
        System.out.println("eliminando el 10");
        b.inorden();
        System.out.println(b.buscar(9));
    }
}
