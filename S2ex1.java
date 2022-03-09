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
import java.util.Scanner;
public class S2ex1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo ret1= new Retangulo();
        Retangulo ret2 = new Retangulo();
        
        System.out.printf("Digite o valor do lado1: ");
        ret1.setLado1(input.nextInt());
        
        System.out.printf("Digite o valor do lado 2: ");
        ret1.setLado2(input.nextInt());
        
        System.out.println("A área do retângulo é "+ret1.area(ret1.getLado1(), ret1.getLado2()));
        System.out.println("A perímetro do retângulo é "+ret1.perimetro(ret1.getLado1(), ret1.getLado2()));
        
        
        System.out.printf("Digite o valor do lado1: ");
        ret2.setLado1(input.nextInt());
        
        System.out.printf("Digite o valor do lado 2: ");
        ret2.setLado2(input.nextInt());
        
        System.out.println("A área do retângulo é "+ret2.area(ret2.getLado1(), ret2.getLado2()));
        System.out.println("A perímetro do retângulo é "+ret2.perimetro(ret2.getLado1(), ret2.getLado2()));
    }
    
}
