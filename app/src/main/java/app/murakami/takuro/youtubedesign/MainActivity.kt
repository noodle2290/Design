package app.murakami.takuro.youtubedesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val movieData: List<Moviedata> = listOf(
        Moviedata(R.drawable.ranking,R.drawable.randy,"ランキングダンジョン","ランディー・1400回"),
        Moviedata(R.drawable.ranking,R.drawable.randy,"ランキングダンジョン","ランディー・1400回"),
        Moviedata(R.drawable.ranking,R.drawable.randy,"ランキングダンジョン","ランディー・1400回")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MovieAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(movieData)
    }
}