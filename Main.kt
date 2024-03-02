fun main() {
  myFunction("akirachix")
    println(introduction("Mercy",20))
    intro("Maurine",20)
    println(getWordLength("Mary"))
    getLength("Exellent")
    printMe("Nancy")
    printMe("Bob")
}
fun myFunction(name:String){
    println(name.first())
    println(name[3])
    println(name[4])
    println(name[0])
    println(name[2])
}
fun introduction(name:String,age:Int): String {
    return("Hi, my name is $name and I am $age years old")


}
fun intro(name:String, age:Int){
    println("Hi, my name is $name and I am $age years old")
}
fun getWordLength(name:String,): Int {
    return(name.length)
}
fun getLength(word:String) {
    println(word.length)
}
fun printMe(name: String) {
    if (name == "Nancy"){
     println("That's me!")}
    else{
    println("That's not me!")}
}

