/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2ex1;

/**
 *
 * @author thomas
 */
public class Retangulo {
    private int lado1, lado2;
    
    public void setLado1(int n){
        lado1 = n;    
    }
    public void setLado2(int n){
        lado2 = n;
    }
    public int getLado1(){
        return lado1;
    } 
    public int getLado2(){
        return lado2;
    }
    
    public int area(int lado1, int lado2){
        int a = lado1*lado2;
        return a;
    }
    
    public int perimetro(int lado1, int lado2){
        int p = (2*lado1)+(2*lado2);
        return p;
    }
}
