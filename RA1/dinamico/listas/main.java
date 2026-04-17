public class main {

    public static void main(String[] args) {
        listacircular circulo = new listacircular();

        circulo.ingresar(5, 0);
        circulo.ingresar(9, 0);

        circulo.mostrar();

        circulo.eliminar(1);
        circulo.mostrar();
    }
}