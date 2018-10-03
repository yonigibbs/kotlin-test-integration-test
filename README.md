# kotlin-test-integration-test

## Old information
The purpose of this repository is to show how integration tests created using
[kotlin-test](https://github.com/kotlintest/kotlintest) can be executed.

The integration tests are defined using a separate gradle source set so that they can be run separately from unit tests.

Unit tests are run automatically as part of a `gradle build`, but integration tests need to be explicity executed by running
`gradle integrationTest`

The *unit* tests are in a file called [UnitTest.kt](/src/test/kotlin/test/test/UnitTest.kt). There are two classes in this file:
* `UnitTest`: uses a standard JUnit `@Test` annotation to define a unit test method.
* `KotlinTestUnitTest`: subclass of the kotlin-test `StringSpec` class.

The *integration* tests are in a file called [IntegrationTest.kt](/src/integrationTest/kotlin/test/test/IntegrationTest.kt).
There are two classes in this file:
* `IntegrationTest`: uses a standard JUnit `@Test` annotation to define a unit test method.
* `KotlinTestIntegrationTest`: subclass of the kotlin-test `StringSpec` class.

These files all have code that can be uncommented to check that a broken test causes the build to fail.

# Instructions
1. Clone the repo
1. Run `./gradlew build integrationTest`