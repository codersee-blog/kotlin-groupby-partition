class Partition {

    fun invoke() {
        val premiumTypesFiltered = items.filter { it.type == ItemType.PREMIUM }
        val otherTypesFiltered = items.filterNot { it.type == ItemType.PREMIUM }
        println("Premium: $premiumTypesFiltered")
        println("Other types: $otherTypesFiltered")

        val partitioned = items.partition { it.type == ItemType.PREMIUM }
        println("Premium: ${partitioned.first}")
        println("Other types: ${partitioned.second}")

        val (premiumTypes, otherTypes) = items.partition { it.type == ItemType.PREMIUM }
        println("Premium: $premiumTypes")
        println("Other types: $otherTypes")
    }
}