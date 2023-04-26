package runners;

import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features"
        , glue = {"steps"}
        , monochrome = true
        , tags = "@sanity or @smoke"  //"@sanity or @bvt"[multiple tags running]
        , dryRun = false
        , plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdaptor:" })
public class TestRunnerJunitExtentReport {

}
