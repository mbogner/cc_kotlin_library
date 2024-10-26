# "{{cookiecutter.project_name}}"

Some library to release on Maven Central.

## Release

see https://github.com/mbogner/spring-boot-bom for more details.

### Build

Local:
```shell
./gradlew clean signMavenPublication publishToMavenLocal
```

Upload:
```shell
./gradlew clean signMavenPublication publishToMavenLocal publish
```

### Web Process

https://s01.oss.sonatype.org