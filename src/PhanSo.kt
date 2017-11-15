class PhanSo {
//    numerator
//    denominator
    var tuSo : Int = 0
    var mauSo : Int = 0
    constructor(){
        this.tuSo = 1
        this.mauSo = 1
    }
    constructor(tuSo: Int, mauSo : Int){
        if (mauSo == 0) throw IllegalArgumentException("Mẫu số phải khác 0")
        this.tuSo = tuSo
        this.mauSo = mauSo
    }

    private fun toiGian(){
        var a = tuSo
        var b = mauSo
        tuSo = a/ucln(a, b)
        mauSo = b/ucln(a, b)
    }

    private fun ucln(tuSo: Int, mauSo: Int):Int {
        var a = tuSo
        var b = mauSo
        while (b!=0){
            a = b.also { b = a % b }
        }
        return a
    }

    fun inGiaTri(){
        if (mauSo==1) println("$tuSo")
        else println("$tuSo/$mauSo")
    }

    fun tong(phanSo:PhanSo):PhanSo{
        var ps:PhanSo = PhanSo()
        ps.tuSo = tuSo*phanSo.mauSo+phanSo.tuSo*mauSo
        ps.mauSo = mauSo*phanSo.mauSo
        ps.toiGian()
        return ps
    }

    fun hieu(phanSo: PhanSo):PhanSo{
        var ps:PhanSo = PhanSo()
        ps.tuSo = tuSo*phanSo.mauSo-phanSo.tuSo*mauSo
        ps.mauSo = mauSo*phanSo.mauSo
        ps.toiGian()
        return ps
    }

    fun tich(phanSo : PhanSo):PhanSo{
        var ps:PhanSo = PhanSo()
        ps.tuSo = tuSo*phanSo.tuSo
        ps.mauSo = mauSo*phanSo.mauSo
        ps.toiGian()
        return ps
    }

    fun thuong(phanSo: PhanSo):PhanSo{
        var ps:PhanSo = PhanSo()
        ps.tuSo = tuSo*phanSo.mauSo
        ps.mauSo = mauSo*phanSo.tuSo
        ps.toiGian()
        return ps
    }

    fun nghichDao():PhanSo{
        if(this.tuSo == 0) throw IllegalArgumentException("Tử số khác 0 khi nghịch đảo")
        var ps = PhanSo(tuSo, mauSo)
        ps.tuSo = ps.mauSo.also { ps.mauSo = ps.tuSo }
        return ps
    }

}