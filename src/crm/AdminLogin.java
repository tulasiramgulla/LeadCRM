package crm;


import java.util.Iterator;

import testUtils.Helper;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminLogin extends Helper{
	WebDriver driver ;
	@BeforeMethod
	public void bf(){
		 //help.browser();
		driver = new ChromeDriver();
		 driver.get(config.getProperty("url"));
	}
 /*@Test
  public void create() throws InterruptedException {
	  driver = new FirefoxDriver();
	  driver.get("http://192.168.50.32:8080/leadcrm/login.jsp");
	  /*==========Login with Admin Credentials========
	  help.login(config.getProperty("AdminuserName"), config.getPropert("AdminPass"));
	  //driver.findElement(By.id("username")).sendKeys("srini.sanchana@gmail.com");
	  //driver.findElement(By.id("password")).sendKeys("password");
	  //driver.findElement(By.cssSelector("p.login.button")).submit();
	  
	  /*==========Side Tree Expansion==========
	  
	  driver.findElement(By.cssSelector("span.symbol-close")).click();
	  
	  /*======Clicking on Create button=======
	  
	   driver.findElement(By.id("createUser")).click();
	   Thread.sleep(3000);
	   
	  /*======'Manager' Drop down button presence and its working===== 
	  // driver.findElement(By.name("manager")).click();
	   System.out.println("The drop down is present");
	    List<WebElement> M = driver.findElement(By.name("manager")).findElements(By.tagName("option"));
	  
	  System.out.println(M.size());
	  
	  for(int i=0;i<M.size();i++){
		  
		  M.get(i).click();
		  Thread.sleep(1000);
	 } 
	  
	  /*======'Role' Drop down button presence and its working=====
	   //driver.findElement(By.name("role")).click();
	  System.out.println("The drop down is present");
	   List<WebElement> R = driver.findElement(By.name("role")).findElements(By.tagName("option"));
	   System.out.println(R.size());
	   for(int j=0;j<R.size();j++){
		  R.get(j).click();
		  Thread.sleep(1000);
	  }													
	   
	   /*========= Creation of New User ======
	   driver.findElement(By.name("firstname")).sendKeys("Rakesh Reddy");
	   driver.findElement(By.name("lastname")).sendKeys("basani");
	   driver.findElement(By.name("email")).sendKeys("rakeshbasani@gmail.com");
	   driver.findElement(By.name("empid")).sendKeys("Temp0115");
	   Random r = new Random();
	   int a = r.nextInt(M.size());
	   if (M.get(a).getText().contentEquals("--- SELECT ---")){
		 a++;  
	   }
	   M.get(a).click();
	   System.out.println(M.get(a).getText());
	  Random r1 = new Random();
	   int b = r1.nextInt(R.size());
	   if (R.get(b).getText().contentEquals("--- SELECT ---")){
			 b++;  
		   }
	   R.get(b).click();
	   System.out.println(R.get(b).getText());
	   if(R.get(b).getText().equals("Architect")){
	       driver.findElement(By.id("Service")).click();  
	       driver.findElement(By.className("medium")).sendKeys("data base specialist");
	       sleep(2);
	       driver.findElement(By.id("createbutton")).click(); 
	       sleep(2);
	       Actions ac = new Actions(driver);
	       ac.moveToElement(driver.findElement(By.cssSelector("button.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-icon-only.ui-dialog-titlebar-close"))).build().perform();
	       driver.findElement(By.cssSelector("button.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-icon-only.ui-dialog-titlebar-close")).click();
	  
	         	       
		 List<WebElement> ls= driver.findElement(By.name("service")).findElements(By.tagName("option"));
		  System.out.println(ls.size());
		 Random r2 = new Random();
		 int c = r.nextInt(ls.size());
		 ls.get(c).click();
	   }
		 driver.findElement(By.id("registerbutton")).submit();   
  	}			*/
  @Test
  public void update() throws Exception   {
	 
	  //driver = new FirefoxDriver();
	  //driver.get("http://192.168.50.32:8080/leadcrm/login.jsp");
	  
	  
	  /*==========Login with Admin Credentials========*/
	  System.out.println(config.getProperty("AdminuserName"));
	  sleep(5);
	  help.login(config.getProperty("AdminuserName"), config.getProperty("AdminPass"));
	// driver.findElement(By.id("username")).sendKeys("srini.sanchana@gmail.com");
	// driver.findElement(By.id("password")).sendKeys("password");
	 //driver.findElement(By.cssSelector("p.login.button")).submit();
	  
	  
	  /*==========Side Tree Expansion==========*/
	  sleep(2);
	  driver.findElement(By.cssSelector("span.symbol-close")).click();
	  
	  /*======Clicking on Update button=======*/
	  
	   driver.findElement(By.id("updateUser")).click();
	   //sleep(3);
	   
   /*====== Verifying the Show Entries Drop down ========    */
	   List<WebElement> lw = driver.findElement(By.name("example_length")).findElements(By.tagName("option"));
	   
	   System.out.println(lw.size());
	   for(int i = lw.size()-1;i>=0;i--){
		   lw.get(i).click();
		   sleep(1);
		   int x = Integer.parseInt(lw.get(i).getText());
		   List<WebElement> tr =driver.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		   if(x==(tr.size()))
		   {
			   System.out.println("Value chosen from drop down:"+x);
			   System.out.println("users displayed in list:"+tr.size());
			 
		   }
		  
		 sleep(3);
	   }
	  
	 /*======== Sorting of the diplayed values ========
	   //sleep(3);
	  // driver.findElement(By.className("sorting_asc")).click();
	   List<WebElement> tbody = driver.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
	   System.out.println(tbody.size());
	   ArrayList<Integer> li= new ArrayList<Integer>();
	   for(int m = 0;m<tbody.size();m++){
		   List<WebElement> trr = tbody.get(m).findElements(By.tagName("td"));
		   System.out.println(trr.get(0).getText());
		   String s= trr.get(0).getText();
		 int y = Integer.parseInt(s);
		  li.add(y);
		 }
	   int  temp;
	   for (int k=0; k<li.size(); k++) 
       {
           for (int l=0; l < li.size()-l; l++) {
               if (li.get(l).compareTo(li.get(l+1)) > 0)
               {
                   temp = li.get(l);
                   li.set(l,li.get(l+1) );
                   li.set(l+1, temp);
               }
           }
       }
	   
	   sleep(2);
	   List<WebElement> tbody1 = driver.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
	   System.out.println(tbody1.size());
	   ArrayList<Integer> li1= new ArrayList<Integer>();
	   for(int m1 = 0;m1<tbody1.size();m1++){
		   List<WebElement> trr1 = tbody1.get(m1).findElements(By.tagName("td"));
		   System.out.println(trr1.get(0).getText());
		   String s1= trr1.get(0).getText();
		 int y1 = Integer.parseInt(s1);
		  li1.add(y1);
		 }
	   for(int z=0;z<li.size();z++){
		   if(li.get(z)==li1.get(z)){
			   System.out.println(li.get(z)+"=="+li1.get(z));
		   }
	   
	   }
	   System.out.println("The users are diplayed in the sorted order");    */
	   
	    /*====== Searching for a specific user ========  */
	   driver.findElement(By.tagName("input")).sendKeys("tulasiram");           
	   driver.findElement(By.id("118")).click();
	   List<WebElement> man=driver.findElement(By.name("manager")).findElements(By.tagName("option"));
	   System.out.println(man.size());
	   driver.findElement(By.id("updatebutton")).submit();
	   sleep(2);
	   Actions ac = new Actions(driver);
       ac.moveToElement(driver.findElement(By.cssSelector("button.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-icon-only.ui-dialog-titlebar-close"))).build().perform();
       driver.findElement(By.cssSelector("button.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-icon-only.ui-dialog-titlebar-close")).click();
	   }
  	
  }
	   
		  
	 
  

