import java.util.*;
public class UnliCallTextPackage implements UnliCallstextOffer{
    private static Map<String, Boolean> packageMap = new HashMap<>();


    static {
        packageMap.put("Smart", false);
        packageMap.put("Globe", true);
        packageMap.put("Ditto", true);
    }


    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){


        String string = String.valueOf(unliCallText);
        return packageMap.get(telcoName);
        //return String = String.valueOf(unliCallText);

    }
}
