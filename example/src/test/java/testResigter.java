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

public class testResigter {
    WebDriver driver;
    public void testResigter(){}


    //Test Click vào đăng ký
    @Test
    public void testResigter1()throws InterruptedException{ 
        WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtLogin.sendKeys("thang");
        WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        txtpassword.sendKeys("123456"+Keys.ENTER);
        Thread.sleep(1000);

        WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
        btnDangKy.click();
        

        String expectURL=driver.getCurrentUrl();
        String actualURL="http://localhost:3000/courseRegister";
        Assertions.assertEquals(expectURL, actualURL);
        
    }

    ////TEST CHỌN HIỂN THỊ 1 MÔN
    //Chọn môn học nhập môn công nghệ phần mềm  lớp id=1
    @Test
    public void testResigter2() throws InterruptedException{

        WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtLogin.sendKeys("thang");
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
         Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
    }

     //Chọn môn học nhập môn công nghệ phần mềm  lớp id=2
     @Test
     public void testResigter3() throws InterruptedException{
 
         WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
         txtLogin.sendKeys("thang");
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
          WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[2]/td[1]/input"));
         mhNMCNPM01.click();
         Thread.sleep(1000);
 
          // kiem tra
          WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
          Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
     }

      //Chọn môn học nhập môn công nghệ phần mềm  lớp id=3
      @Test
      public void testResigter4() throws InterruptedException{
  
          WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
          txtLogin.sendKeys("thang");
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
           WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[3]/td[1]/input"));
          mhNMCNPM01.click();
          Thread.sleep(1000);
  
           // kiem tra
           WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
           Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
      }

      //Chọn môn học nhập môn công nghệ phần mềm  lớp id=4
      @Test
      public void testResigter5() throws InterruptedException{
  
          WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
          txtLogin.sendKeys("thang");
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
           WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[4]/td[1]/input"));
          mhNMCNPM01.click();
          Thread.sleep(1000);
  
           // kiem tra
           WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
           Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
      }


      //Chọn môn học nhập môn công nghệ phần mềm  lớp id=5
      @Test
      public void testResigter6() throws InterruptedException{
  
          WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
          txtLogin.sendKeys("thang");
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
           WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[5]/td[1]/input"));
          mhNMCNPM01.click();
          Thread.sleep(1000);
  
           // kiem tra
           WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
           Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
      }


 //Chọn môn học các hệ thông phân tán  lớp id=6
 @Test
 public void testResigter7() throws InterruptedException{

     WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
     txtLogin.sendKeys("thang");
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
      WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[1]/input"));
     mhNMCNPM01.click();
     Thread.sleep(1000);

      // kiem tra
      WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
      Assertions.assertEquals("Các hệ thống phân tán",viewtenmh.getText());
 }


//Chọn môn học Các hệ thống phân tán  lớp id=7
@Test
public void testResigter8() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thang");
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
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM01.click();
    Thread.sleep(1000);

     // kiem tra
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
     Assertions.assertEquals("Các hệ thống phân tán",viewtenmh.getText());
}

//Chọn môn học Các hệ thống phân tán  lớp id=8
@Test
public void testResigter9() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thang");
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
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[3]/td[1]/input"));
    mhNMCNPM01.click();
    Thread.sleep(1000);

     // kiem tra
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
     Assertions.assertEquals("Các hệ thống phân tán",viewtenmh.getText());
}
//Môn học Cơ sở dữ liệu phân tán
//Chọn  lớp id=11
@Test
public void testResigter10() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thang");
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
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[1]/input"));
    mhNMCNPM01.click();
    Thread.sleep(1000);

     // kiem tra
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
     Assertions.assertEquals("Cơ sở dữ liệu phân tán",viewtenmh.getText());
}

//Chọn  lớp id=12
@Test
public void testResigter11() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thang");
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
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM01.click();
    Thread.sleep(1000);

     // kiem tra
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
     Assertions.assertEquals("Cơ sở dữ liệu phân tán",viewtenmh.getText());
}


//Chọn  lớp id=13
@Test
public void testResigter12() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thang");
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
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[3]/td[1]/input"));
    mhNMCNPM01.click();
    Thread.sleep(1000);

     // kiem tra
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
     Assertions.assertEquals("Cơ sở dữ liệu phân tán",viewtenmh.getText());
}

