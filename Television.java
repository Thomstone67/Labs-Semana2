/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2ex2;

/**
 *
 * @author thomas
 */
public class Television {
    //usar nextLine o input
    //nota: não use double, nunca :)
    private String modelo;
    private double preco, tamanho;
    private int volume, canal;
    private boolean ligada;
    
    public void setModelo(String n){
        modelo = n;
    }
    public void setPreco(double n){
        preco = n;
    }
    public void setTamanho(double n){
        tamanho = n;
    }
    public void setVolume(int n){
        volume = n;
    }
    public void setCanal(int n){
        canal = n;
    }
    public void setLigada(boolean n){
        ligada = n;
    }
    
    public String getModelo(){
        return modelo;
    }
    public double getPreco(){
        return preco;
    }
    public double getTamanho(){
        return tamanho;
    }
    public int getVolume(){
        return volume;
    }
    public int getCanal(){
        return canal;
    }
    public boolean getLigada(){
        return ligada;
    }
    
    public void alteraVolume(int n){
        if (n>=0){
            volume = n;
        }
        System.out.printf("Volume: \n"+ volume);
    }
    
    public void alteraCanal(int n){
        if(n>=0){
            canal = canal+1;
            System.out.printf("Canal "+canal);
        }else{
            System.out.printf("Canal "+n);

        }
    }
    
}
