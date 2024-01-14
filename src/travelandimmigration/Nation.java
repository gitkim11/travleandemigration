package travelandimmigration;

import java.util.Scanner;

public class Nation extends AbstractNation{

    Scanner scanner = new Scanner(System.in);

    public void Nation (String name, String country){
        setName(name);
        setCountry(country);
    }
    @Override
    public String getName() {
        String name = scanner.next();
        return name;
    }
    @Override
    public String getCountry() {
        String country = scanner.next();
        return country;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setCountry(String country) {
        this.country = country;
    }
}
