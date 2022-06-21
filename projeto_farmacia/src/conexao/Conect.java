package conexao;

import javax.swing.JOptionPane;

import classe.Farmaco;

public class Conect {

	public static void main(String[] args) {
		
		Farmaco medicamento1 = new Farmaco();
		
		
		String nome = JOptionPane.showInputDialog("Nome do medicamento");
		String tipo = JOptionPane.showInputDialog("Tipo");
		String classe = JOptionPane.showInputDialog("Classe");
		
		medicamento1.setNome(nome);
		medicamento1.setTipo(tipo);
		medicamento1.setClasse(classe);
		
		JOptionPane.showMessageDialog(null, medicamento1.getNome());
		JOptionPane.showMessageDialog(null, medicamento1.getTipo());
		JOptionPane.showMessageDialog(null, medicamento1.getClasse());
	}

}
