@test
Feature: Formulario de Registro

  Yo como PO
  Quiero un formulario de registro
  Para que los cliente puedan registrarse para loguearse al portal

  @Scenario
  Scenario: como usuario comprar un xbox y verificar el precio correcto
    Given el usuario realiza la busqueda
    And el usuario ingresa nombre valido del producto y busca
      | buscar       |
      | Consola xbox |
    When el sistema verifica que el precio del producto en el carrito y en la busqueda sea el mismo
    Then el usuario encuentra el producto y lo agrega al carrito