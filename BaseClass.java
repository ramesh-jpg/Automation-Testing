package Automation;

	

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.testng.Reporter;

	public class BaseClass{
		//logo
		@FindBy(xpath = "//a[@class='pre-brand-item d-sm-ib prl3-sm']")
		private WebElement logo;
		
		//logo2
		@FindBy(xpath = "//a[@class='d-sm-b pre-logo-link']")
		private WebElement logo2;
		
		//findstore
		@FindBy(xpath = "(//span[@id='hf_header_find_a_store'])[1]")
		private WebElement findstore;
		
		//help
		@FindBy(xpath ="(//span[@id='hf_header_label_help'])[1]")
	    private WebElement help;
		
		//joinus
		@FindBy(xpath = "(//span[.='Join Us'])[1]")
		private WebElement joinus;
		
		//signin
		@FindBy(xpath = "(//span[.='Sign In'])[1]")
		private WebElement signin;
		
		
		//newfeatures
		@FindBy(xpath = "(//button[.='New & Featured'])[2]")
		private WebElement newfeatures;
		
		//men
		@FindBy(xpath = "//a[.='Men']")
		private WebElement mens;
		
		//women
		@FindBy(xpath = "//a[.='Women']")	
		private WebElement womens;
		
		//kids
		@FindBy(xpath = "//a[.='Kids']")
		private WebElement kids;
		
		//sales
		@FindBy(xpath = "(//a[.='Sale'])[4]")
		private WebElement sales;
		
		
		//snkrs
		@FindBy(xpath = "(//a[.='SNKRS'])[2]")
		private WebElement snkrs;
		
		//keepmesignin
		@FindBy(xpath = "//input[@id='865620f4-26d0-4fbc-8562-d2c29dd34dbf']")
		private WebElement keepmesignin;
		
		//forgetpassword
		@FindBy(xpath = "//a[.='Forgotten your password?']")
		private WebElement forgetpassword;
		
		//privacy
		@FindBy(xpath = "(//a[.='Privacy Policy'])[2]")
		private WebElement privacy;
		
		//termofuse
		@FindBy(xpath = "(//a[.='Terms of Use'])[2]")
		private WebElement termofuse;
		
		//fav
		@FindBy(xpath = "//a[@class='pre-btn-header ripple mr3-sm d-sm-h d-lg-ib']")
		private WebElement fav;
		
		//bag
		@FindBy(xpath = "//a[@class='icon-btn ripple d-sm-b']")
		private WebElement bag;
		
		//search
		@FindBy(xpath = "//input[@class='pre-search-input headline-5']")
		private WebElement search;
		
		//twitter
		@FindBy(xpath = "//a[@title='Twitter']")
		private WebElement twitter;
		
		//facebook
		@FindBy(xpath = "//a[@title='Facebook']")
		private WebElement facebook;
		
		//youtube
		@FindBy(xpath = "//a[@title='Youtube']")
		private WebElement youtube;
		
		//instagram
		@FindBy(xpath = "//a[@title='Instagram ']")
		private WebElement instagram;
		
		//findastore
		@FindBy(xpath = "//a[.='Find A Store']")
		private WebElement findastore;
		
		//becameamember
		@FindBy(xpath = "//a[.='Become A Member']")
		private WebElement becameamember;
		
		//sendus
		@FindBy(xpath = "(//button[.='Send Us Feedback'])[2]")
		private WebElement sendus;
		
		//student
		@FindBy(xpath = "//a[.='Student Discounts']")
		private WebElement student;
		
		//gethelp
		@FindBy(xpath = "//a[.='Get Help']")
		private WebElement gethelp;
		
		//order
		@FindBy(xpath = "(//a[.='Order Status'])[2]")
		private WebElement order;
		
		//delivery
		@FindBy(xpath = "//a[.='Delivery']")
		private WebElement delivery;
		
		//return
		@FindBy(xpath = "(//a[.='Returns'])[2]")
		private WebElement returns;
		
		//payment
		@FindBy(xpath = "//a[.='Payment Options']")
		private WebElement payment;
		
		//nike.com
		@FindBy(xpath = "//a[.='Contact Us On Nike.com Inquiries']")
		private WebElement nike;
		
		//others
		@FindBy(xpath = "//a[.='Contact Us On All Other Inquiries']")
		private WebElement others;
		//--------------------------------------------------
		//instalization
		//logo
		
		public void logo() {
			boolean img = logo.isDisplayed();
			Reporter.log("Logo is Dispalyed"+img,true);
		}
		
		//logo2
		public void logo2() {
			boolean img = logo2.isDisplayed();
			Reporter.log("Logo2 is Dispalyed"+img,true);
		}
		
		//logoclick
		public void logoclick() {
			logo.click();
			
		}
		
		//LOGO2click
		public void logo2click() {
			logo2.click();
		}
		
		//findstore
		public void findstore() {
			findstore.click();
			
		}
		
		//help
		public void help() {
			help.click();
			
		}
		
		//joinus
		public void join() 
		{
			joinus.click();
		}
		//signin
		public void signup() {
			signin.click();
		}
		
		//newfeatures
		public void newfeatures() {
			newfeatures.click();
			
		}
		//mens
		public void mens() {
			mens.click();
		}
		
		//womens
		public void womens() {
			womens.click();
		}
		//kids
		public void kids() {
			kids.click();
		}
		//sale
		public void sale() {
			sales.click();
		}
		//snkrs
		public void snkrs() {
			snkrs.click();
		}
		
		//forget
		public void forget() {
			forgetpassword.click();
		}
		
		//keepmesignin
		public void keepmesignin() {
			boolean check = keepmesignin.isEnabled();
			Reporter.log("The checkbox is "+check,true);
		}
		//privacy
		public void privacy() {
			privacy.click();
		}
		//termsofuse
		public void termsofuse() {
			termofuse.click();
		}
		
		//fav
		public void fav() {
			boolean title = fav.isDisplayed();
			Reporter.log("The checkbox is ---"+title,true);
			
		}
		//bag
		public void bag() {
			boolean title = bag.isDisplayed();
			Reporter.log("The checkbox is ----"+title,true);
			
		}
		//search
		public void search() {
			 search.sendKeys("sneakers");
			}
		//instagram
		public void instagram() {
			instagram.click();
		}
		//twitter
		public void twitter() {
			twitter.click();
		}
		//facebook
		public void facebook() {
			facebook.click();
		}
		//youtube
		public void youtube() {
			youtube.click();
		}
		public void findastore() {
			findastore.click();
		}
		public void becameamember() {
			becameamember.click();
		}
		public void sendus(){
			sendus.click();
		}
		public void student() {
			student.click();
		}
		
		
		public void gethelp() {
			gethelp.click();
		}
		
		public void order() {
			order.click();
		}
		public void delivery() {
			delivery.click();
		}
		public void returns() {
			returns.click();
		}
		public void payment() {
			payment.click();
		}
		public void nike() {
			nike.click();
		}
		public void  other() {
			others.click();
		}
	}


