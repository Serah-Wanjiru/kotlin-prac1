fun main(){
    var n=numbers(arrayOf(1,2,3,4,5,6,7,8))
    println(n)
    var c=numm(arrayOf(1,2,3,4,5,6,7))
    println(c)
    var a=nummbb(arrayOf(1,2,3,4,5,6,7))
    println(a.joinToString())
    var b=make(arrayOf(11,12,13,14,15,16,17,18))
    println(b.joinToString())
    var e=manumber(arrayOf(23,45,67,89,12,11,45))
    println(e)
    var s=yes(listOf(12,11,13,14,15,16))
    println(s)
    var p=b(listOf("Annet","Brenda","Ann","Caro"))
    println(p)
    var k=mix(listOf(2,3,4,5,6,7,8,9))
    println(k)
    var m=sortstring(listOf("mary","caro","ann","brenda"))
    println(m)
    var q=multiply(listOf(23,12,2,3,2))
    println(q)


}
//Write a Kotlin function that takes an array of integers as input and
//returns the sum of all the elements in the array.
fun numbers(num:Array<Int>):Int{
    var sum=0
    for (i in num)
        sum+=i
    return sum

}
//Write a Kotlin function that takes an array of integers as input
//and returns the maximum element in the array.
fun numm(nummm:Array<Int>):Int{
    return nummm.max()
}
//Write a Kotlin function that takes an array of integers as input and returns
// a new array that contains the same elements as the input array, but
//in reverse order.
fun nummbb(numbb:Array<Int>):Array<Int>{
  return numbb.reversedArray()


}
//Write a Kotlin function that takes an array of integers as input and returns a new array that contains only
//the even elements of the input array.
fun make(numbers:Array<Int>):Array<Int> {
    return numbers.filter { it% 2 == 0 }.toTypedArray()

}
fun manumber(n:Array<Int>):Int{
  var h=n.sortedArrayDescending()
    return h[0]

}
//Write a function that takes a list of integers and returns the sum of all the
//even numbers in the list.
fun yes(list:List<Int>):Int{
    return list.filter { it%2==0}.sum()
}
fun b(n:List<String>):List<String> {
    var g = mutableListOf<String>()
    for (p in n){
        if (p.startsWith('A')) {
            g.add(p)


        }

}
    return  g
}
//Write a function that takes a list of integers and returns
//a new list with all the elements doubled.
fun mix(number:List<Int>):List<Int>{
  var d= mutableListOf<Int>()
    for (j in number) {
        d.add(j * 2)
    }
    return d


}
//Write a function that takes a list of strings and returns a new list with
//all the strings sorted in alphabetical order.
fun sortstring(names:List<String>):List<String>{
    var e= mutableListOf<String>()
    for (l in names) {
        e.add(l)
    }
    return e.sorted()
}
//Write a function that takes a list of integers and
//returns the product of all the numbers in the list.
fun multiply(numm:List<Int>):Int{
   var w=1
    for (l in numm){
        w*=l
    }
    return w
}

