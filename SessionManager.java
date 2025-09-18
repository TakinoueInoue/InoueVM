public class SessionManager {
  private int aTotal=0;
  private int number = 0;
  private Indicator aInd;
  private ChangePort aCPort;
//  private ArrayList aDSList= new ArrayList();
  private DrinkSlot[] aDSList = new DrinkSlot[10];
  public SessionManager(Indicator id, ChangePort cp){
    aInd = id;
	aCPort = cp;
  }
  public void addDrinkSlot(DrinkSlot ds){
	aDSList[number] = ds;
	number++;
  }
  public void newInput(int am){
	aTotal += am;  // それまでのaTotalに、新たにamを加える。 
	aInd.updateDisplay(aTotal);
	for(int i=0; i< number; i++){
	  aDSList[i].totalInput(aTotal);
	}
  }
  public void purchased(int price){
	 aInd.updateDisplay(0);
	 int change = aTotal - price;
	 if(change > 0)
	    aCPort.provideChange(change);
	 aTotal = 0;
	 for(int i=0; i<number; i++) {
	   aDSList[i].totalInput(0);
     }
  }
}
