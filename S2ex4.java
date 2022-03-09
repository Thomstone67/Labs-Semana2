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
import java.util.Scanner;
public class S2ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Invoice prod = new Invoice();
        
        System.out.printf("Digite a identificação do produto: ");
        prod.setID(input.nextLine());
        
        System.out.printf("Digite a descrição do produto: ");
        prod.setDescrip(input.nextLine());
        
        System.out.printf("Digite o preço do produto: ");
        prod.setPreco(input.nextDouble());
        
        double n=prod.getPreco();
        if(n<=0){
            prod.setPreco(0);
        }
        
        System.out.printf("Digite a quantidade comprada: ");
        prod.setQuant(input.nextInt());
        
        int m=prod.getQuant();
        if(m<=0){
            prod.setQuant(0);
        }
        
        System.out.println("Identificação: "+prod.getID());
        System.out.println("Descrição: "+prod.getDescrip());
        System.out.println("Preço: "+prod.getPreco());
        System.out.println("Quantidade: "+prod.getQuant());
        System.out.println("Fatura: "+prod.getInvoiceAmount(prod.getQuant(), prod.getPreco()));
        // TODO code application logic here
    }
    
}
