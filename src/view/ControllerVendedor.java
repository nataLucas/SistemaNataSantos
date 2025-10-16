/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.NlcVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ControllerVendedor extends AbstractTableModel {
    
    List lstVendedor;
    
    public void setLista(List lstVendedor) {
        this.lstVendedor = lstVendedor;
    }
    
    public NlcVendedor getBean (int rowIndex) {
        return (NlcVendedor) lstVendedor.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return lstVendedor.size();
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        NlcVendedor Vendedor = (NlcVendedor) lstVendedor.get(rowIndex);
        if (columnIndex == 0) {
            return Vendedor.getNlcIdVendedor();
        }
        if (columnIndex == 1) {
            return Vendedor.getNlcNome();
        }
        if (columnIndex == 2) {
            return Vendedor.getNlcTelefone();
        }
        if (columnIndex == 3) {
            return Vendedor.getNlcCpf();
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
            return "Telefone";
        }
        if (column == 3) {
            return "Cpf";
        }else {
            return "";
        }
    }
    
}