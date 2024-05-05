package pgo;

public class Address {

    public static String createAddress(String country) {
        return String.format("Country: %s", country);
    }
    public static String createAddress(String country, String city) {
        return String.format("Country: %s, City: %s", country, city);
    }
    public static String createAddress(String country, String city, String postCode) {
        return String.format("Country: %s, City: %s, Post code: %s", country, city, postCode);
    }
    public static String createAddress(String country, String city, String postCode, String street) {
        return String.format("Country: %s, City: %s, Post code: %s, Street: %s", country, city, postCode, street);
    }
    public static String createAddress(String country, String city, String postCode, String street, Integer houseNumber) {
        return String.format("Country: %s, City: %s, Post code: %s, Street: %s, House number: %s", country, city, postCode, street, houseNumber);
    }
}
