
public class VMachineUI {

	public static void main(String[] args) {
	    CoinEntry ce = new CoinEntry();
	    ChangePort cp = new ChangePort(); 
	    DrinkPort dp = new DrinkPort();
	    Indicator id = new Indicator();
	    SessionManager sm = new SessionManager(id,cp);
	    ce.addSessionManager(sm);  // CoinEntryに、セッションマネジャを登録
	    // コーラ
	    DrinkSlot colaDS = new DrinkSlot("コーラ",120,50,sm,dp);  //\120, 50本
	    sm.addDrinkSlot(colaDS);
	    Button colaB = new Button();
	    colaB.addDrinkSlot(colaDS);
	    DrinkSlot juiceDS = new DrinkSlot("オレンジジュース",150,50,sm,dp);//\150, 50本
	    sm.addDrinkSlot(juiceDS);
	    Button juiceB = new Button();
	    juiceB.addDrinkSlot(juiceDS);  
	    // 以下、ユーザとのセッション：　金額受け入れ、商品指定を受けて、
	    //  飲料を出したり、おつりを出したりの作業をする。
	    ce.inputCoin(100);
	    ce.inputCoin(100);
	    colaB.pushed();

	}
}