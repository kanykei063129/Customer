import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void   main(String[] args) {
            Customer customer = new Customer("Kanykei", "Akjoltoi kyzy", Country.KYRGYZSTAN, 2006, "@akjoltoikyzykanykei");
            Customer customer1 = new Customer("Adil", "Aitbaev", Country.KYRGYZSTAN, 2004, "@aitbaevadil");
            Customer customer2 = new Customer("Nuriza", "Muratova", Country.KAZAKHSTAN, 2005, "@muratovanuriza");
            Customer customer3 = new Customer("Erlan", "Buzurmanaliev", Country.EUROPE, 2001, "@buzurmanalieverlan");
            Customer customer4 = new Customer("Temirlan", "Shuzukulov", Country.ITALY, 2002, "@shuzukulovtemirlan");
            Customer customer5 = new Customer("Eliza", "Ashyrbaeva", Country.EUROPE, 2004, "@ashyrbaevaeliza");
            Customer[] customers = {customer, customer1, customer2, customer3, customer4, customer5};


            Customer customerr = new Customer();
            customerr.getAllCustomer(customers);
            customerr.getCountry(customers);
            System.out.println(customerr.findAge(customer.getYear()));
        System.out.println(Arrays.toString(customer.similarCountry(customers)));

    }
    }
