package fia_14;

public class Produto {
	private String nomeDoGame = ("Fifa 22");
	private String lancamento = ("01/09/2021");
	private float custo = 100;
	private float precoM;
	private float precoP;
	
	public void Vizualizar() {
		System.out.println("Nome do game: " + nomeDoGame + "\nData do lancamento: " + lancamento + "\nCusto unitário: " + custo);
		System.out.println("O preço médio do game é de: " + this.precoM);
		System.out.println("O preço promocional é de: " + this.precoP);
	}

	public String getNomeDoGame() {
		return nomeDoGame;
	}

	public void setNomeDoGame(String nomeDoGame) {
		this.nomeDoGame = nomeDoGame;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public float getPrecoM() {
		return precoM;
	}

	public void setPrecoM(float precoM) {
		this.precoM = precoM;
	}

	public float getPrecoP() {
		return precoP;
	}

	public void setPrecoP(float precoP) {
		this.precoP = precoP;
	}
	
}
