/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_9
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_09{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da venda: ");
        double valorVenda = teclado.nextDouble();
        System.out.printf("Escolha a condição de pagamento: %n 1 - Venda a Vista %n 2 - Venda a Prazo 30 dias %n 3 - Venda a Prazo 60 dias %n 4 - Venda a Prazo 90 dias %n 5 - Venda com cartão de débito %n 6 - Venda com cartão de crédito %n");
        int escolhaPagamento = teclado.nextInt();
        double valorTotal, desconto, acrescimo;
        switch(escolhaPagamento){
            case 1:
            desconto = (valorVenda / 100) * 10;
            valorTotal = valorVenda - desconto;
            System.out.println("O valor total da venda é: R$ " + valorTotal);
            break;
            case 2:
            desconto = (valorVenda / 100) * 5;
            valorTotal = valorVenda - desconto;
            System.out.println("O valor total da venda é: R$ " + valorTotal);
            break;
            case 3:
            desconto = 0;
            valorTotal = valorVenda - desconto;
            System.out.println("O valor total da venda é: R$ " + valorTotal);
            break;
            case 4:
            acrescimo = (valorVenda / 100) * 5;
            valorTotal = valorVenda + acrescimo;
            System.out.println("O valor total da venda é: R$ " + valorTotal);
            break;
            case 5:
            desconto = (valorVenda / 100) * 8;
            valorTotal = valorVenda - desconto;
            System.out.println("O valor total da venda é: R$ " + valorTotal);
            break;
            case 6:
            desconto = (valorVenda / 100) * 7;
            valorTotal = valorVenda - desconto;
            System.out.println("O valor total da venda é: R$ " + valorTotal);
            break;
            default:
            System.out.println("Escolha de pagamento inválido. Reinicie o programa.");
        }
        teclado.close();
    }
}