public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;


    public Telco (String telcoName, double promoPrice, int dataAllowance, boolean unliCallText){
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public double accept(UsagePromo usagepromo, double price) {
        this.promoPrice = price;
        return usagepromo.showAllowance(telcoName, promoPrice);
    }

    @Override
    public boolean accept(UnliCallsTextOffer unlicallstextoffer, boolean unliCallText) {
        this.unliCallText = unliCallText;
        return unlicallstextoffer.showUnliCallsTextOffer(telcoName, unliCallText);
    }


    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public void setDataAllowance(int dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

    public void setUnliCallText(boolean unliCallText) {
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

    public boolean getUnliCallText() {
        return unliCallText;
    }
}
