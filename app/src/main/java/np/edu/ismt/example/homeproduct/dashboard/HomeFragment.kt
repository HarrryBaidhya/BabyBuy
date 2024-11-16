package np.edu.ismt.example.homeproduct.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import np.edu.ismt.example.homeproduct.dashboard.adapter.RecommendationHorizontalAdapter
import np.edu.ismt.example.homeproduct.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(
            layoutInflater,
            container,
            false
        )
        loadRecommendations()
        loadAddItemPage()
        loadADDSMSPage()
        return binding.root
    }

    private fun loadRecommendations() {
        //load recycler view
        val adapter = RecommendationHorizontalAdapter(getProductsForRecommendation())
        binding.rvRecommendations.layoutManager = LinearLayoutManager(
            requireActivity(),
            RecyclerView.HORIZONTAL,
            false
        )
        binding.rvRecommendations.adapter = adapter
    }


    private fun getProductsForRecommendation(): List<Product> {
        val products = mutableListOf<Product>()

        val product1 = Product(
            name = "Shirt",
            category = "Clothes",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product1)

        val product2 = Product(
            name = "brush",
            category = "Category",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product2)

        val product3 = Product(
            name = "Soap",
            category = "Category 3",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product3)

        return products
    }
      private fun loadAddItemPage() {
          binding.fabAddItem.setOnClickListener {
              val intent = Intent(
                  requireActivity(),
                  AddandUpdateActivity::class.java
              )
              startActivity(intent)
          }

      }
    private fun loadADDSMSPage() {
        binding.fabAddSms.setOnClickListener {
            val intent = Intent(
                requireActivity(),
                SMSActivity::class.java
            )
            startActivity(intent)
        }

    }


}