
public class Principal {
	
	public static void main(String [] args) {
		
		Carro carro = new Carro();
		carro.verificarAno();
		carro.verificarDisponibilidade();
		
		Cliente cliente = new Cliente();
		cliente.verificarCnh();
		
		Locacao locacao = new Locacao();
		locacao.alugarCarro(null, cliente);
		locacao.calcularPgto();
		
		Devolucao devolucao = new Devolucao();
		devolucao.gerarDev();
		devolucao.verificarCondicao();
		
		
		
		
	}

}
