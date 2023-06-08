package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SearchContentInOnliner {
    private final String webUrl = "https://www.onliner.by";

    public void openPageOnliner() {
        open(webUrl);
        $(".onliner_logo").shouldBe(visible);
        $("#fast-search").shouldBe(visible);
    }

    public void findProductInSearchLineOfOnliner(String productName) {
        $("input.fast-search__input").setValue(productName);
        switchTo().frame($(".modal-content iframe"));
        $$(".search__content-wrapper .category__title").findBy(text(productName)).click();
        //$("input.search__input").pressEnter();
    }

    public void verifySearchOnOnliner(String productName) {
        $(".schema-header__title").shouldHave(text(productName));
    }
}