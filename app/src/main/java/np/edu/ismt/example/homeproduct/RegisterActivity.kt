package np.edu.ismt.example.homeproduct

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import np.edu.ismt.example.homeproduct.dashboard.DashBoardActivity
import np.edu.ismt.example.homeproduct.dashboard.db.BabyBuyDatabase
import np.edu.ismt.example.homeproduct.databinding.ActivityMainBinding
import np.edu.ismt.example.homeproduct.databinding.RegisterMainBinding
import java.net.PasswordAuthentication

class RegisterActivity : AppCompatActivity() {
    private val TAG = "RegisterActivity"
    private lateinit var binding: RegisterMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegisterMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i(TAG, "onCreate: ")

        binding.mdSave.setOnClickListener {
            val FirstName = binding.etFirstName.text?.toString()?.trim()
            val LastName = binding.etLastName.text?.toString()?.trim()
            val Password = binding.etPassword.text?.toString()?.trim()
            val location = binding.etLoction.text?.toString()?.trim()
            val ConfirmPassword = binding.etCPassword.text?.toString()?.trim()
            val Email = binding.etEmail.text?.toString()?.trim()
            if (FirstName.isNullOrEmpty()) {
                Toast.makeText(
                    this@RegisterActivity,
                    "Please enter an FirstName",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (LastName.isNullOrEmpty()) {
                Toast.makeText(
                    this@RegisterActivity,
                    "Please enter LastName",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this@RegisterActivity,
                    "User Register Sucess",
                    Toast.LENGTH_SHORT
                ).show()
                // TODO Proceed for server/local-db validation
                val sharedPreferences = this@RegisterActivity.getSharedPreferences(
                    "app",
                    MODE_PRIVATE
                )
                val sampleDb = BabyBuyDatabase.getInstance(this.applicationContext)
                val productDao = sampleDb.InsertProductDao()
                val intent = Intent(
                    this@RegisterActivity,
                    MainActivity::class.java
                )

                startActivity(intent)
                finish()
            }


        }
    }
}