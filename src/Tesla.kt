class Tesla(val color: String, val speed: String) : Cars("Tesla") {

    override fun getfueltype(): String {
        return "Electricity"
    }

}