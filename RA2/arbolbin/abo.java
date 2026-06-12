class abo{
    private int dato;
    private abo der;
    private abo izq;

    public abo(){
        dato = -1;
        izq = null;
        der =null;
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
}