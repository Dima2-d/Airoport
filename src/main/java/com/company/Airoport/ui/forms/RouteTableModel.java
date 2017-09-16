package com.company.Airoport.ui.forms;

import com.company.Airoport.model.Route;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class RouteTableModel extends AbstractTableModel {
    private List<Route> routes;

    @Override
    public int getRowCount() {
        return routes != null ? routes.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (routes == null) {
            return null;
        }
        Route route = routes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return route.getAirline().getName();
            case 1:
                return route.getSrcAiroport().getName();
            case 2:
                return route.getDstAiroport().getName();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Airline";
            case 1:
                return "Source";
            case 2:
                return "Destination";
            default:
                return null;
        }
    }

    public void setData(Iterable<Route> routes) {
        this.routes = new ArrayList<>();
        routes.forEach(this.routes::add);
        fireTableDataChanged();
    }
}