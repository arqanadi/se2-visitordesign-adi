public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco(Smart,500,15,false);
        TelcoSubscription globe = new Telco(Globe,450,10,true);
        TelcoSubscription ditto = new Telco(Ditto,400,8,true);


        UsagePromo promo = new TelcoAllowance();
        UnliCallstextOffer unli = new UnliCallTextPackage();


        System.out.println("Smart Total Cost: ₱" + promo.showAllowance(smart));
        System.out.println("Globe Total Cost: ₱" + promo.showAllowance(globe));
        System.out.println("Telco C Total Cost: ₱" + promo.showAllowance(ditto));


        System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe));
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto));
    }
}
