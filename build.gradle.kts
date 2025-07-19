plugins {
    id("org.springframework.boot") version "3.5.3"
    id("io.spring.dependency-management") version "1.1.5"
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2024.0.1") // 최신 BOM 확인
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.cloud:spring-cloud-stream-binder-kafka-streams")
    implementation("org.apache.kafka:kafka-streams") // Kafka Streams API 직접 사용할 경우

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
}
