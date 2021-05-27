import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLogin {
    WebDriver driver;
    public void testLogin(){}
    //Ddanwg nhap dung chuyen qua trnag tiep
    @Test
    public void testLogin1()throws InterruptedException{
        WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtLogin.sendKeys("thang");
        WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        txtpassword.sendKeys("123456"+Keys.ENTER);
        Thread.sleep(10000);

        String expectURL=driver.getCurrentUrl();
        String actualURL="http://localhost:3000/";
        Assertions.assertEquals(expectURL, actualURL);
  

    
    }
    //Test username password trống
    @Test
    public void testLogin2() throws InterruptedException{
        WebElement btnDangnhap = this.driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        btnDangnhap.click();
        Thread.sleep(1000);
        WebElement txtThongbao = this.driver.findElement(By.xpath("//*[@id=\"errorLogin\"]"));
        Assertions.assertEquals("Tài khoản hoặc mật khẩu không chính xác",txtThongbao.getText());
    }

    //Test username trống , password điền

    @Test
    public void testLogin3() throws InterruptedException{
        WebElement txtpassword = this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        txtpassword.sendKeys("123456");
        WebElement btnDangnhap = this.driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        btnDangnhap.click();
        Thread.sleep(1000);
        WebElement txtThongbao = this.driver.findElement(By.xpath("//*[@id=\"errorLogin\"]"));
        Assertions.assertEquals("Tài khoản hoặc mật khẩu không chính xác",txtThongbao.getText());
    }

    //Test Username điền , password trống

  @Test
    public void testLogin4() throws InterruptedException{
        WebElement txtUsername = this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtUsername.sendKeys("thang");
        WebElement btnDangnhap = this.driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        btnDangnhap.click();
        Thread.sleep(1000);
        WebElement txtThongbao = this.driver.findElement(By.xpath("//*[@id=\"errorLogin\"]"));
        Assertions.assertEquals("Tài khoản hoặc mật khẩu không chính xác",txtThongbao.getText());
    }

    //Đăng nhập với tài khoản đúng mật khẩu sai
    @Test
    public void testLogin5() throws InterruptedException{
        WebElement txtUsername = this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtUsername.sendKeys("thang");
        WebElement btnDangnhap = this.driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        btnDangnhap.click();
        Thread.sleep(1000);
        WebElement txtThongbao = this.driver.findElement(By.xpath("//*[@id=\"errorLogin\"]"));
        Assertions.assertEquals("Tài khoản hoặc mật khẩu không chính xác",txtThongbao.getText());
    }

    //Đăng nhập với tài khoản sai mật khẩu đúng
    @Test
    public void testLogin6() throws InterruptedException{
        WebElement txtpassword = this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        txtpassword.sendKeys("123456");
        WebElement btnDangnhap = this.driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        btnDangnhap.click();
        Thread.sleep(1000);
        WebElement txtThongbao = this.driver.findElement(By.xpath("//*[@id=\"errorLogin\"]"));
        Assertions.assertEquals("Tài khoản hoặc mật khẩu không chính xác",txtThongbao.getText());
    }

    //Đăng nhập với tài khoản mật khẩu sai
    @Test
    public void testLogin7() throws InterruptedException{
        WebElement txtUsername = this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtUsername.sendKeys("thang");
        WebElement txtpassword = this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        txtpassword.sendKeys("2w32");
        WebElement btnDangnhap = this.driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        btnDangnhap.click();
        Thread.sleep(1000);
        WebElement txtThongbao = this.driver.findElement(By.xpath("//*[@id=\"errorLogin\"]"));
        Assertions.assertEquals("Tài khoản hoặc mật khẩu không chính xác",txtThongbao.getText());
    }

    //Test đăng xuất
    @Test
    public void testLogin8()throws InterruptedException{
        WebElement txtLogin=this.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        txtLogin.sendKeys("thang");
        WebElement txtpassword=this.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        txtpassword.sendKeys("123456"+Keys.ENTER);
        Thread.sleep(1000);

        WebElement btnDangxuat = this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/header/div/div/div[1]/span"));
        btnDangxuat.click();
        Thread.sleep(1000);

        WebElement btnDangxuat1 = this.driver.findElement(By.xpath("//*[@id=\"LogOut\"]"));
        btnDangxuat1.click();
        String expectURL=driver.getCurrentUrl();
        String actualURL="http://localhost:3000/login";
        Assertions.assertEquals(expectURL, actualURL);
  

    
    }


    @BeforeEach
    public void setUp() throws InterruptedException{
        //1.Khai baos dudwong dan cho webdrive -> để  sprit có thể tương tác
         //  System.setProperty("", "C:\\Users\\Admin\\OneDrive\\Desktop\\chom90\\chromedriver.exe");
        //2.KHởi tạo driver tương tứng với trìnhg duyệt
        //3. SỬ dụng các phương thức cua webdriver để làm yêu cầu

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\M'penGu\\Desktop\\chom90\\chromedriver.exe");
        this.driver=new ChromeDriver();
        this.driver.get("http://localhost:3000/login");


    }
    @AfterEach
    public void tearDown(){}

}
