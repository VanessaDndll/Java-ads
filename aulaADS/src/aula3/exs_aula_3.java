package aula3;

import javax.swing.JOptionPane;

public class exs_aula_3 {

	public static void main(String[] args) {
//------------------------------- Contador de idoso ----------------------------------------------------------
		/*int idade, idosos = 0, cont = 0;
		
		while(cont < 10) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
			if(idade >= 65) {
				idosos ++;
			}
			cont++;
		}
		
		JOptionPane.showMessageDialog(null, "O número de idosos deste grupo é de: "+idosos);*/
		
	
//------------------------------- Soma os pares e os impares ----------------------------------------------------------
		/*int n = 1, par = 0, impar = 0;
		while(n!=0) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira seu número: "));
			if(n % 2 == 0) {
				par = par + n;
			}else {
				impar = impar + n;
			}
		}
		JOptionPane.showMessageDialog(null, "A soma dos números pares é: " + par);
		JOptionPane.showMessageDialog(null, "A soma dos números impares é: " + impar);*/
		
		
//------------------------------- Notas dos alunos + maior + menor + media + n° aprovados ------------------------------	
		double nota, maior = 0, menor = 11, media = 0, ap = 0, cont = 0;
		while(cont < 10) {
			nota = Double.parseDouble(JOptionPane.showInputDialog("Insira sua nota: "));
			if(nota >= 6) {
				ap++;
			}
			if( nota < menor){
				menor = nota;
			}
			if(nota > maior) {
				maior = nota;
			}
			media = media + nota;
			cont ++;
		}
		media = media / 10;
		JOptionPane.showMessageDialog(null, "A maior nota é: " + maior);
		JOptionPane.showMessageDialog(null, "A menor nota é: " + menor);
		JOptionPane.showMessageDialog(null, "A média da sala é: " + media);
		JOptionPane.showMessageDialog(null, "A quantidade de aprovados é: " + ap);
	}

}
