public class Task03 {
    public static void main(String[] args){
    A_country a_country=new A_country();

    a_country.setCountry_name("Россия");

    a_country.setName_of_the_continent("Евразия");

    a_country.setNumber_of_inhabitants_in_the_country("145 478 097 ");

    a_country.setTelephone_country_code("+7");

    a_country.setName_of_the_capital("Москва");

    a_country.setName_of_the_countrys_cities("Иванова Ижевск Казань Липецк Орёл");


    System.out.println( a_country.getCountry_name());
    System.out.println( a_country.getName_of_the_continent());
    System.out.println( a_country.getNumber_of_inhabitants_in_the_country());
    System.out.println(  a_country.getTelephone_country_code());
    System.out.println( a_country.getName_of_the_capital());
    System.out.println( a_country.getName_of_the_countrys_cities());

    }
}
