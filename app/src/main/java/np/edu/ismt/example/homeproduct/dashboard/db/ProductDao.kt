package np.edu.ismt.example.homeproduct.dashboard.db

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface ProductDao {

    @Insert
    fun insertProduct(productEntity: ProductEntity)

    @Insert
    fun insertProducts(productEntities: List<ProductEntity>)

    @Update
    fun updateProduct(productEntity: ProductEntity)

    @Delete
    fun deleteProduct(productEntity: ProductEntity)

    @Query("select * from product_table")
    fun getAllProducts(): List<ProductEntity>

    @Query("select * from product_table where name = :nameOfProduct")
    fun getAllProductsByName(nameOfProduct: String): List<ProductEntity>
}