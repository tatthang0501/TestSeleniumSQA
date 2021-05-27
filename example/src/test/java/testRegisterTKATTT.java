import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testRegisterTKATTT {
    WebDriver driver;
    public void testRegisterTKATTT(){}

    //Test Click vào đăng ký
    @Test
    public void testResigter1()throws InterruptedException{ 
        WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtLogin.sendKeys("thangATTT");
        WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        txtpassword.sendKeys("123456"+Keys.ENTER);
        Thread.sleep(1000);

        WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
        btnDangKy.click();
        

        String expectURL=driver.getCurrentUrl();
        String actualURL="http://localhost:3000/courseRegister";
        Assertions.assertEquals(expectURL, actualURL);
        
    }


    ////TEST CHỌN HIỂN THỊ DANH SACH LỚP HOC

    //Hiển thị danh sách lớp học môn An toàn và bảo mật hệ thống cơ
    @Test
    public void testResigter2() throws InterruptedException{

        WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtLogin.sendKeys("thangATTT");
        WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        txtpassword.sendKeys("123456"+Keys.ENTER);
        Thread.sleep(1000);

        WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
        btnDangKy.click();

        Actions action=new Actions(this.driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
        WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
        mhNMCNPM.click();
        Thread.sleep(1000);


         // kiem tra
         WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[3]"));
         WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[2]/td[3]"));
         WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[3]/td[3]"));
         WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[4]/td[3]"));
         WebElement viewtenmh4 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[5]/td[3]"));
         Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh.getText());
         Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh1.getText());
         Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh2.getText());
         Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh3.getText());
         Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh4.getText());
    }

    //Hiển thị danh sách lớp học môn Bảo mật cơ sở dữ liệu
    @Test
    public void testResigter3() throws InterruptedException{

        WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtLogin.sendKeys("thangATTT");
        WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        txtpassword.sendKeys("123456"+Keys.ENTER);
        Thread.sleep(1000);

        WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
        btnDangKy.click();

        Actions action=new Actions(this.driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
        WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
        mhNMCNPM.click();
        Thread.sleep(1000);


         // kiem tra
         WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[3]"));
         WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[2]/td[3]"));
         WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[3]/td[3]"));
         WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[4]/td[3]"));
         WebElement viewtenmh4 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[5]/td[3]"));
         Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh.getText());
         Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh1.getText());
         Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh2.getText());
         Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh3.getText());
         Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh4.getText());
    }
    

    //Hiển thị danh sách lớp học môn Ngăn chặn tấn công SQL Injecti
    @Test
    public void testResigter4() throws InterruptedException{

        WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtLogin.sendKeys("thangATTT");
        WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        txtpassword.sendKeys("123456"+Keys.ENTER);
        Thread.sleep(1000);

        WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
        btnDangKy.click();

        Actions action=new Actions(this.driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
        WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
        mhNMCNPM.click();
        Thread.sleep(1000);


         // kiem tra
         WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[3]"));
         WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[2]/td[3]"));
         WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[3]/td[3]"));
         WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[4]/td[3]"));
         WebElement viewtenmh4 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[5]/td[3]"));
         Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh.getText());
         Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh1.getText());
         Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh2.getText());
         Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh3.getText());
         Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh4.getText());
    }
    

    //Hiển thị danh sách lớp học môn DDOS và các vấn đề liên quan
    @Test
    public void testResigter6() throws InterruptedException{

        WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtLogin.sendKeys("thangATTT");
        WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        txtpassword.sendKeys("123456"+Keys.ENTER);
        Thread.sleep(1000);

        WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
        btnDangKy.click();

        Actions action=new Actions(this.driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
        WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[4]"));
        mhNMCNPM.click();
        Thread.sleep(1000);


         // kiem tra
         WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[3]"));
         WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[2]/td[3]"));
         WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[3]/td[3]"));
         WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[4]/td[3]"));
         WebElement viewtenmh4 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[5]/td[3]"));
         Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh.getText());
         Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh1.getText());
         Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh2.getText());
         Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh3.getText());
         Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh4.getText());
    }
    
       //Hiển thị dữ liệu môn 	Tìm hiểu và xử lý lỗ hổng hệ t
       @Test
       public void testResigter5() throws InterruptedException{
   
           WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
           txtLogin.sendKeys("thangATTT");
           WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
           txtpassword.sendKeys("123456"+Keys.ENTER);
           Thread.sleep(1000);
   
           WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
           btnDangKy.click();
   
           Actions action=new Actions(this.driver);
           action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
           WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[5]"));
           mhNMCNPM.click();
           Thread.sleep(1000);
   
   
            // kiem tra
            WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[3]"));
            WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[2]/td[3]"));
            WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[3]/td[3]"));
            WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[4]/td[3]"));
            WebElement viewtenmh4 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[5]/td[3]"));
            Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh.getText());
            Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh1.getText());
            Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh2.getText());
            Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh3.getText());
            Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh4.getText());
       }
       

