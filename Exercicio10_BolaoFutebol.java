package ProjetoListaJava1;

/* 
Enunciado: 
Um aluno de computação está organizando um bolão de futebol. Segundo suas regras, os apostadores informam o placar do jogo e ganham 10 pontos se acertarem o vencedor ou se foi empate e ganham mais 5 pontos para o placar de cada time que acertarem. 
Exemplo: se o placar do jogo foi 3x2, são 0 pontos se o placar apostado foi 0x1; 5 pontos para os placares apostados 0x2 ou 3x5; 10 pontos para o placar apostado 1x0; ou 20 pontos para o placar exato de 3x2. 
Faça um programa que requisita do usuário o placar apostado e depois o placar do jogo e informa quantos pontos o apostador fez.

Dificuldade: 5/10
*/

import javax.swing.JOptionPane;
public class Exercicio10_BolaoFutebol {
    public static void main(String[] args) {
        int placarApostado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o placar apostado do time 1:"));
        int placarApostado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o placar apostado do time 2:"));
        int placarReal1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o placar real do time 1:"));
        int placarReal2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o placar real do time 2:"));
        int pontos = 0;
        if ((placarReal1 > placarReal2 && placarApostado1 > placarApostado2) || 
            (placarReal1 < placarReal2 && placarApostado1 < placarApostado2) || 
            (placarReal1 == placarReal2 && placarApostado1 == placarApostado2)) {
            pontos = pontos + 10;
        }
        if (placarApostado1 == placarReal1) {
            pontos = pontos + 5;
        }
        if (placarApostado2 == placarReal2) {
            pontos = pontos + 5;
        }
        JOptionPane.showMessageDialog(null, "Pontos do apostador: " + pontos);
    }
}
