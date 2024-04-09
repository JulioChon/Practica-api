package chon.julio.practica_api.data.model

import chon.julio.practica_api.data.model.Product

data class Products(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)