////TEST CHỌN HIỂN THỊ DANH SACH Môn học chuẩn bị đăng ký

       //Test An toàn và bảo mật hệ thống cơ chọn 1
       @Test
       public void testResigter8() throws InterruptedException{
   
       WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
       txtLogin.sendKeys("thangATTT");
       WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
       txtpassword.sendKeys("123456"+Keys.ENTER);
       Thread.sleep(1000);
   
       WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
       btnDangKy.click();
   
       Actions action=new Actions(this.driver);
       action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
       WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
       mhNMCNPM.click();
       Thread.sleep(1000);
   
        //chọn nhóm môn học
        
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
        WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
       mhNMCNPM01.click();
       Thread.sleep(1000);
   
        // kiem tra
        WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
       Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh.getText());
   }
   
       //Môn An toàn và bảo mật hệ thống cơ chọn tất cả
    @Test
    public void testResigter7() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thangATTT");
    WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
    txtpassword.sendKeys("123456"+Keys.ENTER);
    Thread.sleep(1000);

    WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
    btnDangKy.click();

    Actions action=new Actions(this.driver);
    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
    WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
    mhNMCNPM.click();
    Thread.sleep(1000);

     //chọn nhóm môn học
     
     action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
    mhNMCNPM01.click();
    WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM02.click();
    WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
    mhNMCNPM03.click();
    WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[4]/td[1]/input"));
    mhNMCNPM04.click();
    WebElement mhNMCNPM05 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[5]/td[1]/input"));
    mhNMCNPM05.click();
    Thread.sleep(1000);

     // kiem tra
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
     WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
     WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
     WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
     WebElement viewtenmh4 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[5]/td[3]"));
     Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh.getText());
     Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh1.getText());
     Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh2.getText());
     Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh3.getText());
     Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh4.getText());
}


  //Test Bảo mật cơ sở dữ liệu chọn 1
  @Test
  public void testResigter9() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangATTT");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học
   
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM01.click();
  Thread.sleep(1000);

   // kiem tra
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
  Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh.getText());
}


 //Test Ngăn chặn tấn công SQL Injecti chọn 1
 @Test
 public void testResigter10() throws InterruptedException{

 WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
 txtLogin.sendKeys("thangATTT");
 WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
 txtpassword.sendKeys("123456"+Keys.ENTER);
 Thread.sleep(1000);

 WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
 btnDangKy.click();

 Actions action=new Actions(this.driver);
 action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
 WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
 mhNMCNPM.click();
 Thread.sleep(1000);

  //chọn nhóm môn học
  
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
  WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
 mhNMCNPM01.click();
 Thread.sleep(1000);

  // kiem tra
  WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
 Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh.getText());
}

//Test DDOS và các vấn đề liên quan chọn 1
@Test
public void testResigter11() throws InterruptedException{

WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
txtLogin.sendKeys("thangATTT");
WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
txtpassword.sendKeys("123456"+Keys.ENTER);
Thread.sleep(1000);

WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
btnDangKy.click();

Actions action=new Actions(this.driver);
action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[4]"));
mhNMCNPM.click();
Thread.sleep(1000);

 //chọn nhóm môn học
 
 action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
 WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
mhNMCNPM01.click();
Thread.sleep(1000);

 // kiem tra
 WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh.getText());
}


