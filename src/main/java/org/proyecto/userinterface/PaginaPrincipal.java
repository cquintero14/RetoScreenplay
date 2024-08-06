package org.proyecto.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal extends PageObject {
    public static Target MODULO_ORGANIZACION = Target.the("SECCION_ORGANIZACION").located(By.xpath("//a[@href='#nav_menu1_3_1']"));
    public static Target FUNCIONALIDAD_UNIDAD_NEGOCIO = Target.the("FUNCIONALIDAD_UNIDAD_NEGOCIO").located(By.xpath("//a[@href='/Organization/BusinessUnit']"));
    public static Target FUNCIONALIDAD_CONTACTOS = Target.the("FUNCIONALIDAD_CONTACTOS").located(By.xpath("//a[@href='/Organization/Contact']"));
    public static Target MODULO_REUNION = Target.the("MODULO_REUNION").located(By.xpath("//a[@href='#nav_menu1_3_2']"));
    public static Target FUNCIONALIDAD_REUNIONES = Target.the("FUNCIONALIDAD_REUNIONES").located(By.xpath("//a[@href='/Meeting/Meeting']"));

}
