package src.srccode.example;

public class EnglishLocalization extends AbstractWriter {
	private String male = "Mister ";
	private String female = "Miss ";

	@Override
	public String getMale() {
		return male;
	}

	@Override
	public String getFamale() {
		return female;
	}
}
