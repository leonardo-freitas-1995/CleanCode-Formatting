package br.ufg.inf.cleancode.formatacao;

public class FormatacaoVertical {
	private String variavelDeInstancia = "deve seguir um padrão (neste caso, sempre ao topo)";
	private String outraVariavel = "apenas para exemplificar";

	public boolean possuiEspacamentoVertical(){
		String objeto = "código";
		if (objeto.contains("espaçamento entre blocos de código com diferentes conceitos")){
			return true;
		}

		return false;
	}

	public boolean possuiContinuidadeVertical(){
		String objeto = "código";
		String bloco = "";
		boolean possuiOMesmoConceito = false;
		do{
			bloco += "linhas de código de mesmo conceito";
		}while(possuiOMesmoConceito);

		if (objeto.contains("espaçamento entre blocos de código com mesmo conceitos")){
			return false;
		}

		return true;
	}

	public boolean respeitaDistanciaVertical(){
		String iniciar = "um bloco de código";
		for (int i = 0; i < iniciar.length(); i++){
			iniciar += iniciar.substring(i, i + 1);
		}
		String finalizandoBlocoCom = funcaoASerChamada();

		String objeto = "código"; // Variável declarada próxima de seu uso
		if (objeto.contains("respeito entre distancias de variáveis e funções dependentes")){
			return true;
		}

		return false;
	}

	private String funcaoASerChamada(){
		String condicao = "deve ficar abaixo da função que a chama, quando é possivel";
		String importante = "não devem ficar verticalmente distantes";
		return condicao + " e " + importante;
	}

}