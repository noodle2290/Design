package app.murakami.takuro.youtubedesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val movieData: List<Moviedata> = listOf(
        Moviedata(R.drawable.vlog1,R.drawable.randy,"東北一週VLOG","ランディー・1700回視聴・3日前"),
        Moviedata(R.drawable.tech,R.drawable.randy,"[Life is Tech]Leaders研修","ランディー・1400回視聴・5日前"),
        Moviedata(R.drawable.vlog2,R.drawable.randy,"四国一周VLOG","ランディー・100回視聴・1ヵ月前"),
        Moviedata(R.drawable.vlog1,R.drawable.randy,"東北一週VLOG","ランディー・1700回"),
        Moviedata(R.drawable.tech,R.drawable.randy,"[Life is Tech]Leaders研修","ランディー・1400回"),
        Moviedata(R.drawable.vlog2,R.drawable.randy,"四国一周VLOG","ランディー・100回"),
        Moviedata(R.drawable.vlog1,R.drawable.randy,"東北一週VLOG","ランディー・1700回"),
        Moviedata(R.drawable.tech,R.drawable.randy,"[Life is Tech]Leaders研修","ランディー・1400回"),
        Moviedata(R.drawable.vlog2,R.drawable.randy,"四国一周VLOG","ランディー・100回"),
        Moviedata(R.drawable.vlog1,R.drawable.randy,"東北一週VLOG","ランディー・1700回"),
        Moviedata(R.drawable.tech,R.drawable.randy,"[Life is Tech]Leaders研修","ランディー・1400回"),
        Moviedata(R.drawable.vlog2,R.drawable.randy,"四国一周VLOG","ランディー・100回"),
        Moviedata(R.drawable.vlog1,R.drawable.randy,"東北一週VLOG","ランディー・1700回"),
        Moviedata(R.drawable.tech,R.drawable.randy,"[Life is Tech]Leaders研修","ランディー・1400回"),
        Moviedata(R.drawable.vlog2,R.drawable.randy,"四国一周VLOG","ランディー・100回"),
        Moviedata(R.drawable.vlog1,R.drawable.randy,"東北一週VLOG","ランディー・1700回"),
        Moviedata(R.drawable.tech,R.drawable.randy,"[Life is Tech]Leaders研修","ランディー・1400回"),
        Moviedata(R.drawable.vlog2,R.drawable.randy,"四国一周VLOG","ランディー・100回")
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