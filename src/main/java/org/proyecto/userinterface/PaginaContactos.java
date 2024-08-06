package org.proyecto.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaContactos extends PageObject{
    public static Target BOTON_NUEVO_CONTACTO = Target.the("BOTON_NUEVO_CONTACTO").located(By.xpath("//div[@class = 'tool-button add-button icon-tool-button']"));
    public static Target TABLA_CONTACTOS = Target.the("TABLA_CONTACTOS").located(By.xpath("//div[@class = 'grid-canvas']"));
    public static By CAMPO_TITULO = By.id("Serenity_Pro_Organization_ContactDialog4_Title");
    public static By CAMPO_NOMBRE_CONTACTO = By.id("Serenity_Pro_Organization_ContactDialog4_FirstName");
    public static By CAMPO_APELLIDO_CONTACTO = By.id("Serenity_Pro_Organization_ContactDialog4_LastName");
    public static By CAMPO_EMAIL = By.id("Serenity_Pro_Organization_ContactDialog4_Email");
    public static By CAMPO_NUMERO_IDENTIFICACIÓN = By.id("Serenity_Pro_Organization_ContactDialog4_IdentityNo");
    public static By CAMPO_USUARIO = By.id("s2id_Serenity_Pro_Organization_ContactDialog4_UserId");
    public static By CAMPO_SELECCION = By.id("s2id_autogen1_search");
    public static Target BOTON_GUARDAR_CONTACTO = Target.the("BOTON_GUARDAR_CONTACTO").located(By.xpath("//div[@class ='tool-button save-and-close-button icon-tool-button']"));



}
