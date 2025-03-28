package ProjetoListaJava1;

/* 
Enunciado: 
Faça um programa que requisita do usuário 5 (cinco) números inteiros e informa se pelo menos dois pares diferentes desses números são iguais. 
Exemplo: {3,4,4,5,3} e {1,2,2,1,2} tem 2 pares de números iguais mas {2,2,2,3,2} não tem 2 pares diferentes de números iguais.

Dificuldade: 5/10
*/

import javax.swing.JOptionPane;
public class Exercicio12_ParesIguais {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i+1) + ":"));
        }
        boolean encontrouPrimeiro = false;
        boolean encontrouSegundo = false;
        int valorPrimeiro = 0;
        for (int i = 0; i < 5; i++) {
            int cont = 0;
            for (int j = 0; j < 5; j++) {
                if(numeros[i] == numeros[j]) cont++;
            }
            if(cont >= 2) {
                if(!encontrouPrimeiro) {
                    encontrouPrimeiro = true;
                    valorPrimeiro = numeros[i];
                } else if(numeros[i] != valorPrimeiro) {
                    encontrouSegundo = true;
                }
            }
        }
        String mensagem = (encontrouPrimeiro && encontrouSegundo) ? "Tem dois pares diferentes" : "Não tem dois pares diferentes";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
