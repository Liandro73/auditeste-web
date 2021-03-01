package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PaginaInicial;
import pages.PopupChatBot;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaPaginaInicialSteps{

    private static WebDriver driver;
    private PaginaInicial homePage = new PaginaInicial(driver);
    private PopupChatBot popupChatBot = new PopupChatBot(driver);

    private String tituloPagina = "AUDITESTE - ESPECIALISTAS EM QUALIDADE DE SOFTWARE";
    private String telefoneHome = "+55 11 3236-6600";

    @Before
    public static void inicializar() {
        System.setProperty("webdriver.chrome.driver",
                "/home/dernival_liandro/.webdrivers/chromedriver/88/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public static void finalizar() {
        driver.quit();
    }

    @Dado("que estou na pagina inicial")
    public void que_estou_na_pagina_inicial() {
        homePage.carregarPaginaIncial();
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        assertEquals(homePage.obterTituloPagina(), (tituloPagina));
        assertEquals(homePage.obterNumeroAuditesteHome(), (telefoneHome));
    }

    @Quando("eu navego pela pagina")
    public void eu_navego_pela_pagina() {
        assertEquals(homePage.obterTituloContainerEsquerdoHome(), ("Solidez de Mercado"));
        assertEquals(homePage.obterTextoContainerEsquerdoHome(), ("Há mais de 19 anos trazendo as melhores e mais modernas soluções em\n" +
                "testes de software."));
        assertEquals(homePage.obterTituloContainerCentralHome(), ("Resultado"));
        assertEquals(homePage.obterTextoContainerCentralHome(), ("Superar expectativas e garantir o sucesso do seu projeto é a nossa\n" +
                "principal missão."));
        assertEquals(homePage.obterTituloContainerDireitoHome(), ("Tecnologia"));
        assertEquals(homePage.obterTextoContainerDireitoHome(), ("Extraindo o melhor dos recursos\n" +
                "tecnológicos para entregar um\n" +
                "alto nível de qualidade."));
    }

    @Quando("visualizo os tipos de testes")
    public void visualizo_os_tipos_de_testes() {
        assertEquals(homePage.obterTextoTestesAutomatizados(), ("Automatizados"));
        assertEquals(homePage.obterTextoFabricaTestes(), ("Fábrica"));
        assertEquals(homePage.obterTextoCrowdsourcedAuditeste(), ("Crowdsourced Auditeste"));
        assertEquals(homePage.obterTextoTestesManuais(), ("Manuais"));
        assertEquals(homePage.obterTextoConsultoriaTestes(), ("Consultoria"));
        assertEquals(homePage.obterTextoTestesMobile(), ("Mobile"));
        assertEquals(homePage.obterTextoTestesFuncionaisENaoFuncionais(), ("Testes Funcionais e Não Funcionais"));
        assertEquals(homePage.obterTextoAutomacaoDeProcessos(), ("Automação de Processos"));
        assertEquals(homePage.obterTextoAlocacaoProfissionaisEspecializados(), ("Alocação de Profissionais Especializados"));
    }

    @Quando("as cases da auditeste")
    public void as_cases_da_auditeste() {
        assertEquals(homePage.obterTituloCasesHome(), ("CASES"));
        assertEquals(homePage.obterSubtituloCasesHome(), ("Entenda o que fazemos através do sucesso de nossos clientes"));

        homePage.clicarSeletorPrimeiroDepoimentoCases();
        assertEquals(homePage.obterTextoPrimeiroDepoimentoCasesHome(),
                ("Gostaria de agradecer a dedicação e o atendimento prestados nesses 8 anos com a Tarifa Porto Seguro. O time é muito dedicado e ágil, sempre buscando nos atender da melhor forma. Os resultados que temos são muito satisfatórios e a Gestão da Silvia faz toda a diferença neste processo."));
        homePage.clicarSeletorPrimeiroDepoimentoCases();
        assertEquals(homePage.obterNomeClientePrimeiroDepoimentoCasesHome(), ("Vanessa Fiuza"));
        assertEquals(homePage.obterCargoEmpresaClientePrimeiroDepoimentoCasesHome(), ("Projeto Tarifa Auto - Porto Seguro"));

        homePage.clicarSeletorSegundoDepoimentoCases();
        assertEquals(homePage.obterTextoSegundoDepoimentoCasesHome(),
                ("Tivemos algumas experiências anteriores sem sucesso para automatização de testes em nossa aplicação. A Auditeste abraçou o desafio e provou que era possível. Em poucos meses, cobrimos com testes automatizados um parcela substancial dos processos de nosso software."));
        homePage.clicarSeletorSegundoDepoimentoCases();
        assertEquals(homePage.obterNomeClienteSegundoDepoimentoCasesHome(), ("Julio Souza"));
        assertEquals(homePage.obterCargoEmpresaClienteSegundoDepoimentoCasesHome(), ("Gerente de Produtos - Sistemas Seguros"));

        assertEquals(homePage.obterTextoSeuProjetoComSucessoGarantido(), ("Seu projeto com sucesso garantido!"));
        assertEquals(homePage.obterTextoLinkSolicitarOrcamento(), ("SOLICITE UM ORÇAMENTO"));
    }

    @Quando("acesso o chatbot")
    public void acesso_o_chatbot() {
        homePage.clicarBotaoIniciarChatBot();
    }

    @Entao("visualizo o rodape do site")
    public void visualizo_o_rodape_do_site() {
        assertEquals(homePage.obterTextoRodapeContato(), ("Contato"));
        assertEquals(homePage.obterTextoLinkRodapeTelefone(), ("+55 11 3236-6600"));
        assertEquals(homePage.obterTextoLinkRodapeUnidade(), ("Unidade Centro"));
        assertEquals(homePage.obterTextoLinkRodapeEndereco(), ("Av. Ipiranga, 344 – 9º andar República, São Paulo – SP"));
        assertEquals(homePage.obterTextoRodapeQuemSomos(), ("Quem Somos"));
        assertEquals(homePage.obterTextoLinkRodapeHistoria(), ("História"));
        assertEquals(homePage.obterTextoLinkRodapeMissaoVisaoEValores(), ("Missão, Visão e Valores"));
        assertEquals(homePage.obterTextoLinkRodapeNossosClientes(), ("Nossos Clientes"));
        assertEquals(homePage.obterTextoRodapeServicos(), ("Serviços"));
        assertEquals(homePage.obterTextoLinkRodapeFabricaDeTestes(), ("Fábrica de Testes;"));
        assertEquals(homePage.obterTextoLinkRodapeAutomatizacaoDeTestes(), ("Automatização de Testes;"));
        assertEquals(homePage.obterTextoLinkRodapeTestesMobile(), ("Testes Mobile"));
        assertEquals(homePage.obterTextoLinkRodapeTestesManuais(), ("Testes Manuais;"));
        assertEquals(homePage.obterTextoLinkRodapeTestesFuncionaisENaoFuncionais(), ("Testes Funcionais e Não Funcionais;"));
        assertEquals(homePage.obterTextoLinkRodapeAlocacaoDeProfissionais(), ("Alocação de Profissionais"));
        assertEquals(homePage.obterTextoLinkRodapeAutomacaoDeProcessos(), ("Automação de Processos"));
        assertEquals(homePage.obterTextoLinkRodapeCrowdsourcedAuditeste(), ("Crowdsourced Auditeste"));
        assertEquals(homePage.obterTextoLinkRodapeConsultoria(), ("Consultoria."));
        assertEquals(homePage.obterTextoLinkRodapeCasesDeSucesso(), ("Cases de Sucesso"));
        assertEquals(homePage.obterTextoLinkRodapeTrabalheConosco(), ("Trabalhe Conosco"));
        assertEquals(homePage.obterTextoLinkRodapeBlog(), ("Blog"));
        assertEquals(homePage.obterTextoLinkRodapeWebmail(), ("Webmail"));
        assertEquals(homePage.obterTextoRodapeContateNos(), ("Contate-nos"));
        assertEquals(homePage.obterTextoRodapeEmailMarketingAuditeste(), ("marketing@auditeste.com.br"));
        assertEquals(homePage.obterTextoRodapeCopyright(), ("Copyright © 2017 AudiTeste - Todos os direitos reservados."));
    }

}
