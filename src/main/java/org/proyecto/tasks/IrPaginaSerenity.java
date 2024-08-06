package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.proyecto.userinterface.PaginaInicioSesion;

public class IrPaginaSerenity implements Task {
    private PaginaInicioSesion paginaInicio;
    public static IrPaginaSerenity urlApp() { return Tasks.instrumented(IrPaginaSerenity.class);}


    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(paginaInicio));

    }
}
