package com.multi.project.test;
import com.multi.project.page.object.LoginPage;
import org.testng.annotations.Test;



public class LoginTest {

    @Test
    public void checkLoginPage() {
        LoginPage loginPage = new LoginPage();
        loginPage.getLoginPage();
        System.out.println("Hi Jack");
    }
}
