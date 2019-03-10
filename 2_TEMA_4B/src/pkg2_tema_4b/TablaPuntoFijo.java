
package pkg2_tema_4b;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TablaPuntoFijo extends AbstractTableModel {
    
    private String columnas[]={"i","xi","gxi","error"};
    private ArrayList<IteracionPuntoFijo> lista;
    
    
    public TablaPuntoFijo(ArrayList<IteracionPuntoFijo> lista) {
        this.lista = lista;
    }
    
  
    public int getRowCount() {
        //To change body of generated methods, choose Tools | Templates.
    
      return this.lista.size();
    }

    
    public int getColumnCount() {
         //To change body of generated methods, choose Tools | Templates.
   
       return this.columnas.length;
    }

   
    public Object getValueAt(int rowIndex, int columnIndex) {
      //To change body of generated methods, choose Tools | Templates.
    
     IteracionPuntoFijo fila = this.lista.get(rowIndex);
     switch(columnIndex){
         case 0: return fila.getI();
         case 1: return fila.getXi();
         case 2: return fila.getGxi();
         case 3: return fila.getError();
    } 
     return null;
   }
 
    public String getColumnName(int column) {
        return this.columnas[column]; //To change body of generated methods, choose Tools | Templates.
    }

      
}
