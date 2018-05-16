package florent37.github.com.shrine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu?.setOnClickListener {
            if (middleSheet.isEnabled) {
                middleSheet.animate()
                        .translationY(bottomSheet.height.toFloat())
            } else {
                middleSheet.animate()
                        .translationY(0f)
            }
            middleSheet.isEnabled = !middleSheet.isEnabled
        }

        topSheet?.setOnClickListener {

        }
        addToCart?.setOnClickListener {

        }
    }
}
