package aula2;

import javax.swing.JOptionPane;

public class exs_aula_2 {

	public static void main(String[] args) {
//------------------------------- Maior de iade ou não -------------------------------------------------------------
		/*int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
		if(idade<18) {
			JOptionPane.showMessageDialog(null, "Você não pode entrar pois tem "+idade+" anos.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você pode entrar pois tem "+idade+" anos.");
		}*/
		
//------------------------------- Aprovado ou reprovado -------------------------------------------------------------
		/*int nota1, nota2, media;
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira nota: "));
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda nota: "));
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "O aluno passou com a média de: "+media);
		}
		else if (media <= 7 && media >= 6){
			JOptionPane.showMessageDialog(null, "O aluno ficará de exame com a nota de: "+media);
		}
		else {
			JOptionPane.showMessageDialog(null, "O aluno foi reprovado com a nota de: "+media);
		}*/
		
//------------------------------- Calculadora -------------------------------------------------------------
		/*double n1, n2, total = 0;
		int op;
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));
		op = Integer.parseInt(JOptionPane.showInputDialog("Escolha sua operação: \n1-soma \n2-subtração"
				+ " \n3-multiplicação \n4-divisão"));
		
		switch (op) {
			case 1:{
				total = n1 + n2;
				break;
			}
			case 2:{
				total = n1 - n2;
				break;
			}
			case 3:{
				total = n1 * n2;
				break;
			}
			case 4:{
				total = n1 / n2;
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Valor invalido, escolha entre 1 e 4.");
		}
		JOptionPane.showMessageDialog(null, "O resultado da sua conta é: "+total);*/
	}

}
