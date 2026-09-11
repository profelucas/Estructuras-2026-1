public class main {

    public static void main(String[] args) {
        listacircular circulo = new listacircular();

        circulo.ingresar(5, 0);
        circulo.ingresar(9, 0);

        circulo.mostrar();

        circulo.eliminar(1);
        circulo.mostrar();

        listadoble doble = new listadoble();

        doble.ingresar(5, 0);

        doble.ingresar(6, 3);
        doble.ingresar(10, 2);

        doble.ingresar(1, 1);

        doble.mostrar();
    }
}