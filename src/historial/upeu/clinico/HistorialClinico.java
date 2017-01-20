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
public class HistorialClinico {
    private String observaciones;
    private int codigo,fecha,idPaciente,idMedico;

    public HistorialClinico(String observaciones, int codigo, int fecha, int idPaciente, int idMedico) {
        this.observaciones = observaciones;
        this.codigo = codigo;
        this.fecha = fecha;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
    public void verHistorialClinico(){
        JOptionPane.showMessageDialog(null,"Codigo: "+codigo+"\n Fecha: "+fecha+""
                    +" \n ID Paciente: "+idPaciente+"\n ID Medico: "+idMedico+"\n Observaciones"+observaciones);
    }    
    
}
