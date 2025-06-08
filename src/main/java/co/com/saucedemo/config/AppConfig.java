package co.com.saucedemo.config;

import co.com.saucedemo.utils.TestDataGenerator;

public class AppConfig {
    public static final String BASE_URL   = "https://www.saucedemo.com";
    public static final String USERNAME   = "standard_user";
    public static final String PASSWORD   = "secret_sauce";
    public static final String FIRST_NAME = TestDataGenerator.getNombre();
    public static final String LAST_NAME  =  TestDataGenerator.getApellido();
    public static final String ZIP_CODE   =   TestDataGenerator.getCodigoPostal();



}
