package com.udacity.geofence.basics.util

import com.google.android.gms.maps.model.LatLng
import com.udacity.geofence.basics.R
import com.udacity.geofence.basics.model.LandmarkModel
import java.util.concurrent.TimeUnit

internal object Constant {

    /**
     * Used to set an expiration time for a geofence. After this amount of time, Location services
     * stops tracking the geofence. For this sample, geofences expire after one hour.
     */
    val GEOFENCE_EXPIRATION_IN_MILLISECONDS: Long = TimeUnit.HOURS.toMillis(1)

    val LANDMARK_DATA = arrayOf(
        LandmarkModel(
            "golden_gate_bridge",
            R.string.golden_gate_bridge_hint,
            R.string.golden_gate_bridge_location,
            LatLng(37.819927, -122.478256)
        ),

        LandmarkModel(
            "ferry_building",
            R.string.ferry_building_hint,
            R.string.ferry_building_location,
            LatLng(37.795490, -122.394276)
        ),

        LandmarkModel(
            "pier_39",
            R.string.pier_39_hint,
            R.string.pier_39_location,
            LatLng(37.808674, -122.409821)
        ),

        LandmarkModel(
            "union_square",
            R.string.union_square_hint,
            R.string.union_square_location,
            LatLng(37.788151, -122.407570)
        )
    )

    val NUM_LANDMARKS = LANDMARK_DATA.size
    const val GEOFENCE_RADIUS_IN_METERS = 100f
    const val EXTRA_GEOFENCE_INDEX = "GEOFENCE_INDEX"

    const val REQUEST_FOREGROUND_AND_BACKGROUND_PERMISSION_RESULT_CODE = 33
    const val REQUEST_FOREGROUND_ONLY_PERMISSIONS_REQUEST_CODE = 34
    const val REQUEST_TURN_DEVICE_LOCATION_ON = 29
    const val LOCATION_PERMISSION_INDEX = 0
    const val BACKGROUND_LOCATION_PERMISSION_INDEX = 1
    internal const val ACTION_GEOFENCE_EVENT =
        "MainActivity.treasureHunt.action.ACTION_GEOFENCE_EVENT"

    const val HINT_INDEX_KEY = "hintIndex"
    const val GEOFENCE_INDEX_KEY = "geofenceIndex"
}