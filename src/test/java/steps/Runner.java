package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        monochrome = false,
        features = "src/test/resources/features",
        glue = "steps", //glue = cola onde estão os passos.
        plugin = {
                "pretty", //principal plugin do Cucumber
                "html:target/relatorioSimples", //pasta de saídas do Html, onde ficam os relatórios
                "json:target/relatorioSimples.json",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html"

        }
)
public class Runner {

}
