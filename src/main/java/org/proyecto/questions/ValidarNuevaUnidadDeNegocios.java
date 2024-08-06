package org.proyecto.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.proyecto.userinterface.PaginaUnidadNegocios;


public class ValidarNuevaUnidadDeNegocios implements Question<String> {
    public static ValidarNuevaUnidadDeNegocios unidad_negocio(){
        return new ValidarNuevaUnidadDeNegocios();
    }



    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaUnidadNegocios.TABLA_UNIDADES).answeredBy(actor).toString();
    }
}
