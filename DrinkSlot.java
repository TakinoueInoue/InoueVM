
public class DrinkSlot {
  private String aName;
  private int aPrice;
  private int aStock;
  private SessionManager aSM;
  private Button aButton;
  private DrinkPort aDP;
  public DrinkSlot(String name, int price, int number,
	                                 SessionManager sm, DrinkPort dp){
    aName = name;
    aPrice = price;
    aStock = number;
    aSM = sm;
    aDP = dp;
  }
  public void totalInput(int amount){
    if(amount >= aPrice) {
        aButton.lightOn(true);
    }  else
        aButton.lightOn(false);
  }
  public void addButton(Button bt) {
	aButton = bt;
  }
  public void purchased(){
    aStock -= 1;  //　本当は在庫切れの管理もする
    aDP.provideDrink(aName);
    aSM.purchased(aPrice);
  }
}
