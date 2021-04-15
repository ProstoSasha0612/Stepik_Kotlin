//package chapter4
//
//data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
//    override fun compareTo(other: MyDate): Int {
//        if (this.year > other.year || this.year > other.year && this.month > other.month ||
//            this.year > other.year && this.month > other.month && this.dayOfMonth > other.dayOfMonth
//        ) return 1
//        if (this.year == other.year && this.month == other.month && this.dayOfMonth == other.dayOfMonth) return 0
//        return -1
//    }
//
//}
//
//class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
//    override fun iterator(): Iterator<MyDate> {
//
//    }
//
//}
//
//fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
//    for (date in firstDate..secondDate) {
//        handler(date)
//    }
//}