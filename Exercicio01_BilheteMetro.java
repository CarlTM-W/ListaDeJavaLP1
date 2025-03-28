package ProjetoListaJava1;

/* 
Enunciado: 
Fazer um algoritmo para ajudar a bilheteira do metrô. O operador deve informar o tipo do bilhete (unitário, duplo ou 10 viagens) e o valor pago pelo passageiro. O sistema deve mostrar a quantidade de bilhetes possíveis e o troco que o passageiro deve receber.
Considere a seguinte tabela de preço:
Bilhete unitário .................................................................... 1,30
Bilhete duplo ....................................................................... 2,60
Bilhete de 10 viagens ........................................................ 12,00

Dificuldade: 4/10
*/

import javax.swing.JOptionPane;
public class Exercicio01_BilheteMetro {
    public static void main(String[] args) {
        String tipo = JOptionPane.showInputDialog("Digite o tipo de bilhete (unitário, duplo ou 10 viagens):");
        double valorPago = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago:"));
        double preco = 0;
        if(tipo.equalsIgnoreCase("unitário")) {
            preco = 1.30;
        } else if(tipo.equalsIgnoreCase("duplo")) {
            preco = 2.60;
        } else if(tipo.equalsIgnoreCase("10 viagens")) {
            preco = 12.00;
        } else {
            JOptionPane.showMessageDialog(null, "Tipo inválido");
            return;
        }
        int quantidade = (int)(valorPago / preco);
        double troco = valorPago - (quantidade * preco);
        JOptionPane.showMessageDialog(null, "Bilhetes: " + quantidade + "\nTroco: " + troco);
    }
}
