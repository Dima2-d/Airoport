package com.company.Airoport.ui.forms;

import com.company.Airoport.model.Airoport;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;


public class AiroportTableModel extends AbstractTableModel{
    public static final String [] colums = {"Name", "City", "Counry", "IATA", "ICAO"};
    private List<Airoport> airoports = new ArrayList<>();

    @Override
    public int getRowCount() {
        return airoports.size();
    }

    @Override
    public int getColumnCount() {
        return colums.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        if (airoports.size() <= rowIndex){
            return null;
        }
        Airoport airoport = airoports.get(rowIndex);
        switch (columnIndex){
            case 0:
                return airoport.getName();
            case 1:
                return airoport.getCity();
            case 2:
                return airoport.getCountry();
            case 3:
                return airoport.getIata();
            case 4:
                return airoport.getIcao();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return colums[column];

    }

    public void setAiroports(List<Airoport> airoports) {
        this.airoports.clear();
        this.airoports.addAll(airoports);
        fireTableDataChanged();
    }

    public List<Airoport> getAiroportByRows(int [] selectedRows) {
        List<Airoport> list = new ArrayList<>();
        for (int selectedRow : selectedRows){
            list.add(airoports.get(selectedRow));
        }
        return list;
    }
}
