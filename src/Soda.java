
public class Soda {
	private final String sodaId;
	private final String sodaName;
	private int sodaQuantity;
	private int priceOf300Ml;
	private int priceOf500Ml;
	
	public Soda(final String sodaId, final String sodaName, final int sodaQuantity, final int priceOf300Ml, final int priceOf500Ml) {
		this.sodaId = sodaId;
		this.sodaName = sodaName;
		this.sodaQuantity = sodaQuantity;
		this.priceOf300Ml = priceOf300Ml;
		this.priceOf500Ml = priceOf500Ml;
	}
	public String getSodaId() {
		return sodaId;
	}
	public String getSodaName() {
		return sodaName;
	}
	public int getSodaQuantity() {
		return sodaQuantity;
	}
	public void setSodaQuantity(final int sodaQuantity) {
		this.sodaQuantity = sodaQuantity;
	}
	public int getPriceOf300Ml() {
		return priceOf300Ml;
	}
	public void setPriceOf300Ml(final int priceOf300Ml) {
		this.priceOf300Ml = priceOf300Ml;
	}
	public int getPriceOf500Ml() {
		return priceOf500Ml;
	}
	public void setPriceOf500Ml(final int priceOf500Ml) {
		this.priceOf500Ml = priceOf500Ml;
	}
}
