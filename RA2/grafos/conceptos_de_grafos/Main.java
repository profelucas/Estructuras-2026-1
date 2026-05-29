import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        grafos g = new grafos(5);
        g.enlazar(0, 1);
        g.enlazar(1,2);
        g.enlazar(1,4);
        g.enlazar(2,3);
        g.enlazar(3, 4);
        LinkedList<Integer> vecinos= g.obtenervecinos(1);
        for (int i=0;i<vecinos.size();i++){
            System.out.println(vecinos.get(i));
        }

        System.out.println("impimir todo el grafo");
        g.imprimir();
    }

}
