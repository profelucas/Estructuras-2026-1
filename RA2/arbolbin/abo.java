class abo{
    private int dato;
    private abo der;
    private abo izq;

    public abo(){
        dato = -1;
        izq = null;
        der =null;
    }

    public int getdato(){
        return this.dato;
    }
    public abo getizq(){
        return this.izq;
    }

    public abo getder(){
        return this.der;
    }
    private boolean esvacio(){
        return dato == -1 ;
    }

    private void insertarraiz(int n){
        this.dato = n;
    }

    public void insertar(int n){
        if (esvacio()){
            this.insertarraiz(n);
        }else{
            if(dato>n){
                //izq
                if (this.izq ==null){
                    izq = new abo();
                    izq.insertarraiz(n);
                }else{
                    izq.insertar(n);
                }
            }else{
                //der
                if (this.der ==null){
                    der = new abo();
                    der.insertarraiz(n);
                }else{
                    der.insertar(n);
                }
            }
        }
    }

    public void inorden(){
        if (this.izq!=null){
            izq.inorden();
        }
        System.out.println(this.dato);

        if(this.der!=null){
            der.inorden();
        }

    }
    //eliminar
    //mayor subarbol izq
    private int mayorvalor(abo sub){
        while (sub.der!=null){
            sub =sub.der;
        }
        return sub.dato;
    }
    //menor subarbol derecho-> tarea
    public abo eliminar(int n){
        //buscar

        if (n < dato){
            if (izq!= null){
                izq =izq.eliminar(n);
            }
        }else{
            if (n > dato){
                if(der!= null){
                    der=der.eliminar(n);
                }
            }else{
                //encontrado -> dato == n

                //hoja
                if(this.izq == null && this.der == null){
                    return null;
                }
                //un hijo
                if (izq == null){
                    return der;
                }
                if (der == null){
                    return izq;
                }
                //dos hijos
                int el = mayorvalor(izq); 
                dato = el;
                izq = izq.eliminar(el);
            }
        }

        return this;
    }
    //buscar
    public boolean buscar(int encontrar){
        //encontrado
        if (dato == encontrar){
            return true;
        }
        else{
            if (encontrar > dato){
                if (der == null){
                    return false;
                }
                return der.buscar(encontrar);
            }else{
                if (izq == null){
                    return false;
                }
                return izq.buscar(encontrar);
            }
        }
    }

    public void union(abo a2){
        pilaestatica e1 = new pilaestatica(50);
        pilaestatica e2 = new pilaestatica(50);

        abo actual1= this;
        abo actual2 = a2;

        while(actual1!=null || actual2!=null || !e1.espilavacia() ||!e2.espilavacia()){
            while(actual1!=null){
                e1.ingresar(actual1);
                actual1= actual1.getizq();
            }

            while(actual2!=null){
                e2.ingresar(actual2);
                actual2=actual2.getizq();
            }

            if(e2.espilavacia() || (!e1.espilavacia() && (((abo)e1.cima()).getdato() <= ((abo)e2.cima()).getdato()))){
                actual1 = (abo)e1.eliminar();
                System.out.print(actual1.getdato()+" ");
                actual1= actual1.getder();
            }else{
                actual2 = (abo)e2.eliminar();
                System.out.print(actual2.getdato()+" ");
                actual2=actual2.getder();
            }
        }

    }

}