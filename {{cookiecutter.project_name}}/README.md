# {{cookiecutter.project_name}}

{{cookiecutter.description}}

## Release

see https://github.com/mbogner/spring-boot-bom for more details.

### Build

Local:
```shell
./gradlew clean signMavenPublication publishToMavenLocal
```

see `~/.m2/repository/dev/mbo/{{cookiecutter.project_name}}` for the created content

Upload:
```shell
./gradlew clean signMavenPublication publishToMavenLocal publish
```

see https://s01.oss.sonatype.org/content/groups/public/dev/mbo/

### Web Process

https://s01.oss.sonatype.org