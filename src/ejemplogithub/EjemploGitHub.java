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
        String nombre1;
        String apellido1;
        String sexo1;
        int edad1;

        Persona persona = new Persona();

        persona.setNombre("Carlos Luis");
        persona.setApellido("Cardoso");
        persona.setEdad(23);
        persona.setSexo("M");
        
        nombre = persona.getNombre();
        apellido = persona.getApellido();
        edad = persona.getEdad();
        sexo = persona.getSexo();
        
        Persona persona1 = new Persona();

        persona1.setNombre("Paula");
        persona1.setApellido("Abad");
        persona1.setEdad(10);
        persona1.setSexo("F");
        nombre1 = persona1.getNombre();
        apellido1 = persona1.getApellido();
        edad1 = persona1.getEdad();
        sexo1 = persona1.getSexo();
        System.out.println("");
        System.out.println("DATOS");
        System.out.println(nombre+" "+apellido+" edad: "+edad+" sexo: "+sexo);
        System.out.println(nombre1+" "+apellido1+" edad: "+edad1+" sexo: "+sexo1);

    }

}
