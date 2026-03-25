fun main() {
    val totalSekound = 135

    val minutes = totalSekound / 60      // полные минуты
    val seconds = totalSekound % 60      // остаток секунд

    println("Прошло минут: $minutes; секунд: $seconds")
}