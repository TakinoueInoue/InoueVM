
public class Button {
  private DrinkSlot  aDS;
  private boolean lightStatus=false;
  public void addDrinkSlot(DrinkSlot ds){
     aDS = ds;
     aDS.addButton(this);
  }
  public void lightOn(boolean tf){
    if(tf==true){
      lightStatus = true;
    // 何らかの方法で、画面にボタンを点灯する
      System.out.println("Light On");	} else { 
	  lightStatus = false;
	// 何らかの方法で、ボタンを消灯する。
	  System.out.println("Light Off");
	}
  }
  public void pushed(){
	if(lightStatus == true)
	   aDS.purchased();
  } 
}
