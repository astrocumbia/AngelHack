package me.irvincastellanos.angelhack.item

/**
 * Created by positr0nix on 7/9/17.
 */
data class ProductItem(
        val id: Int,
        val name: String,
        val image: String,
        val gender: String,
        val brand: String,
        val ranking: Double,
        val stores: List<StoreItem>) {

    fun getMinPrice(): Double {
        var maxPrice: Double = 100000.0
        for (store in stores) {
            maxPrice = minOf(maxPrice, store.price)
        }
        return maxPrice
    }
}