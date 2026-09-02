plugins {
    id("java")
}

group = "org.fastcampus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

// Java 소스의 한글 출력 -> Gradle 실행 콘솔 과정에서 문자 인코딩이 맞지 않아 설정 추가
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}


