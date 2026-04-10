public class listaenlazada {
    private nodo primero;
    private nodo ultimo;
    private int tam;

    public listaenlazada(){
        this.primero=this.ultimo=null;
        this.tam=0;
    }
    //esvacia
    private boolean esvacia(){
        return this.primero==null;
    }

    private void ingresar_primero(nodo n){
        if (esvacia()) {
            this.primero=this.ultimo=n;
        }else{
            n.enlazar(this.primero);
            this.primero = n;
        }
        tam++;
    }

    private void ingresar_ultimo(nodo n){
        if (esvacia()) {
            this.primero=this.ultimo=n;
        }else{
            this.ultimo.enlazar(n);
            this.ultimo=n;
        }
        tam++;
    }

    public void ingresar(Object nuevo, int pos){
        nodo n = new nodo(nuevo);

        //pos == 0->ingresar primero
        if (pos == 0) {
            ingresar_primero(n);
            return;
        }
        //pos == tam -> ingresar al final
        if(pos >= tam){
            ingresar_ultimo(n);
            return;

        }
        nodo aux = this.primero;
        for (int i = 0; i < pos-1; i++) {
            aux=aux.getsig();
        }
        n.enlazar(aux.getsig());
        aux.enlazar(n);
        tam++;
    }

    //mostrar todos los elementos de una lista

    public void mostrar(){
        nodo aux = this.primero;
        while(aux!=null){
            System.out.println(aux.getvalor());
            aux=aux.getsig();
        }
    }


    //eliminar

    private void eliminar_primero(){
        if (esvacia()) {
            System.out.println("esta vacia");
            return;
        }

        this.primero = this.primero.getsig();
        tam--;


    }

    private void eliminar_ultimo(){
        if (esvacia()) {
            System.out.println("esta vacio");
            return;
        }

        nodo aux = this.primero;

        while (aux.getsig()!=this.ultimo) {
            aux= aux.getsig();
        }

        this.ultimo=aux;
        this.ultimo.enlazar(null);
        tam--;

    }

    public void eliminar(int pos){

        //pos == 0-> eliminar primero
        //pos >= tam ->eliminar ultimo
        
        if (pos == 0) {
            eliminar_primero();
            return;
        }

        if (pos >= tam) {
            eliminar_ultimo();
            return;
        }
        nodo aux = this.primero;
        for (int i = 0; i < pos -1; i++) {
            aux =aux.getsig();
        }
    
        aux.enlazar(aux.getsig().getsig());
        tam--;
    }
    //buscar por elemento


    public void buscar(){

    }

}

