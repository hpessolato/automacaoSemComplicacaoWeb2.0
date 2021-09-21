package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.NewAccountMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {

    NewAccountMap newAccountMap;

    public NewAccountPage(){
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(), newAccountMap);
    }

    public String getTextNewAccount(){
        return newAccountMap.textCreateAccount.getText();
    }

    public void setinpUserName(String userName){
        newAccountMap.inpUserName.sendKeys(userName);
    }

    public void setinpEmail(String email){
        newAccountMap.inpEmail.sendKeys(email);
    }

    public void setinpPassword(String password){
        newAccountMap.inpPassword.sendKeys(password);
    }

    public void setinpConfirmPassword(String password){
        newAccountMap.getInpConfirmPassword.sendKeys(password);
    }

    public void selectCountry (String country){
        Select select = new Select(newAccountMap.slcCountry);
    }





}
