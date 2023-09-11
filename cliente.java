package fia_14;

public class cliente {
	private String nome;
	private int idade;
	private String sexo;
	private float salario;
	private String endereco;

	public void Vizualizar() {
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("A idade do cliente é: " + this.idade);
		System.out.println("O sexo do cliente é: " + this.sexo);
		System.out.println("O salário do cliente é: " + this.salario);
		System.out.println("O endereço do cliente é: " + this.endereco);
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
