/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2ex3;

/**
 *
 * @author thomas
 */

import java.util.Scanner;
public class S2ex3 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        System.out.printf("Digite o nome do funcionário 1: ");
        f1.setNome(input.nextLine());
        
        System.out.printf("Digite o sobrenome do funcionário 1: ");
        f1.setSobrenome(input.nextLine());
        
        //se der erro use , como separador decimal
        System.out.printf("Digite o salário do funcionário 1: ");
        f1.setSalarioM(input.nextDouble());
        
        double n1 = f1.getSalarioM();
        if (n1<=0){
            f1.setSalarioM(0);
        }
        
        System.out.printf("Digite o nome do funcionário 2: ");
        f2.setNome(input.nextLine());
        f2.setNome(input.nextLine());
        
        System.out.printf("Digite o sobrenome do funcionário 2: ");
        f2.setSobrenome(input.nextLine());
        
        //se der erro use , como separador decimal
        System.out.printf("Digite o salário do funcionário 2: ");
        f2.setSalarioM(input.nextDouble());
        
        double n2 = f2.getSalarioM();
        if (n2<=0){
            f2.setSalarioM(0);
        }
        
        System.out.println("Funcionário 1: ");
        System.out.println("Nome: "+f1.getNome());
        System.out.println("Sobrenome: "+f1.getSobrenome());
        System.out.println("Salário: "+f1.getSalarioM());
        System.out.println("Salário anual: "+f1.salan(f1.getSalarioM()));
        
        System.out.println(" ");
        
        System.out.println("Funcionário 2: ");
        System.out.println("Nome: "+f2.getNome());
        System.out.println("Sobrenome: "+f2.getSobrenome());
        System.out.println("Salário: "+f2.getSalarioM());
        System.out.println("Salário anual: "+f2.salan(f2.getSalarioM()));
        
        System.out.println("Salários anuais com reajuste: ");
        System.out.println("Funcionário 1: "+f1.salan(f1.getSalarioM())*12);
        System.out.println("Funcionário 2: "+f2.salan(f2.getSalarioM())*12);
        // TODO code application logic here
    }
    
}
