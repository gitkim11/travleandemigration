package travelandimmigration;

public class CheckUnableImmigration {
    public static boolean checkUnableImmigration(String fromImmigrationCountry, String toImmigrationCountry) {

        if (fromImmigrationCountry.equalsIgnoreCase("brazil") && toImmigrationCountry.equalsIgnoreCase("france")) {
            System.out.printf("%s 에서 %s (으)로는 이민이 불가합니다. \n \n", fromImmigrationCountry, toImmigrationCountry);
            return true;
        } else if (fromImmigrationCountry.equalsIgnoreCase("france") && toImmigrationCountry.equalsIgnoreCase("brazil")) {
            System.out.printf("%s 에서 %s (으)로는 이민이 불가합니다. \n \n", fromImmigrationCountry, toImmigrationCountry);
            return true;
        }
        return false;
    }
}
