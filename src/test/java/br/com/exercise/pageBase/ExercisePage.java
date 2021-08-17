package br.com.exercise.pageBase;

import br.com.exercise.data.GenerationRandomValues;
import br.com.exercise.utils.BasePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import br.com.exercise.pageObjects.ExerciseObjects;

import java.util.concurrent.TimeUnit;

public class ExercisePage extends BasePage {


    public ExercisePage(WebDriver driver) {
        super(driver);
    }

    ExerciseObjects pageObjects = new ExerciseObjects(driver);
    GenerationRandomValues values = new GenerationRandomValues();

    public void setName(){
        pageObjects.getInputName().sendKeys(values.getValueNames());
    }

    public void setPhone(){
        pageObjects.getInputPhone().sendKeys(values.getValuePhone());
    }

    public void setEmail(){
        pageObjects.getInputEmail().sendKeys("email@test.com");
    }

    public void setCity(){
        pageObjects.getInputCity().sendKeys(values.getValueCity());
    }

    public void setUsername(){
        pageObjects.getInputUsername().sendKeys(values.getValueUsername());
    }

    public void setPassword(){
        pageObjects.getInputPassword().sendKeys("123456");
    }

    public void selectCountry(){
        Select comboBox = new Select(pageObjects.getComboBoxCountry());
        comboBox.selectByVisibleText("Brazil");
    }

    public void clickButtonSubmit(){
        pageObjects.getButtonSubmit().click();
        waitTo(5);
    }

    public void validateSuccess(){
        Assert.assertEquals("This is just a dummy form, you just clicked SUBMIT BUTTON",
                pageObjects.getMessageSuccess().getText());
    }
}
