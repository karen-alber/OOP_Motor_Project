import java.util.Scanner

fun main(){

    var scn = Scanner(System.`in`)

    println("Please enter your BMW required color and speed")
    val c1 = BMW(scn.next(),scn.next())
    scn.nextLine()

    println("Please enter your Tesla required color and speed")
    val c2 = Tesla(scn.next(),scn.next())
    scn.nextLine()

    println("Type: ${c1.type()} \n Color: ${c1.color} \n Speed: ${c1.speed} \n Model: ${c1.model} \n FuelType: ${c1.getfueltype()} ")
    println("Type: ${c2.type()} \n Color: ${c2.color} \n Speed: ${c2.speed} \n Model: ${c2.model} \n FuelType: ${c2.getfueltype()}")
}