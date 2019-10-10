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
    public static String filePathDataProperty = "C:\\Users\\mehul\\IdeaProjects\\autoProj\\datafile.properties";


}
