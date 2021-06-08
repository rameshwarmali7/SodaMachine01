import java.util.List;

public class SodaMachineImpl implements SodaMachineInterface {
	private final String machineId;
	private final Inventory inventory;
	private final AvaliableCoins avaliableCoins;
	private String ownerPin;
	private Soda currentSoda;
	
	public SodaMachineImpl(final String machineId, final Inventory inventory, final AvaliableCoins avaliableCoins, final String ownerPin) {
		this.machineId = machineId;
		this.inventory = inventory;
		this.avaliableCoins = avaliableCoins;
		this.ownerPin = ownerPin;
	}
	
	@Override
	public List<Soda> getAvaliableSodas() {
		return null;
	}

	@Override
	public int getSodaPirce(final String sodaId, final int sodaQuantity) {
		return 0;
	}

	@Override
	public int insertCoin(final Coins coins) throws InsufficientAmountException, NoChangeException, InsufficientQuantityException {
		return 0;
	}

	@Override
	public void autheticateOwner(final int ownerPin) {
		
	}
	
	public void setOwnerPin(final String oldPin, final String newPin) {
		this.ownerPin = newPin;
	}

	@Override
	public void addNewSoda(final String sodaId, final String sodaName, final int sodaQuantity, final int priceOf300Ml, final int priceOf500Ml) {
		
	}

	@Override
	public void removeSoda(final String sodaId) {
		
	}

	@Override
	public void updateSodaQuantity(final String sodaId, final int sodaQuantity) {
		
	}

	@Override
	public List<Soda> getAllSodas() {
		return null;
	}
	
	private boolean isFullPaid(final Coins coins) {
		return true;
	}
	
	private boolean hasSufficentSodaQuantity(final int sodaQuantity) {
		return true;
	}
	
	private boolean hasSufficentChance(final Coins coin) {
		return true;
	}
	
	private Coins getChange(final Coins coins) {
		return new Coins(0, 0);
	}
}
