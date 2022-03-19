fun main(){
    print("Masukan Angka : ")
    val a = readLine()!!.toInt()
    val b = a
    for (i  in 1..8)
    if (i%2 == 0 || i%3 ==0 ){
        var kelipatan= 0
        kelipatan = b * i
        print("$kelipatan ")
    }
}
