package dio;

public class Mulher extends PessoaIMC{

	public Mulher(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}

	@Override
	public String resultIMC() {
		String msg = "";
		double imc = super.calcularIMC(getPeso(), getAltura());
		if(imc < 19) {
			msg = "Abaixo do peso ideal";
		}
		if(imc < 25.8 && imc > 19) {
			msg = "Peso ideal";
		}
		if(imc > 25.8) {
			msg = "Acima do peso ideal";
		}
		return msg;
	}

}
