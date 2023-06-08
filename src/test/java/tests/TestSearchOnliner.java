package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestSearchOnliner extends TestBase {

    @ValueSource(
            strings = {"Холодильники", "Мобильные телефоны"}
    )
    @ParameterizedTest(name = "Search {0} on onliner")
    @Tag("Searching")
    void successSearchInOlninerByValueSource(String productName) {
        searchContentInOnliner.openPageOnliner();
        searchContentInOnliner.findProductInSearchLineOfOnliner(productName);
        searchContentInOnliner.verifySearchInOnliner(productName);

    }


}
