package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountMap {
    @FindBy (css = ".fixedImportant")
    public WebElement textCreateAccount;
    @FindBy (name = "username")
    public WebElement inpUserName;
    @FindBy (name = "emailRegisterPage")
    public WebElement inpEmail;
    @FindBy (name = "passwordRegisterPage")
    public WebElement inpPassword;
    @FindBy (name = "confirm_passwordRegisterPage")
    public WebElement getInpConfirmPassword;
    @FindBy (name = "countryListboxRegisterPage")
    public WebElement slcCountry;
    @FindBy (name = "i_agree")
    public WebElement inpIAgree;
    @FindBy (css = "#register_btnundefined")
    public WebElement btnRegister;

}
