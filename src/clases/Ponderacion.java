/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


public class Ponderacion {
    
    public double promedio;
    public double cal1;
    public double cal2;
    public double cal3;
    public double cal4;
    public double cal5;

    public Ponderacion(double cal1, double cal2, double cal3, double cal4, double cal5) {
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
        this.cal4 = cal4;
        this.cal5 = cal5;
    }
    
    public double getPromedio(){
        
        promedio = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;
        
        return promedio;
    }
    
}
