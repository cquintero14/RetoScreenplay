package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import static org.proyecto.userinterface.PaginaInicioSesion.*;

import java.util.Map;



public class InicioSesion implements Task {
    public static Map<String,String> credencialesdeUsuario;
    public static InicioSesion IniciodeSesion (Map<String,String > credenciales){
        credencialesdeUsuario=credenciales;
        return Tasks.instrumented(InicioSesion.class,credenciales);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credencialesdeUsuario.get("usuario")).into(CAMPO_NOMBRE_USUARIO),
                Enter.theValue(credencialesdeUsuario.get("contraseña")).into(CAMPO_CONTRASEÑA),
                Click.on(BOTON_INICIO_SESION).afterWaitingUntilEnabled()
        );

    }
}
