package com.hawkeye.tests;

import com.hawkeye.pages.ContextPage;
import com.hawkeye.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckContext {

    ContextPage contextPage =new ContextPage();


    @Test
    public void Context_Test(){

        Driver.getDriver().get("http://localhost:7080/context_menu");

        Driver.getDriver().manage().window().maximize();

        Actions actions =new Actions(Driver.getDriver());

        actions.contextClick(contextPage.Context).perform();

        Alert alert =Driver.getDriver().switchTo().alert();

        System.out.println(alert.getText());

        Assert.assertEquals(alert.getText(),"You selected a context menu");

        Driver.closeDriver();


    }
}