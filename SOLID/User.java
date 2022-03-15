
public class User{
    public static void main(String[] args) {
        BuyableLaptop myDell = new BuyDellLaptop();
        Specification myDellSpec = myDell.buyLaptop();
        myDellSpec.display();

        BuyableLaptop myHp = new BuyHpLaptop();
         Specification myHpSpec = myHp.buyLaptop();
        myHpSpec.display();
    }
}