package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static org.proyecto.userinterface.PaginaPrincipal.*;
public class IrPaginaReunion implements Task{
    public static IrPaginaReunion IrReunion (){

        return Tasks.instrumented(IrPaginaReunion.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MODULO_REUNION),
                Click.on(FUNCIONALIDAD_REUNIONES)

        );

    }
}
