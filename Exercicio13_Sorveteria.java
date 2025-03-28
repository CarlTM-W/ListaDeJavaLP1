package ProjetoListaJava1;

/* 
Enunciado: 
Desenvolva um programa para um quiosque de uma sorveteria. O atendente deve informar o tipo de sorvete (picol�, casquinha ou sundae) e a quantidade. Ap�s, informar o valor do pedido ao cliente e inserir o valor pago. O sistema deve verificar se o valor informado � maior que o valor do pedido, caso seja, calcular o troco e inform�-lo, sen�o informar que o valor � insuficiente.
Considere a seguinte tabela de pre�o:
Picol� ............................................................................. 1,30
Casquinha ................................................................................. 2,60
Sundae ............................................................................. 6,00

Dificuldade: 4/10
*/

import javax.swing.JOptionPane;
public class Exercicio13_Sorveteria {
    public static void main(String[] args) {
        String tipo = JOptionPane.showInputDialog("Digite o tipo de sorvete (picol�, casquinha ou sundae):");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
        double preco = 0;
        if(tipo.equalsIgnoreCase("picol�")) {
            preco = 1.30;
        } else if(tipo.equalsIgnoreCase("casquinha")) {
            preco = 2.60;
        } else if(tipo.equalsIgnoreCase("sundae")) {
            preco = 6.00;
        } else {
            JOptionPane.showMessageDialog(null, "Tipo inv�lido");
            return;
        }
        double valorPedido = preco * quantidade;
        double valorPago = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago:"));
        if(valorPago < valorPedido) {
            JOptionPane.showMessageDialog(null, "Valor insuficiente");
        } else {
            double troco = valorPago - valorPedido;
            JOptionPane.showMessageDialog(null, "Troco: " + troco);
        }
    }
}
