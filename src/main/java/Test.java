import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

public class Test {
   public static void main(String[]arg) {
        open("http://google.com/ncr");
        // $(By.name("q")).val("5").pressEnter();

      /*  $$("#ires .g").shouldHave(size(10));

        $("#ires .g").shouldBe(visible).shouldHave(
                text("5: concise UI tests in Java"),
                text("5.org"));
                */
    }
}