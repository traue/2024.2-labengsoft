package teste.eleicao.mack;

public class Eleitor {

	public String classificaEleitor(int idade) {
		String classificacao = "";

		if (idade < 0 || idade > 130) {
			classificacao = "Idade inválida!";
		} else if (idade <= 15) {
			classificacao = "Não permitido";
		} else if (idade <= 17 || idade >= 70) {
			classificacao = "Facultativo";
		} else {
			classificacao = "Obrigatório";
		}

		return classificacao;
	}

}
