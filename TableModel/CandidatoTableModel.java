/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Classes.Candidato;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;


public class CandidatoTableModel extends  AbstractTableModel implements TableModelListener {
    
    ArrayList<Candidato> lista;
    String[] encabezados;
    
    public CandidatoTableModel()
    {
        lista  = new ArrayList<Candidato>();
        
        encabezados = new String[16];
        
        encabezados[0] = "ID";
        encabezados[1] = "Nombre";
        encabezados[2] = "Apellido Paterno";
        encabezados[3] = "Apellido Materno";
        encabezados[4] = "Foto";
        encabezados[5] = "Boleta";
        encabezados[6] = "Correo Electronico";
        encabezados[7] = "Telefono";
        encabezados[8] = "Carrera";
        encabezados[9] = "Generacion";
        encabezados[10] = "Tema de Tesis";
        encabezados[11] = "Director de Tesis";
        encabezados[12] = "Trabajo";
        encabezados[13] = "Lugar de trabajo";
        encabezados[14] = "Horario de trabajo";
        encabezados[15] = "Admitido";
    }
    
    public CandidatoTableModel(ArrayList<Candidato> lista)
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
        
        Candidato candi = lista.get(rowIndex);
        
        switch(columnIndex)
        {
        
            case 0: return candi.getIdCandidato();
            case 1: return  candi.getNombre();
            case 2: return  candi.getAppPaterno();
            case 3: return  candi.getAppMaterno();
            case 4: return  candi.getFoto();
            case 5: return  candi.getBoleta();
            case 6: return  candi.getCorreoElectrónico();
            case 7: return  candi.getTeléfonoCelular();
            case 8: return  candi.getCarrera();
            case 9: return  candi.getGeneración();
            case 10: return  candi.getTemaDeTesis();
            case 11: return  candi.getDirectorDeTesis();
            case 12: return  candi.getTrabaja();
            case 13: return  candi.getLugarDeTrabajo();
            case 14: return  candi.getHorarioDeTrabajo();
            case 15: return  candi.getAdmitido();
            
            default: return "Non emplementar";
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex<0 && columnIndex< 0)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        Candidato candi = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:  candi.setIdCandidato((int) aValue);
                     break;
            case 1: candi.setNombre((String)aValue);
                     break;
            case 2: candi.setAppPaterno((String)aValue);
                     break;
            case 3: candi.setAppMaterno((String)aValue);
                     break;
            case 4: candi.setFoto((String)aValue);
                     break;
            case 5: candi.setBoleta((String)aValue);
                     break;
            case 6: candi.setCorreoElectrónico((String)aValue);
                     break;
            case 7: candi.setTeléfonoCelular((int)aValue);
                     break;
            case 8: candi.setCarrera((String)aValue);
                     break;
            case 9: candi.setGeneración((String)aValue);
                     break;
            case 10: candi.setTemaDeTesis((String)aValue);
                     break;
            case 11: candi.setDirectorDeTesis((String)aValue);
                     break;
            case 12: candi.setTrabaja((String)aValue);
                     break;
            case 13: candi.setLugarDeTrabajo((String)aValue);
                     break;
            case 14: candi.setLugarDeTrabajo((String)aValue);
                     break;
            case 15: candi.setAdmitido((String)aValue);
                     break;
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }

}
