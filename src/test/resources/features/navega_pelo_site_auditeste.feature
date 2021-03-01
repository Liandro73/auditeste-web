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
      E as cases da auditeste quem somos
      Entao visualizo o rodape do site quem somos