//Chuyên đề công nghệ phần mềm
//Chọn  lớp id=16
@Test
public void testResigter13() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thang");
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
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[1]/input"));
    mhNMCNPM01.click();
    Thread.sleep(1000);

     // kiem tra
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
     Assertions.assertEquals("Chuyên đề công nghệ phần mềm",viewtenmh.getText());
}

//Lập trình hệ thống nhúng

//Chọn  lớp id=21
@Test
public void testResigter14() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thang");
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
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[1]/input"));
    mhNMCNPM01.click();
    Thread.sleep(1000);

     // kiem tra
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
     Assertions.assertEquals("Lập trình hệ thống nhúng",viewtenmh.getText());
}
//	Nhập môn trí tuệ nhân tạo

//Chọn  lớp id=26
@Test
public void testResigter15() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thang");
    WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
    txtpassword.sendKeys("123456"+Keys.ENTER);
    Thread.sleep(1000);

    WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
    btnDangKy.click();

    Actions action=new Actions(this.driver);
    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
    WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[6]"));
    mhNMCNPM.click();
    Thread.sleep(1000);

     //chọn nhóm môn học
     
     action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[1]/input"));
    mhNMCNPM01.click();
    Thread.sleep(1000);

     // kiem tra
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
     Assertions.assertEquals("Nhập môn trí tuệ nhân tạo",viewtenmh.getText());
}
//	Nhập môn tương tác người - máy

//Chọn  lớp id=31
@Test
public void testResigter16() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thang");
    WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
    txtpassword.sendKeys("123456"+Keys.ENTER);
    Thread.sleep(1000);

    WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
    btnDangKy.click();

    Actions action=new Actions(this.driver);
    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
    WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[7]"));
    mhNMCNPM.click();
    Thread.sleep(1000);

     //chọn nhóm môn học
     
     action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[1]/input"));
    mhNMCNPM01.click();
    Thread.sleep(1000);

     // kiem tra
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
     Assertions.assertEquals("Nhập môn tương tác người - máy",viewtenmh.getText());
}

//		Cơ sở dữ liệu phân tán

