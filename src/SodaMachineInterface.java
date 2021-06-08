import java.util.List;

public interface SodaMachineInterface {
	public List<Soda> getAvaliableSodas();
	public int getSodaPirce(final String sodaId, final int sodaQuantity);
	public int insertCoin(final Coins coins);
	
	public void autheticateOwner(final int ownerPin);
	public void addNewSoda(final String sodaId, final String sodaName, final int sodaQuantity, final int priceOf300Ml, final int priceOf500Ml);
	public void removeSoda(final String sodaId);
	public void updateSodaQuantity(final String sodaId, final int sodaQuantity);
	public List<Soda> getAllSodas();
}
