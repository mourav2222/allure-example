plugins {
    java
    id("io.qameta.allure") version "2.9.4"
}

group = "io.eroshenkoam"
version = version

allure {
    report {
        version.set("2.18.1")
    }
    adapter {
        autoconfigure.set(true)
        aspectjWeaver.set(true)
        frameworks {
            junit5 {
                adapterVersion.set("2.18.1")
            }
        }
    }
}

tasks.withType(JavaCompile::class) {
    sourceCompatibility = "${JavaVersion.VERSION_1_8}"
    targetCompatibility = "${JavaVersion.VERSION_1_8}"
    options.encoding = "UTF-8"
}

tasks.withType(Test::class) {
    ignoreFailures = true
    useJUnitPlatform {

    }
    systemProperty("junit.jupiter.execution.parallel.enabled", "true")
    systemProperty("junit.jupiter.execution.parallel.config.strategy", "dynamic")

    systemProperty("junit.jupiter.extensions.autodetection.enabled", "true")
}


repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("commons-io:commons-io:2.6")
    implementation("io.qameta.allure:allure-java-commons:2.14.0")
    implementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    implementation("org.junit.jupiter:junit-jupiter-engine:5.7.2")
    implementation("org.junit.jupiter:junit-jupiter-params:5.7.2")

    // https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
    implementation("org.apache.commons:commons-lang3:3.14.0")

    // https://mvnrepository.com/artifact/org.junit-pioneer/junit-pioneer
    // testImplementation("org.junit-pioneer:junit-pioneer:2.2.0")

    // https://mvnrepository.com/artifact/org.springframework/spring-core
    implementation("org.springframework:spring-core:2.5.6")


    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    testImplementation("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.30")

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
    testImplementation("org.slf4j:slf4j-simple:2.0.12")




}
