#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Registro de usuario
  Yo como usuario debe registrarme en la aplicación para tener acceso a las funcionalidades

  @tag1
  Scenario Outline: Registro de usuario
    Given que he ingresado a la página principal de registro
    And he ingresado en el campo Username <Username>
    And he ingresado en el campo Email <Email>
    And he ingresado en el campo Password <Password>
    And he ingresado en el campo Confirm Password <Password2>
    And he seleccionado el campo Date
    And he ingresado en el campo Celular <Celular>
    And he seleccionado en el campo Genero
    And he seleccionado el campo terminos 
    When seleccione el botón SignUp
    Then Debería visualizar el registro limpio

    Examples: 
      | Username  			| Email 								| Password  	|Password2			|Date	|Celular		|
      | Samile Rodriguez| samile@intergrupo.com	|iGDxf8hSRT4= |iGDxf8hSRT4=		|Date	|3101025485	|
  