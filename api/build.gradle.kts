plugins {
    java
    id("org.springframework.boot") version "3.5.5"
    kotlin("jvm") version "2.0.20" // Kotlin 지원
    kotlin("plugin.spring") version "2.0.20" // Spring 과 Kotlin 통합
}

dependencies {
    implementation(project(":user"))
    implementation(project(":infra"))

    // Kotlin (DTO data class 용도)
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    // Spring web (Controller, RestAPI)
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    // Swegger
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0")

    // Lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    // Test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // MapStruct
    implementation("org.mapstruct:mapstruct:1.5.5.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")

}
