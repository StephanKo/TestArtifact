public class Test {
    @Test
    public void user_can_search_everything_in_google() {
        open("http://google.com/ncr");
        $(By.name("q")).val("selenide").pressEnter();

        $$("#ires .g").shouldHave(size(10));

        $("#ires .g").shouldBe(visible).shouldHave(
                text("Selenide: concise UI tests in Java"),
                text("selenide.org"));
    }
}