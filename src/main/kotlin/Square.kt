class Square (val width: Int): Figure() {

    override fun perimeter(): Float {
        return ((4*width).toFloat())
    }

    override fun area(): Float {
        return ((width*width).toFloat())
    }
}