package org.proyecto.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaReuniones extends PageObject{
    public static Target BOTON_NUEVA_REUNION = Target.the("BOTON_NUEVA_REUNION").located(By.xpath("//div[@class = 'tool-button add-button icon-tool-button']"));
    public static Target TABLA_REUNIONES = Target.the("TABLA_REUNIONES").located(By.xpath("//div[@class = 'grid-canvas']"));
    public static By CAMPO_NOMBRE_REUNION = By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName");
    public static By TIPO_REUNION = By.id("select2-chosen-6");
    public static By CAMPO_TIPO_REUNION = By.id("s2id_autogen6_search");
    public static By CAMPO_NUMERO_REUNION = By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber");
    public static By FECHA_INICIO = By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate");
    public static By FECHA_FIN = By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate");
    public static By UBICACION = By.id("select2-chosen-7");
    public static By CAMPO_UBICACION = By.id("s2id_autogen7_search");
    public static By UNIDAD = By.id("select2-chosen-8");
    public static By CAMPO_UNIDAD = By.id("s2id_autogen8_search");
    public static By ORGANIZADOR = By.id("select2-chosen-9");
    public static By CAMPO_ORGANIZADOR = By.id("s2id_autogen9_search");
    public static By REPORTERO = By.id("select2-chosen-10");
    public static By CAMPO_REPORTERO = By.id("s2id_autogen10_search");
    public static By ASISTENTE = By.id("select2-chosen-12");
    public static By CAMPO_ASISTENTE = By.id("s2id_autogen12_search");
    public static Target BOTON_GUARDAR_REUNION = Target.the("BOTON_GUARDAR_REUNION").located(By.xpath("//div[@class = 'tool-button save-and-close-button icon-tool-button']"));



}
