import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private Soda soda;
	
	public List<Soda> getAvaliableSodas() {
		return new ArrayList<Soda>();
	}
	public List<Soda> getAllSodas() {
		return new ArrayList<Soda>();
	}
	public void addNewSoda(final String sodaId, final String sodaName, final int sodaQuantity, final int priceOf400Ml, final int priceOf500Ml) {
		
	}
	public void removeSoda(final String sodaId) {
		
	}
	public void setSodaQuantity(final String sodaId, final int sodaQuantity) {
		
	}
	public Soda getSoda() {
		return soda;
	}
	public void setSoda(final Soda soda) {
		this.soda = soda;
	}
}
