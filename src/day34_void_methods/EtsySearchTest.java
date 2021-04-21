package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("----- Starting Etsy Search Smoke Test -----");
        System.out.println();
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println();
        System.out.println("----- Etsy Search Smoke Test Completed - PASS - -----");
    }

    public static void openBrowser() {
        System.out.println("1. Launching Chrome Browser.");
    }

    public static void navigateToEtsyUrl(){
        System.out.println("2. Navigating to https://www.etsy.com/");
    }

    public static void searchForWoodenSpoon(){
        System.out.println("3. Search for wooden spoon in the search engine.");
    }

    public static void verifyResultsAreDisplayed(){
        System.out.println("4. Check if wooden spoons are on this page.");
    }
}
