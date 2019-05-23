package exerc3;

public class CamaroteInferior extends VIP{
	public CamaroteInferior(double valor) {
		super(valor);
	}

	private String localizacaoIngresso;

	public String getLocalizacaoIngresso() {
		return localizacaoIngresso;
	}

	public void setLocalizacaoIngresso(String localizacaoIngresso) {
		this.localizacaoIngresso = localizacaoIngresso;
	}
}
