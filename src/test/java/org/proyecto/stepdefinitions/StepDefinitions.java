package org.proyecto.stepdefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.proyecto.questions.ValidarNuevaReunion;
import org.proyecto.questions.ValidarNuevaUnidadDeNegocios;
import org.proyecto.questions.ValidarNuevoContacto;
import org.proyecto.tasks.CrearNuevoContacto.*;
import org.proyecto.tasks.*;


import java.util.List;
import java.util.Map;

public class StepDefinitions {
    @Before
    public void IniciarEscenario(){OnStage.setTheStage(new OnlineCast());}

    @Dado("que el usuario acceda a la pagina Serenity.is")
    public void IralaPaginaSerenity() { OnStage.theActorCalled("actor").wasAbleTo(IrPaginaSerenity.urlApp());

    }
    @Y("acceda con el rol admin")
    public void IniciodeSesion(DataTable credencialesadmin) {
        List<Map<String,String>> rows =credencialesadmin.asMaps(String.class, String.class);
        Map<String,String> credenciales = rows.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(InicioSesion.IniciodeSesion(credenciales));

    }

    @Cuando("el usuario despliegue el modulo Organización, acceda a la funcionalidad Unidades de negocio")
    public void IrUnidadDeNegocios() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrPaginaUnidadDeNegocios.UnidadNegocios());
    }
    @Y("Selecciona la opción Nuevo Unidad de negocio e ingrese los datos requeridos")
    public void CrearNuevaUnidadDeNegocios(DataTable infoUnidad) {
        List<Map<String,String> > rows = infoUnidad.asMaps(String.class, String.class);
        Map<String,String> datosUnidadNegocio = rows.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(CrearUnidadNegocio.CrearUnidad(datosUnidadNegocio));

    }
    @Entonces("El sistema creara una nueva unidad de negocio")
    public void ValidarLaCreacionDeLaNuevaUnidad() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (ValidarNuevaUnidadDeNegocios.unidad_negocio(),
                        Matchers.containsString("UdN_25")));
    }

    @Cuando("el usuario despliegue el modulo Organización, acceda a la funcionalidad Contactos")
    public void IrAContactos() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrPaginaContactos.Contactos());

    }
    @Y("Selecciona la opción Nuevo Contacto e ingrese los datos requeridos")
    public void CrearContacto(DataTable infoContacto) {
        List<Map<String,String> > rows = infoContacto.asMaps(String.class, String.class);
        Map<String,String>  datosNuevoContacto = rows.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(CrearNuevoContacto.CrearContacto(datosNuevoContacto));

    }
    @Entonces("El sistema creara un nuevo contacto")
    public void ValidarNuevoContactoEnElSistema() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (ValidarNuevoContacto.contacto(),
                        Matchers.containsString("aaron.taylor")));

    }

    @Cuando("el usuario despliegue el modulo Reunión, acceda a la funcionalidad Reuniones")
    public void IrAPaginaReuniones() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrPaginaReunion.IrReunion());
    }
    @Y("Selecciona la opción Nuevo Reunión e ingrese los datos requeridos")
    public void CrearUnaNuevaReunión(DataTable infoReunion) {
        List<Map<String,String> > rows = infoReunion.asMaps(String.class, String.class);
        Map<String,String>  datosReunion = rows.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(CrearNuevaReunion.CrearReunion(datosReunion));
    }
    @Entonces("El sistema creara una nueva reunión")
    public void ValidarNuevaReunionEnElSistema() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (ValidarNuevaReunion.reunion(),
                        Matchers.containsString("Reunion_UdN25")));

    }

}
