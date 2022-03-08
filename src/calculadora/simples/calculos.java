/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.simples;

import java.util.Scanner;

/**
 *
 * @author EtecMorato
 */
public class calculos {
    
    public static void main(String[] args) {
        
        //var
        double c,i,n,j,t;
        
        Scanner entrada = new Scanner(System.in);
        
        do {
        //inicio app
            System.out.println("\t\t\t\n Calculadora Juros Simples\n");
            
        //menu
            System.out.println("\t\t\t\n 1- Calculo juros simples");
            System.out.println("\t\t\t\n 2- Calculo de capital");
            System.out.println("\t\t\t\n 3- Calculo de taxa");
            System.out.println("\t\t\t\n 4- Calculo de prazo");
            System.out.println("\t\t\t\n 5- Sair\n");
            System.out.print(" Opção: ");
            
            t = entrada.nextInt();
            
        if(t == 1){
           
        //aplicaçao
           System.out.println("\n\t\t\t -- Calculo do juros simples -- \n");
        
           System.out.println("Digite o capital: ");
           c = entrada.nextDouble();
           System.out.println("Digite a taxa: ");
           i = entrada.nextDouble();
           System.out.println("Digite o prazo: ");
           n = entrada.nextDouble();
        
        //calculo
           j = c*i*n/100;
        
        //saida
           System.out.println("O juros simples é: " + j);
           
        }else if(t == 2){
            
        //aplicaçao
           System.out.println("\n\t\t\t -- Calculo do capital -- \n");
        
           System.out.println("Digite a taxa: ");
           i = entrada.nextDouble();
        
           System.out.println("Digite o prazo: ");
           n = entrada.nextDouble();
        
           System.out.println("Digite o juros: ");
           j = entrada.nextDouble();
             
        //calculos
        
           c = j / ((i / 100) * n);
        
        //saida
           System.out.println("O capital é: " + c); 
           
        }else if(t == 3){
        
        //aplicaçao
           System.out.println("\n\t\t\t -- Calculo da taxa -- \n");
        
           System.out.println("Digite o capital: ");
           c = entrada.nextDouble();
        
           System.out.println("Digite o prazo: ");
           n = entrada.nextDouble();
        
           System.out.println("Digite o juros: ");
           j = entrada.nextDouble();
        
        //calculos
           i = j/(c*n)*100;
        
        //saida
           System.out.println("A taxa é: " + i);
           
        }else if(t == 4){
            
            //aplicaçao
           System.out.println("\n\t\t\t -- Calculo do prazo -- \n");
        
           System.out.println("Digite o capital: ");
           c = entrada.nextDouble();
        
           System.out.println("Digite a taxa: ");
           i = entrada.nextDouble();
        
           System.out.println("Digite o juros: ");
           j = entrada.nextDouble();
        
        //calculos
           n = j/(c*i/100);
        
        //saida
           System.out.println("O prazo é: " + n);
        }
        
        } while (t != 5);
    }
    
}
