package np.edu.ismt.example.homeproduct

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.logging.Handler
import javax.accessibility.AccessibleKeyBinding
import javax.swing.text.html.HTML.Tag

class MainActivity : AppCompatActivity() {
    private val Tag="MainActivity"
    Private lateinit var binding: MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        Log.i(Tag, msg:"onCreate: ")
        }
      //  val intent = Intent(packagecontext this, )
        Handler.Postdelayouut(){
         //   val intent = Intent(packagecontext this,MainActivity)

        }

    }
}