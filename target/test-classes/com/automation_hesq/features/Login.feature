Feature: Inicio de Sesion en HSEQ

  Scenario Outline: Inicio de sesion en HSEQ
    Given que estoy en la pagina de inicio de HSEQ
    When ingreso mis credenciales 
      |usuario|clave|
      |<Usuario>|<Clave>|
    Then valido que el login ha sido exitoso

    Examples: 
      |Usuario|Clave|
      |jpreyesg|12345678|
  