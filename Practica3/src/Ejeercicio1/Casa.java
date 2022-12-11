package Ejeercicio1;

public class Casa {
    protected int precio = 96000;
    // Para poner un tipo caracter debemos de poner una comilla no dos.
    protected char letra = 'A';
    protected String referencia_castastral = "1234567 AB1234A 0000 AB";
    protected Integer IVA = 21/100 ;
    protected Integer IVA_reducido = 16/100 ;
    void precio_IVA (int precio, Integer IVA) {
        precio = precio * (IVA);
        System.out.println("El precio con IVA es: " + precio);
    }
    void precio_IVAreducido (int precio, Integer IVA_reducido) {
        precio = precio * (IVA_reducido);
        System.out.println("El precio con un IVA reducido es: " + precio);
    }
    void Imprimir_todo (int precio, Integer IVA, Integer IVA_reducido, String referencia_castastral){
        System.out.println("El precio con un IVA reducido es: " + precio * IVA_reducido);
        System.out.println("El precio con IVA es: " + precio * IVA);
        System.out.println("La referencia catastral es: " + referencia_castastral);
    }
}
