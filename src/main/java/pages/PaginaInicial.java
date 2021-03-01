package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaInicial {

    private WebDriver driver;

    //Itens NavBar
    private By menuItemHome = By.xpath("//a[contains(@title, 'Home')]");

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

    //Rodape
    private By textoRodapeContato = By.cssSelector("div > div:nth-child(1) > div > div > div.vc_custom_heading > b");
    private By linkRodapeTelefone = By.cssSelector("div > div:nth-child(1) > div > div > div:nth-child(3) > div > p:nth-child(1) > a > strong");
    private By linkRodapeUnidade = By.cssSelector("div > div:nth-child(1) > div > div > div:nth-child(3) > div > p:nth-child(2) > a:nth-child(1) > strong");
    private By linkRodapeEndereco = By.cssSelector("div > div:nth-child(1) > div > div > div:nth-child(3) > div > p:nth-child(2) > a:nth-child(3)");
    private By textoRodapeQuemSomos = By.cssSelector("div > div:nth-child(2) > div > div > div.vc_custom_heading > b");
    private By linkRodapeHistoria = By.cssSelector("div > div:nth-child(2) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(1)");
    private By linkRodapeMissaoVisaoEValores = By.cssSelector("div > div:nth-child(2) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(3)");
    private By linkRodapeNossosClientes = By.cssSelector("div > div:nth-child(2) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(5)");
    private By textoRodapeServicos = By.cssSelector("div > div:nth-child(3) > div > div > div.vc_custom_heading > b");
    private By linkRodapeFabricaDeTestes = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(1)");
    private By linkRodapeAutomatizacaoDeTestes = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(3)");
    private By linkRodapeTestesMobile = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(5)");
    private By linkRodapeTestesManuais = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(7)");
    private By linkRodapeTestesFuncionaisENaoFuncionais = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(9)");
    private By linkRodapeAlocacaoDeProfissionais = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(11)");
    private By linkRodapeAutomacaoDeProcessos = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(13)");
    private By linkRodapeCrowdsourcedAuditeste = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(15)");
    private By linkRodapeConsultoria = By.cssSelector("div > div:nth-child(3) > div > div > div.wpb_text_column.wpb_content_element > div > p > a:nth-child(17)");
    private By linkRodapeCasesDeSucesso = By.cssSelector("div > div:nth-child(4) > div > div > div:nth-child(1) > a > b");
    private By linkRodapeTrabalheConosco = By.cssSelector("div > div:nth-child(4) > div > div > div:nth-child(3) > a > b");
    private By linkRodapeBlog = By.cssSelector("div > div:nth-child(4) > div > div > div:nth-child(5) > a > b");
    private By linkRodapeWebmail = By.cssSelector("div > div:nth-child(4) > div > div > div:nth-child(7) > a > b");
    private By textoRodapeContateNos = By.cssSelector("div > div.wpb_column.vc_column_container.vc_col-sm-4 > div > div > div:nth-child(3) > b");
    private By textoRodapeEmailMarketingAuditeste = By.xpath("//*[@id=\"links-rodape\"]/div/div[5]/div/div/div[4]");
    private By textoRodapeCopyright = By.cssSelector("footer.text-center");

    ///ChatBot
    private By iconeAbrirChatBot = By.xpath("//div[contains(@id, 'blip-chat-open-iframe')]");

    public PaginaInicial(WebDriver driver) {
        this.driver = driver;
    }

    public void carregarPaginaIncial() {
        driver.get("https://auditeste.com.br/");
    }

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

    public String obterTextoRodapeContato() {
        return driver.findElement(textoRodapeContato).getText();
    }

    public String obterTextoLinkRodapeTelefone() {
        return driver.findElement(linkRodapeTelefone).getText();
    }

    public String obterTextoLinkRodapeUnidade() {
        return driver.findElement(linkRodapeUnidade).getText();
    }

    public String obterTextoLinkRodapeEndereco() {
        return driver.findElement(linkRodapeEndereco).getText();
    }

    public String obterTextoRodapeQuemSomos() {
        return driver.findElement(textoRodapeQuemSomos).getText();
    }

    public String obterTextoLinkRodapeHistoria() {
        return driver.findElement(linkRodapeHistoria).getText();
    }

    public String obterTextoLinkRodapeMissaoVisaoEValores() {
        return driver.findElement(linkRodapeMissaoVisaoEValores).getText();
    }

    public String obterTextoLinkRodapeNossosClientes() {
        return driver.findElement(linkRodapeNossosClientes).getText();
    }

    public String obterTextoRodapeServicos() {
        return driver.findElement(textoRodapeServicos).getText();
    }

    public String obterTextoLinkRodapeFabricaDeTestes() {
        return driver.findElement(linkRodapeFabricaDeTestes).getText();
    }

    public String obterTextoLinkRodapeAutomatizacaoDeTestes() {
        return driver.findElement(linkRodapeAutomatizacaoDeTestes).getText();
    }

    public String obterTextoLinkRodapeTestesMobile() {
        return driver.findElement(linkRodapeTestesMobile).getText();
    }

    public String obterTextoLinkRodapeTestesManuais() {
        return driver.findElement(linkRodapeTestesManuais).getText();
    }

    public String obterTextoLinkRodapeTestesFuncionaisENaoFuncionais() {
        return driver.findElement(linkRodapeTestesFuncionaisENaoFuncionais).getText();
    }

    public String obterTextoLinkRodapeAlocacaoDeProfissionais() {
        return driver.findElement(linkRodapeAlocacaoDeProfissionais).getText();
    }

    public String obterTextoLinkRodapeAutomacaoDeProcessos() {
        return driver.findElement(linkRodapeAutomacaoDeProcessos).getText();
    }

    public String obterTextoLinkRodapeCrowdsourcedAuditeste() {
        return driver.findElement(linkRodapeCrowdsourcedAuditeste).getText();
    }

    public String obterTextoLinkRodapeConsultoria() {
        return driver.findElement(linkRodapeConsultoria).getText();
    }

    public String obterTextoLinkRodapeCasesDeSucesso() {
        return driver.findElement(linkRodapeCasesDeSucesso).getText();
    }

    public String obterTextoLinkRodapeTrabalheConosco() {
        return driver.findElement(linkRodapeTrabalheConosco).getText();
    }

    public String obterTextoLinkRodapeBlog() {
        return driver.findElement(linkRodapeBlog).getText();
    }

    public String obterTextoLinkRodapeWebmail() {
        return driver.findElement(linkRodapeWebmail).getText();
    }

    public String obterTextoRodapeContateNos() {
        return driver.findElement(textoRodapeContateNos).getText();
    }

    public String obterTextoRodapeEmailMarketingAuditeste() {
        return driver.findElement(textoRodapeEmailMarketingAuditeste).getText();
    }

    public String obterTextoRodapeCopyright() {
        return driver.findElement(textoRodapeCopyright).getText();
    }

    public PopupChatBot clicarBotaoIniciarChatBot() {
        driver.findElement(iconeAbrirChatBot).click();
        return new PopupChatBot(driver);
    }

}