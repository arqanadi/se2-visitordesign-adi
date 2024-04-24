import java.util.*;
public class UnliCallTextPackage implements UnliCallsTextOffer {
    private static Map<String, Boolean> packageMap = new HashMap<>();

    static {
        packageMap.put("smart", false);
        packageMap.put("globe", true);
        packageMap.put("ditto", true);
    }

    @Override
    public Boolean showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        Boolean packageOffer = packageMap.get(telcoName);
        if (packageOffer == null) {
            System.out.println("Telco " + telcoName + " not found in package map.");
            return false;
        }
        return packageOffer && unliCallText;
    }
}