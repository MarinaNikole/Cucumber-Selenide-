package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps", "hooks"},
      //  tags = "@success_login"
      //  tags = " @invalid_data"
      //  tags = " @empty_fields"
     // tags = " @login"
       // tags = "@inventory"
        // tags = "@name_A-Z"
      //  tags = "@price_from_low_to_high"
     //   tags = "@price_from_high_to_low"
       tags = "@Checkout"
)

public class RunnerTest {
}
