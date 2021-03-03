package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contato {

    private WebDriver driver;

    //Itens NavBar
    private By menuItemBlog = By.xpath("//*[@id=\"menu-item-130\"]/a");

    private By tituloPaginaBlog = By.xpath("//h1[contains(@class, 'vc_custom_heading titulo_site')]");

    private By tituloTelefoneContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[1]/b");
    private By textoTelefoneContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/a");
    private By tituloUnidadeCentroContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[3]/div[2]/div/div/div[1]/a/b");
    private By textoUnidadeCentroContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[3]/div[2]/div/div/div[2]");
    private By tituloUnidadeBarueriContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[4]/div[2]/div/div/div[1]/a/b");
    private By textoUnidadeBarueriContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[4]/div[2]/div/div/div[2]/a");
    private By tituloFormularioContato = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/div[2]/b");
    private By tituloNomeFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[1]/div/div/div/div/div[1]/label/span");
    private By campoNomeFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[1]/div/div/div/div/div[2]/input");
    private By tituloEmailFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[2]/div/div/div/div/div[1]/label/span");
    private By campoEmailFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[2]/div/div/div/div/div[2]/input");
    private By tituloTelefoneFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[3]/div/div/div/div/div[1]/label/span");
    private By campoTelefoneFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[2]/div/div[3]/div/div/div/div/div[2]/input");
    private By tituloEmpresaFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[3]/div/div[1]/div/div/div/div/div[1]/label/span");
    private By campoEmpresaFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[3]/div/div[1]/div/div/div/div/div[2]/input");
    private By tituloFalarComFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[3]/div/div[2]/div/div/div/div/div[1]/label/span");
    private By campoFalarComFormContato = By.xpath("//*[@id=\"field_container\"]/div/div[2]/select");
    private By tituloMensagemFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[4]/div/div/div/div[1]/label/span");
    private By campoMensagemFormContato = By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[3]/div/div/div[2]/div[2]/div[10]/form/div[4]/div/div/div/div[2]/textarea");
    private By botaoEnviarFormularioContato = By.xpath("//*[@id=\"field_container\"]/div/div/button");

    private By textoSeuProjetoComSucessoGarantido = By.xpath("//*[@id=\"rodape-faixa-preta\"]/div[1]/div/div/div[2]");
    private By linkParaSolicitarOrcamento = By.xpath("//*[@id=\"rodape-faixa-preta\"]/div[2]/div/div/div[1]/a");

    public Contato(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarMenuItemContato() {
        driver.findElement(menuItemBlog).click();
    }

    public String verificarSeEstaNaPaginaContato() {
        return driver.findElement(tituloPaginaBlog).getText();
    }

    public String obterTituloTelefoneContato() {
        return driver.findElement(tituloTelefoneContato).getText();
    }

    public String obterTextoTelefoneContato() {
        return driver.findElement(textoTelefoneContato).getText();
    }

    public String obterTituloUnidadeCentroContato() {
        return driver.findElement(tituloUnidadeCentroContato).getText();
    }

    public String obterTextoUnidadeCentroContato() {
        return driver.findElement(textoUnidadeCentroContato).getText();
    }

    public String obterTituloUnidadeBarueriContato() {
        return driver.findElement(tituloUnidadeBarueriContato).getText();
    }

    public String obterTextoUnidadeBarueriContato() {
        return driver.findElement(textoUnidadeBarueriContato).getText();
    }

    public String obterTituloFormularioContato() {
        return driver.findElement(tituloFormularioContato).getText();
    }

    public String obterTituloNomeFormContato() {
        return driver.findElement(tituloNomeFormContato).getText();
    }

    public boolean verificarCampoNomeFormContatoEstaVisivel() {
        return driver.findElement(campoNomeFormContato).isDisplayed();
    }

    public String obterTituloEmailFormContato() {
        return driver.findElement(tituloEmailFormContato).getText();
    }

    public boolean verificarCampoEmailFormContatoEstaVisivel() {
        return driver.findElement(campoEmailFormContato).isDisplayed();
    }

    public String obterTituloTelefoneFormContato() {
        return driver.findElement(tituloTelefoneFormContato).getText();
    }

    public boolean verificarTelefoneFormContatoEstaVisivel() {
        return driver.findElement(campoTelefoneFormContato).isDisplayed();
    }

    public String obterTituloEmpresaFormContato() {
        return driver.findElement(tituloEmpresaFormContato).getText();
    }

    public boolean verificarEmpresaFormContatoEstaVisivel() {
        return driver.findElement(campoEmpresaFormContato).isDisplayed();
    }

    public String obterTituloFalarComFormContato() {
        return driver.findElement(tituloFalarComFormContato).getText();
    }

    public boolean verificarFalarComFormContatoEstaVisivel() {
        return driver.findElement(campoFalarComFormContato).isDisplayed();
    }

    public String obterTituloMensagemFormContato() {
        return driver.findElement(tituloMensagemFormContato).getText();
    }

    public boolean verificarMensagemFormContatoEstaVisivel() {
        return driver.findElement(campoMensagemFormContato).isDisplayed();
    }

    public boolean verificarBotaoEnviarFormularioContatoEstaVisivel() {
        return driver.findElement(botaoEnviarFormularioContato).isDisplayed();
    }

    public String obterTextoSeuProjetoComSucessoGarantido() {
        return driver.findElement(textoSeuProjetoComSucessoGarantido).getText();
    }

    public String obterTextoLinkSolicitarOrcamento() {
        return driver.findElement(linkParaSolicitarOrcamento).getText();
    }
}
