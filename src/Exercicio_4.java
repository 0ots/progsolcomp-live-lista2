/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_4
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_4{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = teclado.nextInt();
        int verificarPar = num % 2;
        if(verificarPar == 0 && num > 0){
            System.out.println("O número " + num + " é par e também é um número positivo.");
        }
        else if(verificarPar == 0 && num < 0){
            System.out.println("O número " + num + " é par e também é um número negativo.");
        }
        else if(verificarPar != 0 && num > 0){
            System.out.println("O número " + num + " é um número ímpar e também é um número positivo.");
        }
        else if(verificarPar != 0 && num < 0){
            System.out.println("O número " + num + " é um número ímpar e também é um número negativo.");
        }
        teclado.close();
    }
}