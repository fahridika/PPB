package fahri.dika.myrecyclerview

import android.media.Image
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text

class DataView : AppCompatActivity() {

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_NIP = "extra_nip"
        const val EXTRA_KEAHLIAN = "extra_keahlian"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dataview)
        var imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvNama: TextView = findViewById(R.id.tv_item_name)
        val tvNip: TextView = findViewById(R.id.tv_item_nip)
        val tvKeahlian: TextView = findViewById(R.id.tv_item_keahlian)

        val name = intent.getStringExtra(EXTRA_NAME)
        val nip = intent.getStringExtra(EXTRA_NIP)
        val keahlian = intent.getStringExtra(EXTRA_KEAHLIAN)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        imgPhoto.setImageResource(photo)
        tvNama.text = name
        tvNip.text = nip
        tvKeahlian.text = keahlian
    }
}