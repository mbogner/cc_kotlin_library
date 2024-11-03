# {{cookiecutter.project_name}}

{{cookiecutter.description}}

## Build

Local publication:
```shell
./gradlew clean signMavenPublication publishToMavenLocal
```

see `~/.m2/repository/dev/mbo/{{cookiecutter.project_name}}` for the created content

## Release

For example this prepares a release of 1.0.0 and a development version of 1.0.1-SNAPSHOT.
Do NOT run it with the sample versions. This needs to be updated on every run.

```shell
./gradlew release -Prelease.useAutomaticVersion=true -Prelease.releaseVersion=1.0.0 -Prelease.newVersion=1.0.1-SNAPSHOT
```

## Publication

```shell
./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository
```

By running this you don't need to use the web interface to close and release the library.

see https://s01.oss.sonatype.org/content/groups/public/dev/mbo/

### Web Process

https://s01.oss.sonatype.org