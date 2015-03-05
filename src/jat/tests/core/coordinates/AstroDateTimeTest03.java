package jat.tests.core.coordinates;

import org.joda.time.DateTime;

import jat.core.coordinates.AstroDateTimeLocation;

public class AstroDateTimeTest03 {

	public static void main(final String[] args) {
		AstroDateTimeLocation adt;
		double JD;
		String s, t;

		
		System.out.println("AstroDateTimeTest03");

		long JSTime=1425528000000l;

		// milliseconds from 1970-01-01T00:00:00Z using ISOChronology in the specified time zone
		adt = new AstroDateTimeLocation(JSTime, "CST6CDT");
		JD = adt.getJD();

		s = String.format("%-32s%-25s%-25s", "", "Expected", "JAT");
		System.out.println(s);
		t = String.format("%-32s%-25.2f%-25.2f", "1425528000000ms CST -> JD", 2457086.66667, JD);
		System.out.println(t);
		t = String.format("%-32s%-25s%-25s", "1425528000000ms CST -> UTC", "3/04/2015 22:00:00 CDT", adt.getLocalDateTime());
		System.out.println(t);
		t = String.format("%-32s%-25s%-25s", "1425528000000ms CST -> UTC", "3/05/2015 04:00:00 UTC", adt.getUTCDateTime());
		System.out.println(t);

	}

}
