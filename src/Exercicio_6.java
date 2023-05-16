/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_6
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_6{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu conceito: ");
        double conceito = teclado.nextDouble();
        if(conceito == 0 || conceito <= 49){
            System.out.println("Seu conceito é: Insuficiente");
        }
        else if(conceito == 50 || conceito <= 64){
            System.out.println("Seu conceito é: Regular");
        }
        else if(conceito == 65 || conceito <= 84){
            System.out.println("Seu conceito é: Bom");
        }
        else if(conceito == 85 || conceito <= 100){
            System.out.println("Seu conceito é: Ótimo");
        }
        else{
            System.out.println("Conceito inválido. Reinicie o programa.");
        }
        teclado.close();
    }
}