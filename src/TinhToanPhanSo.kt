fun main(args: Array<String>) {
    var ps1 : PhanSo = PhanSo(0, 4)
    var ps2 : PhanSo = PhanSo(2, 4)
    ps1.tuSo = 3
    var ps3 = ps1.tong(ps2)
    ps3.inGiaTri()
}