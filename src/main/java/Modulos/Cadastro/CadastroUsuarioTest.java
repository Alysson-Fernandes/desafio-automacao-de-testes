package Modulos.Cadastro;

import Paginas.BuscaPage;
import Paginas.CadastroPage;
import Paginas.ExcluirPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.BuildInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste Web de Cadastro de Usuário")

public class CadastroUsuarioTest {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach() {
        //Abrir navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        this.navegador = new ChromeDriver();
        //Maximizar a tela
        this.navegador.manage().window().maximize();
        //Navegar em um site
        this.navegador.get("http://localhost:8080/");
    }

    @Test
    @DisplayName("Cadastrar Usuário com dados Corretos")
    public void cadastroDeUsuarioComDadosCorretos() {

        new CadastroPage(navegador)
                .InformarUsuario("Alysson Fernandes Marquess")
                .InformarCPF("095.575.646-44")
                .InformarCelular("(33)98805-0504")
                .InformarDtNascimento("11/02/1989")
                .SubmeterFormulario();
    }
    @Test
    @DisplayName("Cadastrar Usuário Sem Dados")
    public void cadastroDeUsuarioSemDados(){
        new CadastroPage(navegador)
                .InformarUsuario("")
                .InformarCPF("")
                .InformarCelular("")
                .InformarDtNascimento("")
                .SubmeterFormulario();
    }
    @Test
    @DisplayName("Cadastrar Usuário sem Máscara nos Dados")
    public void cadastroDeUsuarioSemMascaraNosDados(){
        new CadastroPage(navegador)
                .InformarUsuario("Alysson Fernandes Marques")
                .InformarCPF("09557564644")
                .InformarCelular("33988050504")
                .InformarDtNascimento("11/02/1989")
                .SubmeterFormulario();
    }
    @Test
    @DisplayName("Excluir Todos Usuários")
    public void excluirCadastros(){
        new ExcluirPage(navegador)
                .ExcluirUsuarios();
    }
    @Test
    @DisplayName("Localizar Usuário Cadastrado")
    public void buscaDeUsupario(){
        new BuscaPage(navegador)
                .BuscarUsuario("Alysson Fernandes Marques")
                .SubmeterBusca();
    }
    //A cada teste fechar o navegador
    @AfterEach
    public void afterEach(){
        navegador.quit();
    }
}
