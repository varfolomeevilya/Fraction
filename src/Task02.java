public class Task02 {
    public static void main(String[] args){
        City city =new City();
        city.setCountry_name("Россия");

        city.setName_of_the_city("Рязань");

        city.setNumber_of_residents_in_the_city("120 человек");

        city.setName_of_the_region("777- москва, 161 - Ростов на Дону, 62 - Рязань");

        city.setPhone_code_of_the_city("4912-Разань");

        city.setPostal_code_of_the_city("390007 - улица октябрьского городка");

        System.out.println( city.getCountry_name());

        System.out.println(city.getName_of_the_city());

        System.out.println(city.getNumber_of_residents_in_the_city());

        System.out.println(city.getName_of_the_region());

        System.out.println(city.getPhone_code_of_the_city());

        System.out.println(city.getPostal_code_of_the_city());
    }
}
