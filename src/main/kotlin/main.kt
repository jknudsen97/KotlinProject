import java.util.Scanner //Import Scanner from the Java library

class timeDiff(internal var year: Int, internal var month: Int, internal var day: Int,
               internal var hours: Int, internal var minutes: Int, internal var seconds: Int) //Our time difference class that holds all of the integers of our times.
fun main(args: Array<String>) {
    val scanner = Scanner(System. `in`) //Scanner allows us to ask the user for input.
    print("For the beginning and end times enter the Year, month (1-12), day (1-31), hour (1-24), minute (1-60), and second (1-60): ")
    val begin = timeDiff(year= scanner.nextInt(), month = scanner.nextInt(), day = scanner.nextInt(), hours = scanner.nextInt(), minutes = scanner.nextInt(), seconds = scanner.nextInt())
    val end = timeDiff(year = scanner.nextInt(), month = scanner.nextInt(), day = scanner.nextInt(), hours = scanner.nextInt(), minutes = scanner.nextInt(), seconds = scanner.nextInt())//Asks the user for an integer then moves on to the next
    val diff = difference(begin, end)

    print("Time difference: ${begin.year}:${begin.month}:${begin.day}||" +
            "${begin.hours}:${begin.minutes}:${begin.seconds} - ")
    print("${end.year}:${end.month}:${end.day}||" +
            "${end.hours}:${end.minutes}:${end.seconds} \n")
    print(" = ${diff.year} Years : ${diff.month} Months : ${diff.day} Days || " +
            "${diff.hours} Hours : ${diff.minutes} Minutes : ${diff.seconds} Seconds")//Prints out the user inputted beginning time, end time, and the difference between them.

}

fun difference(begin: timeDiff, end: timeDiff): timeDiff {
    val diff = timeDiff(year = 0, month = 0, day = 0, hours = 0, minutes = 0, seconds = 0)

    diff.month = begin.month - end.month //These if statements are supposed to help with overflow.
    if (end.day > begin.day)
    {
        --begin.day
        begin.day += 1
    }

    diff.day = begin.day - end.day
    if (end.hours > begin.hours)
    {
        --begin.hours
        begin.hours += 1
    }

    diff.hours = begin.hours - end.hours
    if (end.minutes > begin.minutes)
    {
        --begin.minutes
        begin.minutes += 1
    }

    diff.minutes = begin.minutes - end.minutes
    if (end.minutes > begin.minutes)
    {
        --begin.seconds
        begin.seconds += 60
    }

    if (diff.year < 0) //These if statements were supposed to help with negative numbers but don't work correctly
    {
        diff.year * -1
    }

    if (diff.month < 0)
    {
        diff.month * -1
    }

    if (diff.day < 0)
    {
        diff.day * -1
    }

    if (diff.hours < 0)
    {
        diff.hours * -1
    }

    if (diff.minutes < 0)
    {
        diff.minutes * -1
    }

    if (diff.seconds < 0)
    {
        diff.seconds * -1
    }

    diff.year = begin.year - end.year //The result is equal to the beginning time minus the end time.
    diff.month = begin.month - end.month
    diff.day = begin.day - end.day
    diff.hours = begin.hours - end.hours
    diff.minutes = begin.minutes - end.minutes
    diff.seconds = begin.seconds - end.seconds

    return diff //Return the difference.
}