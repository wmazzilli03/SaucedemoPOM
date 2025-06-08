Feature: Flujo de compra en la tienda SauceDemo

  Background:
    Given el usuario navega a la página de login
    When ingresa credenciales válidas

  @Login
  Scenario: Login exitoso con credenciales válidas
    Then debería ser redirigido a la pantalla de productos

  @AgregarCarrito
  Scenario: Agregar productos al carrito y Finalizar la compra
    When agrega los productos "Sauce Labs Backpack" y "Test.allTheThings() T-Shirt (Red)" al carrito
    And  debería ver los productos agregados en el carrito
    And  el usuario tiene productos en el carrito
    And  completa el proceso de checkout con datos personales válidos
    And  confirmamos la informacion del pago
    Then debería ver el mensaje de confirmación "Thank you for your order!"
