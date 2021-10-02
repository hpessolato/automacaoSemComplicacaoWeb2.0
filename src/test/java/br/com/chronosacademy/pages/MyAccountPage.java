package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.MyAccountMap;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    MyAccountMap myAccountMap;

    public MyAccountMap() {
        myAccountMap = new MyAccountMap();
        PageFactory.initElements(Driver.getDriver(), myAccountMap);
    }

    public void clickLinkUSer() {
        myAccountMap.linkUser.click();

    }

    public void clickMyAccount() {
        Driver.visibilityOf(myAccountMap.linkUser);
        myAccountMap.linkMyAccount.click();
    }

    public void clickLinkEdit() {
        Driver.visibilityOf(myAccountMap.linkEdit);
        myAccountMap.linkEdit.click();
    }

    public String getTextUsuario() {
        Driver.visibilityOf(myAccountMap.textUsuario);
        myAccountMap.textUsuario.getText();
    }

    public void clickBtnDelete() {
        Driver.visibilityOf(myAccountMap.btnDelete);
        myAccountMap.btnDelete.click();
    }

    public void clickBtnYes() {
        Driver.visibilityOf(myAccountMap.btnYes);
        myAccountMap.btnYes.click();
    }

}