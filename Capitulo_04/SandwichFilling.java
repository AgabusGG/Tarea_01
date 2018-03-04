/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;
public class SandwichFilling {
    private String filling;
    private Integer calorias;
    
    public  SandwichFilling(String fil, Integer cal){
    
    this.filling = fil;
    this.calorias = cal;
}

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }
    
}
