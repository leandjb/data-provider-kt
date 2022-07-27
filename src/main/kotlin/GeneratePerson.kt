import io.github.serpro69.kfaker.Faker

class GeneratePerson
{
    val faker = Faker()

    var personName = faker.name.firstName()
    var personLast = faker.name.lastName()
    var personEmail = faker.internet.email()
    var personAddress = faker.address.fullAddress()

}