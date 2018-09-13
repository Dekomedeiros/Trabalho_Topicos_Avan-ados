package Trabalho_Final;

public class Caminhao extends Veiculo {
	
	private String marca; 
	private int ano;
	private String modelo;
	private String placa;
	public int qtdPacotes = 3;
	
	public Caminhao(String marca, int ano, String modelo, String placa) {
		super(marca, ano, modelo, placa);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getQtdPacotes() {
		return qtdPacotes;
	}

	public void setQtdPacotes(int qtdPacotes) {
		this.qtdPacotes = qtdPacotes;
	}
	
}
