package ba.vaktija.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val green = Color.rgb(13, 66, 48)
        val gold = Color.rgb(225, 190, 100)
        val white = Color.WHITE

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 36, 28, 36)
            setBackgroundColor(green)
        }

        fun text(value: String, size: Float, color: Int) =
            TextView(this).apply {
                text = value
                textSize = size
                setTextColor(color)
                gravity = Gravity.CENTER
                setPadding(8, 12, 8, 12)
            }

        root.addView(text("☾  VAKTIJA  ☽", 30f, gold))
        root.addView(text("Namaska vremena", 18f, white))
        root.addView(text("Dobro došli", 24f, gold))
        root.addView(text("Odaberite svoj grad u postavkama.", 16f, white))

        val prayers = listOf(
            "Sabah       --:--",
            "Izlazak sunca       --:--",
            "Podne       --:--",
            "Ikindija       --:--",
            "Akšam       --:--",
            "Jacija       --:--"
        )

        prayers.forEach {
            root.addView(text(it, 19f, white))
        }

        root.addView(
            text("Vaktija je u izradi", 14f, gold)
        )

        setContentView(root)
    }
}
