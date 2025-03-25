package ProjetoListaJava1;

/* 
Enunciado: 
Ler uma string e copiar seu conteúdo invertido em um outro vetor.
Exemplo: Se a string digitada for "JANELA", então a outra string deverá conter: "ALENAJ".

Dificuldade: 3/10
*/

import javax.swing.JOptionPane;
public class Exercicio02_InverterStringVetor {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Digite uma string:");
        String invertida = "";
        for (int i = s.length()-1; i >= 0; i--) {
            invertida = invertida + s.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "String invertida: " + invertida);
    }
}
