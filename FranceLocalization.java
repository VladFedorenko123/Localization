package src.srccode.example;

public class FranceLocalization extends AbstractWriter {
	private String male = "Monsieur ";
	private String female = "Mademoiselle ";

	@Override
	public String getMale() {
		return male;
	}

	@Override
	public String getFamale() {
		return female;
	}
}
