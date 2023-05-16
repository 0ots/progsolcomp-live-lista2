/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_18
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_18{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = teclado.nextDouble();
        double calculoFatorial = 1;
        for(double i = num; i > 0 ;i--){
            calculoFatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é: " + calculoFatorial);
        teclado.close();
    }
}
