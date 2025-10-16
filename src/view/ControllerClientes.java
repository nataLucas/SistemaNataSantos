/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.NlcClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lucas
 */
public class ControllerClientes extends AbstractTableModel {

    private List lstClientes;

    public void setLista(List lstClientes) {
        this.lstClientes = lstClientes;
    }

    public NlcClientes getBean(int rowIndex) {
        return (NlcClientes) lstClientes.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstClientes.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        NlcClientes usuarios = (NlcClientes) lstClientes.get(rowIndex);
        if (columnIndex == 0) {
            return usuarios.getNlcIdClientes();
        }
        if (columnIndex == 1) {
            return usuarios.getNlcNome();
        }
        if (columnIndex == 2) {
            return usuarios.getNlcCpf();
        }
        if (columnIndex == 3) {
            return usuarios.getNlcAtivo();
        } else {
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
            return "Ativo";
        } else {
            return "";
        }
    }

}
