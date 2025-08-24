plugins {
    // 하위 모듈에서 Spring BOM 정합성 맞추기 위함
    id("io.spring.dependency-management") version "1.1.6"
    java
}

allprojects {
    group = "dev.nft"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    // 모든 하위 모듈에 공통 적용
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "java")

    dependencyManagement {
        imports { mavenBom("org.springframework.boot:spring-boot-dependencies:3.5.5") }
    }

    // JDK 21 통일
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(21))
        }
    }

    // JUnit 5 통일
    tasks.withType<Test> {
        useJUnitPlatform()
    }
}