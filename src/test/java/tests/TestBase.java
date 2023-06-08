package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import pages.SearchContentInOnliner;


import static com.codeborne.selenide.Configuration.*;

public class TestBase {

    SearchContentInOnliner searchContentInOnliner = new SearchContentInOnliner();
    @BeforeEach
    void initBrowser() {
        browserSize = "1920x1080";
        //holdBrowserOpen = true;
        browser = "chrome";
        headless = true;
    }


}