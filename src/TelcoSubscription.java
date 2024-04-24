public interface TelcoSubscription {
    public double accept(UsagePromo usagepromo, double price);
    public boolean accept(UnliCallsTextOffer unlicallstextoffer, boolean unliCallText);
}


