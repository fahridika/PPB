package fahri.dika.myrecyclerview

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
//    companion object{
//        val INTENT_PARCELABLE = "OBJECT_INTENT"
//    }
    private lateinit var rvDosen : RecyclerView
    private var list: ArrayList<Dosen> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDosen = findViewById(R.id.rv_dosen)
        rvDosen.setHasFixedSize(true)

        list.addAll(DataDosen.listData)

        val cardViewHolder = DosenAdapter(list)
        rvDosen.adapter = cardViewHolder

        rvDosen.layoutManager = LinearLayoutManager(this)
        //val  xy: CardView = findViewById(card_)

    }

//    fun onClick(result: MatchResult){
//        startActivity(Intent(applicationContext, detaildosen::class.java))
//    }
}