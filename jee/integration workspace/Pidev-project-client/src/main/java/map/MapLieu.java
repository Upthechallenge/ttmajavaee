/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;
import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Sabrine
 */
public class MapLieu extends Application implements MapComponentInitializedListener{
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


public double x;
public double y;


    @Override
    public void mapInitialized() {
        //Set the initial properties of the map.
    MapOptions mapOptions = new MapOptions();
    //.mapType(MapType.ROADMAP)
    
    
    
    String sx = this.getParameters().getRaw().get(0);
    String sy = this.getParameters().getRaw().get(1);
    x = ( Double.parseDouble(sx));
    y = ( Double.parseDouble(sy));
    
    String typeIcon = this.getParameters().getRaw().get(2);
    
    mapOptions.center(new LatLong(x,y)).zoom(12);
    
    map = mapView.createMap(mapOptions);

    //Add a marker to the map
    MarkerOptions markerOptions = new MarkerOptions();

    markerOptions.position( new LatLong(x, y) )
                .visible(Boolean.TRUE)
                .title("My Marker");
    
//"C:\\Users\\Sabrine\\Documents\\NetBeansProjects\\PiDev_t1_sabrine\\src\\Presentation\\restaurant.png"
    Marker marker = new Marker( markerOptions );

    map.addMarker(marker);  
    }


public static void main(String[] args) {
    launch(args);
}

    
    

   

    
    
}
