plugins {
    kotlin("jvm") version "1.3.31"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    testImplementation("org.assertj:assertj-core:3.11.1")

}

tasks.test {
    useJUnitPlatform()
}
