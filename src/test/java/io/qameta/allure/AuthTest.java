package io.qameta.allure;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.qameta.allure.Allure.*;

@Layer("integ")
@Feature("Auth")
@Story("External Auth")
@Owner("admin")
@Microservice("auth")
class AuthTest {

    @ParameterizedTest()
    @Tags({@Tag("critical"), @Tag("web")})
    @CsvSource({
            "2740, GitHub",
            "2741, Azure",
            "2742, Google"
    })
    @DisplayName("Authantication via external system")
    void testAllAuths(String allureID, String typeAuth) {
        label("AS_ID", allureID);
        parameter("Type", typeAuth);

        step("Open main website");
        step("Select the authentication via " + typeAuth, () -> {
            step("Press a button Login", () -> {

            });
            step("Press a button " + typeAuth);
        });
        step("Authenticate as user 'testuser'", () -> {
            step("Input the mail 'testuser@test.com'");
            step("Input the password '12341234'");
            step("Press the button Login in");
        });
        step("Check the authentication as user 'testuser'", () -> {
            step("Go back to main page");
            step("Check user login must be 'testuser'");
            step("The user name must be 'Mr Test'");

        });

        Assertions.assertTrue(true);
    }

    @Test
    @AllureId("2716")
    @DisplayName("Authentication via GitHub")
    @Tags({@Tag("critical"), @Tag("web")})
    void testGitHub() {


        boolean assertCheck = "False".equalsIgnoreCase(RandomStringUtils.randomAlphabetic(5));
        step("Open main website (CHANGED)");
        step("Select the authentication via GitHub", () -> {
            step("Press a button Login", () -> {

            });
            step("Press a button GitHub");
        });
        step("Authenticate as user 'testuser'", () -> {
            step("Input the mail 'testuser@test.com'");
            step("Input the password '12341234'");
            step("Press the button Login in");
        });
        step("Check the authentication as user 'testuser'", () -> {
            step("Go back to main page");
            step("Check user login must be 'testuser'");
            step("The user name must be 'Mr Test'");

        });

        Assertions.assertTrue(assertCheck);
    }

    @Test
    @AllureId("2707")
    @DisplayName("Authentication via Google")
    @Tags({@Tag("smoke"), @Tag("web")})
    void testGoogleAuth() {
        step("Open main website");
        step("Select the authentication via Google", () -> {
            step("Press a button Login");
            step("Press a button Google");
        });
        step("Authenticate as user testuser", () -> {
            step("Input the mail testuser@gmail.com");
            step("Input the password 12341234");
            step("Press the button Login in");
        });
        step("Check the authentication as user testuser", () -> {
            step("Go back to main page");
            step("Check user login must be testuser");
            step("The user name must be Test Name");
        });

        Assertions.assertTrue(true);
    }


    @Test
    @AllureId("2717")
    @DisplayName("Authentication via Azure")
    @Tags({@Tag("smoke"), @Tag("web")})
    void testAzureAuth() {
        step("Open main website");
        step("Select the authentication via Azure", () -> {
            step("Press a button Login");
            step("Press a button Azure");
        });
        step("Authenticate as user testuser", () -> {
            step("Input the mail testuser@microsoft.com");
            step("Input the password 12341234");
            step("Press the button Login in");
        });
        step("Check the authentication as user testuser", () -> {
            step("Go back to main page");
            step("Check user login must be testuser");
            step("The user name must be Test Name");
        });

        Assertions.assertTrue(true);
    }


    @Test
    void testAAA() {

    }


}
