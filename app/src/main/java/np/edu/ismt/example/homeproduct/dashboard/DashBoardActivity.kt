package np.edu.ismt.example.homeproduct.dashboard

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import np.edu.ismt.example.homeproduct.R
import np.edu.ismt.example.homeproduct.databinding.ActivityDashBoardBinding

class DashBoardActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDashBoardBinding
    private val fragmentManager = supportFragmentManager
    private val homeFragment = HomeFragment()
    private val myItemsFragment = MyItemProductFragment()
    private val recommendationFragment = RecommendationFragment()
    private val profileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadRespectiveFragment(homeFragment)
        binding.bottomNav.setOnNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId) {
                R.id.home -> {
                    loadRespectiveFragment(homeFragment)
                    true
                }

                R.id.my_items -> {
                    loadRespectiveFragment(myItemsFragment)
                    true
                }

                R.id.recommendations -> {
                    loadRespectiveFragment(recommendationFragment)
                    true
                }

                R.id.profile -> {
                    loadRespectiveFragment(profileFragment)
                    true
                }

                else -> false
            }
        }

    }

    private fun loadRespectiveFragment(fragment: Fragment) {
        fragmentManager.beginTransaction()
            .replace(
                binding.fragmentContainerView.id,
                fragment,
                null
            )
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
    }

}