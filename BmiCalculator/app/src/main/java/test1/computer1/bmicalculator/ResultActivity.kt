package test1.computer1.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var height = intent.getStringExtra("height").toInt();
        var weight = intent.getStringExtra("weight").toInt();

        val bmi = weight / Math.pow(height / 100.0, 2.0)

        when{
            bmi >= 35 -> resultTextView.text = "고도비만"
            bmi >= 30 -> resultTextView.text = "30"
            bmi >= 25 -> resultTextView.text = "25"
            bmi >= 23 -> resultTextView.text = "23"
            bmi >= 18.5 -> resultTextView.text = "18.5"
            else -> resultTextView.text = "저체중"
        }

        when{
            bmi >= 23 ->
                imageView.setImageResource(R.drawable.ic_sentiment_very_dissatisfied_black_24dp)
            bmi >= 18.5 ->
                imageView.setImageResource(R.drawable.ic_sentiment_satisfied_black_24dp)
            else ->
                imageView.setImageResource(R.drawable.ic_sentiment_dissatisfied_black_24dp)
        }
    }
}
