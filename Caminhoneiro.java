package Trabalho_Final;

public class Caminhoneiro extends Pessoa{
	
	public Caminhoneiro(String nome, int idade, int id, String endereco, String tipoCNH, int numeroCNH) {
		super(nome,idade,id);
		this.setEndereco(endereco);
		this.setTipoCNH(tipoCNH);
		this.setNumeroCNH(numeroCNH);
	}
	
	private String endereco;
	private String tipoCNH;
	private int numeroCNH;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTipoCNH() {
		return tipoCNH;
	}
	public void setTipoCNH(String tipoCNH) {
		this.tipoCNH = tipoCNH;
	}
	public int getNumeroCNH() {
		return numeroCNH;
	}
	public void setNumeroCNH(int numeroCNH) {
		this.numeroCNH = numeroCNH;
	}
	
	@Override
	public String toString() {
		return "Caminhoneiro [endereco=" + endereco + ", tipoCNH=" + tipoCNH + ", numeroCNH=" + numeroCNH
				+ ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getId()=" + getId() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
