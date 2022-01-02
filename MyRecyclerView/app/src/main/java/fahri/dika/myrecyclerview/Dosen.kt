package fahri.dika.myrecyclerview

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Dosen (
    var name: String = "",
    var nip: String = "",
    var keahlian: String = "",
    var photo: Int = 0
        ) :Parcelable




