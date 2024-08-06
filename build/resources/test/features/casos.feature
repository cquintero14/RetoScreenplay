#autor: Carlos Quintero
  #language: es

  @HistoriaDeUsuario
  Característica: Agendar una reunión a unidad de negocio y asociar contacto previamente creados

    Antecedentes:
      Dado que el usuario acceda a la pagina Serenity.is
      Y acceda con el rol admin
      |usuario|contraseña|
      | admin |serenity  |

      @CasoUnidadDeNegocio
      Escenario: Crear una nueva unidad de negocio
        Cuando el usuario despliegue el modulo Organización, acceda a la funcionalidad Unidades de negocio
        Y Selecciona la opción Nuevo Unidad de negocio e ingrese los datos requeridos
        |nombre_unidad|unidad_principal|
        |UdN_25       |Catherine   |
        Entonces El sistema creara una nueva unidad de negocio


      @CasoContacto
      Escenario: Crear un nuevo contacto
        Cuando el usuario despliegue el modulo Organización, acceda a la funcionalidad Contactos
        Y Selecciona la opción Nuevo Contacto e ingrese los datos requeridos
          |titulo|nombre|apellido|email|numero_identificación|usuario|
          |Mr.|Lionel|Messi       |dyclark@test.com|888-77-777    |dylan.clark|
        Entonces El sistema creara un nuevo contacto



       @CasoCrearReunion
       Escenario: Crear una nueva reunión
         Cuando el usuario despliegue el modulo Reunión, acceda a la funcionalidad Reuniones
         Y Selecciona la opción Nuevo Reunión e ingrese los datos requeridos
           |nombre|tipo_reunión|id_reunión|fecha_inicial|fecha_final|ubicación|unidad|organizador|reportero|asistente|
           |Reunion_UdN25|Strategy|R_0025 |30/12/2024 08:00|30/12/2024 12:00|HQ-01|UdN_25|Adam Stewart|Allison Bell|Lionel Messi|
         Entonces El sistema creara una nueva reunión
