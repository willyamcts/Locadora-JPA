package model;

//import java.sql.Date;
import java.util.Date;

public class Filme {
	
	private String titulo;
	private String genero;
	private Date dataLancamento;
	private long duracao;
	
	
	public Filme(String titulo, String genero, Date dataLancamento, long duracao) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.dataLancamento = dataLancamento;
		this.duracao = duracao;
	}


	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Date getDataLancamento() {
		return dataLancamento;
	}


	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}


	public long getDuracao() {
		return duracao;
	}


	public void setDuracao(long duracao) {
		this.duracao = duracao;
	}
	
}