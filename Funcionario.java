package Trabalho_Final;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{
	
	public Funcionario(String nome, int idade, int id) {
		super(nome, idade, id);
	}
	public void cadastrarObjetoEntrega() {
	
	}
	public void cadastrarRoteiro() {
		
	}
	
	public void cadastrarVeiculo(String veiculo) {
		String marca = JOptionPane.showInputDialog("Insira o valor da placa.");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do carro."));
		String modelo = JOptionPane.showInputDialog("Insira o modelo do carro.");
		String placa = JOptionPane.showInputDialog("Insira a placa do carro.");
		if(veiculo == "caminhao") {
			Caminhao c1 = new Caminhao(marca, ano, modelo, placa);
		}else if(veiculo == "carreta") {
			Carreta ca1 = new Carreta(marca, ano, modelo, placa);
		}else if(veiculo == "van") {
			Van v1 = new Van(marca, ano, modelo, placa);
		}else {
			System.out.println("Valor inválido.");
		}
	}
	
	public void listar(Caminhoneiro caminhoneiro) {
		JOptionPane.showMessageDialog(null, 
		"Nome do caminhoneiro: " + caminhoneiro.getNome() + "\n" +
		"Endereço do caminhoneiro: " + caminhoneiro.getEndereco() + "\n" +
		"Tipo do CNH: " + caminhoneiro.getTipoCNH() + "\n" +
		"Número do CNH: " + caminhoneiro.getNumeroCNH() + "\n" +
		"Idade do caminhoneiro: " + caminhoneiro.getIdade() + "\n" +
		"Id do caminhoneiro: " + caminhoneiro.getId());
	}
	
	public void cadastrarCaminhoneiro() {
		
		String nome = JOptionPane.showInputDialog("Insira o nome do caminhoneiro.");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do caminhoneiro."));
		int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o id do caminhoneiro."));
		String endereco = JOptionPane.showInputDialog("Insira o endereço do caminhoneiro.");
		String tipoCnh = JOptionPane.showInputDialog("Insira o tipo da CNH.");
		int numeroCnh = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da CNH."));
		
		Caminhoneiro c1 = new Caminhoneiro(nome, idade, id, endereco, tipoCnh, numeroCnh);
		
		listar(c1);
		
	}
	
}
