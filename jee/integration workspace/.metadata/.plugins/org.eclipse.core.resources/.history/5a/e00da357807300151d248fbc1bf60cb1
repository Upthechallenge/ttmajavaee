/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.event.UIEventType;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MVCArray;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
import com.lynden.gmapsfx.javascript.object.Polyline;
import com.lynden.gmapsfx.javascript.object.PolylineOptions;
import com.lynden.gmapsfx.shapes.Polygon;
import com.lynden.gmapsfx.shapes.PolygonOptions;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

/**
 *
 * @author Sabrine
 */
public class MapItineraire extends Application implements MapComponentInitializedListener{
    GoogleMapView mapView;
    GoogleMap map;
    
    private double latitude;
    private double longitude;
    private Byte[] mapIcon;

@Override
public void start(Stage stage) throws Exception {

    //Create the JavaFX component and set this as a listener so we know when 
    //the map has been initialized, at which point we can then begin manipulating it.
    mapView = new GoogleMapView();
    mapView.addMapInializedListener((MapComponentInitializedListener) this);
    

    Scene scene = new Scene(mapView);

    stage.setTitle("JavaFX and Google Maps");
    stage.setScene(scene);
    stage.show();
}


public double x1, y1, x2, y2;


    @Override
    public void mapInitialized() {
        //Set the initial properties of the map.
    MapOptions mapOptions = new MapOptions();
    //.mapType(MapType.ROADMAP)
    
    
    
    String lat1 = this.getParameters().getRaw().get(0);
    String longi1 = this.getParameters().getRaw().get(1);
    x1 = ( Double.parseDouble(lat1));
    y1 = ( Double.parseDouble(longi1));
    
    String lat2 = this.getParameters().getRaw().get(2);
    String longi2 = this.getParameters().getRaw().get(3);
    x2 = ( Double.parseDouble(lat2));
    y2 = ( Double.parseDouble(longi2));
    
    
    mapOptions.center(new LatLong(x1,y1)).zoom(8);
    
    map = mapView.createMap(mapOptions);

    //Add a marker to the map
    MarkerOptions markerOptions1 = new MarkerOptions();

    markerOptions1.position( new LatLong(x1, y1) )
                .visible(Boolean.TRUE)
                .title("My Marker");
    MarkerOptions markerOptions2 = new MarkerOptions();

    markerOptions2.position( new LatLong(x2, y2) )
                .visible(Boolean.TRUE)
                .title("My Marker");
    
//"C:\\Users\\Sabrine\\Documents\\NetBeansProjects\\PiDev_t1_sabrine\\src\\Presentation\\restaurant.png"
    Marker marker1 = new Marker( markerOptions1 );
     Marker marker2 = new Marker( markerOptions2 );

    map.addMarker(marker1);
    map.addMarker(marker2);
    
    
    
    
    
    
        LatLong poly1 = new LatLong(x1, y1);
        LatLong poly2 = new LatLong(x2, y2);
        
        LatLong[] pAry = new LatLong[]{poly1, poly2};
        MVCArray pmvc = new MVCArray(pAry);

        PolygonOptions polygOpts = new PolygonOptions()
                .paths(pmvc)
                .strokeColor("blue")
                .strokeWeight(2)
                .editable(false)
                .fillColor("lightBlue")
                .fillOpacity(0.5);

        Polygon pg = new Polygon(polygOpts);
        map.addMapShape(pg);
        map.addUIEventHandler(pg, UIEventType.click, (JSObject obj) -> {
            polygOpts.editable(true);
            pg.setEditable(!pg.getEditable());
        });
        
        
        
        
        //Add an info window to the Map.
        /*InfoWindowOptions infoOptions = new InfoWindowOptions();
        infoOptions.content("<h2>Center of the Universe</h2>")
                .position(center);

        InfoWindow window = new InfoWindow(infoOptions);
        window.open(map, myMarker);*/
    
    
    }


public static void main(String[] args) {
    launch(args);
}

    
}
