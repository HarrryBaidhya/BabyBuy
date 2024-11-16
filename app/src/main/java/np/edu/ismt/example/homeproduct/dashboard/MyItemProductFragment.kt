package np.edu.ismt.example.homeproduct.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import np.edu.ismt.example.homeproduct.R
import np.edu.ismt.example.homeproduct.dashboard.adapter.RecommendationHorizontalAdapter
import np.edu.ismt.example.homeproduct.databinding.FragmentHomeBinding
import np.edu.ismt.example.homeproduct.databinding.FragmentMyItemProductBinding



class MyItemProductFragment : Fragment() {
    private lateinit var binding: FragmentMyItemProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyItemProductBinding.inflate(
            layoutInflater,
            container,
            false
        )
        loadRecommendations()
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
            price="300",
            category = "Clothes",
            description="This is the for baby clothes",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product1)

        val product2 = Product(
            name = "brush",
            price = "50",
            description="This is the baby for brush",
            category = "Category",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product2)

        val product3 = Product(
            name = "Soap",
            price = "50",
            description="This is the suitable for baby for bathing",
            category = "Category 3",
            itemRequiredTime = PregnancyState.PRE_BIRTH
        )
        products.add(product3)

        return products
    }


}