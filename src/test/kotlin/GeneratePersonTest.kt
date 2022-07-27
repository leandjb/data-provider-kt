import kotlin.test.Test
import kotlin.test.assertIs

internal class GeneratePersonTest
{
    private val testGeneratePerson: GeneratePerson = GeneratePerson()

    @Test
    fun testGeneratePerson()
    {
        println(testGeneratePerson.personName)
        println(testGeneratePerson.personLast)
        println(testGeneratePerson.personAddress)
        println(testGeneratePerson.personEmail)

        assertIs<String>(testGeneratePerson.personName)
    }
}