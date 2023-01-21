package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcluirPage {
    private WebDriver navegador;

    //Método Construtor
    public ExcluirPage(WebDriver navegador) {
        this.navegador = navegador;
    }
    public ExcluirPage ExcluirUsuarios(){
        navegador.findElement(By.cssSelector("button[class=\"btn btn-danger\"]")).click();
        return this;
    }

}
