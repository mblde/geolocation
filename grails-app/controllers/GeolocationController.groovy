

import org.grails.plugins.geolocation.Coordinates;
import org.grails.plugins.geolocation.GeoPosition;
import grails.converters.*;
import org.codehaus.groovy.grails.web.json.*
class GeolocationController {
 def setGeoPosition = {
    def o = JSON.parse(params.val); // Parse a JSON String
	def position = new GeoPosition(o)
	def coords = new Coordinates(o.coords)
    position.coords = coords
	session.position = position
     }

   def showMap = {
      render(view: "/map/show");
   }
}
