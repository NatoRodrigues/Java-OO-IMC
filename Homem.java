package dio;

public class Homem extends PessoaIMC{


	public Homem(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}

	@Override
	public String resultIMC() {
		String msg = "";
		double imc = super.calcularIMC(getPeso(), getAltura());
		if(imc < 20.7) {
			msg = "Abaixo do peso ideal";
		}
		if(imc < 26.4 && imc > 20.7) {
			msg = "Peso ideal";
		}
		if(imc > 26.4) {
			msg = "Acima do peso ideal";
		}
		return msg;
	}

}
