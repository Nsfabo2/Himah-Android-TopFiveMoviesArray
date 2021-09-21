import java.util.*

fun main(){
/**/

    //Create an array of five empty strings
    var ArrayOfFive = arrayOf("","","","","")

    //The user has to enter exactly 5 movies
    var counter = 0
    println("What's your top 5 movies?")
    while (counter<5){
        //Ask the user to enter their top 5 movies
        var movie = readLine()!!.toString()
        //Add each movie to the array by updating all strings in the array
        ArrayOfFive[counter] = movie
        counter++
    }
    println("Your top 5 movies are:")
    //Print each movie with a for loop
    for (element in ArrayOfFive){
        println(element)
    }
    println("Good taste!")
}
