class listacircular{
    private nodo primero;
    private nodo ultimo;
    private int tam;

    public listacircular(){
        this.primero=this.ultimo = null;
        tam=0;
    }

    private boolean esvacia(){
        return this.primero==null;
    }

    //ingresar

    //primero
    private void ingresar_primero(nodo nuevo){

        if(esvacia()){
            this.primero=ultimo=nuevo;
        }else{
            nuevo.enlazar(this.primero);
            this.primero=nuevo;
        }
        //circular
        this.ultimo.enlazar(this.primero);
        tam++;
    }
    //ultimo
    private void ingresar_ultimo(nodo nuevo){
        if(esvacia()){
            this.primero=this.ultimo=nuevo;
        }else{
            this.ultimo.enlazar(nuevo);
            this.ultimo=nuevo;
        }
        this.ultimo.enlazar(this.primero);
        tam++;
    }
    public void ingresar(Object x, int pos){
        nodo nuevo = new nodo(x);
        //primero
        if(pos==0){
            ingresar_primero(nuevo);
            return;
        }
        //ultimo
        if(pos==tam-1){
            ingresar_ultimo(nuevo);
            return;
        }
        //medio
        nodo aux = this.primero;
        //avanzar
        for (int i = 0; i < pos; i++) {
            aux=aux.getsig();
        }
        nuevo.enlazar(aux.getsig());
        aux.enlazar(nuevo);
        tam++;
    }

    private void  eliminar_primero(){
        if (esvacia()) {
            System.out.println("esta vacio");
        }else{
            if(tam==1){
                  this.primero=this.ultimo=null;
            }else{
                this.primero=this.primero.getsig();
                this.ultimo.enlazar(primero);
            }
            tam--;            
        }
    }

    private void eliminar_ultimo(){
        if(esvacia()){
            System.out.println("esta vacio");
        }else{

            if(tam==1){
                this.primero=this.ultimo=null;

            }else{
                nodo aux = this.primero;
                while(aux.getsig()!=this.ultimo){
                    aux=aux.getsig();
                }
                this.ultimo=aux;
                aux.enlazar(this.primero);
            }
            tam--;

        }

    }
    //eliminar
    public void eliminar(int pos){
        if(pos==0){
            eliminar_primero();
            return;
        }
        if(pos==tam-1){
            eliminar_ultimo();
            return;
        }

        nodo aux = this.primero;
        //avanzar
        for (int i = 0; i < pos; i++) {
            aux=aux.getsig();
        }

        aux.enlazar(aux.getsig().getsig());
        tam--;

    }


    //desafio->valor
    public void buscar(){
        return;
    }


    public void mostrar(){
        nodo aux=this.primero;
        if (esvacia()) {
            System.out.println("esta vacio");
            return;
        }
        do{
            System.out.println(aux.getvalor());
            aux=aux.getsig();
        }while(aux!=this.primero);
        //for (int i = 0; i <tam ; i++){}
    }
}