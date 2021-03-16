
  #Funcionalidade: Consulta
   # Cenario: Consultar Ovo de Pascoa
     # Dado que acesso o Wikipedia em Portugues
      #Quando pesquiso por "Ovo de Páscoa"
      #Entao exibe a expressao "Ovo de Páscoa" no titulo da guia


Feature:Consulta
  Scenario: Consultar Ovo de Pascoa
  Given que acesso o Wikipedia em Portugues
   When pesquiso por "Ovo de Páscoa"
   Then exibe a expressao "Ovo de Páscoa" no titulo da guia