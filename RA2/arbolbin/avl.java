class avl {
        private int dato;
        private int altura;
        private avl izq;
        private avl der;

        public avl(){
            dato = -1;
            altura = 0;
            izq = der = null;

        }


        private boolean esvacio(){
            return dato==-1;
        }

        private int altura (avl nodo){
            if (nodo ==null){
                return 0;
            }else{
                return nodo.altura;
            }
        }

        private int actualizaraltura(){
            int i=altura(izq);
            int d =altura(der);
            if (i>d){
                altura = 1+ i;
            }else{
                altura =1+d;
            }
            return altura;

       }

        private int balance(){
            return altura(izq)-altura(der); 
        }

        private avl rotacionizquierda(){
            avl nuevaraiz =der;
            avl temp = nuevaraiz.izq;
            nuevaraiz.izq=this;
            this.der = temp;

            this.actualizaraltura();
            nuevaraiz.actualizaraltura();

            return nuevaraiz;
        }

        private avl rotacionderecha(){
            avl nuevaraiz =izq;
            avl temp = nuevaraiz.der;
            nuevaraiz.der = this;
            this.izq= temp;

            this.actualizaraltura();
            nuevaraiz.actualizaraltura();

            return nuevaraiz;
        }

        private void insertarraiz(int n){
            dato =n;
            altura=1;
        }

        public avl insertar(int n){
            if(esvacio()){
                insertarraiz(n);
                return this;
            }

            if (n <dato){
                if (izq ==null){
                    izq = new avl();
                    izq.insertarraiz(n);
                }else{
                    izq =izq.insertar(n);
                }
            }else{
                if (der== null){
                    der = new avl();
                    der.insertarraiz(n);
                }else{
                    der = der.insertar(n);
                }
            }
            actualizaraltura();

            int balance = balance();

            //balanceo correspondientes

            if (balance > 1){
                if(n< izq.dato){
                    return rotacionderecha();
                }else{
                    if ( n > izq.dato ){
                        izq = izq.rotacionizquierda();
                        return rotacionderecha();
                    }
                }
            }else{
                if (balance < -1){
                    if (n > der.dato){
                        return rotacionizquierda();
                    }else{
                        if (n < der.dato){
                            der = der.rotacionderecha();
                            return rotacionizquierda();
                        }
                    }
                }
            }
            return this;

        }

        //desafio aplicar la eliminacion

        
}
