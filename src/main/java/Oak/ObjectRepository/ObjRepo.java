package Oak.ObjectRepository;

public class ObjRepo {

    public static String qualityURL = "https://test.oakanalytics.com/oak/";
    public static String prodURL = "https://oakanalytics.com/oak/login";
    public static String userName = "//input[starts-with(@id,\"login_username\")]";
    public static String Password = "//input[starts-with(@id,\"login_password\")]";
    public static String loginBtn ="//*[@id=\"login_button\"]";
    //public static String topUserName ="//*[@id=\"TopUserName\"]";
    //public static String topUserName ="//*[contains(@class, 'nav-link dropdown-toggle')]";
    public static String topUserName = "oak-header div.UserName + i";
    public static String logoutBtn = "//*[@class=\"logoutTxt\"]";
    public static String filePathDataProperty = "C:\\Users\\mehul\\testautomation\\datafile.properties";

    // Customer Side nav menu links
    public static String customerManagementMenuLink = "//*[@id='customerManagement']";
    public static String cusotmerLink = "//*[@id='Customer']";
    public static String userLink ="//*[@id='user']";
    public static String productMappingLink ="//*[@id='customermapping']";
    public static String productTypeMapping = "//*[@id='producttypemapping']";

    //Rolemanagement Side nav menu link
    public static String rolemangementLink = "//*[@id='roleManagement']";






}
