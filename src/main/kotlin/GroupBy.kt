class GroupBy {

    fun invoke() {
        val groupedByItems = items.groupBy { it.type }
        println(groupedByItems)

        val groupedByItemsReference = items.groupBy(Item::type)
        println(groupedByItemsReference)

        val groupedByItemsNamesOnly = items.groupBy(
            (Item::type),
            (Item::name)
        )
        println(groupedByItemsNamesOnly)

        val premiumItems = items.groupBy(Item::type)[ItemType.PREMIUM]
        val otherItems = items.groupBy(Item::type)
            .filterNot { it.key == ItemType.PREMIUM }
            .values
            .flatten()

        println("Premium: $premiumItems")
        println("Other types: $otherItems")
    }
}