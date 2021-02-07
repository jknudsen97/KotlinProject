# Overview

This is a basic Kotlin program that calculates the difference in two time periods. This includes the year down to the second.
The purpose of this program was to learn the basics of kotlin and how it operates since I have never worked with it before and it is used quite frequently in Android app development.
To run go to src/main/kotlin/main.kt.

[Software Demo Video](https://youtu.be/9eyWq2TLgH0)

## Development Environment

* IntelliJ 2020.3.1 Community Edition
* Kotlin 203-1.4.30
* Git and Github

## Useful Websites

* [Kotlin](https://kotlinlang.org/)
* [Programiz](https://www.programiz.com/kotlin-programming)

## Future Work

* I tried to implement the calendar library from Java into my   code but I could not get it to work properly so I had to scrap it.
* There are negative numbers displayed I do have if statements telling if the result is negative then multiply by -1 but that does not work.
* I originally had the date and times implemented within the code itself manually. But I changed it so that the user can input values themselves which is an improvement, however, since the time difference class is expecting integers I cannot use a string for each individual user input asking for the beginning year, day etc. There is a string above that asks to input the values but the user needs to keep track themselves what they are inputing which can easily lead to putting in say the end year where the beginning second should be.
