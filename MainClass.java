package Automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainClass {
	static WebDriver ramesh;
	 static BaseClass mp=new BaseClass();
	 @BeforeMethod
	 public void openthebrowser() {
		 ramesh=new ChromeDriver();
		 ramesh.manage().window().maximize();
		 ramesh.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		 
		 
	 }
     @AfterMethod
     public void closethebrowser() {
    	 ramesh.quit();
     }
     @Test
     public void Testcase1() {
    	String title = ramesh.getTitle();
    	Reporter.log(title,true);
     }
     @Test
     public void Testcase2() {
     	String title = ramesh.getCurrentUrl();
     	Reporter.log(title,true);
      }
     
     @Test
     public void Testcase3() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.logo();
     }
     @Test
     public void Testcase4() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.logo2();
    	 
     }
     @Test
     public void Testcase5(){
    	 PageFactory.initElements(ramesh, mp);
    	 mp.logoclick();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void Testcase6(){
    	 PageFactory.initElements(ramesh, mp);
    	 mp.logo2click();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void Testcase7() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.findstore();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase8() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.help();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void Testcase9() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.join();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void Testcase10() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.signup();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
     }
     @Test
     public void Testcase11() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.newfeatures();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase12() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.mens();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);

    	 
     }
     @Test
     public void Testcase13() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.womens();
    	 ramesh.navigate().refresh();     
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase14() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.kids();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase15() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.sale();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase16() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.snkrs();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase17() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.forget();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase18() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.keepmesignin();
    	 ramesh.navigate().refresh();
    	    	 }
     @Test
     public void Testcase19() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.privacy();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase20() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.termsofuse();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase21() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.fav();
    	 ramesh.navigate().refresh();
    	 
    	 }
     @Test
     public void Testcase22() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.bag();
    	 ramesh.navigate().refresh();
    	 
    	 }
     @Test
     public void Testcase23() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.search();
    	 ramesh.navigate().refresh();
    	 Reporter.log("The Search Option Is Working Fine",true);
    	  }
     @Test
     public void Testcase24() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.instagram();
    	 ramesh.navigate().refresh();
    	 
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase25() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.facebook();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase26() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.youtube();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase27() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.twitter();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase28() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.findastore();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase29() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.becameamember();;
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase30() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.sendus();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase31() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.student();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase32() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.gethelp();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase33() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.order();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase34() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.delivery();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase35() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.returns();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase36() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.payment();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase37() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.nike();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
     @Test
     public void Testcase38() {
    	 PageFactory.initElements(ramesh, mp);
    	 mp.other();
    	 ramesh.navigate().refresh();
    	 String title = ramesh.getTitle();
    	 Reporter.log(title,true);
    	 }
}

