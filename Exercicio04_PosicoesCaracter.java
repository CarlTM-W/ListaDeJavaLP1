package ProjetoListaJava1;

/* 
Enunciado: 
Fazer um programa para ler uma string e um caractere qualquer e calcular construir um outro vetor (OC) contendo as posições (índices) de onde ocorre o caractere na string.
Exemplo: Seja a string "abracadabra!!!" e o caractere 'a', então o vetor de índices deverá conter os seguintes valores: { 0 3 5 7 10 -1}.

Dificuldade: 5/10
*/

import javax.swing.JOptionPane;
public class Exercicio04_PosicoesCaracter {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Digite uma string:");
        String c = JOptionPane.showInputDialog("Digite um caractere:");
        String posicoes = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c.charAt(0)) {
                posicoes = posicoes + i + " ";
            }
        }
        posicoes = posicoes + "-1";
        JOptionPane.showMessageDialog(null, "Posições: " + posicoes);
    }
}
