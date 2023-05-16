/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_3
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_03{
    public static void main(String[] args) throws Exception{
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    double num1 = teclado.nextDouble();
    System.out.println("Digite o segundo número: ");
    double num2 =  teclado.nextDouble();
        if (num1 % num2 == 0 || num1 % num2 == 0){
        System.out.println("São múltiplos");
        } else {
        System.out.println("Não são múltiplos");
        }
        teclado.close();   
    }
}