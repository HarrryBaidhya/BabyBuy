package np.edu.ismt.example.homeproduct.dashboard.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "User_table")
data class UserProfileEntity(
    @PrimaryKey(autoGenerate = true)
    val Userid: Long = 0,
    val FirstName: String? = "",
    val LastName: String? = "",
    val Email: String? = "",
    val password:String?="",
    val MobileNo: String? = "",
    val locationLng: String? = "",
    val ConfirmPassword: String?="",
    val image: String = ""

)
