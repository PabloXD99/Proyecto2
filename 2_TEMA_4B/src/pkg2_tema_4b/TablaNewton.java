
package pkg2_tema_4b;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TablaNewton extends AbstractTableModel{
    private String columnas[]={"i","xi","fxi","f'xi","fxi/f'xi","xi+1","error"};
    
    private ArrayList<IteracionNewton> lista;

    public TablaNewton(ArrayList<IteracionNewton> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        //To change body of generated methods, choose Tools | Templates.
    
      return this.lista.size();
    }

    @Override
    public int getColumnCount() {
         //To change body of generated methods, choose Tools | Templates.
   
       return this.columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      //To change body of generated methods, choose Tools | Templates.
    
     IteracionNewton fila = this.lista.get(rowIndex);
     switch(columnIndex){
         case 0: return fila.getI();
         case 1: return fila.getXi();
         case 2: return fila.getFxi();
         case 3: return fila.getFxid();
         case 4: return fila.getFxir();
         case 5: return fila.getFxiR();
         case 6: return fila.getError();
        
     }
     return null;
     
    }

    @Override
    public String getColumnName(int column) {
        return this.columnas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}