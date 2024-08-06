package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import static org.proyecto.userinterface.PaginaReuniones.*;
import java.util.Map;

public class CrearNuevaReunion implements Task {
    public static Map<String,String> datos_Reuniones;
    public static CrearNuevaReunion CrearReunion (Map<String,String>datosReunion){
        datos_Reuniones = datosReunion;
        return Tasks.instrumented(CrearNuevaReunion.class,datosReunion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NUEVA_REUNION),
                Enter.theValue(datos_Reuniones.get("nombre")).into(CAMPO_NOMBRE_REUNION),
                Click.on(TIPO_REUNION),
                Enter.theValue(datos_Reuniones.get("tipo_reunión")).into(CAMPO_TIPO_REUNION),
                Hit.the(Keys.ENTER).into(CAMPO_TIPO_REUNION),
                Enter.theValue(datos_Reuniones.get("id_reunión")).into(CAMPO_NUMERO_REUNION),
                Enter.theValue(datos_Reuniones.get("fecha_inicial")).into(FECHA_INICIO),
                Enter.theValue(datos_Reuniones.get("fecha_final")).into(FECHA_FIN),
                Click.on(UBICACION),
                Enter.theValue(datos_Reuniones.get("ubicación")).into(CAMPO_UBICACION),
                Hit.the(Keys.ENTER).into(CAMPO_UBICACION),
                Click.on(UNIDAD),
                Enter.theValue(datos_Reuniones.get("unidad")).into(CAMPO_UNIDAD),
                Hit.the(Keys.ENTER).into(CAMPO_UNIDAD),
                Click.on(ORGANIZADOR),
                Enter.theValue(datos_Reuniones.get("organizador")).into(CAMPO_ORGANIZADOR),
                Hit.the(Keys.ENTER).into(CAMPO_ORGANIZADOR),
                Click.on(REPORTERO),
                Enter.theValue(datos_Reuniones.get("reportero")).into(CAMPO_REPORTERO),
                Hit.the(Keys.ENTER).into(CAMPO_REPORTERO),
                Click.on(ASISTENTE),
                Enter.theValue(datos_Reuniones.get("asistente")).into(CAMPO_ASISTENTE),
                Hit.the(Keys.ENTER).into(CAMPO_ASISTENTE),
                Click.on(BOTON_GUARDAR_REUNION)

                );

    }
}
