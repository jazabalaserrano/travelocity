@travelocity
Feature: Validacion De Escenarios travelocity
  Esta feature se trata de validar distintos esenarios sobre travelocity.com

  @1buscarCrucero
  Scenario: Buscar un crucero en travelocity.com
    Given ingresa al sitio web de travelocity.com
    When el usuario busca un crucero
    Then el usuario valida el crucero seleccionado

  @2buscarCarro
  Scenario Outline: Buscar un carro en travelocity.com
    Given ingresa al sitio web de travelocity.com
    When el usuario Ingresa a rentar carros y diligencia el formulario <ciudadOrigen>,<ciudadDestino>,<horaRecogida>,<horaEntrega>
    Then el usuario valida el vehiculo seleccionado

    Examples: 
      | ciudadOrigen | ciudadDestino | horaRecogida | horaEntrega |
      | Bogota       | medellin      | 11:45        | 08:15       |
      | Bogota       | cali          | 10:30        | 09:00       |

  @inicioSesion
  Scenario: Iniciar sesion   travelocity.com
    Given ingresa al sitio web de travelocity.com
    When el usuario Ingresa a Iniciar Sesion y diligencia sus datos
    Then el usuario valida la restriccion al iniciar sesion

  @3buscarHotel
  Scenario: Buscar un hotel en travelocity.com
    Given ingresa al sitio web de travelocity.com
    When el usuario busca un hotel
    Then el usuario valida la informacion de su hotel

  @4buscarVuelo
  Scenario Outline: Buscar un vuelo ida y vuelta en travelocity.com
    Given ingresa al sitio web de travelocity.com
    When el usuario busca un vuelo de <ciudadOrigen> a <ciudadDestino>
    Then el usuario valida la informacion de su vuelo

    Examples: 
      | ciudadOrigen | ciudadDestino |
      | Bogota       | miami         |
