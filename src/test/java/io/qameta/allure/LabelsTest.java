package io.qameta.allure;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

@Layer("rest")
@Feature("Labels")
@Story("External Systems")
@Owner("admin")
class LabelsTest {

    @Test
    @DisplayName("Labels via GitHub")
    @Tags({@Tag("critical"), @Tag("labels")})
    void testLabelsGitHub() {

        boolean assertCheck = "False".equalsIgnoreCase(RandomStringUtils.randomAlphabetic(5));
        assertCheck = true;

        step("Labels: Open main website (CHANGED)");
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
    @DisplayName("Labels via Google")
    @Tags({@Tag("smoke"), @Tag("labels")})
    void testLabelsGoogle() {
        step("Labels: Open main website");
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
    @DisplayName("Labels via Azure")
    @Tags({@Tag("smoke"), @Tag("labels")})
    void testLabelsAzure() {
        step("Labels: Open main website");
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
