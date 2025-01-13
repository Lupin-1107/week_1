public class EarthVolume {
  public static void main(String[] args) {
      // Radius of Earth in kilometers
      double radiusKm = 6378.0;

      // Conversion factor: 1 km = 0.621371 miles
      double kmToMiles = 0.621371;

      // Volume of a sphere formula: (4/3) * pi * r^3
      double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

      // Converting radius to miles and calculating volume in miles^3
      double radiusMiles = radiusKm * kmToMiles;
      double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

      // Displaying the results
      System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 +
                         " and in cubic miles is " + volumeMiles3);
  }
}
