import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.1.0"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.8.21"
	kotlin("plugin.spring") version "1.8.21"
	kotlin("plugin.jpa") version "1.8.21"

	// mapStruct
	kotlin("kapt") version "1.6.21"
}

group = "jjfactory"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	runtimeOnly("org.postgresql:postgresql")


	// MapStruct
	implementation("org.mapstruct:mapstruct:1.5.1.Final")
	kapt("org.mapstruct:mapstruct-processor:1.5.1.Final")
	kaptTest("org.mapstruct:mapstruct-processor:1.5.1.Final")

	//apache lang
	implementation("com.google.guava:guava:30.0-jre")
	implementation("org.apache.commons:commons-lang3:3.9")


	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
