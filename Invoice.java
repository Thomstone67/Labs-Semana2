/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2ex4;

/**
 *
 * @author thomas
 */

public class Invoice {
    private String identificador, descricao;
    private int quantidade;
    private double preco;
    
    public void setID(String n){
        identificador = n;
    }
    public void setDescrip(String n){
        descricao = n;
    }
    public void setQuant(int n){
        quantidade = n;
    }
    public void setPreco(double n){
        preco = n;
    }
    
    
    public String getID(){
        return identificador;
    }
    public String getDescrip(){
        return descricao;
    }
    public int getQuant(){
        return quantidade;
    } 
    public double getPreco(){
        return preco;
    }
    
    public double getInvoiceAmount(int qua, double prec){
        double result = qua * prec;
        return result;
    }
}
