package fahri.dika.volumebalok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        private const val STATE_RESULT = "state_result"
    }

    private lateinit var edtBil1: EditText
    private lateinit var edtBil2: EditText
    private lateinit var edtBil3: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtBil1 = findViewById(R.id.edtPanjang)
        edtBil2 = findViewById(R.id.edtLebar)
        edtBil3 = findViewById(R.id.edtTinggi)
        btnHitung = findViewById(R.id.btnHitung)
        tvHasil = findViewById(R.id.tvHasil)

        btnHitung.setOnClickListener(this)
        if (savedInstanceState != null) {
            val result = savedInstanceState.getString(STATE_RESULT)
            tvHasil.text = result
        }


    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnHitung) {
            val inputAngka1 = edtBil1.text.toString().trim()
            val inputAngka2 = edtBil2.text.toString().trim()
            val inputAngka3 = edtBil3.text.toString().trim()

            var isEmptyField = false
            if (inputAngka1.isEmpty()) {
                isEmptyField = true
                edtBil1.error = "gaboleh kosong"
            }
            if (inputAngka2.isEmpty()) {
                isEmptyField = true
                edtBil2.error = "gaboleh kosong"
            }
            if (inputAngka3.isEmpty()) {
                isEmptyField = true
                edtBil2.error = "gaboleh kosong"
            }
            if (!isEmptyField) {
                val jumlah =
                    inputAngka1.toDouble() * inputAngka2.toDouble() * inputAngka3.toDouble()
                tvHasil.text = jumlah.toString()
            }
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, tvHasil.text.toString())
    }

}


