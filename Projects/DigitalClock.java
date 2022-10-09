package Projects;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DigitalClock {
    public static void main(String[] args) {

        //digital clock
        new myFrame();


    }

    public static class myFrame<Jlabel> extends JFrame {

        //set calendar, and call time
        Calendar calendar;
        SimpleDateFormat timeFormat;
        SimpleDateFormat dayFormat;
        SimpleDateFormat dateFormat;
        JLabel timeLabel;
        JLabel dayLabel;
        JLabel dateLabel;
        String time;
        String day;
        String date;

        //sets the look/frame of how the gui will look
        myFrame() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Digital Watch");
            this.setLayout(new FlowLayout());
            this.setSize(300, 250);

            //sets time format
            timeFormat = new SimpleDateFormat("HH:mm:ss");
            //sets the day format
            dayFormat = new SimpleDateFormat("EEEE");
            //sets the date format
            dateFormat = new SimpleDateFormat("d, M, Y");

            //shows the time of the day
            timeLabel = new JLabel();

            //shows the day of the week
            dayLabel = new JLabel();

            //shows the date of the year
            dateLabel = new JLabel();

            this.add(timeLabel); //adds the time to gui frame
            this.add(dayLabel); //adds the day to gui frame
            this.add(dateLabel); //adds the date to gui frame
            this.setVisible(true);

            setTime(); //this method will help to update time every second.
        }

        public void setTime() {

            while (true) {
                //this gets the time in real time
                time = timeFormat.format(Calendar.getInstance().getTime());
                //timeFormat brings calendar, getInstance gets the real date, getTime changes format to time
                //then time is set as a value for timeLabel
                timeLabel.setText(time);

                //this gets the day in real time
                day = dayFormat.format(Calendar.getInstance().getTime());
                //dayFormat brings calendar, getInstance gets the real date
                //then day is set as a value for dayLabel
                dayLabel.setText(day);

                //this gets the date in real time
                date = dateFormat.format(Calendar.getInstance().getTime());
                //dateFormat brings calendar, getInstance gets the real date
                //then date is set as a value for dateLabel
                dateLabel.setText(date);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}