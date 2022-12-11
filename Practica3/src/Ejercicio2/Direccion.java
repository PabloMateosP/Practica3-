package Ejercicio2;

public class Direccion {
    String calle = "Calle Los Naranjos";
    Integer numero = 47;
    String piso = "3ºA";
    Integer codigoPostal = 11660;
    String pueblo = "Ubrique";
    String localidad = "Cádiz";
    void imprimir_direccion (String calle, Integer numero, String piso, Integer codigoPostal, String pueblo, String localidad){
        System.out.println("La direccion de este alumno es: " + calle + " ," + numero + " ," + codigoPostal + " " + pueblo + " (" + localidad + ")");
    }
}
