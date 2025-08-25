plugins {
    `java-library`
    kotlin("jvm") version "2.0.20"
    kotlin("plugin.spring") version "2.0.20"
    kotlin("plugin.jpa") version "2.0.20"
}

dependencies {
    implementation(project(":core"))

    // JPA
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // Lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    // Kotlin
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    // Test
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // PasswordEncoder
    implementation("org.springframework.security:spring-security-crypto")
}