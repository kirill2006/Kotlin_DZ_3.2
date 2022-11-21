class Circle (val a: Int, val b: Int, val c: Int, val h: Int): Figure() {

    override fun perimeter(): Float {
        return ((a+b+c).toFloat())
    }

    override fun area(): Float {
        return ((a*0.5*h).toFloat())
    }
}