package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

class AgentsOverviewTest {

    @Test
    void agentsFilterByAgentTest() {

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
}
