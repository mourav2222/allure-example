package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Feature("Agents")
@Story("Filtering")
class AgentsOverviewTest {

    @Test
    @Tags({@Tag("regress")})
    void agentsFilterByAgentTest() {
        Allure.step("Step 1  ", () -> {
        });

        Allure.step("Step 2", () -> {
        });

        Allure.step("Step 3", () -> {
        });
    }

    @AllureId("2575")
    @Owner("admin")
    // "comp": [agents]
    // "jira": [AN-1]
    @Test
    @DisplayName("Filter by Agent in the Agents Overview")
    @Tags({@Tag("regress")})
    void testFilterByAgentInTheAgentsOverview() {

        Allure.step("Open web ui and login  ", () -> {
        });

        Allure.step("Open an Agents Overview", () -> {
        });

        Allure.step("Select 'Agent' entry in the filter  by Agent", () -> {
        });

        Allure.step("Check a correct execution of selection of 'Agent' agent", () -> {

            Allure.step("", () -> {
            });
        });
    }

    @AllureId("2842")
    @Owner("admin")
    // "msrv": [mounth]
    @Microservice("mounth")
    @Test
    @DisplayName("<2> Manual Test - Changed")
    @Tags({@Tag("januar"), @Tag("critical"), @Tag("import")})
    void test2ManualTest() {

        Allure.step("Step 1", () -> {
            Allure.step("Step 11", () -> {
            });
        });

        Allure.step("Step 2", () -> {
            Allure.step("Step 22", () -> {
            });
        });

        Allure.step("Step 3", () -> {

            Allure.step("Step 31", () -> {
            });

            Allure.step("Step 32", () -> {
            });

            Allure.step("Step 33", () -> {
            });
        });

        Allure.step("Step 4", () -> {
        });

        Allure.step("Step 5", () -> {
        });
    }

    @AllureId("2872")
    @Owner("admin")
    @Test
    @DisplayName("Manual test 004")
    @Tags({@Tag("critical")})
    void testManualTest004() {

        Allure.step("Step 1", () -> {
        });

        Allure.step("Step 2 ", () -> {
        });

        Allure.step("Step 3", () -> {
        });

        Allure.step("Step 4 ", () -> {
        });

        Allure.step("Step 5 ", () -> {
        });
    }

    @AllureId("2616")
    @Owner("admin")
    @Test
    @DisplayName("New Test")
    void testNewTest22() {

        Allure.step("Step 1", () -> {
        });

        Allure.step("Step2", () -> {
        });

        Allure.step("Step 3", () -> {
        });

        Allure.step("Step 4", () -> {
        });
        Allure.step("Step 5", () -> {
        });
        Allure.step("Step 6", () -> {
        });
    }

    @AllureId("2873")
    @Owner("admin")
    @Test
    @DisplayName("New Test")
    @Tags({@Tag("januar")})
    void testNewTest() {

        Allure.step("Step 1", () -> {
        });

        Allure.step("Step 2", () -> {
        });

        Allure.step("Step3", () -> {
        });
        Allure.step("Step 4", () -> {
        });
        Allure.step("Step 5", () -> {
        });
    }

    @AllureId("2905")
    @Owner("admin")
    @Test
    @DisplayName("New Test 005")
    void testNewTest005() {

        Allure.step("Step 1", () -> {
        });

        Allure.step("Step 2", () -> {
        });

        Allure.step("Step 3", () -> {
        });

        Allure.step("Step 4", () -> {
        });

        Allure.step("Step 5", () -> {
        });

        Allure.step("Step 6", () -> {
        });
    }




}
