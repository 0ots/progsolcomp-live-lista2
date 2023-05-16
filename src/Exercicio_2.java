/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_2
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_2{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = teclado.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = teclado.nextDouble();
        if(num1 >= num2 && num1 >= num3 && num2 >= num3){    
            System.out.println(num3 + " " + num2 + " " + num1);
        }
        else if(num1 >= num2 && num1 >= num3 && num3 > num2){
            System.out.println(num2 + " " + num3 + " " + num1);
        }
        else if(num2 >= num1 && num2 >= num3 && num1 >= num3){
            System.out.println(num3 + " " + num1 + " " + num2);           
        }
        else if(num2 >= num1 && num2 >= num3 && num3 >= num1){
            System.out.println(num1 + " " + num3 + " " + num2);
        }
        else if(num3 >= num1 && num3 >= num2 && num1 >= num2){
            System.out.println(num2 + " " + num1 + " " + num3);
        }
        else if(num3 >= num1 && num3 >= num2 && num2 >= num1){
            System.out.println(num1 + " " + num2 + " " + num3);
        }
        teclado.close();
    }
}