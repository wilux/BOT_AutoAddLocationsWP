package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class LoginPage
{
    WebDriver driver;

    By UserInput = By.id("BPN_u");
    By PasswordInput = By.id("BPN_p");
    By LoginButton = By.id("btn-submit");

    public LoginPage(WebDriver driver){

        this.driver = driver;

    }


    public void setUserName(String strUserName){

        driver.findElement(UserInput).sendKeys(strUserName);

    }


    public void setPassword(String strPasword){

        driver.findElement(PasswordInput).sendKeys(strPasword);

    }

    public void LoginButton(){

        driver.findElement(LoginButton).click();

    }


    public void loginToBT(String strUserName,String strPasword){

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.LoginButton();
    }



}


