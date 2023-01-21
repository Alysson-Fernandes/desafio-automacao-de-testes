package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaPage {

    private WebDriver navegador;
    //Método Construtor
    public BuscaPage(WebDriver navegador){
        this.navegador = navegador;
    }
    public BuscaPage BuscarUsuario(String nome){
        navegador.findElement(By.id("input-search")).click();
        navegador.findElement(By.id("input-search")).sendKeys(nome);
        return this;
    }
    public BuscaPage SubmeterBusca(){
        navegador.findElement(By.xpath("//form[2]//button")).click();
        return this;
    }

}
