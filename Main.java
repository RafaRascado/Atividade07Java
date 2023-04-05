//Crie um programa que lê um número entre 1 e 12, correspondendo 
// a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro. 
// Ao final, o programa deve imprimir uma mensagem identificando, 
// com base no número digitado, o nome do mês e a estação. 

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    
    System.out.println("Informe o mês que deseja saber a estação que está no Brasil, sendo que o mês 1 é janeiro e o 12 é dezembro");

    Scanner teclado = new Scanner(System.in);
    int escolha = teclado.nextInt();

    switch(escolha){
      case 1: 
        System.out.println("Estamos no mês de janeiro e sua estação é verão");
        break; 
      case 2: 
        System.out.println("Estamos no mês de fevereiro e sua estação é verão");
        break; 
      case 3: 
        System.out.println("Estamos no mês de março e sua estação é verão até o dia 21");
        break; 
      case 4: 
        System.out.println("Estamos no mês de abril e sua estação é outuno");
        break; 
      case 5:
        System.out.println("Estamos no mês de maio e sua estação é outuno");
        break; 
      case 6: 
        System.out.println("Estamos no mês de junho e sua estação é outuno");
        break; 
      case 7: 
        System.out.println("Estamos no mês de julho e sua estação é inverno");
        break; 
      case 8:
        System.out.println("Estamos no mês de agosto e sua estação é inverno");
        break; 
      case 9: 
        System.out.println("Estamos no mês de setembro e sua estação é inverno");
        break; 
      case 10:
        System.out.println("Estamos no mês de outubro e sua estação é primavera");
        break; 
      case 11: 
        System.out.println("Estamos no mês de novembro e sua estação é primavera");
        break; 
      case 12:
        System.out.println("Estamos no mês de dezembro e sua estação é primavera");
        break; 
      default: 
        System.out.println("Opção inválida");
       
    }
    
    
  }
}