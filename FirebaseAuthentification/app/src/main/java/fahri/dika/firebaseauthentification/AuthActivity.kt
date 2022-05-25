package fahri.dika.firebaseauthentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_auth.*

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        //tambahan klik
        btn_signin_auth.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }

        btn_signup_auth.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}