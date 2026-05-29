import java.util.LinkedList;

class grafos {
    private int V;
    private int E;
    private LinkedList<Integer>[] X;
    //constructor
    public grafos(int v){
        this.V = v;
        this.E =0;
        X = new LinkedList[V];
    
        for (int i =0;i<V;i++){
            X[i]= new LinkedList<>();
        }
    }

    private boolean validar(int v){
        return(v>=0 && v<V);
    }

    public void enlazar(int v, int w){
        if(validar(v)&& validar(w)){
            X[v].add(w);
            X[w].add(v);
            E++;
        }
    }

    public int vertices(){
        return V;
    }
    public int aristas(){
        return E;
    }

    public LinkedList<Integer> obtenervecinos(int v){
        if (validar(v)){
            return X[v];
        }
        return null;
    }

    public void imprimir(){
        for ( int i =0;i<V;i++){
            System.out.println(i+"->"+X[i]);
        }
    }
}