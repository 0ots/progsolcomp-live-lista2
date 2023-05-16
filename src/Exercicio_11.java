/* Nome do Aluno: Otávio Arantes Maciel
* RA: 32318877
* Nome do Programa: Exercicio_11
* Data: 16/05/2023
*/
public class Exercicio_11{
    public static void main(String[] args) throws Exception{
        for(int i = 100; i > 0; i--){
            int verificarPar = i % 2;
            if(verificarPar == 0){
                System.out.println(i);
            }
        }
    }
}