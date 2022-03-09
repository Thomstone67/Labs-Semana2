/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2ex5;

/**
 *
 * @author thomas
 */
public class PerfilDeSaude {
    private String nome, sobrenome, data_de_nat;
    private double altura, peso;
    int dia, mes, ano;
    
    public void setNome(String n){
        nome = n;
    }
    public void setSobrenome(String n){
        sobrenome = n;
    }
    public void setDia(int n){
        dia = n;
    }
    public void setMes(int n){
        mes = n;
    }
    public void setAno(int n){
        ano = n;
    }
    public void setAltura(double n){
        altura = n;
    }
    public void setPeso(double n){
        peso = n;
    }
    
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public String getDDN(){
        return data_de_nat;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }
    
    public String getDDN(int dia, int mes, int ano){
        return data_de_nat = dia+"/"+mes+"/"+ano;
    }
    public double getIMC(double p, double a){
        double imc=p/(a*a);
        return imc;
    }
    
    public int getIdade(int a){
        int r = 2022-a;
        return r;
    }
    
}