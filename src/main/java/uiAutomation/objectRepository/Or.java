package uiAutomation.objectRepository;
public class Or {
    public static String checkBox =  "(//input[@name='sports'])[4]__xpath";

    //-----------------------------------Automation_Practice_Site_Page Objects------------------------------------------------------------------------------------
    public static String resources = "//li[@id='menu-item-27617']//span[@class='menu-text'][normalize-space()='Resources']__xpath";
    public static String resources_practice_site_1 = "//li[@id='menu-item-27618']//span[@class='menu-text'][normalize-space()='Practice Site 1']__xpath";

    //-----------------------------------Dummy Registration Form Objects-------------------------------------------------------------------------------------------
    public static String name = "//input[@name='name']__xpath";
    public static String phone = "input[name='phone']__css";
    public static String email = "email__name";
    public static String country = "//select[@name='country']__xpath";
    public static String city = "//input[@name='city']__xpath";
    public static String username = "//div[@id='load_box']//input[@name='username']__xpath";
    public static String password = "//div[@id='load_box']//input[@name='password']__xpath";
    public static String ENTER_TO_THE_TESTING_WEBSITE = "//div[@id='load_box']//a[@class='fancybox'][normalize-space()='ENTER TO THE TESTING WEBSITE']__xpath";
    public static String EXPLORE_LIFETIME_MEMBERSHIP = "//div[@id='load_box']//a[@class='fancybox'][normalize-space()='EXPLORE LIFETIME MEMBERSHIP']__xpath";
    public static String Submit_btn = "//div[@id='load_box']//input[@value='Submit']__xpath";
}
