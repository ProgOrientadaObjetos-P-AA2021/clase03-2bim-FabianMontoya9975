/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herencias2;

/**
 * 
 * @author josef
 */
public class Policia extends Persona{
    
    private String rango;
    
    public Policia(String n, String a, int e, String ran){
        super(n, a, e);
        setRango(ran);
    }
    
//    @Override
//    public void setNombre(String n){
//        nombre = n.toUpperCase();    
//    }
    
    public void setRango(String r){
        rango = r;
    }
    
    public String getRango(){
        return rango;
    }
    
    @Override
    public String toString(){
    
        return String.format("%s - %s", super.toString(), getRango());
    }

}
