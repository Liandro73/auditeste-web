package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PaginaInicial;
import pages.TrabalheConosco;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaTrabalheConoscoSteps {

    private static WebDriver driver = new ChromeDriver();

    private TrabalheConosco trabalheConosco = new TrabalheConosco(driver);
    private PaginaInicial homePage = new PaginaInicial(driver);

    @Dado("que estou na pagina trabalhe conosco")
    public void que_estou_na_pagina_trabalhe_conosco() {
        driver.get("https://auditeste.com.br/");
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        trabalheConosco.clicarMenuItemTrabalheConosco();
        assertEquals(trabalheConosco.verificarSeEstaNaPaginaTrabalheConosco(), ("//TRABALHE\n" +
                "CONOSCO"));
    }

    @Quando("eu navego pela pagina trabalhe conosco")
    public void eu_navego_pela_pagina_trabalhe_conosco() {
        assertEquals(trabalheConosco.obterTextoPaginaTrabalheConosco(), ("Venha fazer parte da empresa referência em qualidade de software.\n" +
                "Cadastre o seu currículo e aguarde oportunidades."));
        assertEquals(trabalheConosco.obterTituloCampoNomeTrabalheConosco(), ("NOME"));
        assertEquals(trabalheConosco.verificarSeCampoNomeTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoEmailTrabalheConosco(), ("EMAIL"));
        assertEquals(trabalheConosco.verificarSeCampoEmailTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoTelefoneTrabalheConosco(), ("TELEFONE"));
        assertEquals(trabalheConosco.verificarSeCampoTelefoneTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoEnderecoTrabalheConosco(), ("ENDEREÇO"));
        assertEquals(trabalheConosco.verificarSeCampoEnderecoTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoCidadeTrabalheConosco(), ("ESCREVA O NOME DA SUA CIDADE"));
        assertEquals(trabalheConosco.verificarSeCampoCidadeTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoObjetivoProfissionalTrabalheConosco(), ("OBJETIVO PROFISSIONAL"));
        assertEquals(trabalheConosco.verificarSeCampoObjetivoProfissionalTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoAreaAtuacaoTrabalheConosco(), ("ÁREA"));
        assertEquals(trabalheConosco.verificarSeCampoAreaAtuacaoTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoMensagemTrabalheConosco(), ("MENSAGEM"));
        assertEquals(trabalheConosco.verificarSeCampoMensagemTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTituloCampoAnexarTrabalheConosco(), ("ANEXAR CURRICULUM"));
        assertEquals(trabalheConosco.verificarSeCampoAnexarTrabalheConoscoEstaVisivel(), (true));
        assertEquals(trabalheConosco.obterTextoTiposDeArquivosAceitosTrabalheConosco(), ("Arquivos aceitos: PDF, DOC, DOCX e TXT"));
        assertEquals(trabalheConosco.verificarSeBotaoEnviarFormularioTrabalheConosco(), (true));
    }

    @Entao("visualizo solicitacao de orcamento na pagina trabalhe conosco")
    public void visualizo_solicitacao_de_orcamento_na_pagina_trabalhe_conosco() {
        assertEquals(trabalheConosco.obterTextoSeuProjetoComSucessoGarantido(), ("Seu projeto com sucesso garantido!"));
        assertEquals(trabalheConosco.obterTextoLinkSolicitarOrcamento(), ("SOLICITE UM ORÇAMENTO"));

        driver.quit();
    }
}
