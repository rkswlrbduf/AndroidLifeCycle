package blackstone.com.androidlifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("LifeCycle", "onCreate Activated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "onStart Activated")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "onResume Activated")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "onPause Activated")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "onStop Activated")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle", "onRestart Activated")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "onDestroy Activated")
    }

}
