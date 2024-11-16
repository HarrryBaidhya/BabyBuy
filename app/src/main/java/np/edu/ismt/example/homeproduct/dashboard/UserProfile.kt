package np.edu.ismt.example.homeproduct.dashboard

data class UserProfile(
    val FirstName: String? = "",
    val LastName: String? = "",
    val Email: String? = "",
    val password:String?="",
    val MobileNo: String? = "",
    val locationLng: String? = "",
    val ConfirmPassword: String?="",
    val image: String = ""
)

