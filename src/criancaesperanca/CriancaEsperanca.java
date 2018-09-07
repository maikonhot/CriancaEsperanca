
package criancaesperanca;

import java.util.Scanner;

public class CriancaEsperanca {
  
public static void main(String[] args) {
 int doacao, valor;
   Scanner leia = new Scanner(System.in);
   System.out.println("Digite a doação desejada");
   doacao=leia.nextInt();
   switch(doacao){
       case 10:
               System.out.println("Obrigado Você Doou R$10 Reais");
               break;
       case 15:
               System.out.println("Obrigado Você Doou R$15 Reais");
               break;
       case 20:
               System.out.println("Obrigado Você Doou R$20 Reais");
               break; 
       case 40:
               System.out.println("Obrigado Você Doou R$40 Reais");
               break;
       case 5:
               System.out.println("Digite o Valor Desejado");
               valor = leia.nextInt();
               System.out.println("Sua doação foi de R$"+valor);
               System.out.println("Obrigado Sua Doação é Muito Importante");
               break;
               
       default:
               System.out.println("Você Cancelou a Doação");
          
               
   }
    }
    
               
   }
    
    

