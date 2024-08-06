package org.proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.proyecto.userinterface.PaginaContactos;

public class ValidarNuevoContacto implements Question<String> {
    public static ValidarNuevoContacto contacto(){

        return new ValidarNuevoContacto();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaContactos.TABLA_CONTACTOS).answeredBy(actor).toString();
    }
}
