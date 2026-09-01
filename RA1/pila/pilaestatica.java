class pilaestatica {
    private Object[] pila;
    private int tam;
    private int tope;


    //constructor 
    public pilaestatica(int tam){
        this.tam =tam;
        this.tope=-1;
        this.pila = new Object[tam];
    }

    public boolean espilallena(){
        return this.tope==(this.tam-1);
    }

    public boolean espilavacia(){
        return this.tope==-1;
    }

    public Object cima(){
        return this.pila[tope];
    }
    public void ingresar(Object x){
        if(!espilallena()){
            this.tope++;
            this.pila[tope] = x;
        }else{
            System.out.println("La pila esta llena");
        }
        
    }
    public void eliminar(){
        //comprobar si esta vacio
        if(!this.espilavacia()){
            this.pila[tope]=null;
            this.tope--;
        }else{
            System.out.println("la pila esta vacia");
        }
    }

    public void mostrar(){
        int i = tope;
        if(!espilavacia()){
            while(i>=0){
                System.out.println(pila[i]);
                i--;
            }
        }else{
            System.out.println("La pila esta vacia");
        }
        
    }

    
//dado un objeto devolver la posicion
    public void buscar(Object x){
    }

}
