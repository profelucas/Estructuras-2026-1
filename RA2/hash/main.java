public class main {

    public static void main(String[] args) {
        hash ej1 = new hash(10);
        int  el1 = ej1.hashing("subaru");
        int el2 =ej1.hashing("fiat");
        System.out.println(el1);
        System.out.println(el2);
        System.out.println(ej1.hashing("nissan"));
        System.out.println(ej1.hashing("toyota"));
        ej1.ingresar("subaru");
        ej1.ingresar("fiat");
        ej1.ingresar("nissan");
        ej1.ingresar("toyota");
        ej1.mostrar_todos();
    }
    
}
