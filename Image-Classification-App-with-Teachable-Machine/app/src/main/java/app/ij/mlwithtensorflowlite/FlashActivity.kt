package app.ij.mlwithtensorflowlite

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class FlashActivity : AppCompatActivity() {

    internal var handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash)
        handler.postDelayed({
            val intent = Intent(this, StartActivity::class.java)  //회원가입함수 구현 후 회원가입 엑티비티로 변경이 필요 --> 로그인 창으로 이동
            startActivity(intent)
            finish() }, 2000)
    }
}