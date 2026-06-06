import java.util.Queue;
import java.util.LinkedList;

class AB {
    private int raiz;
    private AB  izq;
    private AB der;

    public AB(){
        raiz = -1;
        izq = null;
        der = null;
    }

    private boolean esvacio(){
        return raiz == -1;
    }

    public void insertarraiz(int dato){
        if (esvacio()) {
            this.raiz=dato;    
        }
    }

    public boolean insertar (int padre, int n, boolean dir){
        if (esvacio()){
            return false;
        }
        if (this.raiz == padre){
            if (dir){
                if(this.der ==null){
                    der = new AB();
                    der.insertarraiz(n);
                    return true;
                }
            }else{
                if(this.izq==null){
                    izq = new AB();
                    izq.insertarraiz(n);
                    return true;
                }
            }
        }

        boolean encontrado = false;

        if (izq != null){
            encontrado = izq.insertar(padre, n, dir);
        }
        if (!encontrado && der!=null){
            encontrado = der.insertar(padre, n, dir);
        }
        return encontrado;
    }

    public void preorden(){
        System.out.println(this.raiz);
        if(this.izq!=null){
            izq.preorden();
        }
        if(this.der!=null){
            der.preorden();
        }
    }

    public void inorden(){

        if(this.izq!=null){
            izq.inorden();
        }
        System.out.println(this.raiz);

        if(this.der!=null){
            der.inorden();
        }   
    }


    public void postorden(){
        if(this.izq!=null){
            izq.postorden();
        }
        if(this.der!=null){
            der.postorden();
        }
        System.out.println(this.raiz);
    }

    public void anchura(){
        if (esvacio()){
            return;
        }
        Queue<AB> cola = new LinkedList<>();
        cola.add(this);
        while(!cola.isEmpty()){
            AB actual = cola.poll();
            System.out.println(actual.raiz);
            if(actual.izq!=null){
                cola.add(actual.izq);
            }
            if(actual.der!=null){
                cola.add(actual.der);
            }
        }
    }
}