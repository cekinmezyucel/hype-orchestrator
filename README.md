# productstock-hype-orchestrator

## setup project

### Import intellij-java-google-style.xml
1.  File → Settings → Editor → Code Style
2.  Click the small gear icon next to "Scheme", Select "Import Scheme" → CheckStyle Configuration
3.  Select our `checkstyle/intellij-java-google-style.xml`.
4.  Click OK.
5.  Click Apply.

### Enable SpringBoot LiveReload for IntelliJ IDEA
https://stackoverflow.com/a/44095431

## run project

### create the database and keycloak instance
```shell
docker-compose up -d
```

### run the application
run from your ide or from maven
```shell
mvn spring-boot:run
```