//Test Tìm hiểu và xử lý lỗ hổng hệ t chọn 1
@Test
public void testResigter12() throws InterruptedException{

WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
txtLogin.sendKeys("thangATTT");
WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
txtpassword.sendKeys("123456"+Keys.ENTER);
Thread.sleep(1000);

WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
btnDangKy.click();

Actions action=new Actions(this.driver);
action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[5]"));
mhNMCNPM.click();
Thread.sleep(1000);

 //chọn nhóm môn học
 
 action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
 WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
mhNMCNPM01.click();
Thread.sleep(1000);

 // kiem tra
 WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh.getText());
}


     //Môn 	Bảo mật cơ sở dữ liệu chọn tất cả
     @Test
     public void testResigter13() throws InterruptedException{
 
     WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
     txtLogin.sendKeys("thangATTT");
     WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
     txtpassword.sendKeys("123456"+Keys.ENTER);
     Thread.sleep(1000);
 
     WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
     btnDangKy.click();
 
     Actions action=new Actions(this.driver);
     action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
     WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
     mhNMCNPM.click();
     Thread.sleep(1000);
 
      //chọn nhóm môn học
      
      action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
      WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
     mhNMCNPM01.click();
     WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
     mhNMCNPM02.click();
     WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
     mhNMCNPM03.click();
     WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[4]/td[1]/input"));
     mhNMCNPM04.click();
     WebElement mhNMCNPM05 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[5]/td[1]/input"));
     mhNMCNPM05.click();
     Thread.sleep(1000);
 
      // kiem tra
      WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
      WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
      WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
      WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
      WebElement viewtenmh4 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[5]/td[3]"));
      Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh.getText());
      Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh1.getText());
      Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh2.getText());
      Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh3.getText());
      Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh4.getText());
 }

 
     //Môn 	Ngăn chặn tấn công SQL Injecti chọn tất cả
     @Test
     public void testResigter14() throws InterruptedException{
 
     WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
     txtLogin.sendKeys("thangATTT");
     WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
     txtpassword.sendKeys("123456"+Keys.ENTER);
     Thread.sleep(1000);
 
     WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
     btnDangKy.click();
 
     Actions action=new Actions(this.driver);
     action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
     WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
     mhNMCNPM.click();
     Thread.sleep(1000);
 
      //chọn nhóm môn học
      
      action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
      WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
     mhNMCNPM01.click();
     WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
     mhNMCNPM02.click();
     WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
     mhNMCNPM03.click();
     WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[4]/td[1]/input"));
     mhNMCNPM04.click();
     WebElement mhNMCNPM05 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[5]/td[1]/input"));
     mhNMCNPM05.click();
     Thread.sleep(1000);
 
      // kiem tra
      WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
      WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
      WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
      WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
      WebElement viewtenmh4 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[5]/td[3]"));
      Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh.getText());
      Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh1.getText());
      Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh2.getText());
      Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh3.getText());
      Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh4.getText());
 }

 
     //Môn 	DDOS và các vấn đề liên quan chọn tất cả
     @Test
     public void testResigter15() throws InterruptedException{
 
     WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
     txtLogin.sendKeys("thangATTT");
     WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
     txtpassword.sendKeys("123456"+Keys.ENTER);
     Thread.sleep(1000);
 
     WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
     btnDangKy.click();
 
     Actions action=new Actions(this.driver);
     action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
     WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[4]"));
     mhNMCNPM.click();
     Thread.sleep(1000);
 
      //chọn nhóm môn học
      
      action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
      WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
     mhNMCNPM01.click();
     WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
     mhNMCNPM02.click();
     WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
     mhNMCNPM03.click();
     WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[4]/td[1]/input"));
     mhNMCNPM04.click();
     WebElement mhNMCNPM05 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[5]/td[1]/input"));
     mhNMCNPM05.click();
     Thread.sleep(1000);
 
      // kiem tra
      WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
      WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
      WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
      WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
      WebElement viewtenmh4 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[5]/td[3]"));
      Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh.getText());
      Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh1.getText());
      Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh2.getText());
      Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh3.getText());
      Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh4.getText());
 }

 
     //Môn 	Tìm hiểu và xử lý lỗ hổng hệ t chọn tất cả
     @Test
     public void testResigter16() throws InterruptedException{
 
     WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
     txtLogin.sendKeys("thangATTT");
     WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
     txtpassword.sendKeys("123456"+Keys.ENTER);
     Thread.sleep(1000);
 
     WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
     btnDangKy.click();
 
     Actions action=new Actions(this.driver);
     action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
     WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[5]"));
     mhNMCNPM.click();
     Thread.sleep(1000);
 
      //chọn nhóm môn học
      
      action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
      WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
     mhNMCNPM01.click();
     WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
     mhNMCNPM02.click();
     WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
     mhNMCNPM03.click();
     WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[4]/td[1]/input"));
     mhNMCNPM04.click();
     WebElement mhNMCNPM05 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[5]/td[1]/input"));
     mhNMCNPM05.click();
     Thread.sleep(1000);
 
      // kiem tra
      WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
      WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
      WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
      WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
      WebElement viewtenmh4 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[5]/td[3]"));
      Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh.getText());
      Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh1.getText());
      Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh2.getText());
      Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh3.getText());
      Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh4.getText());
 }
 
