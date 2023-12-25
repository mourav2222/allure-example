package io.qameta.allure;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

@Layer("unit")
@Feature("Milestones")
@Story("Stages")
@Owner("admin")
class MilestonesTest {

    @Test
    @DisplayName("Milestones via GitHub")
    @Tags({@Tag("critical"), @Tag("milestones")})
    void testMilestonesGitHub() {

        boolean assertCheck = "False".equalsIgnoreCase(RandomStringUtils.randomAlphabetic(5));
        assertCheck = true;

        step("Milestones: Open main website (CHANGED)");
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
    @DisplayName("Milestones via Google")
    @Tags({@Tag("smoke"), @Tag("milestones")})
    void testMilestonesGoogle() {
        step("Milestones: Open main website");
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
    @DisplayName("Milestones via Azure")
    @Tags({@Tag("smoke"), @Tag("milestones")})
    void testMilestonesAzure() {
        step("Milestones: Open main website");
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
