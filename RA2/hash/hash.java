public class hash {
    private String [] datos;
    private int tam;

    public hash(int tam){
        this.tam=tam;
        this.datos=new String[tam];
    }

    public int hashing(String n){
        int result=0;
        for(int i = 0; i<n.length();i++){
            result+=n.charAt(i);
        }
        return result%tam;
    }

    public void ingresar(String n){
        int pos = hashing(n);

        if(datos[pos]!=null){
            System.out.println("existe colision");
            //sondeo lineal
            while(datos[pos]!=null){
                pos++;
                //lleno
                if(pos==tam){
                    System.out.println("llegamos al limite");
                    return;
                }
            }
        }
        datos[pos]=n;

    }

    public void mostrar(int pos){
        System.out.println(this.datos[pos]);
    }

    public void mostrar_todos(){
        for (int i = 0; i<tam; i++){
            if (datos[i]!=null) {
                System.out.println(datos[i]);
            } else {
                System.out.println("0");
            }
        }
    }
}
