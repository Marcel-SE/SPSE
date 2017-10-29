
public class Manager implements ManagerIF {

	int preis = 3;
	@Override
	public int preisAnpassen(int i) {
		preis = i;
		return preis;
	}

}
