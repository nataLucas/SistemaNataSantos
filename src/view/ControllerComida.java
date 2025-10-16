/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.NlcComida;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Lucas
 */
public class ControllerComida extends AbstractTableModel {
    
    List lstcomida;
    
    public void setLista(List lstcomida) {
        this.lstcomida = lstcomida;
    }
    
    public NlcComida getBean (int rowIndex) {
        return (NlcComida) lstcomida.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return lstcomida.size();
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        NlcComida comida = (NlcComida) lstcomida.get(rowIndex);
        if (columnIndex == 0) {
            return comida.getNlcIdComida();
        }
        if (columnIndex == 1) {
            return comida.getNlcNome();
        }
        if (columnIndex == 2) {
            return comida.getNlcTipo();
        }
        if (columnIndex == 3) {
            return comida.getNlcSabor();
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
            return "Tipo";
        }
        if (column == 3) {
            return "Sabor";
        }else {
            return "";
        }
    }
    
}