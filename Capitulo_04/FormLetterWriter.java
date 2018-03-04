/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;
public class FormLetterWriter {
    private String nombre;
    private String apellido;
    
    
       public   FormLetterWriter (String a ){
        this.apellido=a;
}
    
         public  FormLetterWriter (String n, String a ){
        this.nombre=n;
        this.apellido=a;
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldo() {
        return apellido;
    }

    public void setApelldo(String apelldo) {
        this.apellido = apelldo;
    }
   public String toString(){
       
  
       
       return "Estimado " + nombre+" "+apellido+"\nThank you for your recent order";
   }
   }
