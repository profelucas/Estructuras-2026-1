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

        abo e1 =  new abo();

        abo e2 = new abo();

        e1.insertar(8);
        e1.insertar(2);
        e1.insertar(1);
        e1.insertar(10);


        e2.insertar(5);
        e2.insertar(3);
        e2.insertar(0);

        e1.union(e2);

        abo e3 = new abo();
        int k = 7;
        e3.insertar(10);
        e3.insertar(2);
        e3.insertar(11);
        e3.insertar(1);
        e3.insertar(5);
        e3.insertar(3);
        e3.insertar(6);
        e3.insertar(4);

        abo e4 = new abo();
        k=11;
        e4.insertar(9);
        e4.insertar(4);
        e4.insertar(17);
        e4.insertar(3);
        e4.insertar(6);
        e4.insertar(22);
        e4.insertar(5);
        e4.insertar(7);
        e4.insertar(20);
    }
}
