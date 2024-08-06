package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static org.proyecto.userinterface.PaginaPrincipal.*;



public class IrPaginaUnidadDeNegocios  implements Task {
    public static IrPaginaUnidadDeNegocios UnidadNegocios () {
        return Tasks.instrumented(IrPaginaUnidadDeNegocios.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MODULO_ORGANIZACION),
                Click.on(FUNCIONALIDAD_UNIDAD_NEGOCIO)
        );


    }
}
