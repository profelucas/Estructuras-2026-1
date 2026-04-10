public class main {

    public static void main(String[] args) {
        listaenlazada lista = new listaenlazada();

        lista.ingresar(5, 0);

        lista.ingresar(6, 1);

        lista.ingresar(9, 0);

        lista.ingresar(14, 19);

        lista.mostrar();
        System.out.println("eliminar");
        lista.eliminar(9);
        lista.mostrar();
    }
}