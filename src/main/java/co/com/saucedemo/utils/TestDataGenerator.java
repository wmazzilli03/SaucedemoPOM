package co.com.saucedemo.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDataGenerator {

    static Faker faker = new Faker(new Locale("es"));

    public static String getNombre() {
        return faker.name().firstName();
    }

    public static String getApellido() {
        return faker.name().lastName();
    }

    public static String getCodigoPostal() {
        return faker.address().zipCode();
    }

}
