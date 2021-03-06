package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CasesDeSucesso;
import pages.PaginaInicial;
import util.Screenshot;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaCasesDeSucessoSteps {

    private static WebDriver driver = new ChromeDriver();

    private CasesDeSucesso casesDeSucesso = new CasesDeSucesso(driver);
    private PaginaInicial homePage = new PaginaInicial(driver);
    private Screenshot screenshot = new Screenshot(driver);

    @Dado("que estou na pagina cases de sucesso")
    public void que_estou_na_pagina_cases_de_sucesso() {
        driver.get("https://auditeste.com.br/");
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        casesDeSucesso.clicarMenuItemCasesDeSucesso();
        assertEquals(casesDeSucesso.verificarSeEstaNaPaginaCasesDeSucesso(), ("//CASES DE SUCESSO"));
        try {
            screenshot.capturarScreenshot("dado_que_estou_na_pagina_cases_de_sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Quando("eu navego pela pagina cases de sucesso")
    public void eu_navego_pela_pagina_cases_de_sucesso() {
        assertEquals(casesDeSucesso.obterTituloPaginaCasesDeSucessoAuditeste(), ("Cases de Sucesso Auditeste"));
        assertEquals(casesDeSucesso.obterTextoPaginaCasesDeSucesso(), ("Com atuação há 17 anos no mercado de testes e qualidade de software a Auditeste possui em seu portfólio diversos cases e desafios superados, e nesta página você pode conferir alguns de nossos cases de sucesso que trouxeram ótimos resultados aos nossos clientes. Confira:"));
        assertEquals(casesDeSucesso.verificarImgPaginaCasesDeSucessoEstaVisivel(), (true));
        assertEquals(casesDeSucesso.obterLegendaImgPaginaCasesDeSucesso(), ("A Auditeste possui também um histórico de sucesso em automação de testes."));
        assertEquals(casesDeSucesso.obterTituloVideoPaginaCasesDeSucesso(), ("Automação de Testes"));
        assertEquals(casesDeSucesso.verificarVideoPaginaCasesDeSucessoEstaVisivel(), (true));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_cases_de_sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("visualizo depoimentos cases de sucesso")
    public void visualizo_depoimentos_cases_de_sucesso() {
        casesDeSucesso.clicarSeletorPrimeiroDepoimentoCases();
        assertEquals(casesDeSucesso.obterTextoPrimeiroDepoimentoCases(),
                ("Gostaria de agradecer a dedicação e o atendimento prestados nesses 8 anos com a Tarifa Porto Seguro. O time é muito dedicado e ágil, sempre buscando nos atender da melhor forma. Os resultados que temos são muito satisfatórios e a Gestão da Silvia faz toda a diferença neste processo."));
        casesDeSucesso.clicarSeletorPrimeiroDepoimentoCases();
        assertEquals(casesDeSucesso.obterNomeClientePrimeiroDepoimentoCases(), ("Vanessa Fiuza"));
        assertEquals(casesDeSucesso.obterCargoEmpresaClientePrimeiroDepoimentoCases(), ("Projeto Tarifa Auto - Porto Seguro"));

        casesDeSucesso.clicarSeletorSegundoDepoimentoCases();
        assertEquals(casesDeSucesso.obterTextoSegundoDepoimentoCases(),
                ("Tivemos algumas experiências anteriores sem sucesso para automatização de testes em nossa aplicação. A Auditeste abraçou o desafio e provou que era possível. Em poucos meses, cobrimos com testes automatizados uma parcela substancial dos processos de nosso software."));
        casesDeSucesso.clicarSeletorSegundoDepoimentoCases();
        assertEquals(casesDeSucesso.obterNomeClienteSegundoDepoimentoCases(), ("Julio Souza"));
        assertEquals(casesDeSucesso.obterCargoEmpresaClienteSegundoDepoimentoCases(), ("Gerente de Produtos - Sistemas Seguros"));

        assertEquals(casesDeSucesso.obterTextoSeuProjetoComSucessoGarantido(), ("Seu projeto com sucesso garantido!"));
        assertEquals(casesDeSucesso.obterTextoLinkSolicitarOrcamento(), ("SOLICITE UM ORÇAMENTO"));
        try {
            screenshot.capturarScreenshot("entao_visualizo_depoimentos_cases_de_sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
