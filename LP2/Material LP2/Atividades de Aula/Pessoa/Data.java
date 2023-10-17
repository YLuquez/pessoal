package modelo;

public class Data {
	private int dia, mes, ano;
	public Data(int d, int m, int a) {
		dia = d;
		mes = m;
		ano = a;
	}
	public Data() {
		
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String toString() {
		return(dia+"/"+mes+"/"+ano);
	}
}
