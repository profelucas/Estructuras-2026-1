class doblenodo {
    //atributos
    private Object dato;
    private doblenodo sig;
    private doblenodo ant;

    //metodos
    //crear
    public doblenodo(Object dato){
        this.dato=dato;
        this.sig=this.ant=null;
    }
    //gets
    public Object getdato(){
        return this.dato;
    }
    public doblenodo getsig(){
        return this.sig;
    }

    public doblenodo getant(){
        return this.ant;
    }

    //sets
    private void setsig(doblenodo s){
        this.sig=s;
    } 
    private void setant(doblenodo a){
        this.ant=a;
    }

    public void enlazar(doblenodo a){
        this.setsig(a);
        a.setant(this);
    }

    public void desenlazar(){
        this.ant=null;
    }
}