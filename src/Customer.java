import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Customer implements Service {
    private String name;
    private String surname;
    private Country country;
    private int year;
    private String email;

    public Customer(String name, String surname, Country country, int year, String email) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.year = year;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer() {

    }

    @Override
    public int findAge(int birthDate) {
        int age = 0;
        try {
            Calendar past = new GregorianCalendar();
            Calendar present = Calendar.getInstance();
            past.setTime(new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse(String.valueOf(birthDate)));
            age = present.get(Calendar.YEAR) - past.get(Calendar.YEAR);
        } catch (ParseException e) {
            int a = 2022 - birthDate;
            System.out.println("invalid date: " + a);
        }
        return age;
    }

    @Override
    public void findAge(Customer[] customers, int year) {

    }

    @Override
        public Customer[] similarCountry(Customer[]customers) {

            String input = new Scanner(System.in).next();
            int counter = 0;
            for (Customer customer : customers) {
                if (customer.country.name().equals(input.toUpperCase())) {
                    counter++;
                }
            }

            int index = 0;
            Customer[]customers1 = new Customer[counter];
            for (Customer customer : customers) {
                if(customer.country.name().equals(input.toUpperCase())) {
                    customers1[index] = customer;
                    index++;
                }
            }return customers1;
    }


    @Override
    public void getAllCustomer(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void getCountry(Customer[] customers) {
        for (Customer customer : customers) {
            if (customer.country.equals(country)) {
                System.out.println(customer);
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", email='" + email + '\'' +
                '}';
    }
}
