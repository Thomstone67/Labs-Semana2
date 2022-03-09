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

import java.util.Scanner;
public class S2ex2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Television tv1 = new Television();
        Television tv2 = new Television();
        
        System.out.printf("Digite o modelo da televisão 1: ");
        tv1.setModelo(input.nextLine());
        //se estiver dando erro use , como separador decimal
        System.out.printf("\nDigite o preço da tv1: ");
        tv1.setPreco(input.nextDouble());
        System.out.printf("\nDigite o tamanho da tv1: ");
        tv1.setTamanho(input.nextDouble());
        System.out.printf("\nDigite o volume da tv1: ");
        tv1.setVolume(input.nextInt());
        System.out.printf("\nDigite o canal da tv1(em números): ");
        tv1.setCanal(input.nextInt());
        System.out.printf("\nA tv1 está ligada? (true para sim e false para não): ");
        tv1.setLigada(input.nextBoolean());
        
        System.out.println("\nDigite o modelo da televisão 2: ");
        tv2.setModelo(input.nextLine());
        input.nextLine();
        System.out.printf("\nDigite o preço da tv2: ");
        tv2.setPreco(input.nextDouble());
        System.out.printf("\nDigite o tamanho da tv2: ");
        tv2.setTamanho(input.nextDouble());
        System.out.printf("\nDigite o volume da tv2: ");
        tv2.setVolume(input.nextInt());
        System.out.printf("\nDigite o canal da tv2(em números): ");
        tv2.setCanal(input.nextInt());
        System.out.printf("\nA tv2 está ligada? (true para sim e false pra não): ");
        tv2.setLigada(input.nextBoolean());
        
        System.out.println("Modelo tv1: "+tv1.getModelo());
        System.out.println("Preço tv1: "+tv1.getPreco());
        System.out.println("Tamanho tv1: "+tv1.getTamanho());
        System.out.println("Estado: "+tv1.getLigada());
        System.out.println("Volume: "+tv1.getVolume());
        System.out.println("Canal: "+tv1.getCanal());
        System.out.println();
        System.out.println("Modelo tv2: "+tv2.getModelo());
        System.out.println("Preço tv2: "+tv2.getPreco());
        System.out.println("Tamanho tv2: "+tv2.getTamanho());
        System.out.println("Estado: "+tv2.getLigada());
        System.out.println("Volume: "+tv2.getVolume());
        System.out.println("Canal: "+tv2.getCanal());
        
        int a;
        System.out.println("\nQuer mudar a tv1 de canal? se sim digite 1 se não digite 0");
        a = input.nextInt();
        tv1.alteraCanal(a);

        int b;
        System.out.println("\nQuer mudar a tv2 de canal? se sim digite 1 se não digite 0");
        b = input.nextInt();
        tv2.alteraCanal(b);
        
        int c;
        System.out.println("\nQuer mudar o volume da tv1? Digite o valor: ");
        c = input.nextInt();
        tv1.alteraVolume(c);

        int d;
        System.out.println("\nQuer mudar o volume da tv2? Digite o valor: ");
        d = input.nextInt();
        tv1.alteraVolume(d);
        
        boolean e;
        System.out.println("\nQuer desligar a tv1? Digite true para sim e false para não: ");
        e = input.nextBoolean();
        int b1=Boolean.compare(e,tv1.getLigada());
        if(b1==1){
            System.out.println("Tv1: Ligada");
        }else{
            System.out.println("Tv1: Desligada");
        }
        
    }
    
}