////////LƯU ĐĂNG KÝ CÁC MÔN ĐÃ CHỌN

//LƯU 1 Môn

//Môn An toàn và bảo mật hệ thống cơ
@Test
public void testResigter23() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM01.click();
  Thread.sleep(1000);
  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh.getText());
}

//Môn Bảo mật cơ sở dữ liệu
@Test
public void testResigter24() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM01.click();
  Thread.sleep(1000);
  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh.getText());
}

//Ngăn chặn tấn công SQL Injecti
@Test
public void testResigter25() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM01.click();
  Thread.sleep(1000);
  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh.getText());
}

//DDOS và các vấn đề liên quan
@Test
public void testResigter26() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[4]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM01.click();
  Thread.sleep(1000);
  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh.getText());
}

//Tìm hiểu và xử lý lỗ hổng hệ t
@Test
public void testResigter27() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[5]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM01.click();
  Thread.sleep(1000);
  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh.getText());
}

/// TEST LƯU NHIỀU MÔN CÙNG 1 LỚP



    //Môn An toàn và bảo mật hệ thống cơ
@Test
public void testResigter28() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
   WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
   WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
   WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[4]/td[1]/input"));
  mhNMCNPM01.click();
  mhNMCNPM02.click();
  mhNMCNPM03.click();
  mhNMCNPM04.click();
  Thread.sleep(1000);
  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
   WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
   WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
   Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh.getText());
   Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh1.getText());
   Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh2.getText());
   Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh3.getText());
}


    //Môn An toàn và bảo mật hệ thống cơ
    @Test
    public void testResigter29() throws InterruptedException{
    
      WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
      txtLogin.sendKeys("thangCNTT2");
      WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
      txtpassword.sendKeys("123456"+Keys.ENTER);
      Thread.sleep(1000);
    
      WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
      btnDangKy.click();
    
      Actions action=new Actions(this.driver);
      action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
      WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
      mhNMCNPM.click();
      Thread.sleep(1000);
    
       //chọn nhóm môn học 
       
       action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
       WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
       WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
       WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
       WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[4]/td[1]/input"));
      mhNMCNPM01.click();
      mhNMCNPM02.click();
      mhNMCNPM03.click();
      mhNMCNPM04.click();
      Thread.sleep(1000);
      //Lưu 
    
      WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
      save.click();
      Thread.sleep(1000);
    
      //XÁc nhận lưu
      WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
      saveAp.click();
      Thread.sleep(2000);
    
      WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
      btnDangKy1.click();
      Thread.sleep(2000);
     
       // kiem tra 
       WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
       WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
       WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
       WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
       Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh.getText());
       Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh1.getText());
       Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh2.getText());
       Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh3.getText());
    }
    
//Môn Ngăn chặn tấn công SQL Injecti
@Test
public void testResigter30() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
   WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
   WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
   WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[4]/td[1]/input"));
  mhNMCNPM01.click();
  mhNMCNPM02.click();
  mhNMCNPM03.click();
  mhNMCNPM04.click();
  Thread.sleep(1000);
  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
   WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
   WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
   Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh.getText());
   Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh1.getText());
   Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh2.getText());
   Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh3.getText());
}

//Môn DDOS và các vấn đề liên quan
@Test
public void testResigter31() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[4]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
   WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
   WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
   WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[4]/td[1]/input"));
  mhNMCNPM01.click();
  mhNMCNPM02.click();
  mhNMCNPM03.click();
  mhNMCNPM04.click();
  Thread.sleep(1000);
  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
   WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
   WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
   Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh.getText());
   Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh1.getText());
   Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh2.getText());
   Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh3.getText());
}


//Môn 	Tìm hiểu và xử lý lỗ hổng hệ t
@Test
public void testResigter32() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[5]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
   WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
   WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
   WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[4]/td[1]/input"));
  mhNMCNPM01.click();
  mhNMCNPM02.click();
  mhNMCNPM03.click();
  mhNMCNPM04.click();
  Thread.sleep(1000);
  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
   WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
   WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
   Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh.getText());
   Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh1.getText());
   Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh2.getText());
   Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh3.getText());
}


