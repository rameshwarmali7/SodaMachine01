
public class SodaMachineFactory {
	
	public SodaMachineInterface getSodaMachine() {
		return new SodaMachineImpl(null, null, null, null);
	}
}
