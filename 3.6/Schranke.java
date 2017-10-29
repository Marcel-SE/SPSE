
public class Schranke implements SchrankeIF {

	boolean bezahlt = false;
	boolean schrankeStatus = false;
	
	@Override
	public boolean bezahlen(int i) {
		if(i >= 3){
			bezahlt = true;
			return bezahlt;
		}
		else{
			bezahlt = false;
			return bezahlt;
		}
	}

	@Override
	public boolean oeffnen() {
		if(bezahlt = true){
			schrankeStatus = true;
			return schrankeStatus;
		}
		else{
			schrankeStatus = false;
			return schrankeStatus;
		}
	}

	@Override
	public boolean schließen() {
		schrankeStatus = false;
		return schrankeStatus;
	}

}
