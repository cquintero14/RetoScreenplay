package org.proyecto.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.proyecto.userinterface.PaginaReuniones;


public class ValidarNuevaReunion  implements Question<String> {
    public static ValidarNuevaReunion reunion(){

        return new ValidarNuevaReunion();
    }



    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaReuniones.TABLA_REUNIONES).answeredBy(actor).toString();
    }
}
