/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_1
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_01{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = teclado.nextDouble();
        if(num1 > num2){    
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
        teclado.close();
    }
}