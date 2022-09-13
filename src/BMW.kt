class BMW(val color: String, val speed: String) : Cars("BMW"){

    override fun getfueltype(): String {
        return "Gas"
    }

}