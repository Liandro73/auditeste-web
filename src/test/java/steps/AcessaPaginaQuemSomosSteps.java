package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PaginaInicial;
import pages.QuemSomos;
import pages.Rodape;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaPaginaQuemSomosSteps {

    private static WebDriver driver;
    private QuemSomos quemSomos = new QuemSomos(driver);
    private PaginaInicial homePage = new PaginaInicial(driver);
    private Rodape rodape = new Rodape(driver);

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

    @Dado("que estou na pagina quem somos")
    public void que_estou_na_pagina_quem_somos() {
        homePage.carregarPaginaIncial();
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        quemSomos.clicarMenuItemQuemSomos();
        assertEquals(quemSomos.verificarSeEstaNaPaginaQuemSomos(), ("//QUEM SOMOS"));
    }

    @Quando("eu navego pela pagina quem somos")
    public void eu_navego_pela_pagina_quem_somos() {
        assertEquals(quemSomos.obterTituloBugMilenio(), ("“BUG” DO MILÊNIO"));
        assertEquals(quemSomos.obterTexto1BugMilenio(), ("Com a chegada do século XX, o mundo enfrentava um momento de pânico, pois a entrada deste novo milênio representava uma grande ameaça em todos os cantos do planeta terra, pois traria a falência de empresas, queda de aviões, processos judiciais, pane em sistemas, enfim um grande caos e tudo isso devido a uma simples data abreviada."));
        assertEquals(quemSomos.obterTexto2BugMilenio(), ("Melhor explicando, os desenvolvedores dos anos 60 encontraram uma ótima solução para economizar bytes, que na época era extremamente caro e a solução era abreviar a data, mais especificamente o ano, ou seja, de 01/01/1900, passaria a ser interpretado como 01/01/00."));
        assertEquals(quemSomos.obterTexto3BugMilenio(), ("Porém os anos se passaram a tecnologia evoluiu e isso não era mais motivo de preocupação e principal fator de economia, passando a ser temido não só pelos próprios profissionais de T.I, mas também por empresários e toda população, simplesmente pelo fato do conflito entre os anos 1900 e 2000 em todos os sistemas que tivessem a tal data abreviada."));
        assertEquals(quemSomos.obterTituloBumTestesSoftware(), ("O “BUM” DOS TESTES DE SOFTWARE"));
        assertEquals(quemSomos.obterTexto1BumTestesSoftware(), ("Anos antes da chegada do novo milênio, o setor da tecnologia precisava estar preparado e certificado de que esta mudança não impactaria negativamente os sistemas e empresas do mundo."));
        assertEquals(quemSomos.obterTexto2BumTestesSoftware(), ("E isso só poderia ser garantido com os testes de software, que simularia os cenários futuros, buscando neutralizar riscos e certificar a qualidade de todos os sistemas e funcionalidades envolvidas."));
        assertEquals(quemSomos.obterTexto3BumTestesSoftware(), ("O que auxiliou e muito os desenvolvedores da época e fez com que a transição de um milênio para outro fosse totalmente o oposto das previsões."));
    }

    @Quando("visualizo sobre a auditeste")
    public void visualizo_sobre_a_auditeste() {
        assertEquals(quemSomos.obterTextoSobreAuditeste(), ("A AUDITESTE"));
        assertEquals(quemSomos.obterTexto1SobreAuditeste(), ("Durante esta transição, José Antônio Gomes Ramos, que na época era um dos especialistas na área de testes de software de uma grande instituição financeira, contribuiu para que a passagem do milênio fosse um sucesso."));
        assertEquals(quemSomos.obterTexto2SobreAuditeste(), ("E por volta dos anos 2000, mais especificamente 07/05/2001, fundou a Auditeste, uma empresa totalmente focada em promover a qualidade de software, que até hoje se mantém como referência neste segmento."));
        assertEquals(quemSomos.obterTexto3SobreAuditeste(), ("Afinal conta com profissionais capacitados e certificados, com ferramentas customizadas conforme a necessidade do cliente, além de uma expertise que só a experiência, ética, parceria e amor pelo que faz podem oferecer."));
        assertEquals(quemSomos.obterTexto4SobreAuditeste(), ("CONHEÇA A AUDITESTE, A EMPRESA QUE NÃO SÓ ENTREGA QUALIDADE, MAS GARANTE O SUCESSO DO SEU PROJETO E A SATISFAÇÃO DE SEUS CLIENTES."));

        assertEquals(quemSomos.imgTituloMissaoAuditesteEstavisivel(), (true));
        assertEquals(quemSomos.obterTextoMissaoAuditeste(), ("Oferecer aos nossos clientes as melhores e mais modernas soluções no segmento de testes e certificação de software e demais aplicações, garantindo assim a qualidade, segurança e sucesso de seu projeto."));
        assertEquals(quemSomos.imgTituloVisaoAuditesteEstavisivel(), (true));
        assertEquals(quemSomos.obterTextoVisaoAuditeste(), ("Aliados à profissionais altamente capacitados e os mais modernos recursos tecnológicos, almejamos ser reconhecidos como preferência de nossos clientes e referência no mercado em nosso segmento de atuação."));
        assertEquals(quemSomos.imgTituloValoresAuditesteEstavisivel(), (true));
        assertEquals(quemSomos.obterTextoValoresAuditesteEtica(), ("Ética;"));
        assertEquals(quemSomos.obterTextoValoresAuditesteAgilidade(), ("Agilidade;"));
        assertEquals(quemSomos.obterTextoValoresAuditesteComprometimento(), ("Comprometimento;"));
        assertEquals(quemSomos.obterTextoValoresAuditesteRespeito(), ("Respeito;"));
        assertEquals(quemSomos.obterTextoValoresAuditesteQualidade(), ("Qualidade."));
    }

    @Quando("visualizo os tipos de servicos")
    public void visualizo_os_tipos_de_servicos() {
        assertEquals(quemSomos.obterTituloServicos(), ("NOSSOS SERVIÇOS"));
        assertEquals(quemSomos.obterTextoServicosTestesAutomatizados(), ("Testes Automatizados"));
        assertEquals(quemSomos.obterTextoServicosFabricaTestes(), ("Fábrica de Testes"));
        assertEquals(quemSomos.obterTextoServicosTestesManuais(), ("Testes Manuais"));
        assertEquals(quemSomos.obterTextoServicosConsultoriaTestes(), ("Consultoria"));
        assertEquals(quemSomos.obterTextoServicosTestesMobile(), ("Testes Mobile"));
        assertEquals(quemSomos.obterTextoServicosTestesFuncionaisENaoFuncionais(), ("Testes Funcionais e Não Funcionais"));
        assertEquals(quemSomos.obterTextoServicosAlocacaoProfissionaisEspecializados(), ("Alocação de Profissionais Especializados"));
        assertEquals(quemSomos.obterTextoServicos(), ("Clique e entenda melhor cada serviço."));
    }

    @Quando("as cases da auditeste quem somos")
    public void as_cases_da_auditeste_quem_somos() {
        assertEquals(quemSomos.obterTituloCasesAuditeste(), ("CASES DE SUCESSO"));
        assertEquals(quemSomos.obterTextoCasesAuditeste(), ("Quer conferir os cases de clientes que tiveram os seus respectivos projetos com qualidade e sucesso garantidos? clique aqui"));

        assertEquals(homePage.obterTextoSeuProjetoComSucessoGarantido(), ("Seu projeto com sucesso garantido!"));
        assertEquals(homePage.obterTextoLinkSolicitarOrcamento(), ("SOLICITE UM ORÇAMENTO"));
    }

    @Entao("visualizo o rodape do site quem somos")
    public void visualizo_o_rodape_do_site_quem_somos() {
        assertEquals(rodape.obterTextoRodapeContato(), ("Contato"));
        assertEquals(rodape.obterTextoLinkRodapeTelefone(), ("+55 11 3236-6600"));
        assertEquals(rodape.obterTextoLinkRodapeUnidade(), ("Unidade Centro"));
        assertEquals(rodape.obterTextoLinkRodapeEndereco(), ("Av. Ipiranga, 344 – 9º andar República, São Paulo – SP"));
        assertEquals(rodape.obterTextoRodapeQuemSomos(), ("Quem Somos"));
        assertEquals(rodape.obterTextoLinkRodapeHistoria(), ("História"));
        assertEquals(rodape.obterTextoLinkRodapeMissaoVisaoEValores(), ("Missão, Visão e Valores"));
        assertEquals(rodape.obterTextoLinkRodapeNossosClientes(), ("Nossos Clientes"));
        assertEquals(rodape.obterTextoRodapeServicos(), ("Serviços"));
        assertEquals(rodape.obterTextoLinkRodapeFabricaDeTestes(), ("Fábrica de Testes;"));
        assertEquals(rodape.obterTextoLinkRodapeAutomatizacaoDeTestes(), ("Automatização de Testes;"));
        assertEquals(rodape.obterTextoLinkRodapeTestesMobile(), ("Testes Mobile"));
        assertEquals(rodape.obterTextoLinkRodapeTestesManuais(), ("Testes Manuais;"));
        assertEquals(rodape.obterTextoLinkRodapeTestesFuncionaisENaoFuncionais(), ("Testes Funcionais e Não Funcionais;"));
        assertEquals(rodape.obterTextoLinkRodapeAlocacaoDeProfissionais(), ("Alocação de Profissionais"));
        assertEquals(rodape.obterTextoLinkRodapeAutomacaoDeProcessos(), ("Automação de Processos"));
        assertEquals(rodape.obterTextoLinkRodapeCrowdsourcedAuditeste(), ("Crowdsourced Auditeste"));
        assertEquals(rodape.obterTextoLinkRodapeConsultoria(), ("Consultoria."));
        assertEquals(rodape.obterTextoLinkRodapeCasesDeSucesso(), ("Cases de Sucesso"));
        assertEquals(rodape.obterTextoLinkRodapeTrabalheConosco(), ("Trabalhe Conosco"));
        assertEquals(rodape.obterTextoLinkRodapeBlog(), ("Blog"));
        assertEquals(rodape.obterTextoLinkRodapeWebmail(), ("Webmail"));
        assertEquals(rodape.obterTextoRodapeContateNos(), ("Contate-nos"));
        assertEquals(rodape.obterTextoRodapeEmailMarketingAuditeste(), ("marketing@auditeste.com.br"));
        assertEquals(rodape.obterTextoRodapeCopyright(), ("Copyright © 2017 AudiTeste - Todos os direitos reservados."));
    }

}