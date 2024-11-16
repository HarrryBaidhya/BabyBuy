package np.edu.ismt.example.homeproduct.dashboard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import np.edu.ismt.example.homeproduct.dashboard.Product
import np.edu.ismt.example.homeproduct.databinding.LayoutRecommendationItemBinding


class RecommendationHorizontalAdapter(
    private val products: List<Product>
): RecyclerView.Adapter<RecommendationHorizontalAdapter.ViewHolder>() {

    class ViewHolder(val binding: LayoutRecommendationItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LayoutRecommendationItemBinding.inflate(
            inflater,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.binding.tvNameRecommendationItem.text = product.name
        holder.binding.tvCategoryRecommendationItem.text = product.category
    }
}