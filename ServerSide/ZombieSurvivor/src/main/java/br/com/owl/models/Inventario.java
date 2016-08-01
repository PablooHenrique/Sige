package br.com.owl.models;

public class Inventario {

	private int agua;
	private int comida;
	private int medicamento;
	private int municao;
	
	public int getAgua() {
		return agua;
	}
	public void setAgua(int agua) {
		this.agua = agua;
	}
	public int getComida() {
		return comida;
	}
	public void setComida(int comida) {
		this.comida = comida;
	}
	public int getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(int medicamento) {
		this.medicamento = medicamento;
	}
	public int getMunicao() {
		return municao;
	}
	public void setMunicao(int municao) {
		this.municao = municao;
	}
	
	public Inventario(int agua, int comida, int medicamento, int municao) {
		setAgua(agua);
		setComida(comida);
		setMedicamento(medicamento);
		setMunicao(municao);
	}
	
	public Inventario() {
	}
}
