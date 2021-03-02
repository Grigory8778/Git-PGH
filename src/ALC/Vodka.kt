package ALC

class Vodka(var name: String) {
    var alc: Int = 40
    var vol: Double = 0.0
    var clas: String = "Ниже дна"
    var orig: String = "Славянск на кубани"
    var tip: String = "ссанина"

    constructor(name: String, _alc: Int) : this(name) {
        alc = _alc
    }

    constructor(name: String, _alc: Int, _vol: Double) : this(name, _alc) {

        vol = _vol
    }

    constructor(name: String, _alc: Int, _vol: Double, _clas: String) : this(name, _alc, _vol) {
        clas = _clas
    }

    constructor(name: String, _alc: Int, _vol: Double, _clas: String, _orig: String) : this(name, _alc, _vol, _clas) {
        orig = _orig
    }

    constructor(name: String, _alc: Int, _vol: Double, _clas: String, _orig: String, _tip: String) : this(name, _alc, _vol, _clas, _orig) {
        tip = _tip
    }
}