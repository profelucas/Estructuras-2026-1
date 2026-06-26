class hash{
    private int[] valor;

    private int tam;

    private void rellenar(){
        for (int i = 0; i < valor.length; i++) {
            valor[i]=0;

        }
    }
    public hash(int tam){
        this.tam=tam;
        this.valor=new int[tam];
        rellenar();
    }

    public void calcular(int dato){
        valor[dato]+=1;

    }

    public void ingresar(int a[]){
        for (int i = 0; i < a.length; i++) {
            calcular(a[i]);
        }
    }

    public void mostrar(){
        for (int i = 0; i < valor.length; i++) {
            if (valor[i]!=0){
                System.out.println(i+"->"+valor[i]);
            }
        }
    }

    public void pares(int x){

    for(int i=0;i<valor.length;i++){
        if(valor[i] > 0){
            int complemento = x - i;
            if (i< complemento){
                if(complemento >= 0 &&complemento < valor.length &&valor[complemento] > 0){
                    System.out.println(i + " " + complemento);
                }
            }
        }
    }
}

}