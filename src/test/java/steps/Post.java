package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.Assert.assertTrue;

public class Post extends Base{
    private Base base;

    public Post(Base base) { //construtor são as setas do Base que contém o Selenium para os steps
        this.base = base; // a minha base (this.base) vai chamar a Classe java (Base.java) my.base vai receber a Base.java
    }

    @Dado("^que acesso o Wikipedia em Portugues$")
    public void queAcessoOWikipediaEmPortugues() {

        base.driver.get(base.url); //Abre o navegador no site alvo (extendendo da base)

    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {

        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);

    }

    @Entao("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto)  {

        assertTrue(base.driver.getTitle().contains(produto));

    }
}
