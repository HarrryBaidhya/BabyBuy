package np.edu.ismt.example.homeproduct.dashboard

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import np.edu.ismt.example.homeproduct.R
import np.edu.ismt.example.homeproduct.databinding.ActivityAddandUpdateBinding
import np.edu.ismt.example.homeproduct.databinding.ActivitySmsactivityBinding

class SMSActivity : AppCompatActivity() {
    private val TAG = "SMSActivity"
    private lateinit var binding: ActivitySmsactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmsactivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i(TAG, "onCreate: ")

    }
}