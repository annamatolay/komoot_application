/*
Given this Kotlin code in this GIST:
https://gist.github.com/ArneKoeckeritz/f39a8c711473f4ceb8dbea9cc1dd5e5e

Please write Kotlin code to print the top sport by distance, excluding eBikes.
In a few sentences, explain why you chose this solution and not another approach.

Source: https://apply.workable.com/komoot/j/9BF2EF2CED/apply/
 */
enum class Sport { HIKE, RUN, TOURING_BICYCLE, E_TOURING_BICYCLE }

data class Summary(val sport: Sport, val distance: Int)

fun main() {
    val sportStats = listOf(Summary(Sport.HIKE, 92),
        Summary(Sport.RUN, 77),
        Summary(Sport.TOURING_BICYCLE, 322),
        Summary(Sport.E_TOURING_BICYCLE, 656))

    // Write kotlin code to print the top sport by distance excluding eBikes.
    // println()

    // Filter out eBikes and find the sport with the maximum distance
    val topSport = findTopSportByDistance(sportStats)

    // Print the result
    if (topSport != null) {
        println("The top sport by distance, excluding eBikes, is ${topSport.sport} with ${topSport.distance} kilometers.")
    } else {
        println("No sports found.")
    }
}

fun findTopSportByDistance(sportStats: List<Summary>): Summary? =
    sportStats
        .filter { it.sport != Sport.E_TOURING_BICYCLE }
        .maxByOrNull { it.distance }