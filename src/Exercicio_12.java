/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_12
* Data: 16/05/2023
*/
public class Exercicio_12{
    public static void main(String[] args) throws Exception{
        int num = 0;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num += 2;
        }while (num % 7 != 0);
    }
}
