package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import pages.PaginaInicial;
import pages.QuemSomos;
import pages.Servicos;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcessaServicosSteps {

    private static WebDriver driver = new ChromeDriver();

    private Servicos servicos = new Servicos(driver);
    private PaginaInicial homePage = new PaginaInicial(driver);
    private QuemSomos quemSomos = new QuemSomos(driver);

    @Dado("que estou na pagina servicos")
    public void que_estou_na_pagina_servicos() {
        driver.get("https://auditeste.com.br/");
        homePage.visualizarPopupHomeOffice();
        homePage.clicarBotaoFecharPopupHomeOffice();
        homePage.clicarTextoTestesAutomatizados();
        assertEquals(servicos.verificarSeEstaEmTestesAutomatizados(), ("//TESTES AUTOMATIZADOS"));
    }

    @Quando("eu navego pela pagina servicos")
    public void eu_navego_pela_pagina_servicos() {
        assertEquals(servicos.obterTextoTestesAutomatizados(), ("Com o avanço tecnológico o quesito automação vem tomando novas proporções, sendo um grande e principal aliado no ganho de qualidade, no aumento de produção e principalmente na redução de custo. Nós da Auditeste sabemos e utilizamos da melhor maneira este segmento de testes, afinal a tecnologia pode ser maravilhosa, se tivermos o conhecimento necessário para utilizá-la ao nosso favor."));
        assertEquals(servicos.obterTituloHistoricoTestes(), ("HISTÓRICO DE SUCESSO"));
        assertEquals(servicos.obterHistoricoTestes(), ("Possuímos uma gama de soluções completas e personalizadas conforme as necessidades de nossos clientes e no quesito automação, temos uma abordagem de sucesso em diferentes setores:"));

        assertEquals(servicos.verificarImgHistoricoTestes(), (true));

        assertEquals(servicos.obterTituloPrincipaisBeneficios(), ("PRINCIPAIS BENEFÍCIOS"));
        assertEquals(servicos.obterTextoPrimeiroBeneficio(), ("Redução de erros humanos"));
        assertEquals(servicos.obterTextoSegundoBeneficio(), ("Aumento de produtividade"));
        assertEquals(servicos.obterTextoTerceiroBeneficio(), ("Otimização de Mão de Obra"));
        assertEquals(servicos.obterTextoQuartoBeneficio(), ("Otimização de custos"));
        assertEquals(servicos.obterTextoQuintoBeneficio(), ("Prazo menor para certificação"));
        assertEquals(servicos.obterTextoSextoBeneficio(), ("Integrações de sistemas sem modificação de código"));
        assertEquals(servicos.obterTextoSetimoBeneficio(), ("Maior quantidade de testes por 24h"));
        assertEquals(servicos.obterTextoOitavoBeneficio(), ("Garantia de armazenamento de dados utilizados, testes realizados e evidências"));
        assertEquals(servicos.obterTextoNonoBeneficio(), ("maior tempo para foco em projetos relevantes"));

        assertEquals(servicos.verificarImgTiposDeTeste(), (true));
        assertEquals(servicos.obterTituloTiposDeTeste(), ("TIPOS DE TESTE"));
        assertEquals(servicos.obterTextoTipoDeTesteRegressivoEProgressivo(), ("REGRESSIVOS E PROGRESSIVOS"));
        assertEquals(servicos.obterTextoTipoDeTesteFuncionais(), ("FUNCIONAIS"));
        assertEquals(servicos.obterTextoTipoDeTesteCarga(), ("CARGA"));
        assertEquals(servicos.obterTextoTipoDeTesteMonitoracao(), ("MONITORAÇÃO"));

        assertEquals(servicos.verificarImgFerramentasUtilizadas(), (true));
        assertEquals(servicos.obterTituloFerramentasUtilizadas(), ("FERRAMENTAS UTILIZADAS"));
        assertEquals(servicos.obterTextoFerramentaQuickTest(), ("QUICK TEST (HP)"));
        assertEquals(servicos.obterTextoFerramentaTestComplete(), ("TEST COMPLETE (SMARTBEAR)"));
        assertEquals(servicos.obterTextoFerramentaSilk4net(), ("SILK4NET"));
        assertEquals(servicos.obterTextoFerramentaRational(), ("RATIONAL (IBM)"));
        assertEquals(servicos.obterTextoFerramentaJmeter(), ("JMETER"));
        assertEquals(servicos.obterTextoFerramentaHPAlm(), ("HP-ALM (QUALITY CENTER)"));
        assertEquals(servicos.obterTextoFerramentaHOUtf(), ("HO UFT (HP QTP)"));
        assertEquals(servicos.obterTextoFerramentaSelenium(), ("SELENIUM WEBDRIVER"));
        assertEquals(servicos.obterTextoFerramentaTestLink(), ("TESTLINK"));
        assertEquals(servicos.obterTextoFerramentaMantisRuby(), ("MANTIS, RUBY (CUNCUMBER)"));
        assertEquals(servicos.obterTextoFerramentaMicrofocus(), ("MICROFOCUS (SILK CENTRAL)"));
        assertEquals(servicos.obterTextoFerramentaTestTFS(), ("TFS (TEAM FUNDATION SERVICE)"));
        assertEquals(servicos.obterTextoFerramentaCapybara(), ("CAPYBARA"));

        assertEquals(servicos.verificarImgTecnologiasTestadas(), (true));
        assertEquals(servicos.obterTituloTecnologiasTestadas(), ("TECNOLOGIAS TESTADAS"));
        assertEquals(servicos.obterTextoTipoDeTecnologiaTestadaWeb(), ("WEB"));
        assertEquals(servicos.obterTextoTipoDeTecnologiaTestadaDatabase(), ("DATABASE"));
        assertEquals(servicos.obterTextoTipoDeTecnologiaTestadaWindowsFrom(), ("WINDOWS FROM"));
        assertEquals(servicos.obterTextoTipoDeTecnologiaTestadaWebServices(), ("WEB SERVICES"));

        assertEquals(servicos.obterTituloGerenciadorAuditeste(), ("G.A."));
        assertEquals(servicos.obterTextoGerenciadorAuditeste(), ("O G.A. (Gerenciador Auditeste) é uma ferramenta desenvolvida exclusivamente para extrair o melhor que a automatização pode proporcionar, sendo essencial e principal aliada em alguns segmentos de atuação. Coordenando e direcionando criteriosamente os robôs executores, a ferramenta proporciona aos nossos clientes informações gerenciais em tempo real, tornando possível o acompanhamento e análise dos testes executados ou em andamento."));
        assertEquals(servicos.visualizarPrimeiraImgGerenciadorAuditeste(), (true));
        assertEquals(servicos.visualizarSegundaImgGerenciadorAuditeste(), (true));
    }

    @Quando("visualizo sobre a metodologia dos testes")
    public void visualizo_sobre_a_metodologia_dos_testes() {
        assertEquals(servicos.obterTituloMetodologiaTestes(), ("METODOLOGIA DA REALIZAÇÃO DOS TESTES"));
        assertEquals(servicos.visualizarImgMetodologiaTestesPlanejamento(), (true));
        assertEquals(servicos.obterPrimeiroTextoMetodologiaTestesPlanejamento(), ("ARTEFATOS GERADOS"));
        assertEquals(servicos.obterSegundoTextoMetodologiaTestesPlanejamento(), ("Ata de Reunião"));
        assertEquals(servicos.obterTerceiroTextoMetodologiaTestesPlanejamento(), ("Entregáveis do Projeto"));
        assertEquals(servicos.obterQuartoTextoMetodologiaTestesPlanejamento(), ("Plano de Teste"));
        assertEquals(servicos.obterQuintoTextoMetodologiaTestesPlanejamento(), ("Análise de Impacto"));

        assertEquals(servicos.visualizarImgMetodologiaTestesEspecificacao(), (true));
        assertEquals(servicos.obterPrimeiroTextoMetodologiaTestesEspecificacao(), ("ARTEFATOS GERADOS"));
        assertEquals(servicos.obterSegundoTextoMetodologiaTestesEspecificacao(), ("Roteiro de Testes"));
        assertEquals(servicos.obterTerceiroTextoMetodologiaTestesEspecificacao(), ("Definição de Massa"));
        assertEquals(servicos.obterQuartoTextoMetodologiaTestesEspecificacao(), ("Solicitação de ambiente"));

        assertEquals(servicos.visualizarImgMetodologiaTestesExecucao(), (true));
        assertEquals(servicos.obterPrimeiroTextoMetodologiaTestesExecucao(), ("ARTEFATOS GERADOS"));
        assertEquals(servicos.obterSegundoTextoMetodologiaTestesExecucao(), ("Termo de Finalização"));
        assertEquals(servicos.obterTerceiroTextoMetodologiaTestesExecucao(), ("Status report (Não Funcional)"));
        assertEquals(servicos.obterQuartoTextoMetodologiaTestesExecucao(), ("Revisão"));
        assertEquals(servicos.obterQuintoTextoMetodologiaTestesExecucao(), ("Cenário"));
        assertEquals(servicos.obterSextoTextoMetodologiaTestesExecucao(), ("Relatório de Defeitos"));

        assertEquals(servicos.obterPrimeiroTextoMetodologiaTestes(), ("É importante que as atividades de testes comecem no início do ciclo de vida do desenvolvimento de software."));
        assertEquals(servicos.obterSegundoTextoMetodologiaTestes(), ("REQUISITOS NECESSÁRIOS"));
        assertEquals(servicos.obterTerceiroTextoMetodologiaTestes(), ("Sucesso de acesso aos ambientes"));
        assertEquals(servicos.obterQuartoTextoMetodologiaTestes(), ("Disponibilidade do ambiente de homologação"));
        assertEquals(servicos.obterQuintoTextoMetodologiaTestes(), ("Suporte à regras de negócio"));
    }

    @Quando("visualizo as cases da auditeste servicos")
    public void visualizo_as_cases_da_auditeste_servicos() {
        assertEquals(servicos.obterTituloCasesAuditeste(), ("CASES DE SUCESSO"));
        assertEquals(servicos.obterTextoCasesAuditeste(), ("Quer conferir os cases de clientes que tiveram os seus respectivos projetos com qualidade e sucesso garantidos? clique aqui "));

        assertEquals(homePage.obterTextoSeuProjetoComSucessoGarantido(), ("Seu projeto com sucesso garantido!"));
        assertEquals(homePage.obterTextoLinkSolicitarOrcamento(), ("SOLICITE UM ORÇAMENTO"));
    }

    @Quando("visualizo a pagina testes funcionais e nao funcionais")
    public void visualizo_a_pagina_testes_funcionais_e_nao_funcionais() {
        servicos.clicarLinkRodapeTestesFuncionaisENaoFuncionais();
        assertEquals(servicos.verificarSeEstaEmTestesAutomatizados(), ("//TESTES FUNCIONAIS NÃO FUNCIONAIS"));

        assertEquals(servicos.obterTituloTestesFuncionais(), ("TESTES FUNCIONAIS"));
        assertEquals(servicos.obterTextoTestesFuncionais(), ("Os testes funcionais também são conhecidos como teste da “caixa-preta”, pois é realizado para entender o comportamento da aplicação durante a navegação do usuário, ou seja, testando definitivamente a funcionalidade do sistema, simulando um cenário de produção e identificando possíveis problemas na interface do mesmo."));
        assertEquals(servicos.obterTituloTestesNaoFuncionais(), ("TESTES NÃO FUNCIONAIS"));
        assertEquals(servicos.obterTextoTestesNaoFuncionais(), ("Testes não funcionais, diferentemente do anterior, não são relacionados à funcionalidade da aplicação em si, pois simulam os cenários de acessos, performance e estresse, testando os atributos de um componente do sistema efetuando uma verificação mais profunda e analítica do servidor."));
    }

    @Quando("visualizo a pagina testes manuais")
    public void visualizo_a_pagina_testes_manuais() {
        servicos.clicarLinkRodapeTestesManuais();
        assertEquals(servicos.verificarSeEstaEmTestesAutomatizados(), ("//TESTES MANUAIS"));

        assertEquals(servicos.obterTextoTestesManuais(), ("Diferentemente dos testes automatizados, os testes manuais são executados somente por profissionais capacitados para tarefa, que seguem criteriosamente as documentações de requisitos e negócios, onde estão relacionadas às situações convencionais e não convencionais do sistema. Este documento tanto pode ser fornecido pelo cliente, como elaborado por nossos profissionais."));
        assertEquals(servicos.obterSegundoTextoTestesManuais(), ("Este tipo de teste envolve ainda mais o lado intelectual, analítico e lógico do ser humano, devido a necessidade de efetuar uma verificação minuciosa da aplicação a ser testada para identificação e neutralização de possíveis riscos e adequação a uma boa experiência do usuário."));
    }

    @Quando("visualizo a pagina testes mobile")
    public void visualizo_a_pagina_testes_mobile() {
        servicos.clicarLinkRodapeTestesMobile();
        assertEquals(servicos.verificarSeEstaEmTestesAutomatizados(), ("//TESTES MOBILE"));

        assertEquals(servicos.obterTextoTestesMobile(), ("O número de dispositivos móveis e os adeptos a esta tecnologia aumentam a cada dia, levando a grande necessidade das empresas adaptarem seus serviços e sistemas a este meio. Porém, é muito importante ao efetuar essa adaptação manter a qualidade, garantir o bom funcionamento e a boa usabilidade para o cliente, afinal é a reputação de sua empresa que está em jogo."));
        assertEquals(servicos.obterTituloTestesMobile(), ("GARANTINDO A QUALIDADE"));
        assertEquals(servicos.obterPrimeiroTextoTestesMobile(), ("Para isso, existem os testes mobile que se diferenciam dos aplicados em desktop, pois a imensa variedade de modelos e sistemas de dispositivos móveis não permitem a padronização do ambiente, havendo a necessidade da elaboração de cenários específicos para cada tipo de aparelho."));
        assertEquals(servicos.obterSegundoTextoTestesMobile(), ("Além disso, a automação desses testes contam com ferramentas que permitem um envolvimento mais efetivo de todos profissionais do projeto no processo de validação da aplicação, sendo uma ótima solução para melhoria da experiência mobile."));
    }

    @Quando("visualizo a pagina fabrica de testes")
    public void visualizo_a_pagina_fabrica_de_testes() {
        servicos.clicarLinkRodapeFabricaDeTestes();
        assertEquals(servicos.verificarSeEstaEmTestesAutomatizados(), ("//FÁBRICA DE TESTES"));

        assertEquals(servicos.obterTituloTestesFabricaTestes(), ("LOCALIZAÇÃO"));
        assertEquals(servicos.obterPrimeiroTextoFabricaTestes(), ("A Auditeste possui vasta experiência no segmento de testes e certificação de software, entregando qualidade e garantindo o sucesso dos projetos e respectivamente a satisfação de seus clientes desde 2001."));
        assertEquals(servicos.obterSegundoTextoFabricaTestes(), ("Contam com profissionais capacitados e certificados (CTFL, IBQTS, Scrum, ITIL), com infraestrutura de qualidade e amplo domínio em ferramentas como: HP Quality Center, TFS, ALM Microfocus, UFT, Test Complete, Selenium, Test Link, Jira, Mantis, Ruby, entre outras."));
        assertEquals(servicos.obterTerceiroTextoFabricaTestes(), ("Possibilitando atender a demanda em testes e qualidade de software, agregando de fato aos resultados finais e sucesso dos projetos de seus clientes, atuando desde a gestão e estruturação inicial até a entrega e consequentemente satisfação dos usuários."));
    }

    @Quando("visualizo a pagina consultoria")
    public void visualizo_a_pagina_consultoria() {
        servicos.clicarLinkRodapeConsultoria();
        assertEquals(servicos.verificarSeEstaEmTestesAutomatizados(), ("//CONSULTORIA"));

        assertEquals(servicos.obterPrimeiroTextoConsultoria(), ("Otimizar a área de TI e promover a qualidade das aplicações é sempre um grande desafio, que na maioria das vezes pode desequilibrar a balança do custo x benefício, gerando um alto gasto para empresa e mínimos resultados. Por isso, para garantia do sucesso e certificação de qualidade de seus projetos em TI é de grande importância firmar parceria com uma empresa que tenha experiência de mercado e conhecimento necessário para atender as necessidades de seus clientes e gerar os resultados esperados."));
        assertEquals(servicos.obterSegundoTextoConsultoria(), ("E com a atuação desde 2001 e diversos cases de sucesso em seu portfólio, a Auditeste mostra que possui esses requisitos e o Know-How necessário para te atender, garantindo assim a tranquilidade e segurança de que tudo está sendo encaminhado para o sucesso."));
    }

    @Quando("visualizo a pagina crowdsourced auditeste")
    public void visualizo_a_pagina_crowdsourced_auditeste() {
        servicos.clicarLinkRodapeCrowdsourcedAuditeste();
        assertEquals(servicos.verificarSeEstaEmTestesAutomatizados(), ("//CROWDSOURCED AUDITESTE"));

        assertEquals(servicos.obterTextoBotaoAcesseJaCrowdsourced(), ("ACESSE JÁ"));
        assertEquals(servicos.obterTextoBotaoCadastreSeCrowdsourced(), ("CADASTRE-SE"));
        assertEquals(servicos.obterPrimeiroTextoCrowdsourced(), ("Desenvolver um aplicativo para smartphones, tablets ou um software para a web e desktop é uma tarefa que requer uma série de cuidados especiais. É muito comum o aparecimento de problemas durante a efetiva execução do produto — os chamados bugs."));
        assertEquals(servicos.obterSegundoTextoCrowdsourced(), ("Para evitar estes tipos de problemas, a utilização do Crowdsourced Auditeste, ajudará a realizar testes diretamente com os usuários para detectar e sanar possíveis falhas."));
        assertEquals(servicos.obterTerceiroTextoCrowdsourced(), ("Com esta modalidade de testes será possível ter acesso a diversos tipos de plataformas, como navegadores web, sistemas operacionais ou de dispositivos móveis."));
        assertEquals(servicos.obterQuartoTextoCrowdsourced(), ("Essa ferramenta não demanda um grande investimento ou o uso de equipamentos sofisticados para a validação das aplicações."));
        assertEquals(servicos.obterTituloCrowdsourced(), ("COMO FUNCIONA?"));
        assertEquals(servicos.obterQuintoTextoCrowdsourced(), ("O Crowdsourced Auditeste (CA) cria a possibilidade de:"));
        assertEquals(servicos.obterSextoTextoCrowdsourced(), ("Execução de testes finais, em qualquer situação e ambiente de uso;"));
        assertEquals(servicos.obterSetimoTextoCrowdsourced(), ("Testes feitos de maneira colaborativa, porém remunerada, por voluntários freelancers e com perfis aproximados dos usuários finais (conforme requisitos informados pelo Cliente)."));
    }

    @Quando("visualizo a pagina alocacao de profissionais")
    public void visualizo_a_pagina_alocacao_de_profissionais() {
        servicos.clicarLinkRodapeAlocacaoDeProfissionais();
        assertEquals(servicos.verificarSeEstaEmTestesAutomatizados(), ("//ALOCAÇÃO DE PROFISSIONAIS"));

        assertEquals(servicos.obterPrimeiroTextoAlocacaoProfissionais(), ("Identificar perfis para qualquer oportunidade do mercado, já não é uma tarefa simples e para um nicho específico da área de TI que exigem requisitos, capacitações e certificações específicas, tornam a tarefa ainda mais árdua. Por isso, para as empresas que procuram profissionais de TI do setor de qualidade de software, nada melhor que deixar essa tarefa nas mãos de quem tem a experiência e os processos de seleção e avaliação necessários para trazer a você os melhores e mais capacitados profissionais do mercado."));
        assertEquals(servicos.obterSegundoTextoAlocacaoProfissionais(), ("A alocação de profissionais capacitados é realizada com as seguintes funções:"));
        assertEquals(servicos.visualizarImgAlocacaoProfissionais(), (true));
        assertEquals(servicos.obterTituloBeneficioAlocacaoProfissionais(), ("PRINCIPAIS BENEFÍCIOS"));
        assertEquals(servicos.obterTextoPrimeiroBeneficioAlocacaoProfissionais(), ("Assertividade"));
        assertEquals(servicos.obterTextoSegundoBeneficioAlocacaoProfissionais(), ("Prazos Otimizados"));
        assertEquals(servicos.obterTextoTerceiroBeneficioAlocacaoProfissionais(), ("Otimização de Custos"));
    }

    @Entao("visualizo a pagina automacao de processos")
    public void visualizo_a_pagina_automacao_de_processos() {
        servicos.clicarLinkRodapeAutomacaoDeProcessos();
        assertEquals(servicos.verificarSeEstaEmTestesAutomatizados(), ("//AUTOMAÇÃO DE PROCESSOS"));

        assertEquals(servicos.obterPrimeiroTextoAutomacaoProcessos(), ("A automação de processos visa a otimização do ciclo de produção, identificando gargalos, pontos de ineficiência e desperdícios de recursos, permitindo monitoramento e controle de resultados, tanto de forma segmentada quanto global."));
        assertEquals(servicos.obterSegundoTextoAutomacaoProcessos(), ("Esse tipo de Automação possibilita o planejamento, a execução e o monitoramento de todos os processos de negócio, mantendo-os alinhados e permitindo sua constante melhoria."));
        assertEquals(servicos.obterTerceiroTextoAutomacaoProcessos(), ("Uma importante característica da automação de processos é a facilidade na extração de dados e indicadores, o que proporciona uma visão mais integral da organização e, consequentemente, melhora a tomada de decisões."));

        driver.quit();
    }
}
