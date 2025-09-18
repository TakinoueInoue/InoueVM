
public class CoinEntry {
  private SessionManager aSM;
  public void addSessionManager(SessionManager sm){
	aSM = sm; 
  }
  public void inputCoin(int amount){
    aSM.newInput(amount);
  }
}
