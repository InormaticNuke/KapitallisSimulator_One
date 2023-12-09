package kapOne.kap.kapitallissimulator_one;

import androidx.appcompat.app.AppCompatActivity;

public class mapView extends AppCompatActivity {

    private static final double EARTH_RADIUS = 6371;

    //AQUI SE MOSTRARA UN MAPA DE DONDE ENCONTRAR LA SUCURSAL, WORK IN PROGRESS

    /*public static double mapView(GeoPoint point1, GeoPoint point2) {
        double lat1 = Math.toRadians(point1.getLatitude());
        double lon1 = Math.toRadians(point1.getLongitude());

        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS * c;
    }*/

}
