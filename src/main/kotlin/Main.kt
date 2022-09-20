import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    val format = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val today = LocalDate.now()
    val todayFormat = today.format(format)
    val recentFullMoon = LocalDate.parse("2022-09-10")
    val formatRecentFullMoon = recentFullMoon.format(format)

    val daysUntilNextFullMoon = 29
    val daysSinceLastFullMoon = today.minusDays(recentFullMoon.dayOfMonth.toLong())
    val days = daysSinceLastFullMoon.dayOfMonth
    val daysUntilFullMoonFromNow = daysUntilNextFullMoon - days
    val nextFullMoon = recentFullMoon.plusDays(daysUntilNextFullMoon.toLong())
    val nextFullMoonFormat = nextFullMoon.format(format)

    println("The last full moon was $days days ago on $formatRecentFullMoon. There are $daysUntilNextFullMoon days between full moons")
    println("Today is $todayFormat")
    print("The next full moon will be in $daysUntilFullMoonFromNow days from now on $nextFullMoonFormat")

}