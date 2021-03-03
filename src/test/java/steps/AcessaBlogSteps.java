package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Blog;
import pages.PaginaInicial;
import util.Screenshot;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaBlogSteps {

    private static WebDriver driver = new ChromeDriver();

    private Blog blog = new Blog(driver);
    private PaginaInicial homePage = new PaginaInicial(driver);
    private Screenshot screenshot = new Screenshot(driver);

    @Dado("que estou na pagina blog")
    public void que_estou_na_pagina_blog() {
        driver.get("https://auditeste.com.br/");
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        blog.clicarMenuItemBlog();
        assertEquals(blog.verificarSeEstaNaPaginaBlog(), ("//BLOG"));
        try {
            screenshot.capturarScreenshot("dado_que_estou_na_pagina_blog");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Quando("eu navego pela pagina blog")
    public void eu_navego_pela_pagina_blog() {
        assertEquals(blog.obterNumeroPaginaAtualBlog(), ("1"));
        assertEquals(blog.vericarBlocosDePotagensEstaVisivel(), (true));
        assertEquals(blog.obterQuantidadeBlocosDePotagens(), (12));

        assertEquals(blog.vericarBotaoProximaPaginaBlogEstaVisivel(), (true));
        blog.clicarBotaoProximaPaginaBlog();

        assertEquals(blog.obterNumeroPaginaAtualBlog(), ("2"));
        assertEquals(blog.vericarBlocosDePotagensEstaVisivel(), (true));
        assertEquals(blog.obterQuantidadeBlocosDePotagens(), (12));

        assertEquals(blog.vericarBotaoProximaPaginaBlogEstaVisivel(), (true));
        assertEquals(blog.vericarBotaoPaginaAnteriorBlogEstaVisivel(), (true));
        blog.clicarBotaoPaginaAnteriorBlog();

        assertEquals(blog.obterNumeroPaginaAtualBlog(), ("1"));
        assertEquals(blog.vericarBlocosDePotagensEstaVisivel(), (true));
        assertEquals(blog.obterQuantidadeBlocosDePotagens(), (12));
        try {
            screenshot.capturarScreenshot("quando_eu_navego_pela_pagina_blog");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Entao("visualizo solicitacao de orcamento na pagina blog")
    public void visualizo_solicitacao_de_orcamento_na_pagina_blog() {
        assertEquals(blog.obterTextoSeuProjetoComSucessoGarantido(), ("Seu projeto com sucesso garantido!"));
        assertEquals(blog.obterTextoLinkSolicitarOrcamento(), ("SOLICITE UM ORÇAMENTO"));
        try {
            screenshot.capturarScreenshot("entao_visualizo_solicitacao_de_orcamento_na_pagina_blog");
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

}
