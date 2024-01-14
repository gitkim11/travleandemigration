package travelandimmigration;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TravelAgency implements ITravelable, ICheckUnableTravel {
    @Override
    public void travel() {

        Scanner scanner = new Scanner(System.in);
        Nation nation = new Nation();
        CheckUnableTravel checkUnableTravel = new CheckUnableTravel();

        boolean off_Flag = false;
        int cnt = 0;

        System.out.println("여행 안내를 시작합니다. \n");

        System.out.println("여행 인원 수 : ");
        int num = scanner.nextInt();


        ArrayList<String> travelName = new ArrayList<>(num);
        ArrayList<String> unableTravelName = new ArrayList<>(num);

        for (int i=0;i<num;i++) {
            System.out.println("이름 : ");
            travelName.add(nation.getName());

            System.out.println("여행출발 국가: ");
            String fromTravelCountry = nation.getCountry();
            System.out.println("여행도착 국가: ");
            String toTravelCountry = nation.getCountry();

            if (CheckUnableTravel.checkUnableTravel(fromTravelCountry, toTravelCountry) == true){
                cnt++;
                unableTravelName.add(travelName.get((travelName.size()-1)));
                travelName.remove(travelName.size() -1);
                continue;
            }
            System.out.printf("%s 님은 %s 에서 %s (으)로 여행 갑니다. \n \n",
                    travelName.get(travelName.size() -1), fromTravelCountry, toTravelCountry);
        }
        System.out.printf("여행 허용 인원 : %d 명 \n", num-cnt);
        System.out.printf("여행 허가 인원 = %s \n", travelName);
        System.out.printf("여행 불가 인원 = %s \n", unableTravelName);
    }
}
