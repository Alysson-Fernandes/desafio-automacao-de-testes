package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPage {
    private WebDriver navegador;

    //Método Construtor
    public CadastroPage(WebDriver navegador){
        this.navegador = navegador;
    }
    //Criando os métodos
    public CadastroPage InformarUsuario(String usuario){
        navegador.findElement(By.id("nome")).click();
        navegador.findElement(By.id("nome")).sendKeys(usuario);
        return this;
    }
    public CadastroPage InformarCPF(String CPF){
        navegador.findElement(By.id("cpf")).click();
        navegador.findElement(By.id("cpf")).sendKeys(CPF);
        return this;
    }
    public CadastroPage InformarCelular(String celular){
        navegador.findElement(By.id("celular")).click();
        navegador.findElement(By.id("celular")).sendKeys(celular);
        return this;
    }
    public CadastroPage InformarDtNascimento(String DtNascimento){
        navegador.findElement(By.id("dt-nascimento")).click();
        navegador.findElement(By.id("dt-nascimento")).sendKeys(DtNascimento);
        return this;
    }
    public CadastroPage SubmeterFormulario(){
        navegador.findElement(By.id("btn-salvar")).click();
        return this;
    }
}
