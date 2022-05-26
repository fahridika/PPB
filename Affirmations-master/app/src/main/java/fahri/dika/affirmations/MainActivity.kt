package fahri.dika.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.RecyclerView
import fahri.dika.affirmations.adapter.ItemAdapter
import fahri.dika.affirmations.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Initialize data.
        val myDataset = DataSource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this, myDataset)


        recyclerView.setHasFixedSize(true)
    }
}