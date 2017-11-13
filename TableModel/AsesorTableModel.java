package TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import TableModel.*;
import Classes.Asesor;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;


public class AsesorTableModel extends  AbstractTableModel implements TableModelListener {
    
    ArrayList<Asesor> lista;
    String[] encabezados;
    
    public AsesorTableModel()
    {
        lista  = new ArrayList<Asesor>();
        
        encabezados = new String[7];
        
        encabezados[0] = "ID";
        encabezados[1] = "Nombre";
        encabezados[2] = "Apellido Paterno";
        encabezados[3] = "Apellido Materno";
        encabezados[4] = "Cubiculo";
        encabezados[5] = "Correo Electronico";
        encabezados[6] = "Horario de Asesoria";
       
    }
    
    public AsesorTableModel(ArrayList<Asesor> lista)
    {
        this();
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return encabezados.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex >= 0 && columnIndex < encabezados.length)
            return encabezados[columnIndex];
        
        return "Sin Nombre";
    }

    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Asesor ase = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return  ase.getIdAsesor();
            case 1: return  ase.getNombre();
            case 2: return  ase.getAppPaterno();
            case 3: return  ase.getAppMaterno();
            case 4: return  ase.getCubículo();
            case 5: return  ase.getCorreoElectrónico();
            case 6: return  ase.getHorarioDeAsesorías();
            default: return "Non emplementar";
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex<0 && columnIndex< 0)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        Asesor ase = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: ase.setIdAsesor((int)aValue);
                     break;
            case 1: ase.setNombre((String)aValue);
                     break;
            case 2: ase.setAppPaterno((String)aValue);
                     break;
            case 3: ase.setAppMaterno((String)aValue);
                     break;
            case 4: ase.setCubículo((String)aValue);
                     break;
            case 5: ase.setCorreoElectrónico((String)aValue);
                     break;
            case 6: ase.setHorarioDeAsesorías((String)aValue);
                     break;
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }

}
