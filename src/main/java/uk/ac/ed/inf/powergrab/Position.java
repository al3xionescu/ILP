package uk.ac.ed.inf.powergrab;

public class Position {
	public double latitude;
	public double longitude;
	public Position(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Position nextPosition(Direction direction) {
		if (direction.curr == Direction.Dir.N) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.NNE) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.NE) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.ENE) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.E) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.ESE) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.SE) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.SSE) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.S) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.SSW) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.SW) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.WS) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.W) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.WNW) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.NW) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		} else if (direction.curr == Direction.Dir.NNW) {
			this.latitude = this.latitude * Math.cos(67.5);
			this.longitude = this.longitude * Math.sin(67.5);
		}
		
		return new Position(this.latitude, this.longitude);
		
	}
	public boolean inPlayArea() {
		return (Boolean) null;
	}
}
