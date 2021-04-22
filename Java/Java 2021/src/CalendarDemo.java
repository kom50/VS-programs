import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.System.*;

import java.util.Date;

public class CalendarDemo {
      public static void main(String[] args) {

            Date d1 = new Date();
            GregorianCalendar rightNow = new GregorianCalendar();
            // rightNow.setGregorianChange(d1);
            out.println(GregorianCalendar.HOUR + " : " + rightNow.MINUTE + " : " + rightNow.SECOND);
            out.println(rightNow.MONTH + " : " + rightNow.AM_PM + " : " + rightNow.SECOND);
            out.println(rightNow.DATE + " : " + rightNow.MONTH + " : " + GregorianCalendar.YEAR);
            out.println(d1 + "\n - " + rightNow.get(rightNow.YEAR));

            Calendar c1 = Calendar.getInstance();
            out.println("Calendar : " + c1);
            out.println("DATE :  " + c1.get(c1.DATE) + " MONTH :  " + c1.get(c1.MONTH) + " YEAR :  " + c1.get(c1.YEAR));
            out.println("HOURS :  " + c1.get(c1.HOUR) + " MINUTES :  " + c1.get(c1.MINUTE) + " SECONDS :  "
                        + c1.get(c1.SECOND));
            out.println("DAY_OF_MONTH :  " + c1.get(c1.DAY_OF_MONTH));
            out.println("DAY_OF_WEEK :  " + rightNow);

            String month[] = { "Jan", "Feb", "Mar", "Apr", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            String d = c1.get(c1.DATE) < 10 ? "0" + c1.get(c1.DATE) : "" + c1.get(c1.DATE);
            String date = (c1.get(c1.DATE) < 10 ? "0" + c1.get(c1.DATE) : "" + c1.get(c1.DATE)) + "-"
                        + month[c1.get(c1.MONTH) - 1] + "-" + c1.get(c1.YEAR);// String.join(String.valueOf(c1.get(c1.DATE)),
                                                                              // "He");
            out.println(date);

      }
}
