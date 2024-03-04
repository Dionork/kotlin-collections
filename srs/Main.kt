package srs

fun main() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 300, 100),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    printInfo(data)
}
fun printInfo(data:Map<String,List<Int>>){
    val validData = data.filterNot { it.value.any {it<0} }
    val averegeInWeek = validData.flatMap { it.value }.average()
    println("Средняя выручка в неделю: $averegeInWeek")
    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.max()
    val min = listOfSum.min()
    val averageMonth = listOfSum.average()
    val maxMonth = validData.filter { it.value.sum() == max }.keys
    val minMonth = validData.filter { it.value.sum() == min }.keys
    println("Средняя выручка в месяц: $averageMonth")
    println("Максимум выручка в месяц: $max")
    println("В месяце: $maxMonth")
    println("Минимум выручка в месяц: $min")
    println("В месяце: $minMonth")
    val inValidData = data.filter { it.value.any {it<0} }.keys
    print("Ощибки в месяцах: ")
    for (month in inValidData){
        print("$month ")}

}






