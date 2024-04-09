package chon.julio.practica_api_233242.data

import chon.julio.practica_api.data.model.Product
import kotlinx.coroutines.flow.Flow


interface ProductsRepository {
    suspend fun getProductsList(): Flow<Result<List<Product>>>
}