package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;


public class Artigo {
    //dois atributos
    String url; //endereco do site alvo
    WebDriver driver; //Objeto do Selenium WebDriver

    @Before// O que acontece antes do teste
    public void iniciar(){
        url = "https://pt.wikipedia.org/"; // endereço do site alvo
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maris\\drivers\\chrome\\89\\chromedriver.exe");
        driver = new ChromeDriver(); //Instanciar o Selenium com o Chrome Driver

        driver.manage().window().maximize(); //Maximizar a janela do navegador
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
                //define uma espera implicita de 1min, verificando o carregamento a cada milisegundo
    }
    @Test//O que acontece durante o teste
    public void consultarArtigo(){
        //Abrir o site
        driver.get(url);

        //Pesquisar por "Ovo de Páscoa"
        driver.findElement(By.id("searchInput")).sendKeys("Ovo de Páscoa");
        driver.findElement(By.id("searchButton")).click(); //Clica na Lupa

        //Validar o título da página de retorno
        //assertEquals("Ovo de Páscoa – Wikipédia, a enciclopédia livre", driver.getTitle());
        assertTrue(driver.getTitle().contains("Ovo de Páscoa"));
        //assertEquals("Ovo de Páscoa", driver.findElement(By.id("firstHeading")).getText());

    }

    @After//O que acontece apos do teste

    public void finalizar(){

        driver.quit();
    }
}
