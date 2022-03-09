package s2ex3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thomas
 */
public class Funcionario {
    private String nome, sobrenome;
    private double salario_m;
    
    public void setNome(String n){
        nome=n;
    }
    
    public void setSobrenome(String n){
        sobrenome=n;
    }
    
    public void setSalarioM(double n){
        salario_m=n;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public double getSalarioM(){
        return salario_m;
    }
    
    public double salan(double n){
        double sal_ano;
        sal_ano = n*12;
        return sal_ano;
    }
    
}