//Chọn  lớp id=36
@Test
public void testResigter17() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thang");
    WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
    txtpassword.sendKeys("123456"+Keys.ENTER);
    Thread.sleep(1000);

    WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
    btnDangKy.click();

    Actions action=new Actions(this.driver);
    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
    WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[8]"));
    mhNMCNPM.click();
    Thread.sleep(1000);

     //chọn nhóm môn học
     
     action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("//*[@id=\"listClass\"]/table/tbody/tr[1]/td[1]/input"));
    mhNMCNPM01.click();
    Thread.sleep(1000);

     // kiem tra
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
     Assertions.assertEquals("Cơ sở dữ liệu phân tán",viewtenmh.getText());
}



 ////TEST CHỌN HIỂN THỊ 2 MÔN

 //2 môn khác nhau
 @Test
 public void testResigter18() throws InterruptedException{

     WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
     txtLogin.sendKeys("thang");
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

     WebElement mhNMCNPM1=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
     mhNMCNPM1.click();
     Thread.sleep(1000);
     WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
     mhNMCNPM02.click();
     Thread.sleep(1000);

      // kiem tra
      WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
      WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
      Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
      Assertions.assertEquals("Các hệ thống phân tán",viewtenmh1.getText());
 }
 
 //2 môn trùng nhau
 @Test
 public void testResigter19() throws InterruptedException{

     WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
     txtLogin.sendKeys("thang");
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
     WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
     mhNMCNPM02.click();
     Thread.sleep(1000);

      // kiem tra
      WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
      WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
      Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
      Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh1.getText());
 }

  //3 môn khác nhau
  @Test
  public void testResigter20() throws InterruptedException{
 
      WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
      txtLogin.sendKeys("thang");
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
 
      WebElement mhNMCNPM1=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
      mhNMCNPM1.click();
      Thread.sleep(1000);
      WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
      mhNMCNPM02.click();
      Thread.sleep(1000);

      WebElement mhNMCNPM2=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
      mhNMCNPM2.click();
      Thread.sleep(1000);
      WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[1]/td[1]/input"));
      mhNMCNPM03.click();
      Thread.sleep(1000);
 
       // kiem tra
       WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
       WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
       WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
       Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
       Assertions.assertEquals("Các hệ thống phân tán",viewtenmh1.getText());
       Assertions.assertEquals("Cơ sở dữ liệu phân tán",viewtenmh2.getText());
  }
  
  //3 môn trùng nhau
  @Test
  public void testResigter21() throws InterruptedException{
 
      WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
      txtLogin.sendKeys("thang");
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
      WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
      mhNMCNPM02.click();
      Thread.sleep(1000);
      WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
      mhNMCNPM03.click();
      Thread.sleep(1000);
 
       // kiem tra
       WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
       WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
       WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
       Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
       Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh1.getText());
       Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh2.getText());
  }
  

 //3 môn Với id bất kì
 @Test
  public void testResigter22() throws InterruptedException{
 
      WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
      txtLogin.sendKeys("thang");
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
       WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
      mhNMCNPM01.click();
      Thread.sleep(1000);
 
      WebElement mhNMCNPM1=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
      mhNMCNPM1.click();
      Thread.sleep(1000);
      WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[4]/td[1]/input"));
      mhNMCNPM02.click();
      Thread.sleep(1000);

      WebElement mhNMCNPM2=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
      mhNMCNPM2.click();
      Thread.sleep(1000);
      WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
      mhNMCNPM03.click();
      Thread.sleep(1000);
 
       // kiem tra
       WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
       WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
       WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
       Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
       Assertions.assertEquals("Các hệ thống phân tán",viewtenmh1.getText());
       Assertions.assertEquals("Cơ sở dữ liệu phân tán",viewtenmh2.getText());
  }
  ////
  //LƯU ĐĂNG KÝ
  ////
  //LƯU 1 Môn
  @Test
  public void testResigter23() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thangCNDPT2");
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
     Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
}
 //Huỷ bỏ 
 @Test
 public void testResigter24() throws InterruptedException{

   WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
   txtLogin.sendKeys("thangCNDPT2");
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

   //Huỷ bỏ
   WebElement saveAp = this.driver.findElement(By.xpath("//*[@id=\"Save\"]/div/div[2]/button[1]"));
   saveAp.click();
   Thread.sleep(2000);

   WebElement btnDangKy1=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
   btnDangKy1.click();
   Thread.sleep(2000);
  
    // kiem tra 
    WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr/td[3]"));
    Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
}


  //LƯU 2 kip cung mon hco
  @Test 
  public void testResigter25() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thangCNDPT2");
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
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM01.click();
    WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
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
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
     WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
     Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
     Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh1.getText());
}


  //Xoá 2 kip đã đăng ký
  @Test 
  public void testResigter26() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thangCNDPT2");
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
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM01.click();
    WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[3]/td[1]/input"));
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
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
     WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
     Assertions.assertEquals("",viewtenmh.getText());
     Assertions.assertEquals("",viewtenmh1.getText());
}

  //LƯU 2 kip khac hco
  @Test 
  public void testResigter27() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thangCNDPT2");
    WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
    txtpassword.sendKeys("123456"+Keys.ENTER);
    Thread.sleep(1000);

    WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
    btnDangKy.click();

    Actions action=new Actions(this.driver);
    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
    //Mon hoc 1
    WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
    mhNMCNPM.click();
    Thread.sleep(1000);

     //chọn nhóm môn học 
     
     action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM01.click();

    //Môn học 2
    WebElement mhNMCNPM1=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
    mhNMCNPM1.click();
    Thread.sleep(1000);

     //chọn nhóm môn học 
     
     WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM02.click();


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
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
     WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
     Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
     Assertions.assertEquals("Các hệ thống phân tán",viewtenmh1.getText());
}
    //Huỷ 2 kíp học khác nhau

  @Test 
  public void testResigter28() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thangCNDPT2");
    WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
    txtpassword.sendKeys("123456"+Keys.ENTER);
    Thread.sleep(1000);

    WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
    btnDangKy.click();

    Actions action=new Actions(this.driver);
    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
    //Mon hoc 1
    WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
    mhNMCNPM.click();
    Thread.sleep(1000);

     //chọn nhóm môn học 
     
     action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM01.click();

    //Môn học 2
    WebElement mhNMCNPM1=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
    mhNMCNPM1.click();
    Thread.sleep(1000);

     //chọn nhóm môn học 
     
     WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM02.click();


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
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
     WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
     Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
     Assertions.assertEquals("Các hệ thống phân tán",viewtenmh1.getText());
}

    //Lưu nhiều hơn 2 kíp học và nhiều hơn 2 môn học
  @Test 
  public void testResigter29() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thangCNDPT2");
    WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
    txtpassword.sendKeys("123456"+Keys.ENTER);
    Thread.sleep(1000);

    WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
    btnDangKy.click();

    Actions action=new Actions(this.driver);
    action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
    //Mon hoc 1
    WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
    mhNMCNPM.click();
    Thread.sleep(1000);

     //chọn nhóm môn học 
     
     action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
     WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM01.click();

    //Môn học 2
    WebElement mhNMCNPM1=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
    mhNMCNPM1.click();
    Thread.sleep(1000);

     //chọn nhóm môn học 
     
     WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM02.click();

    //Môn học 3
    WebElement mhNMCNPM2=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
    mhNMCNPM2.click();
    Thread.sleep(1000);

     //chọn nhóm môn học 
     
     WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
    mhNMCNPM03.click();


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
     WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
     WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
     WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
     Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
     Assertions.assertEquals("Các hệ thống phân tán",viewtenmh1.getText());
     Assertions.assertEquals("Cơ sở dữ liệu phân tán",viewtenmh2.getText());
}

