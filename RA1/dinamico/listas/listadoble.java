class listadoble{
    //atributos

    private doblenodo primero;
    private doblenodo ultimo;
    private int tam;

    //metodos

    public listadoble(){
        this.primero=this.ultimo = null;
        this.tam=0;
    }

    private boolean esvacia(){
        return this.primero==null;
    }

    private void ingresar_vacio(doblenodo x){
        this.primero = this.ultimo=x;
        tam++;
    }

    private void ingresar_primero(doblenodo x){
        x.enlazar(this.primero);
        this.primero=x;
        tam++;
    }

    private void ingresar_ultimo(doblenodo x){
        this.ultimo.enlazar(x);
        this.ultimo=x;
        tam++;
    }

    private void eliminar_primero(){
        if (tam <= 1) {
            this.primero = null;
            this.ultimo = null;
        } else {
            this.primero = this.primero.getsig();
            this.primero.desenlazar();
        }
        tam--;
    }

    private void eliminar_ultimo(){
        if (tam>1){
            this.ultimo=this.ultimo.getant();
            this.ultimo.desenlazar();
        }else{
            this.primero=this.ultimo=null;
        }

        tam--;

    }
    
    public void ingresar(Object x, int pos){

        /*
        metodo de ingresa a la lista dado el valor y la posicion
        input= 
        Object x -> dato que se ingresará
        int pos -> posicion donde quiero agregar

        return null
         */
        doblenodo nuevo = new doblenodo(x);
        //determinar en caso vacio
        if(esvacia()){
            ingresar_vacio(nuevo);
            return;
        }

        //previo al primero
        if (pos ==0){
            ingresar_primero(nuevo);
            return;
        }

        if (pos>=tam){
            ingresar_ultimo(nuevo);
            return;
        }
        doblenodo aux = this.primero;
        for (int i=1; i<pos;i++){
            aux = aux.getsig();
        }

        nuevo.enlazar(aux.getsig());
        aux.enlazar(nuevo);

        tam++;

    }

    public void eliminar(int pos){
        /*
        metodo de elimina un elemento dentro de la lista dando la posicion
        input= 
        int pos -> posicion del elemento que quiero eliminar.
        return null
         */
        if (esvacia()){
            System.out.println("esta vacia");
            return;
        }

        if (pos ==0){
            eliminar_primero();
            return;
        }

        if (pos >=tam){
            eliminar_ultimo();
            return;
        }
        doblenodo aux = this.primero;
        for (int i = 1; i < pos; i++) {
            aux=aux.getsig();
        }

        //eliminacion general

        aux.enlazar(aux.getsig().getsig());
        tam--;
    }

    public void mostrar(){
        doblenodo aux = this.primero;
        for (int i = 0; i < tam; i++) {
            System.out.println(aux.getdato());
            aux=aux.getsig();
        }

    }

    public void buscar(Object x){
        /*
            desafio: la idea es dado un valor x, el metodo debe buscar y devolver la posicion dentro de la lista, asegurese que exista.
            return pos
         */
    }

}