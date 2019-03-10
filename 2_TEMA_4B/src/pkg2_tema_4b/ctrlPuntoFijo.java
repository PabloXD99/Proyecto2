
package pkg2_tema_4b;

import java.util.ArrayList;

public class ctrlPuntoFijo {
    private double xi;
    
    private int iteraciones;
    
    private double error;

    public ctrlPuntoFijo(double xi, int iteraciones, double error) {
        this.xi = xi;
        this.iteraciones = iteraciones;
        this.error = error;
    }
    
    
    private double getEvaluacion(double x){
     return Math.pow(Math.E, -x );

    }
    
    private boolean haySolucion(){
     boolean solucion=false;
     
     if(this.getEvaluacion(this.xi)!=0 )
         solucion=true;
     return solucion;
    
    }
    
    public ArrayList<IteracionPuntoFijo> getPuntoFijo(){
    
        int i=1;
        double errorCalculado=1;
        
        ArrayList<IteracionPuntoFijo> lista = null;
        
        if( this.haySolucion() ){
            
            lista = new ArrayList<IteracionPuntoFijo>();
            
          
            while( i < this.iteraciones && errorCalculado>this.error ){
             
              double gxi = this.getEvaluacion(this.xi);
              
              IteracionPuntoFijo fila = new IteracionPuntoFijo();
              
              fila.setI(i);
              
              fila.setXi(this.xi);
              
              fila.setGxi(gxi);
              
                           
              if(i==1){
                errorCalculado=1;
              }
              
              else{
                
                  double xXi = fila.getXi();
                  
                  
                  double xGxi = fila.getGxi();
                  
                  errorCalculado =Math.abs((xGxi-xXi)/xGxi);
                  
              }
              
              fila.setError(errorCalculado);
              
              System.out.println( fila.toString());
              
              lista.add(fila);
              
              if( fila.getXi()!= fila.getGxi()){
               this.xi= gxi;
              }
              
              i++;
          
          }
        }
        return lista;
        
    }
    
    
    
    public TablaPuntoFijo getTabla(){
     
        ArrayList<IteracionPuntoFijo> lista = this.getPuntoFijo();
     
        TablaPuntoFijo tabla= new TablaPuntoFijo(lista);
        
        return tabla;
    }
}