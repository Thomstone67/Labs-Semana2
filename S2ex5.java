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
import java.util.Scanner;
public class S2ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PerfilDeSaude pers = new PerfilDeSaude();
        
        System.out.printf("Digite seu primeiro nome: ");
        pers.setNome(input.nextLine());
        
        System.out.printf("Digite seu sobrenome: ");
        pers.setSobrenome(input.nextLine());
        
        System.out.printf("Digite o dia de seu nascimento: ");
        pers.setDia(input.nextInt());
        
        System.out.printf("Digite o mes: ");
        pers.setMes(input.nextInt());
        
        System.out.printf("Digite o ano: ");
        pers.setAno(input.nextInt());
        
        System.out.printf("Digite sua altura: ");
        pers.setAltura(input.nextDouble());
        
        System.out.printf("Digite seu peso: ");
        pers.setPeso(input.nextDouble());
        
        System.out.println("Seu nome: "+pers.getNome());
        System.out.println("Seu sobrenome: "+pers.getSobrenome());
        System.out.println("Sua data de nascimento "+pers.getDDN(pers.getDia(), pers.getMes(), pers.getAno()));
        System.out.println("Sua altura: "+pers.getAltura());
        System.out.println("Seu peso: "+pers.getPeso());
        System.out.println("Sua idade: "+pers.getIdade(pers.getAno()));
        System.out.println("Sua massa corporal: "+pers.getIMC(pers.getPeso(), pers.getAltura()));
        // TODO code application logic here
    }
    
}
