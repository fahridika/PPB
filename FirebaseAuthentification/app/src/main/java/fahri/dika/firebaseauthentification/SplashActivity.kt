package fahri.dika.firebaseauthentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
//        goToMain()
    }


//    private fun goToMain() {
//        Thread.sleep(4000)
//        val i = Intent(this@SplashActivity, MainActivity::class.java)
//        finish()
//        startActivity(i)
    }

