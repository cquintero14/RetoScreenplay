package org.proyecto.userinterface;


import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class PaginaUnidadNegocios extends PageObject{
    public static Target BOTON_NUEVA_UNIDAD = Target.the("BOTON_NUEVA_UNIDAD").located(By.xpath("//div[@class = 'tool-button add-button icon-tool-button']"));
    public static Target TABLA_UNIDADES = Target.the("TABLA_UNIDADES").located(By.xpath("//div[@class = 'grid-canvas']"));
    public static Target BOTON_GUARDAR = Target.the("BOTON_GUARDAR").located(By.xpath("//div[@class = 'tool-button save-and-close-button icon-tool-button']"));
    public static By CAMPO_NOMBRE_UNIDAD = By.id("Serenity_Pro_Organization_BusinessUnitDialog3_Name");
    public static By CAMPO_UNIDAD_PRINCIPAL = By.id("select2-chosen-1");
    public static By CAMPO_SELECCION = By.id("s2id_autogen1_search");

}
