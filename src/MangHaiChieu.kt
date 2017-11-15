import java.util.*

fun main(args: Array<String>) {
    val random : Random = Random()
    var input : String?
    var n : Int = 0
    var a : Double
    var dt : Double = 1.0
    println("Cấp ma trận cần tính?")
    input = readLine()
    if(input!=null) n = input.toInt()
    var maTran : Array<DoubleArray> = Array(n, {DoubleArray(n)})
    var sizeMaTran = maTran.size
    var indicesMatran = maTran.indices
    for(i in indicesMatran) for(j in indicesMatran) maTran[i][j] = random.nextInt(2).toDouble()
    var k : Int = 0
    for(index in 0 until sizeMaTran-1) {
        if (maTran[index][index] == 0.0 && k < sizeMaTran) {
            k = index + 1
            while (maTran[index][index] == 0.0 && k < sizeMaTran) {
                if (maTran[k][index] != 0.0) for (i in indicesMatran) maTran[k][i] = maTran[index][i].also { maTran[index][i] = maTran[k][i] }
                k++
            }
            if(maTran[index][index] == 0.0 && k >= sizeMaTran)  dt = 0.0
        }
        if(dt == 0.0) break
        for(i in index+1 until sizeMaTran) {
            a = maTran[i][index] / maTran[index][index]
            for (j in index until sizeMaTran) maTran[i][j] -= maTran[index][j]*a
        }
    }
    for(i in indicesMatran){
        for (j in indicesMatran) print("${maTran[i][j]}\t")
        println()
        dt*=maTran[i][i]
    }
    println("Định Thức của ma trận là $dt")
}