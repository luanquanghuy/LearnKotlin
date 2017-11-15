import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    var mangSo : IntArray = kotlin.IntArray(20)
    var random : Random = Random()
    for(i in mangSo.indices) mangSo[i] = random.nextInt(100)
    for (item in mangSo) print("$item\t")
    var soLonHon50 : Int = mangSo.count { x -> x>50 }
    println("\nSố lượng số lớn hơn 50 là $soLonHon50")
    mangSo.sortDescending()
    println("Số chẵn lớn trong mảng là ${mangSo.maxBy { x->x%2==0 }}")
    println("Tổng các số trong mảng là ${mangSo.sum()}")
    println("Trung bình các số trong mảng là ${mangSo.average()}")
    mangSo.sort()
    for(item in mangSo) print("$item\t")
    println()
    var mangNumber : ArrayList<Int> = ArrayList()
    for (index in 0..19) mangNumber.add(random.nextInt(100))
    for(index in mangNumber) print("$index\t")
    Collections.shuffle(mangNumber, random)
    println()
    for(index in mangNumber) print("$index\t")
    println()
    for(index in mangNumber.filter { x->x%2==0 }) print("$index\t")
    println("Mảng số có phần tử 44 không? ${(mangNumber.contains(44))}")

}