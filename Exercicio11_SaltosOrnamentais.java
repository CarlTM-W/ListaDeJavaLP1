package ProjetoListaJava1;

/* 
Enunciado: 
Em uma competição de saltos ornamentais, 6 (seis) juízes informam notas reais variando de 0 a 10. A nota final do atleta deve excluir a maior e a menor nota dos juízes e é composta pela soma das quatro demais notas. 
Faça um programa que lê do usuário as seis notas dos juízes e informa a nota final do atleta (a soma das notas excluindo a menor e a maior delas).

Dificuldade: 6/10
*/

import javax.swing.JOptionPane;
public class Exercicio11_SaltosOrnamentais {
    public static void main(String[] args) {
        double[] notas = new double[6];
        for (int i = 0; i < 6; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do juiz " + (i+1) + ":"));
        }
        double maior = notas[0], menor = notas[0], soma = 0;
        for (int i = 0; i < 6; i++) {
            if (notas[i] > maior) maior = notas[i];
            if (notas[i] < menor) menor = notas[i];
            soma = soma + notas[i];
        }
        double notaFinal = soma - maior - menor;
        JOptionPane.showMessageDialog(null, "Nota final: " + notaFinal);
    }
}
