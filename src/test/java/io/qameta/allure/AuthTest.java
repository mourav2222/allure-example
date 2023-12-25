package io.qameta.allure;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static io.qameta.allure.Allure.*;

@Feature("Auth")
@Story("External Auth")
@Owner("admin")
class AuthTest {

    @ParameterizedTest(name = "Authantication via external system (name)")
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
        step("Open main website");
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

        Assertions.assertTrue(true);
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


}
