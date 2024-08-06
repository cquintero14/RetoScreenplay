package org.proyecto.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import java.util.Map;
import static org.proyecto.userinterface.PaginaContactos.*;

public class CrearNuevoContacto implements Task {
    public static Map<String,String>datos_Contacto;
    public static CrearNuevoContacto CrearContacto (Map <String,String> datosNuevoContacto){
        datos_Contacto = datosNuevoContacto;
        return Tasks.instrumented(CrearNuevoContacto.class,datosNuevoContacto);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NUEVO_CONTACTO),
                Enter.theValue(datos_Contacto.get("titulo")).into(CAMPO_TITULO),
                Enter.theValue(datos_Contacto.get("nombre")).into(CAMPO_NOMBRE_CONTACTO),
                Enter.theValue(datos_Contacto.get("apellido")).into(CAMPO_APELLIDO_CONTACTO),
                Enter.theValue(datos_Contacto.get("email")).into(CAMPO_EMAIL),
                Enter.theValue(datos_Contacto.get("numero_identificación")).into(CAMPO_NUMERO_IDENTIFICACIÓN),
                Click.on(CAMPO_USUARIO),
                Enter.theValue(datos_Contacto.get("usuario")).into(CAMPO_SELECCION),
                Hit.the(Keys.ENTER).into(CAMPO_SELECCION),
                Click.on(BOTON_GUARDAR_CONTACTO)

                );

    }
}
