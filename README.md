# kotlin-test-integration-test
The purpose of this repository is to attempt to execute integration tests using
[kotlin-test](https://github.com/kotlintest/kotlintest).

The integration tests are defined using a separate gradle source set so that they can be run separately from unit tests.

Unit tests are run automatically as part of a `gradle build`, but integration tests need to be explicity executed by running
`gradle integrationTest`

The *unit* tests are in a file called [UnitTest.kt](/src/test/kotlin/test/test/UnitTest.kt). There are two classes in this file:
* `UnitTest`: uses a standard JUnit `@Test` annotation to define a unit test method.
* `KotlinTestUnitTest`: subclass of the kotlin-test `StringSpec` class.

Both of these will successfully cause the test task to fail if the relevant code is uncommented in them.

The *integration* tests are in a file called [IntegrationTest.kt](/src/integrationTest/kotlin/test/test/IntegrationTest.kt).
There are two classes in this file:
* `IntegrationTest`: uses a standard JUnit `@Test` annotation to define a unit test method.
* `KotlinTestIntegrationTest`: subclass of the kotlin-test `StringSpec` class.
The standard JUnit class successfully causes the test task to fail if the relevant code is uncommented.
The `StringSpec` implementation does not cause the test to fail, as it should.

# Instructions
1. Clone the repo
1. Run `./gradlew build`
1. Run `./gradlew integrationTest`

That last step should fail, but it succeeds. However, editing the code in [IntegrationTest.kt](/src/integrationTest/kotlin/test/test/IntegrationTest.kt)
in the `IntegrationTest` class (the standard JUnit one) will cause the integration test to fail.
