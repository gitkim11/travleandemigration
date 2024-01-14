package travelandimmigration;

import java.util.ArrayList;
import java.util.Scanner;

public class ImmigrationAgency implements ICheckUnableTravel, IImmigrationable, ICheckUnableImmigration {
    @Override
    public void immigration() {

        Scanner scanner = new Scanner(System.in);
        Nation nation = new Nation();
        CheckUnableTravel checkUnableTravel = new CheckUnableTravel();
        CheckUnableImmigration checkUnableImmigration = new CheckUnableImmigration();

        boolean off_Flag = false;
        int immigrationCnt = 0;
        int travelCnt = 0;

        System.out.println("이민 안내를 시작합니다. \n");
        System.out.println("이민 인원 수 : ");
        int num = scanner.nextInt();

        ArrayList<String> immigrationName = new ArrayList<>(num);
        ArrayList<String> immigrationCountry = new ArrayList<>(num);
        ArrayList<String> unableTravelName = new ArrayList<>(num);
        ArrayList<String> unableImmigrationName = new ArrayList<>(num);

        for (int i = 0; i < num; i++) {
            System.out.println("이름 : ");
            immigrationName.add(nation.getName());
            System.out.println("국적 : ");
            immigrationCountry.add(nation.getCountry());

            System.out.println("이민출발 국가: ");
            String fromImmigrationCountry = nation.getCountry();
            System.out.println("이민도착 국가: ");
            String toImmigrationCountry = nation.getCountry();

            if (CheckUnableImmigration.checkUnableImmigration(immigrationCountry.get(i), toImmigrationCountry) == true) {
                immigrationCnt++;
                unableImmigrationName.add(immigrationName.get(immigrationName.size() -1));
                immigrationName.remove(immigrationName.size() -1);
                continue;
            }
            if (checkUnableTravel.checkUnableTravel(fromImmigrationCountry, toImmigrationCountry) == true) {
                travelCnt++;
                unableTravelName.add(immigrationName.get(immigrationName.size()- 1));
                immigrationName.remove(immigrationName.size() -1);
                continue;
            }
            System.out.printf("%s 님은 %s 에서 %s (으)로 이동합니다. \n \n",
                    immigrationName.get(immigrationName.size() - 1), fromImmigrationCountry, toImmigrationCountry);
            System.out.printf("%s (%s) 님은 %s 에서 %s (으)로 이민 갑니다. \n \n",
                    immigrationName.get(immigrationName.size() -1), immigrationCountry.get(immigrationCountry.size() -1), immigrationCountry.get(immigrationCountry.size()-1), toImmigrationCountry);
            System.out.printf("%s (%s) 님은 %s (%s) (으)로 국적이 변경됩니다. \n \n",
                    immigrationName.get(immigrationName.size()-1), immigrationCountry.get(immigrationCountry.size() -1), immigrationName.get(immigrationName.size()-1), toImmigrationCountry);
            immigrationCountry.set(i, toImmigrationCountry);

        }
        System.out.printf("이민 허용 인원 : %d 명 \n", num - (immigrationCnt + travelCnt));
        System.out.printf("이민 허가 인원 = %s \n", immigrationName);

        System.out.printf("이민 불가 인원 : %d 명 \n", immigrationCnt + travelCnt);
        System.out.printf("이동 불가 인원 = %s \n", unableTravelName);
        System.out.printf("이민 불가 인원 = %s \n", unableImmigrationName);

    }
}