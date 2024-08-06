package org.proyecto.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static org.proyecto.userinterface.PaginaPrincipal.*;

public class IrPaginaContactos implements Task{
    public static IrPaginaContactos Contactos(){
        return Tasks.instrumented(IrPaginaContactos.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(MODULO_ORGANIZACION),
               Click.on(FUNCIONALIDAD_CONTACTOS)
       );

    }
}