///TEST LƯU NHIỀU MÔN CÙNG NHIỀU LỚP

//Test 2 môn khác nhau
@Test
public void testResigter33() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM01.click();
  Thread.sleep(1000);

  WebElement mhNMCNPM2=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
  mhNMCNPM2.click();
  Thread.sleep(1000);
  WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM02.click();
  Thread.sleep(1000);


  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
   Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh.getText());
   Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh1.getText());
}


//Test 3 môn khác nhau
@Test
public void testResigter34() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM01.click();
  Thread.sleep(1000);

  WebElement mhNMCNPM2=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
  mhNMCNPM2.click();
  Thread.sleep(1000);
  WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM02.click();
  Thread.sleep(1000);

  WebElement mhNMCNPM4=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
  mhNMCNPM4.click();
  Thread.sleep(1000);
  WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM04.click();
  Thread.sleep(1000);

  


  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
   WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
   Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh.getText());
   Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh1.getText());
   Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh2.getText());
}


//Test 4 môn khac nhau

@Test
public void testResigter35() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM01.click();
  Thread.sleep(1000);

  WebElement mhNMCNPM2=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
  mhNMCNPM2.click();
  Thread.sleep(1000);
  WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM02.click();
  Thread.sleep(1000);

  WebElement mhNMCNPM4=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
  mhNMCNPM4.click();
  Thread.sleep(1000);
  WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM04.click();
  Thread.sleep(1000);
  WebElement mhNMCNPM3=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[4]"));
  mhNMCNPM3.click();
  Thread.sleep(1000);
  WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM03.click();
  Thread.sleep(1000);

  


  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
   WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
   WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
   Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh.getText());
   Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh1.getText());
   Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh2.getText());
   Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh3.getText());
}


//Test 5 môn khác nhau

@Test
public void testResigter36() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNTT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM01.click();
  Thread.sleep(1000);

  WebElement mhNMCNPM2=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
  mhNMCNPM2.click();
  Thread.sleep(1000);
  WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM02.click();
  Thread.sleep(1000);

  WebElement mhNMCNPM4=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
  mhNMCNPM4.click();
  Thread.sleep(1000);
  WebElement mhNMCNPM04 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM04.click();
  Thread.sleep(1000);

  WebElement mhNMCNPM3=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[4]"));
  mhNMCNPM3.click();
  Thread.sleep(1000);
  WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM03.click();
  Thread.sleep(1000);
  
  WebElement mhNMCNPM5=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[5]"));
  mhNMCNPM5.click();
  Thread.sleep(1000);
  WebElement mhNMCNPM05 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
  mhNMCNPM05.click();
  Thread.sleep(1000);


  //Lưu 

  WebElement save = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div[4]/button"));
  save.click();
  Thread.sleep(1000);

  //XÁc nhận lưu
  WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[2]"));
  saveAp.click();
  Thread.sleep(2000);

  WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy1.click();
  Thread.sleep(2000);
 
   // kiem tra 
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
   WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
   WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
   WebElement viewtenmh3 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
   WebElement viewtenmh4 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[5]/td[3]"));
   Assertions.assertEquals("An toàn và bảo mật hệ thống cơ",viewtenmh.getText());
   Assertions.assertEquals("Bảo mật cơ sở dữ liệu",viewtenmh1.getText());
   Assertions.assertEquals("Ngăn chặn tấn công SQL Injecti",viewtenmh2.getText());
   Assertions.assertEquals("DDOS và các vấn đề liên quan",viewtenmh3.getText());
   Assertions.assertEquals("Tìm hiểu và xử lý lỗ hổng hệ t",viewtenmh4.getText());
}





































    @BeforeEach
    public void setUp1() throws InterruptedException{
        //1.Khai baos dudwong dan cho webdrive -> để  sprit có thể tương tác
         //  System.setProperty("", "C:\\Users\\Admin\\OneDrive\\Desktop\\chom90\\chromedriver.exe");
        //2.KHởi tạo driver tương tứng với trìnhg duyệt
        //3. SỬ dụng các phương thức cua webdriver để làm yêu cầu

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M'penGu\\Desktop\\chom90\\chromedriver.exe");
        this.driver=new ChromeDriver();
        this.driver.get("http://localhost:3000/");


    }
    @AfterEach
    public void tearDown1(){
        //this.driver.quit();
    }
}
