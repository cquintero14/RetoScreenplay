package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.Map;

import static org.proyecto.userinterface.PaginaUnidadNegocios.*;

public class CrearUnidadNegocio implements Task{
    public static Map<String,String> datos_Unidad_Negocios;
    public static CrearUnidadNegocio CrearUnidad (Map<String,String>datosUnidadNegocios){
        datos_Unidad_Negocios = datosUnidadNegocios;
        return Tasks.instrumented(CrearUnidadNegocio.class,datosUnidadNegocios);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NUEVA_UNIDAD),
                Enter.theValue(datos_Unidad_Negocios.get("nombre_unidad")).into(CAMPO_NOMBRE_UNIDAD),
                Click.on(CAMPO_UNIDAD_PRINCIPAL),
                Enter.theValue(datos_Unidad_Negocios.get("unidad_principal")).into(CAMPO_SELECCION),
                Hit.the(Keys.ARROW_DOWN).into(CAMPO_SELECCION),
                Hit.the(Keys.ENTER).into(CAMPO_SELECCION),
                Click.on(BOTON_GUARDAR)

        );

    }
}
