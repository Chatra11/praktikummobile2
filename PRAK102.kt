fun hitung (x : Int ){
    var total = (2*(x*x)) +(5*x) - 8
    println(total)
}
fun main(){
    print("Nilai X = ")
    var X1 = readLine()!!.toInt()
    hitung(X1)
}