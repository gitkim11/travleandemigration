package travelandimmigration;

public class CheckUnableTravel implements ICheckUnableTravel {
    public static boolean checkUnableTravel(String fromTravelCountry, String toTravelCountry) {

        if (fromTravelCountry.equalsIgnoreCase("egypt") && toTravelCountry.equalsIgnoreCase("usa")) {
            System.out.printf("%s 에서 %s (으)로는 이동이 불가합니다. \n \n", fromTravelCountry, toTravelCountry);
            return true;
        }

        else if (fromTravelCountry.equalsIgnoreCase("france") && toTravelCountry.equalsIgnoreCase("brazil")){
            System.out.printf("%s 에서 %s (으)로는 이동이 불가합니다. \n \n", fromTravelCountry, toTravelCountry);
            return true;
        }
        else {
            return false;
        }
    }
}
