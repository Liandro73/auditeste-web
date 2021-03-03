package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blog {

    private WebDriver driver;

    //Itens NavBar
    private By menuItemBlog = By.xpath("//*[@id=\"menu-item-1477\"]/a");

    private By tituloPaginaBlog = By.xpath("//h1[contains(@class, 'vc_custom_heading titulo_site')]");

    private By numeroPaginaAtualBlog = By.xpath("//span[contains(@class, 'page-numbers current')]");
    private By proximaPaginaBlog = By.xpath("//a[contains(@class, 'next page-numbers')]");
    private By paginaAnteriorBlog = By.xpath("//a[contains(@class, 'prev page-numbers')]");
    private By blocosDePotagens = By.xpath("//div[contains(@class, 'bloco-post')]");

    private By textoSeuProjetoComSucessoGarantido = By.xpath("//*[@id=\"rodape-faixa-preta\"]/div[1]/div/div/div[2]");
    private By linkParaSolicitarOrcamento = By.xpath("//*[@id=\"rodape-faixa-preta\"]/div[2]/div/div/div[1]/a");

    public Blog(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarMenuItemBlog() {
        driver.findElement(menuItemBlog).click();
    }

    public String verificarSeEstaNaPaginaBlog() {
        return driver.findElement(tituloPaginaBlog).getText();
    }

    public String obterNumeroPaginaAtualBlog() {
        return driver.findElement(numeroPaginaAtualBlog).getText();
    }

    public int obterQuantidadeBlocosDePotagens() {
        return driver.findElements(blocosDePotagens).size();
    }

    public boolean vericarBlocosDePotagensEstaVisivel() {
        return driver.findElement(blocosDePotagens).isDisplayed();
    }

    public boolean vericarBotaoProximaPaginaBlogEstaVisivel() {
        return driver.findElement(proximaPaginaBlog).isDisplayed();
    }

    public boolean vericarBotaoPaginaAnteriorBlogEstaVisivel() {
        return driver.findElement(paginaAnteriorBlog).isDisplayed();
    }

    public void clicarBotaoProximaPaginaBlog() {
        driver.findElement(proximaPaginaBlog).click();
    }

    public void clicarBotaoPaginaAnteriorBlog() {
        driver.findElement(paginaAnteriorBlog).click();
    }

    public String obterTextoSeuProjetoComSucessoGarantido() {
        return driver.findElement(textoSeuProjetoComSucessoGarantido).getText();
    }

    public String obterTextoLinkSolicitarOrcamento() {
        return driver.findElement(linkParaSolicitarOrcamento).getText();
    }

}
