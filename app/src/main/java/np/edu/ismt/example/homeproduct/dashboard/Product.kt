package np.edu.ismt.example.homeproduct.dashboard


data class Product(
    val name: String? = "",
    val price: String? = "",
    val description: String? = "",
    val category: String? = "",
    val itemRequiredTime: PregnancyState,
    val markAsPurchased: Boolean = false,
    val locationLat: String? = "",
    val locationLng: String? = "",
    val image: String = ""
)
enum class PregnancyState{
    PRE_BIRTH, POST_BIRTH
}