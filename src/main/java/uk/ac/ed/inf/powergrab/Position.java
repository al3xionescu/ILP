package uk.ac.ed.inf.powergrab;

public class Position {
    public double latitude;
    public double longitude;
    public Position(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public Position nextPosition(Direction direction) {
        double newLatitude = 0;
        double newLongitude = 0;
        if (direction == Direction.N) {
            newLatitude = App.distance * Math.sin((Math.toRadians(90)));
            newLongitude = App.distance * Math.cos((Math.toRadians(90)));
        } else if (direction == Direction.NNE) {
            newLatitude = App.distance * Math.sin((Math.toRadians(67.5)));
            newLongitude = App.distance * Math.cos((Math.toRadians(67.5)));
        } else if (direction == Direction.NE) {
            newLatitude = App.distance * Math.sin((Math.toRadians(45)));
            newLongitude = App.distance * Math.cos((Math.toRadians(45)));
        } else if (direction == Direction.ENE) {
            newLatitude = App.distance * Math.sin((Math.toRadians(22.5)));
            newLongitude = App.distance * Math.cos((Math.toRadians(22.5)));
        } else if (direction == Direction.E) {
            newLatitude = App.distance * Math.sin((Math.toRadians(0)));
            newLongitude = App.distance * Math.cos((Math.toRadians(0)));
        } else if (direction == Direction.ESE) {
            newLatitude -= App.distance * Math.sin((Math.toRadians(22.5)));
            newLongitude = App.distance * Math.cos((Math.toRadians(22.5)));
        } else if (direction == Direction.SE) {
            newLatitude -= App.distance * Math.sin((Math.toRadians(45)));
            newLongitude = App.distance * Math.cos((Math.toRadians(45)));
        } else if (direction == Direction.SSE) {
            newLatitude -= App.distance * Math.sin((Math.toRadians(67.5)));
            newLongitude = App.distance * Math.cos((Math.toRadians(67.5)));
        } else if (direction == Direction.S) {
            newLatitude -= App.distance * Math.sin((Math.toRadians(90)));
            newLongitude = App.distance * Math.cos((Math.toRadians(90)));
        } else if (direction == Direction.SSW) {
            newLatitude -= App.distance * Math.sin((Math.toRadians(112.5)));
            newLongitude = App.distance * Math.cos((Math.toRadians(112.5)));
        } else if (direction == Direction.SW) {
            newLatitude -= App.distance * Math.sin((Math.toRadians(135)));
            newLongitude = App.distance * Math.cos((Math.toRadians(135)));
        } else if (direction == Direction.WSW) {
            newLatitude -= App.distance * Math.sin((Math.toRadians(157.5)));
            newLongitude = App.distance * Math.cos((Math.toRadians(157.5)));
        } else if (direction == Direction.W) {
            newLatitude = App.distance * Math.sin((Math.toRadians(0)));
            newLongitude -= App.distance * Math.cos((Math.toRadians(0)));
        } else if (direction == Direction.WNW) {
            newLatitude = App.distance * Math.sin((Math.toRadians(22.5)));
            newLongitude -= App.distance * Math.cos((Math.toRadians(22.5)));
        } else if (direction == Direction.NW) {
            newLatitude = App.distance * Math.sin((Math.toRadians(45)));
            newLongitude -= App.distance * Math.cos((Math.toRadians(45)));
        } else if (direction == Direction.NNW) {
            newLatitude = App.distance * Math.sin((Math.toRadians(67.5)));
            newLongitude -= App.distance * Math.cos((Math.toRadians(67.5)));
        }
        
        return new Position(this.latitude + newLatitude, this.longitude + newLongitude);
        
    }
    public boolean inPlayArea() {
    	if (this.longitude <= -3.192473 || this.longitude >= -3.184319) {
    		return false;
    	}
    	if (this.latitude <= 55.942617 || this.latitude >= 55.946233) {
    		return false;
    	}
        return true;
    }
    public static void main(String[] args) {
        final Position p0 = new Position(55.942616, -3.188396);
        System.out.print(p0.inPlayArea());
    }
}