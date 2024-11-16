package np.edu.ismt.example.homeproduct

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Usetest(
    val variable1: String,
    val variable2: Int

):Parcelable