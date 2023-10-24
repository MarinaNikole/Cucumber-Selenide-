package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps",
      //  tags = "@success_login"
      //  tags = " @invalid_data"
      //  tags = " @empty_fields"
      //  tags = " @login"
        tags = "@name_A-Z"
)

public class RunnerTest {
}
