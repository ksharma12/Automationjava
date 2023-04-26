package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features"
        , glue = {"steps"}
        , monochrome = true
        , tags = "@sanity or @smoke"  //"@sanity or @bvt"[multiple tags running]
        , plugin = {"summary", "pretty", "html:target/cucumber-reports.html"
        , "json:target/cucumber-reports"
        , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
class TestRunnerJunit {
}
