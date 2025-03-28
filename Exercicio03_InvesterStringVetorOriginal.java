package ProjetoListaJava1;

/* 
Enunciado: 
Ler uma string e inverter seu conteúdo no mesmo vetor.

Dificuldade: 3/10
*/

import javax.swing.JOptionPane;
public class Exercicio03_InverterStringVetorOriginal {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Digite uma string:");
        char[] vetor = s.toCharArray();
        int inicio = 0, fim = vetor.length - 1;
        while(inicio < fim) {
            char temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;
            inicio++;
            fim--;
        }
        String invertida = new String(vetor);
        JOptionPane.showMessageDialog(null, "String invertida: " + invertida);
    }
}
