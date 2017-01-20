/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historial.upeu.clinico;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE OROSCO
 */
public class Paciente {
    private String nombre,apellidos,genero;
    private int dni,edad;

    Paciente(String nombre, String apellidos, String genero, int dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.dni = dni;
        this.edad = edad;
    }

   

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void verHistorialPaciente(){
        JOptionPane.showMessageDialog(null,"DNI: "+dni+"\n Nombre: "+nombre+"\n Apellidos: "+apellidos+""
                    +"\n Edad: "+edad+"\n Genero: "+genero);
    }
    
}
