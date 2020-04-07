package interfaceexamples;

public interface SalesCalc {

	public default void printItemReport(){
		System.out.println("---- Hello ---");
	}
	
	public default int calculateGst(){
		return 16;
	}
}
