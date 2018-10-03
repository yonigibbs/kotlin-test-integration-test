package test.test

import io.kotlintest.specs.StringSpec
import org.junit.Assert
import org.junit.Test

class UnitTest {
    @Test
    fun unitTest() {
        // Succeed
        Assert.assertEquals("aa", ThingToBeTested().duplicate("a"))

        // Fail on purpose: uncommenting this causes the test to fail.
        // Assert.assertEquals("fail on purpose", ThingToBeTested().duplicate("a"))
    }
}

class KotlinTestUnitTest : StringSpec({
    "test that passes" {
        // Succeed
        Assert.assertEquals("aa", ThingToBeTested().duplicate("a"))
    }

    "test that fails" {
        // Fail on purpose: uncommenting this causes the test to fail.
        // Assert.assertEquals("fail on purpose", ThingToBeTested().duplicate("a"))
    }
})