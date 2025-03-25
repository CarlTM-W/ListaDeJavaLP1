package ProjetoListaJava1;

/* 
Enunciado: 
Leia uma palavra e verifique se a mesma é um palíndromo. Um palíndromo é uma palavra que, se lida de trás para frente, apresenta a mesma grafia da leitura normal.
Exemplos: ovo, arara, asdfjk kjfdsa.

Dificuldade: 4/10
*/

import javax.swing.JOptionPane;
public class Exercicio07_Palindromo {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
        String invertida = "";
        for (int i = palavra.length()-1; i >= 0; i--) {
            invertida = invertida + palavra.charAt(i);
        }
        String resultado = (palavra.equalsIgnoreCase(invertida)) ? "É palíndromo" : "Não é palíndromo";
        JOptionPane.showMessageDialog(null, resultado);
    }
}
