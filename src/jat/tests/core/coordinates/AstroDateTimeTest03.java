package jat.tests.core.coordinates;

import jat.core.coordinates.AstroDateTimeLocation;

public class AstroDateTimeTest03 {

	public static void main(final String[] args) {
		AstroDateTimeLocation adt;
		double JD;
		String s, t;

		System.out.println("AstroDateTimeTest03");

		long JSTime=1425523873000l;
		adt = new AstroDateTimeLocation(JSTime, "CST6CDT");
		JD = adt.getJD();

		s = String.format("%-32s%-25s%-25s", "", "Expected", "JAT");
		System.out.println(s);
		t = String.format("%-32s%-25.2f%-25.2f", "2/17/1985 06:00:00 CST -> JD", 2446114., JD);
		System.out.println(t);
		// System.out.println(adt.getUTCDateTime());
		t = String.format("%-32s%-25s%-25s", "2/17/1985 06:00:00 CST -> UTC", "2/17/1985 12:00:00 UTC", adt.getUTCDateTime());
		System.out.println(t);

	}

}
