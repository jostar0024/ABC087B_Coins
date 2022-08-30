fun main(args: Array<String>) {
    val en500 = readLine()!!.toInt()
    val en100 = readLine()!!.toInt()
    val en50 = readLine()!!.toInt()
    val sum = readLine()!!.toInt()
    var count = 0
    
   for(i in 0..en500) {
       for(j in 0..en100) {
           for(k in 0..en50){
               if((500*i + 100*j + 50*k) == sum ) count++
           }
       }
   }
   print(count)
}
