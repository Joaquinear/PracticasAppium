Feature: NotesCreate
  @movile
  Scenario: Como usuario quiero crear una nota para ver mi progreso en mis tareas

    Given que tengo abierto la app: whenDo
    When hago click en el boton [+]
    And ingreso el titulo: "Practica"
    And ingreso la descripcion: "Practica Appium"
    And hago click en boton [guardar]
    Then la nota "Practica" deberia ser creada

  Scenario: Como usuario quiero poder eliminar una tarea registrada

    Given que tengo abierto la app: whenDo
    When hago click en el boton [+]
    And ingreso el titulo: "PracticaDelete"
    And ingreso la descripcion: "Practica Appium"
    And hago click en boton [guardar]
    And usuario selecciona el item guardado con titulo "PracticaDelete"
    And la aplicacion muestra los datos de la tarea
    And usuario presiona sobre el logo del [BASURERO]
    And aparece mensaje de confirmacion
    And usuario presiona en [DELETE]
    Then la nota seleccionada es eliminada

  Scenario: Como usuario quiero poder Actualizar la tarea creada
    Given que tengo abierto la app: whenDo
    When hago click en el boton [+]
    And ingreso el titulo: "PracticaUpdate"
    And ingreso la descripcion: "Practica Appium"
    And hago click en boton [guardar]
    And usuario selecciona el item guardado con titulo "PracticaUpdate"
    And presiona sobre el titulo de la tarea "PracticaUpdate"
    And modifica el titulo por "Update"
    And presiona sobre la descripcion
    And modifica la descripcion por "Update Descripcion"
    And hago click en boton [guardar]
    Then el titulo, descripcion fueron modificados


