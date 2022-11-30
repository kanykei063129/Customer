public interface Service {

    int findAge(int birthDate);

    void findAge(Customer[] customers, int year);

    Customer[] similarCountry(Customer[] customers);

    void getCountry(Customer[] customers);

    void getAllCustomer(Customer[] customers);
}
