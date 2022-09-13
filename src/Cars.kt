abstract class Cars (val model : String): Motor{
    open fun getfueltype(): String {
        return "null"
    }

    override fun type(): String {
        return "Cars"
    }

}