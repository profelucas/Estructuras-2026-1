public class nodo {
    private Object n;
    private nodo sig;

    public nodo(Object x){
        this.n = x;
        this.sig=null;
    }
    public Object getvalor(){
        return n;
    }

    public nodo getsig(){
        return sig;
    }
    public void enlazar(nodo n){
        this.sig=n;
    }

}
