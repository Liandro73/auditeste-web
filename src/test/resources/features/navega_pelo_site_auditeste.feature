# language: pt
  Funcionalidade: Navega pelo site Auditeste
    Com acesso a pagina inicial
    Eu quero navegar por cada pagina
    e visualizar informações
    E acessar links navBar
    Para sair da site

  @paginainicial
  Cenario: Deve mostrar a home
    Dado que estou na pagina inicial
    Quando eu navego pela pagina inicial
    E visualizo os tipos de testes
    E as cases da auditeste
    E acesso o chatbot
    Entao visualizo o rodape do site

    @quemsomos
    Cenario: Deve mostrar a pagina quem somos
      Dado que estou na pagina quem somos
      Quando eu navego pela pagina quem somos
      E visualizo sobre a auditeste
      E visualizo os tipos de servicos
      Entao visualizo as cases da auditeste quem somos

    @servicos
    Cenario: Deve mostrar a pagina servicos
      Dado que estou na pagina servicos
      Quando eu navego pela pagina servicos
      E visualizo sobre a metodologia dos testes
      E visualizo as cases da auditeste servicos
      E visualizo a pagina testes funcionais e nao funcionais
      E visualizo a pagina testes manuais
      E visualizo a pagina testes mobile
      E visualizo a pagina fabrica de testes
      E visualizo a pagina consultoria
      E visualizo a pagina crowdsourced auditeste
      E visualizo a pagina alocacao de profissionais
      Entao visualizo a pagina automacao de processos

      @casesdesucesso
      Cenario: Deve mostrar a pagina cases de sucesso
        Dado que estou na pagina cases de sucesso
        Quando eu navego pela pagina cases de sucesso
        Entao visualizo depoimentos cases de sucesso