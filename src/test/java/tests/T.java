package tests;

import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class T {
    ReadDataFromJson readDataFromJson;
    @Test
    public void testLoginValidData() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        System.out.println(readDataFromJson.readJsonData().URL);
       System.out.println(readDataFromJson.readJsonData().login.validCredentials.userName);
        System.out.println(readDataFromJson.readJsonData().login.validCredentials.password);

    }

}
