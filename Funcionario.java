package fia_14;

public class Funcionario {
	private String nome = ("Jorge Chan");
	private int idade = (23);
	private String aniversario = ("21/08");
	private String ferias;
	private String proxferias;
	
	public void Vizualizar (){
		System.out.println(nome + "\n" + idade + "\n" + aniversario);
		System.out.println("A data das últimas férias do Jorge foi: " + this.ferias);
		System.out.println("Ele quer tirar suas próximas féria em: " + this.proxferias);
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	public String getFerias() {
		return ferias;
	}
	public void setFerias(String ferias) {
		this.ferias = ferias;
	}
	public String getProxferias() {
		return proxferias;
	}
	public void setProxferias(String proxferias) {
		this.proxferias = proxferias;
	}
	
	
}
