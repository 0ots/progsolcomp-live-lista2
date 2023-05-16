/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_21
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_21{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int num = teclado.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= 10; j++){
                int multilicacao = i * j;
                System.out.println(i + " x " + j + " = " + multilicacao);
            }
            System.out.println("");
        }
        teclado.close();
    }
}
