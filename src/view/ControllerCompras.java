/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.NlcCompra;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Lucas
 */
public class ControllerCompras extends AbstractTableModel {
    
    List lstCompra;
    
    public void setLista(List lstCompra) {
        this.lstCompra = lstCompra;
    }
    
    public NlcCompra getBean (int rowIndex) {
        return (NlcCompra) lstCompra.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return lstCompra.size();
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        NlcCompra Compra = (NlcCompra) lstCompra.get(rowIndex);
        if (columnIndex == 0) {
            return Compra.getNlcIdCompra();
        }
        if (columnIndex == 1) {
            return Compra.getNlcFormaPagamento();
        }
        if (columnIndex == 2) {
            return Compra.getNlcData();
        }
        if (columnIndex == 3) {
            return Compra.getNlcTotal();
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
            return "Forma de Pagamento";
        }
        if (column == 2) {
            return "Data";
        }
        if (column == 3) {
            return "Total";
        }else {
            return "";
        }
    }
    
}