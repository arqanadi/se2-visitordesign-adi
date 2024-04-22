public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;




    public Telco (String bankName, double money){
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }




    @Override
    public String accept(UsagePromo usagepromo, double price) {
        this.promoPrice = price;
        return usagepromo.showAllowance(telcoName, promoPrice);
    }




    @Override
    public String accept(UnliCallstextOffer unlicallstextoffer, boolean unliCallText) {
        this.promoPrice = unliCallText;
        return unlicallstextoffer.showUnliCallsTextOffer(telcoName, unliCallText);
    }




    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }


    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }


    public void setDataAllowance(double dataAllowance) {
        this.dataAllowance = dataAllowance;
    }


    public void setUnliCallText(double unliCallText) {
        this.unliCallText = unliCallText;
    }


    public String getTelcoName() {
        return telcoName;
    }


    public double getPromoPrice() {
        return promoPrice;
    }


    public double getDataAllowance() {
        return dataAllowance;
    }


    public double getUnliCallText() {
        return unliCallText;
    }


}
