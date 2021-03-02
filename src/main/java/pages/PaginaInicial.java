package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaInicial {

    private WebDriver driver;

    //Itens NavBar
    private By menuItemHome = By.xpath("//*[@id=\"menu-item-132\"]/a");

    private By popupHomeOffice = By.xpath("//div[contains(@class, 'sg-popup-builder-content')]");
    private By botaoFecharPopupHomeOffice = By.className("sgpb-popup-close-button-1");
    private By telefoneAuditesteHome = By.xpath("//div[contains(@class, textwidget)]//div[2]//div[1]//div[1]/strong//a");
    private By tituloContainerSolidezDeMercado = By.xpath("//h2[contains(@class, 'vc_custom_heading vc_custom_1505950507376')]//b");
    private By textoContainerSolidezDeMercado = By.xpath("//p[contains(@class, 'vc_custom_heading vc_custom_1580138079481')]");
    private By tituloContainerTecnologia = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[2]/div/div/h2/b");
    private By textoContainerTecnologia = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[2]/div/div/p");
    private By tituloContainerResultado = By.xpath("//h2[contains(@class, 'vc_custom_heading vc_custom_1505950512945')]//b");
    private By textoContainerResultado = By.xpath("//p[contains(@class, 'vc_custom_heading vc_custom_1507650059574')]");

    //Tipos de Testes Disponibilizados
    private By testesAutomatizados = By.cssSelector("div:nth-child(8) > div > div:nth-child(1) > div > div > div:nth-child(1) > a");
    private By fabricaTestes = By.cssSelector("div:nth-child(8) > div > div:nth-child(1) > div > div > div:nth-child(2) > a");
    private By crowdsourcedAuditeste = By.cssSelector("div:nth-child(8) > div > div:nth-child(1) > div > div > div:nth-child(3) > a");
    private By testesManuais = By.cssSelector("div:nth-child(8) > div > div:nth-child(2) > div > div > div:nth-child(1) > a");
    private By consultoriaTestes = By.cssSelector("div:nth-child(8) > div > div:nth-child(2) > div > div > div:nth-child(2) > a");
    private By testesMobile = By.cssSelector("div:nth-child(8) > div > div:nth-child(3) > div > div > div:nth-child(1) > a");
    private By testesFuncionaisENaoFuncionais = By.cssSelector("div:nth-child(8) > div > div:nth-child(3) > div > div > div:nth-child(2) > a");
    private By automacaoDeProcessos = By.cssSelector("div:nth-child(8) > div > div:nth-child(4) > div > div > div:nth-child(1) > a");
    private By alocacaoProfissionaisEspecializados = By.cssSelector("div:nth-child(8) > div > div:nth-child(4) > div > div > div:nth-child(2) > a");

    //Dados das Cases
    private By tituloCasesHome = By.xpath("//h3[contains(@class, 'vc_custom_heading vc_custom_1505964002618')]//b");
    private By subtituloCasesHome = By.xpath("//p[contains(@class, 'vc_custom_heading vc_custom_1505964009773')]");

    private By seletorPrimeiroDepoimento = By.xpath("//div[contains(@class, 'vc_tta-panels-container')]//li[1]");
    private By seletorSegundoDepoimento = By.xpath("//div[contains(@class, 'vc_tta-panels-container')]//li[2]");
    //Dados do depoimento primeiro
    private By primeiroDepoimentoCasesHome =
            By.xpath("//div[contains(@class, 'depoimento-004 arrow-left vc_custom_1506913897462')]//div//p");
    private By clientePrimeiroDepoimentoCasesHome =
            By.xpath("//div[contains(@class, 'depoimento-004 arrow-left vc_custom_1506913897462')]//p[2]//span[1]");
    private By cargoEmpresaClientePrimeiroDepoimentoCasesHome =
            By.xpath("//div[contains(@class, 'depoimento-004 arrow-left vc_custom_1506913897462')]//p[2]//span[2]");
    //Dados do depoimento segundo
    private By segundoDepoimentoCasesHome =
            By.xpath("//div[contains(@class, 'depoimento-004 arrow-left vc_custom_1506954663920')]//div//p");
    private By clienteSegundoDepoimentoCasesHome =
            By.xpath("//div[contains(@class, 'depoimento-004 arrow-left vc_custom_1506954663920')]//p[2]//span[1]");
    private By cargoEmpresaClienteSegundoDepoimentoCasesHome =
            By.xpath("//div[contains(@class, 'depoimento-004 arrow-left vc_custom_1506954663920')]//p[2]//span[2]");

    private By textoSeuProjetoComSucessoGarantido = By.xpath("//div[contains(@class, 'vc_custom_heading vc_custom_1507572802097')]");
    private By linkParaSolicitarOrcamento = By.xpath("//div[contains(@class, 'vc_btn3-container  btn-rodape vc_btn3-left vc_custom_1508376558440')]//a");

    ///ChatBot
    private By iconeAbrirChatBot = By.xpath("//div[contains(@id, 'blip-chat-open-iframe')]");

    public PaginaInicial(WebDriver driver) {
        this.driver = driver;
    }

//    public void carregarPaginaIncial() {
//        driver.get("https://auditeste.com.br/");
//    }

    public String obterTituloPagina() {
        return driver.getTitle().toUpperCase();
    }

    public String obterNumeroAuditesteHome() {
      return driver.findElement(telefoneAuditesteHome).getText();
    };

    public String obterTextoMenuItemHome() {
        return driver.findElement(menuItemHome).getText();
    }

    public boolean visualizarPopupHomeOffice() {
        return driver.findElement(popupHomeOffice).isDisplayed();
    }

    public void clicarBotaoFecharPopupHomeOffice() {
        driver.findElement(botaoFecharPopupHomeOffice).click();
    }

    public String obterTituloContainerEsquerdoHome() {
        return driver.findElement(tituloContainerSolidezDeMercado).getText();
    }

    public String obterTextoContainerEsquerdoHome() {
        return driver.findElement(textoContainerSolidezDeMercado).getText();
    }

    public String obterTituloContainerDireitoHome() {
        return driver.findElement(tituloContainerTecnologia).getText();
    }

    public String obterTextoContainerDireitoHome() {
        return driver.findElement(textoContainerTecnologia).getText();
    }

    public String obterTituloContainerCentralHome() {
        return driver.findElement(tituloContainerResultado).getText();
    }

    public String obterTextoContainerCentralHome() {
        return driver.findElement(textoContainerResultado).getText();
    }

    public String obterTituloCasesHome() {
        return driver.findElement(tituloCasesHome).getText();
    }

    public String obterSubtituloCasesHome() {
        return driver.findElement(subtituloCasesHome).getText();
    }

    public void clicarSeletorPrimeiroDepoimentoCases() {
        driver.findElement(seletorPrimeiroDepoimento).click();
    }

    public void clicarSeletorSegundoDepoimentoCases() {
        driver.findElement(seletorSegundoDepoimento).click();
    }

    public String obterTextoPrimeiroDepoimentoCasesHome() {
        return driver.findElement(primeiroDepoimentoCasesHome).getText();
    }

    public String obterNomeClientePrimeiroDepoimentoCasesHome() {
        return driver.findElement(clientePrimeiroDepoimentoCasesHome).getText();
    }

    public String obterCargoEmpresaClientePrimeiroDepoimentoCasesHome() {
        return driver.findElement(cargoEmpresaClientePrimeiroDepoimentoCasesHome).getText();
    }

    public String obterTextoSegundoDepoimentoCasesHome() {
        return driver.findElement(segundoDepoimentoCasesHome).getText();
    }

    public String obterNomeClienteSegundoDepoimentoCasesHome() {
        return driver.findElement(clienteSegundoDepoimentoCasesHome).getText();
    }

    public String obterCargoEmpresaClienteSegundoDepoimentoCasesHome() {
        return driver.findElement(cargoEmpresaClienteSegundoDepoimentoCasesHome).getText();
    }

    public String obterTextoSeuProjetoComSucessoGarantido() {
        return driver.findElement(textoSeuProjetoComSucessoGarantido).getText();
    }

    public String obterTextoLinkSolicitarOrcamento() {
        return driver.findElement(linkParaSolicitarOrcamento).getText();
    }

    public String obterTextoTestesAutomatizados() {
        return driver.findElement(testesAutomatizados).getText();
    }

    public void clicarTextoTestesAutomatizados() {
        driver.findElement(testesAutomatizados).click();
    }

    public String obterTextoFabricaTestes() {
        return driver.findElement(fabricaTestes).getText();
    }

    public String obterTextoCrowdsourcedAuditeste() {
        return driver.findElement(crowdsourcedAuditeste).getText();
    }

    public String obterTextoTestesManuais() {
        return driver.findElement(testesManuais).getText();
    }

    public String obterTextoConsultoriaTestes() {
        return driver.findElement(consultoriaTestes).getText();
    }

    public String obterTextoTestesMobile() {
        return driver.findElement(testesMobile).getText();
    }

    public String obterTextoTestesFuncionaisENaoFuncionais() {
        return driver.findElement(testesFuncionaisENaoFuncionais).getText();
    }

    public String obterTextoAlocacaoProfissionaisEspecializados() {
        return driver.findElement(alocacaoProfissionaisEspecializados).getText();
    }

    public String obterTextoAutomacaoDeProcessos() {
        return driver.findElement(automacaoDeProcessos).getText();
    }

    public PopupChatBot clicarBotaoIniciarChatBot() {
        driver.findElement(iconeAbrirChatBot).click();
        return new PopupChatBot(driver);
    }

}