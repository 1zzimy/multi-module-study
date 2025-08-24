import org.gradle.internal.impldep.org.junit.experimental.categories.Categories.CategoryFilter.include

plugins {
    `java-library`
}

dependencies {

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // Spring Context
    implementation("org.springframework:spring-context")

    // Spring Security
    implementation("org.springframework.boot:spring-boot-starter-security")
}