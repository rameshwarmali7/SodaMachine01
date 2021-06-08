import java.security.Timestamp;

public class AvaliableCoins {
	private final String machineId;
	private Coins coins;
	private Timestamp startTimestamp;
	private Timestamp updatedTimestamp;
	
	public AvaliableCoins(String machineId, Coins coins, Timestamp startTimestamp, Timestamp updatedTimestamp) {
		this.machineId = machineId;
		this.coins = coins;
		this.startTimestamp = startTimestamp;
		this.updatedTimestamp = updatedTimestamp;
	}

	public Coins getCoins() {
		return coins;
	}

	public void setCoins(final Coins coins) {
		this.coins = coins;
	}
}
