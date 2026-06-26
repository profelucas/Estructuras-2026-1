class main{
    public static void main(String[] args) {
        hash ejemplo = new hash(10);

        int a[] = {1,2,3,3,1,5};
        ejemplo.ingresar(a);
        ejemplo.mostrar();
        
        int b[]={5,1,6,7,16};

        hash ejemplo2 = new hash(20);
        ejemplo2.ingresar(b);
        ejemplo2.pares(6);

    }
}