package ALC

import javax.swing.text.View

class Vine(private var name: String) {
    var alc: Int = 12
    var vol: Double = 0.0
    var view: String = "красное"

    constructor(name: String, _alc: Int) : this(name) {
        alc = _alc
    }

    constructor(name: String, _alc: Int, _vol: Double) : this(name, _alc) {
        vol = _vol
    }

    constructor(name: String, _alc: Int, _vol: Double, _view: String) : this(name, _alc, _vol) {
        view = _view
    }

    private fun getAlc(): Double {
        return alc - vol
    }

    private fun getVin(): String {
        return "Название вина $name тип вина $view"
    }

    fun Alcogol(): String {
        return "${getVin()} алкоголь= ${getAlc()}"
    }
}
