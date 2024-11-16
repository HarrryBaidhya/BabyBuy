package np.edu.ismt.example.homeproduct.dashboard.db

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface UserProfileDao {

    @Insert
    fun insertProduct(UserProfileEntity: UserProfileEntity)

    @Insert
    fun insertProducts(UserProfileEntities: List<ProductEntity>)

    @Update
    fun updateProduct(UserProfileEntity: UserProfileEntity)

    @Delete
    fun deleteProduct(UserProfileEntity: UserProfileEntity)

    @Query("select * from User_table")
    fun getAllUsers(): List<UserProfileEntity>


}