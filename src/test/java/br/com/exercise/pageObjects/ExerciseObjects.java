package br.com.exercise.pageObjects;

import br.com.exercise.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExerciseObjects extends BasePage{

    public ExerciseObjects(WebDriver driver) {
        super(driver);
    }

    public WebElement getFormBox(){
        return driver.findElement(By.id("load_box"));
    }

    public WebElement getInputName(){
        return driver.findElement(By.name("name"));
    }

    public WebElement getInputPhone(){
        return driver.findElement(By.name("phone"));
    }

    public WebElement getInputEmail(){
        return driver.findElement(By.name("email"));
    }

    public WebElement getInputCity(){
        return driver.findElement(By.name("city"));
    }

    public WebElement getInputUsername(){
        return driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input"));
    }

    public WebElement getInputPassword(){
        return driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input"));
    }

    public WebElement getButtonSubmit(){
        return driver.findElement(By.cssSelector("#load_form > div:nth-child(12) > div.span_1_of_4 > input"));
    }

    public WebElement getComboBoxCountry(){
        return driver.findElement(By.name("country"));
    }

    public WebElement getMessageSuccess(){
        return driver.findElement(By.cssSelector("#alert"));
    }

}
