package cat.insvidreres.inf.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cat.insvidreres.inf.affirmations.adapter.ItemAdapter
import cat.insvidreres.inf.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(myDataset, this)

//        val textView: TextView = findViewById(R.id.mainTextView)
////        textView.text = Datasource().loadAffirmations().size.toString()
    }
}