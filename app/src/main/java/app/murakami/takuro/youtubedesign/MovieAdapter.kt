package app.murakami.takuro.youtubedesign

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val context: Context):RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    val movies:MutableList<Moviedata> = mutableListOf()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val thumnailImage: ImageView = view.findViewById(R.id.thumnailImage)
        val iconImage: ImageView = view.findViewById(R.id.iconImage)
        val titleText: TextView = view.findViewById(R.id.titleText)
        val infoText: TextView = view.findViewById(R.id.infoText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.movie,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        holder.thumnailImage.setImageResource(movie.thumnail)
        holder.iconImage.setImageResource(movie.icon)
        holder.titleText.text = movie.title
        holder.infoText.text = movie.info
    }

    fun addAll(movies:List<Moviedata>){
        this.movies.addAll(movies)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}
