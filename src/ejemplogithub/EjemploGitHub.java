/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogithub;

/**
 *
 * @author Carlos Cardoso
 */
public class EjemploGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nombre;
        String apellido;
        String sexo;
        int edad;

        Persona persona = new Persona();

        persona.setNombre("Carlos Luis");
        persona.setApellido("Cardoso");
        persona.setEdad(23);
        persona.setSexo("M");

        nombre = persona.getNombre();
        apellido = persona.getApellido();
        edad = persona.getEdad();
        sexo = persona.getSexo();
        System.out.println("");
        System.out.println("DATOS");
        System.out.println(nombre+" "+apellido+" edad: "+edad+" sexo: "+sexo);

    }

}
