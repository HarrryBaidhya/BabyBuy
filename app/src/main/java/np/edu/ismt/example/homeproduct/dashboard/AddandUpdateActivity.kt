package np.edu.ismt.example.homeproduct.dashboard

import android.content.Context
import android.content.Intent
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import np.edu.ismt.example.homeproduct.Contant
import np.edu.ismt.example.homeproduct.R
import np.edu.ismt.example.homeproduct.Usetest
import np.edu.ismt.example.homeproduct.dashboard.db.BabyBuyDatabase
import np.edu.ismt.example.homeproduct.dashboard.db.ProductEntity
import np.edu.ismt.example.homeproduct.databinding.ActivityAddandUpdateBinding
import np.edu.ismt.example.homeproduct.databinding.ActivityMainBinding


class AddandUpdateActivity : AppCompatActivity() {
    private val TAG = "AddandUpdateActivity"
    private lateinit var binding: ActivityAddandUpdateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddandUpdateBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i(TAG, "onCreate: ")

        binding.mbAddOrUpdate.setOnClickListener {
            val ProductName = binding.etProductName.text?.toString()?.trim()
            val Price = binding.etPrice.text?.toString()?.trim()
            val Description = binding.etDescription.text?.toString()?.trim()
            val location = binding.etLoction.text?.toString()?.trim()
            if (ProductName.isNullOrEmpty()) {
                Toast.makeText(
                    this@AddandUpdateActivity,
                    "Please enter an productName",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (Price.isNullOrEmpty()) {
                Toast.makeText(
                    this@AddandUpdateActivity,
                    "Please enter an Price",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this@AddandUpdateActivity,
                    "Product save sucessfully",
                    Toast.LENGTH_SHORT
                ).show()
                // TODO Proceed for server/local-db validation
                val sharedPreferences = this@AddandUpdateActivity.getSharedPreferences(
                    "app",
                    Context.MODE_PRIVATE
                )
                val sampleDb = BabyBuyDatabase.getInstance(this.applicationContext)
                val productDao = sampleDb.InsertProductDao()
               val intent = Intent(
                    this@AddandUpdateActivity,
                    DashBoardActivity::class.java
                )

                startActivity(intent)
                finish()
            }
        }
    }

}