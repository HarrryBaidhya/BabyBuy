package np.edu.ismt.example.homeproduct

import android.content.Context
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.util.Log
import android.util.Patterns
import android.content.Intent
import np.edu.ismt.example.homeproduct.dashboard.DashBoardActivity
import np.edu.ismt.example.homeproduct.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i(TAG, "onCreate: ")
    binding.RegisterText.setOnClickListener {
        val intent = Intent(
        this@MainActivity,
        RegisterActivity::class.java
    )
        startActivity(intent)
        finish()
    }

        binding.btnLogin.setOnClickListener {
            val email = binding.tieEmail.text?.toString()?.trim()
            val password = binding.tiePassword.text?.toString()?.trim()
            if (email.isNullOrEmpty()) {
                Toast.makeText(
                    this@MainActivity,
                    "Please enter an email",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(
                    this@MainActivity,
                    "Please enter an valid email",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (password.isNullOrEmpty()) {
                Toast.makeText(
                    this@MainActivity,
                    "Please enter an password",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "Login SuccessFully",
                    Toast.LENGTH_SHORT
                ).show()
                // TODO Proceed for server/local-db validation
                val sharedPreferences = this@MainActivity.getSharedPreferences(
                    "app",
                    Context.MODE_PRIVATE
                )

                val sharedPrefEditor = sharedPreferences.edit()
                sharedPrefEditor.putBoolean(
                    "isLoggedIn",
                    true
                )
                sharedPrefEditor.apply()

                val test = Usetest(
                    variable1 = "This is test",
                    variable2 = 29
                )

                val intent = Intent(
                    this@MainActivity,
                    DashBoardActivity::class.java
                )
                intent.putExtra(Contant.ENTERED_EMAIL, email)
                intent.putExtra(Contant.KEY_TEST_OBJECT, test)
                startActivity(intent)
                finish()
            }



        }



        }


        override fun onStart() {
            super.onStart()
            Log.i(TAG, "onStart: ")
        }

        override fun onResume() {
            super.onResume()
            Log.i(TAG, "onResume: ")
        }

        override fun onPause() {
            super.onPause()
            Log.i(TAG, "onPause: ")
        }

        override fun onStop() {
            super.onStop()
            Log.i(TAG, "onStop: ")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.i(TAG, "onDestroy: ")
        }
    }
