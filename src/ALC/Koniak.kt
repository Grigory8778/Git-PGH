package ALC

class Koniak(private var name: String) {
    private var alc: Int = 12
    private var vol: Double = 0.0
    private var exc: Int = 25
    private var clas: String = "Высший сорт"
    private var orig: String = "Темрюк"
    private var tip: String = "Топ напиток богов"

    constructor(name: String, _alc: Int) : this(name) {
        alc = _alc
    }

    constructor(name: String, _alc: Int, _vol: Double) : this(name, _alc) {

        vol = _vol
    }

    constructor(name: String, _alc: Int, _vol: Double, _exc: Int) : this(name, _alc, _vol) {

        exc = _exc
    }

    constructor(name: String, _alc: Int, _vol: Double, _exc: Int, _clas: String) : this(name, _alc, _vol, _exc) {
        clas = _clas
    }

    constructor(name: String, _alc: Int, _vol: Double, _exc: Int, _clas: String, _orig: String) : this(name, _alc, _vol, _exc, _clas) {
        orig = _orig
    }

    constructor(name: String, _alc: Int, _vol: Double, _exc: Int, _clas: String, _orig: String, _tip: String) : this(name, _alc, _vol, _exc, _clas, _orig) {
        tip = _tip
    }
    fun getvoid():String{
        return name
    }
}
