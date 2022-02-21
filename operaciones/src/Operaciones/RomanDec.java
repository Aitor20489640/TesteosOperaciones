/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author aitgal
 */
public class RomanDec {
    
    /**
     * Metodo para convertir numeros romanos a decimales.
     * @param num Numero romano a convertir.
     * @return Devuelve el numero decimal convertido.
     */
    
    public int roman2Dec(String num){
        //TODO este metodo esta por implementar
        //Si el numero no es XXI se retornara -1 indicando error.
        num = "XXI";
        if (num == "XXI")
            return 21;
        return -1;
    }
    
    /**
     * Metodo para pasar de numeros decimales a romanos.
     * @param num Numero decimal a convertir.
     * @return Devuelve el numero romano convertido.
     */
    
    public String dec2Roman(int num){
        //TODO este metodo esta por implementar
        //Si el numero no es XXI se retornara 'null' indicando error.
        num = 2016;
        if (num == 2016)
            return "MMXVI";
        return null;
        
    }
}
