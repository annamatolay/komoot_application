import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SportStatsTest {

    @Test
    fun `GIVEN sport stats, WHEN finding top sport and eBikes included, THEN exclude it and return correctly`() {
        val sportStats = listOf(
            Summary(Sport.HIKE, 92),
            Summary(Sport.RUN, 77),
            Summary(Sport.TOURING_BICYCLE, 322),
            Summary(Sport.E_TOURING_BICYCLE, 656)
        )

        val topSport = findTopSportByDistance(sportStats)

        // Assert that the top sport is correctly identified
        assertEquals(Sport.TOURING_BICYCLE, topSport?.sport)
        assertEquals(322, topSport?.distance)
    }

    @Test
    fun `GIVEN no sport stats, WHEN finding top sport, THEN return with null`() {
        val sportStats = emptyList<Summary>()

        val topSport = findTopSportByDistance(sportStats)

        // Assert that when the list is empty, the result is null
        assertEquals(null, topSport)
    }

    @Test
    fun `GIVEN only eBike sport stats, WHEN finding top sport, THEN return with null`() {
        val sportStats = listOf(
            Summary(Sport.E_TOURING_BICYCLE, 656)
        )

        val topSport = findTopSportByDistance(sportStats)

        // Assert that when the list contains only eBike, the result is null
        assertEquals(null, topSport)
    }
}
