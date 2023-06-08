package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TestSearchOnliner extends TestBase {

    @ValueSource(
            strings = {"Холодильники", "Мобильные телефоны"}
    )
    @ParameterizedTest(name = "Search products on onliner with ValueSource")
    @Tag("Searching")
    void successSearchInOlninerByValueSource(String productName) {
        searchContentInOnliner.openPageOnliner();
        searchContentInOnliner.findProductInSearchLineOfOnliner(productName);
        searchContentInOnliner.verifySearchOnOnliner(productName);

    }


    @CsvSource({
            "Холодильники",
            "Мобильные телефоны",
            "Видеокарты"
    })
    @ParameterizedTest(name = "Search products on onliner with CsvSource")
    @Tag("Searching by csv source")
    void successSearchInOlninerByCsvSource(String productName) {
        searchContentInOnliner.openPageOnliner();
        searchContentInOnliner.findProductInSearchLineOfOnliner(productName);
        searchContentInOnliner.verifySearchOnOnliner(productName);
    }

    @CsvFileSource(resources = "/testDate.csv")
    @ParameterizedTest(name = "Search products on onliner with CsvFileSource")
    @Tag("Searching by csv file")
    void successSearchInOlninerByCsvFileSource(String productName) {
        searchContentInOnliner.openPageOnliner();
        searchContentInOnliner.findProductInSearchLineOfOnliner(productName);
        searchContentInOnliner.verifySearchOnOnliner(productName);
    }


}
