plugins {
    `java-library`
}

dependencies {
    // JPA
    api("org.springframework.boot:spring-boot-starter-data-jpa")

    // Spring boot
    implementation("org.springframework.boot:spring-boot-starter")

    // DB 드라이버(실행 시 필요) — 공통화
    runtimeOnly("com.mysql:mysql-connector-j")

    // 마이그레이션(선택) - DB 스키마 변경을 버전별로 누적 관리하는 것
//    implementation("org.flywaydb:flyway-core")
}
