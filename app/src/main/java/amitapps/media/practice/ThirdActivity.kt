package amitapps.media.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Log.d("Activity__3", "oncreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d("Activity__3", "onStart")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity__3", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity__3", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity__3", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity__3", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity__3", "onDestroy")
    }
}