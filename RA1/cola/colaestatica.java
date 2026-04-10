public class colaestatica {
    private Object[] cola;
    private int primero;
    private int ultimo;
    private int tam;

    public colaestatica(int tam){
        this.tam =tam;
        this.primero=this.ultimo=-1;
        this.cola= new Object[tam];
    }

    public Boolean esvacia(){
        return this.primero==-1;
    }

    public boolean eslleno(){
        return this.ultimo==tam-1;
    }
    public Object getprimero(){
        return cola[this.primero];
    }

    public Object getultimo(){
        return cola[this.ultimo];
    }

    public void ingresar(Object x){
        //verificar si esta lleno
        if (eslleno()) {
            System.out.println("Esta lleno");
            return;
        }
        
        if (esvacia()) {
            this.primero++;
            this.ultimo++;
            cola[primero]=x;

        } else {
            this.ultimo++;
            cola[ultimo]=x;
        }

    }
    public void quitar(){
        if (esvacia()) {
            System.out.println("Esta vacio");
        } else {
            this.cola[primero]=null;
            this.primero++;
            this.sobreponer();
        }
    }


    public void sobreponer(){
        int j  = 0;
        for (int i = primero; i < this.tam; i++) {
            cola[j]=cola[i];
            j++;
        }
        cola[tam-1]=null;

        this.ultimo = this.ultimo - this.primero;
        primero = 0;
        
    }

    public void mostrar(){
        if (esvacia()) {
            System.out.println("esta vacia");
            return;
        }
        for (int i = this.primero; i <= this.ultimo; i++) {
            System.out.println(cola[i]);
        }
    }
}
