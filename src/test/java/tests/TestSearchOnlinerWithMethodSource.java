package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class TestSearchOnlinerWithMethodSource extends TestBase{

    static Stream<Arguments> successSearchInOlninerByMethodSource() {
        return Stream.of(
                Arguments.of("Холодильники"),
                Arguments.of("Мобильные телефоны"),
                Arguments.of("Видеокарты")
        );
    }

    @MethodSource("successSearchInOlninerByMethodSource")
    @ParameterizedTest(name = "Search products on onliner with MethodSource")
    @Tag("Searching by MethodSource file")
    void successSearchInOlninerByMethodSource(String productName) {
        searchContentInOnliner.openPageOnliner();
        searchContentInOnliner.findProductInSearchLineOfOnliner(productName);
        searchContentInOnliner.verifySearchOnOnliner(productName);
    }
}
