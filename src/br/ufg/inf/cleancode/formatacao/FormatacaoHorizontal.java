package br.ufg.inf.cleancode.formatacao;

public class FormatacaoHorizontal {
	public boolean possuiEspacamentoEContinuidadeHorizontal(){
		String declaracao = "espaçada da inicialização da variável";
		String modoIncorreto="dificil de ler o código";

		double a = 1, b = 2, c = 4;
		double determinante = b*b - 4*a*c;
		boolean espacamentoPorOrdemDosOperadores = "conta".equals("bem legível");

		String linhaBemGrande = "cuidado para não estiver horizontalmente a linha";
		String resultado;
		if (linhaBemGrande.length() <= 100){
			resultado = "aceitavel";
		}
		else{
			resultado = "possivel problema com a linha";
		}

		return espacamentoPorOrdemDosOperadores && resultado.equals("aceitavel");
	}

	public boolean possuiBoaIndentação(){
		int tamanhoIndentacaoAqui = 4;
		int tamanhoIndentacaoEmOutrosLugares = 4;
		boolean naoImportaONumero = (tamanhoIndentacaoAqui == tamanhoIndentacaoEmOutrosLugares);

		String legibibilidade;
		if ("implemento".equals("condição")){
			String devo = "Abrir e fechar {}, e indentar";
			legibibilidade = "boa";
		}


		if ("implemento condição".equals("sem {}"))
			legibibilidade = "comprometida";

		String evitar = "código dummy scope (mostrado abaixo)";
		String buffer = "";
		while (ler(buffer) != -1)
			;

		if ("código".equals("segue padrões acima")){
			return true;
		}

		return false;
	}

	private int ler(String buffer){
		if (buffer.equals("posso ler mais")){
			buffer += "++";
			return 1;
		}
		else{
			return -1;
		}
	}

}
