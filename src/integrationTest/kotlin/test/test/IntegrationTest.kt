package test.test

import io.kotlintest.specs.StringSpec
import org.junit.Assert
import org.junit.Test

class IntegrationTest {
    @Test
    fun integrationTest() {
        // Succeed
        Assert.assertEquals("aa", ThingToBeTested().duplicate("a"))

        // Fail on purpose: uncommenting this causes the test to fail.
        // Assert.assertEquals("fail on purpose", ThingToBeTested().duplicate("a"))
    }
}

class KotlinTestIntegrationTest : StringSpec({
    "test that passes" {
        // Succeed
        Assert.assertEquals("aa", ThingToBeTested().duplicate("a"))
    }

    "test that fails" {
        // Fail on purpose: uncommenting this causes the test to fail.
        // Assert.assertEquals("fail on purpose", ThingToBeTested().duplicate("a"))
    }
})