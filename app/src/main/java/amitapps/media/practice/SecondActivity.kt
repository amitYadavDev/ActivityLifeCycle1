package amitapps.media.practice

import amitapps.media.practice.databinding.ActivityMainBinding
import amitapps.media.practice.databinding.ActivitySecondBinding
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil


class SecondActivity : ComponentActivity() {
    var _binding: ActivitySecondBinding? = null
    val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        binding.lifecycleOwner = this
        binding.secondActivity.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
        Log.d("Activity__2", "oncreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity__2", "onStart")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity__2", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity__2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity__2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity__2", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity__2", "onDestroy")
    }
}