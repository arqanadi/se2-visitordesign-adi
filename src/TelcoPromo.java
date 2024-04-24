public class TelcoPromo {
    //Adi_Arqan_Adanza
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco("smart",500.00,15,false);
        TelcoSubscription globe = new Telco("globe",450.00,10,true);
        TelcoSubscription ditto = new Telco("ditto",400.00,8,true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: ₱" + promo.showAllowance(((Telco) smart).getTelcoName(), ((Telco) smart).getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: ₱" + promo.showAllowance(((Telco) globe).getTelcoName(), ((Telco) globe).getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: ₱" + promo.showAllowance(((Telco) ditto).getTelcoName(), ((Telco) ditto).getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(((Telco) smart).getTelcoName(), ((Telco) smart).getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(((Telco) globe).getTelcoName(), ((Telco) globe).getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(((Telco) ditto).getTelcoName(), ((Telco) ditto).getUnliCallText()));
    }
}