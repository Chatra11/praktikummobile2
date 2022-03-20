fun main(){
    print("Input bilangan = ")
    val a = readLine()!!.toInt()
    for (i  in 1..8)
    if (i%2 == 0 || i%3 ==0 ){
        var kelipatan= 0
        kelipatan = a * i
        print("$kelipatan ")
    }
}
