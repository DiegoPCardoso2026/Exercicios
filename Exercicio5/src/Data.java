/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carol
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public String imprimir()
     {
         String data = this.dia +"/" + this.mes + "/" + this.ano;
         return data;
     }
    
    
}
