class Circle (val radius: Int): Figure() {

    override fun perimeter(): Float {
        return ((2*3.14*radius).toFloat())
    }

    override fun area(): Float {
        return ((3.14*radius*radius).toFloat())
    }
}