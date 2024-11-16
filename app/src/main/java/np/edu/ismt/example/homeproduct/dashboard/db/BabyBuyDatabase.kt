package np.edu.ismt.example.homeproduct.dashboard.db
import androidx.room.Room
import android.content.Context
import androidx.room.Database
import androidx.room.Insert
import androidx.room.RoomDatabase


@Database(
    entities = [ProductEntity::class],
    version = 1
)
abstract class BabyBuyDatabase: RoomDatabase() {
    companion object {
        fun getInstance(applicationContext: Context): BabyBuyDatabase {
            return Room.databaseBuilder(
                applicationContext,
                BabyBuyDatabase::class.java,
                "Baby_db"
            ).build()
        }
    }

    abstract fun getProductDao(): ProductDao
    abstract  fun InsertProductDao():ProductDao
}