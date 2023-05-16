/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_5
* Data: 16/05/2023
*/
import java.util.Scanner;
public class Exercicio_5{
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine();
        System.out.println("Digite sua idade: ");
        String idade = teclado.nextLine();
        System.out.println("Digite sua naturalidade: ");
        String naturalidade = teclado.nextLine();
        System.out.println("Deseja visualizar dados completos? Se sim, digite S, se não, digite N. ");
        String dadoscompletos = teclado.nextLine();
        switch(dadoscompletos){
            case "S":
            System.out.println("Nome: " + nome);
            System.out.println("Sobreome: " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Nome: " + naturalidade);
            break;
            case "N":
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            break;
            default:
            System.out.println("Digito inválido. Reinicie o programa.");
        }
        teclado.close();
    }
}