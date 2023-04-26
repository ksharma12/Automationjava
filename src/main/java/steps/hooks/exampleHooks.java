package steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class exampleHooks {
    @Before("@prod")
    public void setUpProd(){
        System.out.println("Launch the browser prod");
    }
    @After("@prod")
    public void tearDownProd(){
        System.out.println("driver.quit prod");
    }
    @Before("@smoke")
    public void setUpSmoke(){
        System.out.println("Launch the browser smoke");
    }
    @After("@smoke")
    public void tearDownSmoke(){
        System.out.println("driver.quit smoke");
    }
}
