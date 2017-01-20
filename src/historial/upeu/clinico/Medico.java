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
public class Medico {
    private String nombre,apellidos,especialidad;
    private int dni;

    public Medico(String nombre, String apellidos, String especialidad, int dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.dni = dni;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public void verHistorialMedico(){
        JOptionPane.showMessageDialog(null,"DNI: "+dni+"\n Nombres: "+nombre+""
                    +" \n Apellidos: "+apellidos+"\n Especialidad: "+especialidad);
    }    
    
}
