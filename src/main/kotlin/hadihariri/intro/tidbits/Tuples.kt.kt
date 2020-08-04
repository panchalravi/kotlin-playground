package com.rsk.hadihariri.tidbits


fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair(country, 2_30_0000)
}

fun countryDetails(country:String): Triple<String, String, Long> {
    return Triple(country, "Europe", 2_30_0000)
}

fun main(args: Array<String>) {
    val result = capitalAndPopulation("Madrid")
    countryDetails("Madrid");

    println(result.first)
    println(result.second)

    val (country, continent, population) = countryDetails("Spain") // Deconstructing values
    println("-----")
    println(country)
    println(continent)
    println(population)
    println("-----")

    val listOfCountries = listOf<Pair<String, Long>>(Pair("Madrid", 2_30_0000), Pair("Mumbai", 5_00_0000))
    for((country, population) in listOfCountries) {
        println("$country - $population")
    }

}