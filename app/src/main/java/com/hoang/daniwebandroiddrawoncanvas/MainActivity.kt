package com.hoang.daniwebandroiddrawoncanvas

import android.graphics.*
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.imageView_myImage)
            .setImageDrawable(BasicShapes())
    }
}

class BasicShapes : Drawable() {
    private val paint: Paint = Paint().apply {
        // Create your paint here
        style = Paint.Style.STROKE
        strokeWidth = 10f
        color = Color.CYAN
    }

    override fun draw(canvas: Canvas) {
        // Do your drawing here
        canvas.drawRect(
            Rect(
                100, // distance from left of view
                100, // distance from top of view
                400, // distance from left of view
                300 // distance from top of view
            ),
            paint
        )

        canvas.drawCircle(300f, 500f, 100f, paint)
        canvas.drawOval(
            RectF(100f, 700f, 500f, 800f),
            paint
        )
        // square
        canvas.drawRect(
            Rect(
                500, // distance from left of view
                100, // distance from top of view
                700, // distance from left of view
                300 // distance from top of view
            ),
            paint
        )
    }

    override fun setAlpha(alpha: Int) {
        // Required but can be left empty
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        // Required but can be left empty
    }

    @Deprecated("Deprecated by super class")
    override fun getOpacity() = PixelFormat.OPAQUE
}