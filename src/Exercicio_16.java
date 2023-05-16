/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_16
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_16{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = teclado.nextDouble();
        while(num > 0){
            System.out.println("Digite um número: ");
            num = teclado.nextDouble();
        }
        System.out.println("O programa foi encerrado. Você digitou um número menor do que 0.");
        teclado.close();
    }
}