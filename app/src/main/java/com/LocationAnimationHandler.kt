package com.example.t

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class LocationAnimationHandler {

    public var location: Location

    init {
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
    }

    public fun currentLocation() {
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location.getCurrentLocation(), 16f))
    }

    public fun hospitalLocations() {
        
    }
}