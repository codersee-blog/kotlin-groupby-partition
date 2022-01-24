data class Item(
    val name: String,
    val type: ItemType
)

enum class ItemType {
    STANDARD, PREMIUM, OTHER
}

val items = listOf(
    Item(name = "Item #1", type = ItemType.STANDARD),
    Item(name = "Item #2", type = ItemType.OTHER),
    Item(name = "Item #3", type = ItemType.PREMIUM),
    Item(name = "Item #4", type = ItemType.STANDARD),
    Item(name = "Item #5", type = ItemType.PREMIUM),
)