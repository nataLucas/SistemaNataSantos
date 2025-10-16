/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.NlcUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Lucas
 */
public class ControllerUsuarios extends AbstractTableModel {
    
    private List lstUsuarios;
    
    public void setLista(List lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }
    
    public NlcUsuarios getBean (int rowIndex) {
        return(NlcUsuarios) lstUsuarios.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return lstUsuarios.size();
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        NlcUsuarios usuarios = (NlcUsuarios) lstUsuarios.get(rowIndex);
        if (columnIndex == 0) {
            return usuarios.getNlcIdusuarios();
        }
        if (columnIndex == 1) {
            return usuarios.getNlcNome();
        }
        if (columnIndex == 2) {
            return usuarios.getNlcCpf();
        }
        if (columnIndex == 3) {
            return usuarios.getNlcApelido();
        }
        else {
            return "";
        }
    }
    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "CPF";
        }
        if (column == 3) {
            return "Apelido";
        }else {
            return "";
        }
    }
    
}