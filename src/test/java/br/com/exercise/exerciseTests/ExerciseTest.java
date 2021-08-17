package br.com.exercise.exerciseTests;

import br.com.exercise.utils.WebDriverUtil;
import br.com.exercise.data.GenerationRandomValues;
import org.junit.Test;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import br.com.exercise.pageBase.ExercisePage;

public class ExerciseTest {

    public static WebDriver driver = WebDriverUtil.openBrowser();
    ExercisePage page = new ExercisePage(driver);

    @AfterClass
    public static void testQuitBrowser() {
        driver.quit();
    }

    @Test
    public void testFillAndSubmitRegistrationForm() {
        this.page.setName();
        this.page.setPhone();
        this.page.setEmail();
        this.page.selectCountry();
        this.page.setCity();
        this.page.setUsername();
        this.page.setPassword();
        this.page.clickButtonSubmit();
        this.page.validateSuccess();
    }

}
