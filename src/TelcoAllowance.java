import java.util.*;
public class TelcoAllowance implements UsagePromo {
    private static Map<String, Double> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("smart", 500.00);
        allowanceMap.put("globe", 450.00);
        allowanceMap.put("ditto", 400.00);
    }

    @Override
    public double showAllowance(String telcoName, double money) {
        Double allowance = allowanceMap.get(telcoName);
        if (allowance == null) {
            System.out.println("Telco " + telcoName + " not found in allowance map.");
            return 0.0;
        }
        return allowance;
    }
}