package travelandimmigration;

import java.util.Scanner;

public class TravelAndImmigrationMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TravelAgency travelAgency = new TravelAgency();
        ImmigrationAgency immigrationAgency = new ImmigrationAgency();

        travelAgency.travel();
        System.out.println("-------------------------------------");
        immigrationAgency.immigration();
    }
}
