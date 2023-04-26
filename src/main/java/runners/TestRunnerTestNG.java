package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import java.io.File;

@CucumberOptions(
        features = "src/main/java/features"
        , glue = {"steps"}
        , monochrome = true
        , tags = "@sanity or @smoke"  //"@sanity or @bvt"[multiple tags running]
        , plugin = {"pretty", "html:target/cucumber"})
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
}
