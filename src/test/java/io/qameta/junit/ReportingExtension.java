package io.qameta.junit;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;


@Slf4j
public class ReportingExtension implements AfterTestExecutionCallback {

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        log.info("publishing results to elastic");
        System.out.println("TTTTTEEEESSSSTTT");
    }
}
