package cgeo.geocaching.apps.cache.navi;

import cgeo.geocaching.Geocache;
import cgeo.geocaching.R;
import cgeo.geocaching.Waypoint;
import cgeo.geocaching.enumerations.WaypointType;
import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.maps.CGeoMap;

import android.app.Activity;

class InternalMap extends AbstractPointNavigationApp {

    InternalMap() {
        super(getString(R.string.cache_menu_map), null);
    }

    @Override
    public boolean isInstalled() {
        return true;
    }

    @Override
    public void navigate(final Activity activity, final Geopoint coords) {
        CGeoMap.startActivityCoords(activity, coords, WaypointType.WAYPOINT, null);
    }

    @Override
    public void navigate(final Activity activity, final Waypoint waypoint) {
        CGeoMap.startActivityCoords(activity, waypoint.getCoords(), waypoint.getWaypointType(), waypoint.getName());
    }

    @Override
    public void navigate(final Activity activity, final Geocache cache) {
        CGeoMap.startActivityGeoCode(activity, cache.getGeocode());
    }

}
