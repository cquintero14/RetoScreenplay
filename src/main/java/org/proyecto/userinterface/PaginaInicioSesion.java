package org.proyecto.userinterface;
import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F")
public class PaginaInicioSesion extends PageObject {
    public static By CAMPO_NOMBRE_USUARIO = By.id("LoginPanel0_Username");
    public static By CAMPO_CONTRASEÑA = By.id("LoginPanel0_Password");
    public static By BOTON_INICIO_SESION = By.id("LoginPanel0_LoginButton");

}
