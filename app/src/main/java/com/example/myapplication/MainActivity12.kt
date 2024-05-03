package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.runtime.image.ImageProvider
import com.yandex.mapkit.map.MapObjectTapListener
import com.yandex.mapkit.mapview.MapView
private lateinit var mapView: MapView
class MainActivity12 : AppCompatActivity() {
    private val placemarkTapListener10 = MapObjectTapListener { _, point ->
// Переходим на новую активити
        val intent = Intent(this@MainActivity12, MainActivity11::class.java)
        startActivity(intent)
        true
    }
    private val placemarkTapListener1 = MapObjectTapListener { _, point ->
// Переходим на новую активити
        val intent = Intent(this@MainActivity12, MainActivity2::class.java)
        startActivity(intent)
        true
    }
    private val placemarkTapListener2 = MapObjectTapListener { _, point ->
// Переходим на новую активити
        val intent = Intent(this@MainActivity12, MainActivity3::class.java)
        startActivity(intent)
        true
    }
    private val placemarkTapListener3 = MapObjectTapListener { _, point ->
// Переходим на новую активити
        val intent = Intent(this@MainActivity12, MainActivity4::class.java)
        startActivity(intent)
        true
    }
    private val placemarkTapListener4 = MapObjectTapListener { _, point ->
// Переходим на новую активити
        val intent = Intent(this@MainActivity12, MainActivity5::class.java)
        startActivity(intent)
        true
    }
    private val placemarkTapListener5 = MapObjectTapListener { _, point ->
// Переходим на новую активити
        val intent = Intent(this@MainActivity12, MainActivity6::class.java)
        startActivity(intent)
        true
    }
    private val placemarkTapListener6 = MapObjectTapListener { _, point ->
// Переходим на новую активити
        val intent = Intent(this@MainActivity12, MainActivity7::class.java)
        startActivity(intent)
        true
    }
    private val placemarkTapListener7 = MapObjectTapListener { _, point ->
// Переходим на новую активити
        val intent = Intent(this@MainActivity12, MainActivity8::class.java)
        startActivity(intent)
        true
    }
    private val placemarkTapListener8 = MapObjectTapListener { _, point ->
// Переходим на новую активити
        val intent = Intent(this@MainActivity12, MainActivity9::class.java)
        startActivity(intent)
        true
    }
    private val placemarkTapListener9 = MapObjectTapListener { _, point ->
// Переходим на новую активити
        val intent = Intent(this@MainActivity12, MainActivity10::class.java)
        startActivity(intent)
        true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey("681e96c6-8d85-4f46-91a7-0e091a4eca20")
        MapKitFactory.initialize(this)
        setContentView(R.layout.activity_main12)
        mapView = findViewById(R.id.mapview)
        mapView.map.move(
            CameraPosition(
                Point(55.751225, 37.629540),
                /* zoom = */ 17.0f,
                /* azimuth = */ 150.0f,
                /* tilt = */ 30.0f
            )
        )
        val imageProvider = ImageProvider.fromResource(this, R.drawable.ic_pin)
        val placemark1 = mapView.map.mapObjects.addPlacemark().apply {
            geometry = Point(53.587803, 97.214216)
            setIcon(imageProvider)

        }
        val placemark2 = mapView.map.mapObjects.addPlacemark().apply {
            geometry = Point(44.988381, 37.256870)
            setIcon(imageProvider)

        }
        val placemark3 = mapView.map.mapObjects.addPlacemark().apply {
            geometry = Point(43.115536, 131.885485)
            setIcon(imageProvider)

        }
        val placemark4 = mapView.map.mapObjects.addPlacemark().apply {
            geometry = Point(49.782901, 87.730971)
            setIcon(imageProvider)

        }
        val placemark5 = mapView.map.mapObjects.addPlacemark().apply {
            geometry = Point(41.115706, 29.068566)
            setIcon(imageProvider)

        }
        val placemark6 = mapView.map.mapObjects.addPlacemark().apply {
            geometry = Point(59.383759, -84.663700)
            setIcon(imageProvider)

        }
        val placemark7 = mapView.map.mapObjects.addPlacemark().apply {
            geometry = Point(44.039799, 43.070639)
            setIcon(imageProvider)

        }
        val placemark8 = mapView.map.mapObjects.addPlacemark().apply {
            geometry = Point(53.721152, 91.442387)
            setIcon(imageProvider)

        }
        val placemark9 = mapView.map.mapObjects.addPlacemark().apply {
            geometry = Point(43.794501, 131.869037)
            setIcon(imageProvider)

        }
        val placemark10 = mapView.map.mapObjects.addPlacemark().apply {
            geometry = Point(48.480248, 135.071671)
            setIcon(imageProvider)

        }
        placemark1.addTapListener(placemarkTapListener1)
        placemark2.addTapListener(placemarkTapListener2)
        placemark3.addTapListener(placemarkTapListener3)
        placemark4.addTapListener(placemarkTapListener4)
        placemark5.addTapListener(placemarkTapListener5)
        placemark6.addTapListener(placemarkTapListener6)
        placemark7.addTapListener(placemarkTapListener7)
        placemark8.addTapListener(placemarkTapListener8)
        placemark9.addTapListener(placemarkTapListener9)
        placemark10.addTapListener(placemarkTapListener10)
    }
    override fun onStart() {
        super.onStart()
        MapKitFactory.getInstance().onStart()
        mapView.onStart()
    }

    override fun onStop() {
        mapView.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }
}