//Xoá nhiều hơn 2 kíp học và nhiều hơn 2 môn học
@Test 
public void testResigter30() throws InterruptedException{

  WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
  txtLogin.sendKeys("thangCNDPT2");
  WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
  txtpassword.sendKeys("123456"+Keys.ENTER);
  Thread.sleep(1000);

  WebElement btnDangKy=this.driver.findElement(By.xpath("//*[@id=\"DangKyMon\"]"));
  btnDangKy.click();

  Actions action=new Actions(this.driver);
  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]"))).perform();
  //Mon hoc 1
  WebElement mhNMCNPM=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[1]"));
  mhNMCNPM.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"listClass\"]"))).perform();
   WebElement mhNMCNPM01 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
  mhNMCNPM01.click();

  //Môn học 2
  WebElement mhNMCNPM1=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[2]"));
  mhNMCNPM1.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
  mhNMCNPM02.click();

  //Môn học 3
  WebElement mhNMCNPM2=this.driver.findElement(By.xpath("//*[@id=\"listMonHoc\"]/button[3]"));
  mhNMCNPM2.click();
  Thread.sleep(1000);

   //chọn nhóm môn học 
   
   WebElement mhNMCNPM03 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[2]/td[1]/input"));
  mhNMCNPM03.click();


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
   WebElement viewtenmh = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[2]/td[3]"));
   WebElement viewtenmh1 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[3]/td[3]"));
   WebElement viewtenmh2 = this.driver.findElement(By.xpath("//*[@id=\"listSubed\"]/div/table/tbody/tr[4]/td[3]"));
   Assertions.assertEquals("Nhập môn công nghệ phần mềm",viewtenmh.getText());
   Assertions.assertEquals("Các hệ thống phân tán",viewtenmh1.getText());
   Assertions.assertEquals("Cơ sở dữ liệu phân tán",viewtenmh2.getText());
}


 //Test Trùng
 @Test

 public void testResigter31() throws InterruptedException{

    WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
    txtLogin.sendKeys("thangCNDPT2");
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

    WebElement mhNMCNPM02 = this.driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[2]/table/tbody/tr[5]/td[1]/input"));
    mhNMCNPM02.click();
    Thread.sleep(1000);
    //Lưu 
   
     // kiem tra 
     WebElement viewtenmh = this.driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/span[2]"));
     Assertions.assertEquals("Có lớp học phần bị trùng, vui lòng thử lại",viewtenmh.getText());
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
        this.driver.quit();
    }

}