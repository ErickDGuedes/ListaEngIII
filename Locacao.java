import java.util.Date;
import java.util.List;

public class Locacao {
	
	private Date dataLocacao;
	private int tempo;
	private String finalidade;
	private String local;
	private double caucao;
	private List<Carro> carro;
	private Cliente cliente;
	
	public Date getDataLocacao() {
		return dataLocacao;
	}
	
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String getFinalidade() {
		return finalidade;
	}
	
	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	public double getCaucao() {
		return caucao;
	}
	
	public void setCaucao(double caucao) {
		this.caucao = caucao;
	}
	
	public List<Carro> getCarro() {
		return carro;
	}
	
	public void setCarro(List<Carro> carro) {
		this.carro = carro;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void alugarCarro(List<Carro> carro, Cliente cliente) {
		
	}
	
	public void calcularPgto() {
		
	}
	
	
	

}
