package src.srccode.example;

public class UkraineLocalization extends AbstractWriter {
	private String male = "Pan ";
	private String female = "Pani ";

	@Override
	public String getMale() {
		return male;
	}

	protected void setMale(String stati) {
		this.male = stati;
	}

	@Override
	public String getFamale() {
		return female;
	}

	protected void setFamale(String stati) {
		this.female = stati;
	}

}
