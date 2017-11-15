class PhanSo {
    private var tuSo : Int = 0
    private var mauSo : Int = 0

    constructor()
    constructor(tuSo: Int, mauSo : Int){
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

    fun tong(ps1:PhanSo):PhanSo{
        var ps:PhanSo = PhanSo()
        ps.tuSo = tuSo*ps1.mauSo+ps1.tuSo*mauSo
        ps.mauSo = mauSo*ps1.mauSo
        ps.toiGian()
        return ps
    }

    fun hieu(ps1: PhanSo):PhanSo{
        var ps:PhanSo = PhanSo()
        ps.tuSo = tuSo*ps1.mauSo-ps1.tuSo*mauSo
        ps.mauSo = mauSo*ps1.mauSo
        ps.toiGian()
        return ps
    }

    fun tich(ps1: PhanSo):PhanSo{
        var ps:PhanSo = PhanSo()
        ps.tuSo = tuSo*ps1.tuSo
        ps.mauSo = mauSo*ps1.mauSo
        ps.toiGian()
        return ps
    }

    fun thuong(ps1: PhanSo):PhanSo{
        var ps:PhanSo = PhanSo()
        ps.tuSo = tuSo*ps1.mauSo
        ps.mauSo = mauSo*ps1.tuSo
        ps.toiGian()
        return ps
    }

    fun nghichDao():PhanSo{
        var ps = PhanSo(tuSo, mauSo)
        ps.tuSo = ps.mauSo.also { ps.mauSo = ps.tuSo }
        return ps
    }

}