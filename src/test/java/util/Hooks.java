package util;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;

    public Hooks(WebDriver driver) {
        this.driver = driver;
    }

    @Before
    public static void inicializar() {
        System.setProperty("webdriver.chrome.driver",
                "/home/dernival_liandro/.webdrivers/chromedriver/88/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeEach
    public void carregarPaginaInicial() {
        driver.get("https://auditeste.com.br/");
    }

//    @After(order = 0)
//    public void capturarTela(String nomeTeste, String resultado) {
//        TakesScreenshot camera = (TakesScreenshot) driver;
//        File capturarTela = camera.getScreenshotAs(OutputType.FILE);
//        try {
//            Files.move(capturarTela, new File("resources/screenshots/" + nomeTeste + "_" + resultado + ".png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @After
    public static void finalizar() {
        driver.quit();
    }

}
