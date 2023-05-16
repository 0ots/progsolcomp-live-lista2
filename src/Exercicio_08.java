/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_8
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_08{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 12: ");
        int num =  teclado.nextInt();
        switch(num){
            case 1:
            System.out.println("Mês: Janeiro - Estação: Verão");
            break;
            case 2:
            System.out.println("Mês: Fevereiro - Estação: Verão");
            break;
            case 3:
            System.out.println("Mês: Março - Estação: Verão");
            break;
            case 4:
            System.out.println("Mês: Abril - Estação: Outono");
            break;
            case 5:
            System.out.println("Mês: Maio - Estação: Outono");
            break;
            case 6:
            System.out.println("Mês: Junho - Estação: Outono");
            break;
            case 7:
            System.out.println("Mês: Julho - Estação: Inverno");
            break;
            case 8:
            System.out.println("Mês: Agosto - Estação: Inverno");
            break;
            case 9:
            System.out.println("Mês: Setembro - Estação: Inverno");
            break;
            case 10:
            System.out.println("Mês: Outubro - Estação: Primavera");
            break;
            case 11:
            System.out.println("Mês: Novembro - Estação: Primavera");
            break;
            case 12:
            System.out.println("Mês: Dezembro - Estação: Verão");
            break;
            default:
            System.out.println("Número inválido. Reinicie o programa");
        }
        teclado.close();
    }
}