package geometry;

public class Angle {

	double degrees;
	
	Angle(double degrees) {
		try {
			setAngle(degrees);
		} catch (IllegalDegreeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Angle(LineSegment lineA, LineSegment lineB) throws IllegalDenominatorException {
		float m1 = lineA.getSlope();
		float m2 = lineB.getSlope();
		
		this.degrees = Math.toDegrees(Math.abs(Math.atan((m1 - m2) / (1 + m1 * m2))));
	}
	
	public void setAngle(double degrees) throws IllegalDegreeException {
		
		if ((degrees < 0) || (degrees > 180))
			throw new IllegalDegreeException("Illegal value for the degree of the angle");
		
		this.degrees = degrees;
	}
	
	public double getAngle() {
		return degrees;
	}
	
	public boolean isRight() {
		return degrees == 90;
	}
	
	public boolean isObtuse() {
		return ((degrees > 90) && (degrees <= 180));
	}
	
	public boolean isAcute() {
		return ((degrees < 90) && (degrees >= 0));
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Angle))
			return false;
		Angle a = (Angle) obj;
		return a.degrees == this.degrees;
	}
	
	@Override
	public int hashCode() {
		Double dDegrees = degrees;
		return dDegrees.hashCode();
	}
	
	@Override
	public String toString() {
		return String.format("Angle Degrees: %.2f", getAngle());
	}
}