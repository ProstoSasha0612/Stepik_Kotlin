package chapter4

import chapter3.MyDate

class DateRange(val start:MyDate,val endInclusive:MyDate){
    //TODO()
}

fun checkInRange(date:MyDate,first:MyDate,last:MyDate){
    return date in DateRange(first,last)
}