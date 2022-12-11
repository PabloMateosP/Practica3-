package Ejercicio2;

public class Alumno extends Direccion {

                String nombre;
                String apellido1 = "Pérez";
                String apellido2 = "Ponce";
                Integer edad = 18;
                String repetidor = "No";
                Integer NotaMedia = 8; //No me viene ahora como poner con comas.
                String correoElectronico = "manuelperez18@gmail.com";

                String getNombre (String nombre){
                        return nombre;
                }

                void setNombre(String nombre) {
                        this.nombre = nombre;
                }

                String getApellido1 (String apellido1){
                        return apellido1;
                }

                void setApellido1(String apellido1) {
                        this.apellido1 = apellido1;
                }
                String getApellido2 (String apellido2){
                        return apellido2;
                }

                void setApellido2(String apellido2) {
                        this.apellido2 = apellido2;
                }

                Integer getEdad (Integer edad){
                        return edad;
                }

                void setEdad(Integer edad) {
                        this.edad = edad;
                }

                String getRepetidor (String repetidor){
                        return repetidor;
                }

                void setRepetidor(String repetidor) {
                        this.repetidor = repetidor;
                }

                Integer getNotaMedia (Integer NotaMedia){
                        return NotaMedia;
                }

                void setNotaMedia(Integer NotaMedia) {
                        NotaMedia = NotaMedia;
                }

                String getCorreoElectronico (String correoElectronico){
                        return correoElectronico;
                }
                void setCorreoElectronico(String correoElectronico) {
                        this.correoElectronico = correoElectronico;
                }
                void Imprimir_nombre (String nombre) {
                        System.out.print("El nombre de este alumno es: " + nombre);
                }
                void Imprimir_edad (Integer edad) {
                        System.out.println("La edad de este alumno es: " + edad);
                }

    @Override
    void imprimir_direccion(String calle, Integer numero, String piso, Integer codigoPostal, String pueblo, String localidad) {
        super.imprimir_direccion(calle, numero, piso, codigoPostal, pueblo, localidad);
    }
}
