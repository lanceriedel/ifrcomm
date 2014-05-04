package com.hivedata.mobileappserver.webapp.pojo;

/**
 * Created with IntelliJ IDEA.
 * User: lanceriedel
 * Date: 5/3/14
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */

//Cessna 70977 you are <5> miles northwest of <sunol> cross <manis> at or above <altitude> cleared the <approach>

public class ClearanceComm {
    private String callSign = "Cessna 70977";
    private int distanceFromCurrentLocationRef;
    private String  currentLocationRef;
    private  String iaf;


    private String message;


    public String getMessage() {

        int random = (int )(Math.random() * 3 + 1);

        switch (random) {
            case 1:
                return message1();
            case 2:
                return message2();
            case 3:
                return message3();
        }
        return message1();

    }

    //Cessna 70977 you are <5> miles northwest of <sunol> cross <manis> at or above <altitude> cleared the <approach>

    private String message1() {

        return callSign + " you are " + distFromRef() + " miles " + directionFromRef() +
                " from " +locationReference() + ", cross " + FAF() + " at or above " + altitude() + ", cleared the " +
                approach() + " approach ";

    }

    private String message2() {
        return callSign + " you are " + distFromRef() + " miles " + directionFromRef() +
                " from " +locationReference() + ", turn " + vector() + ", cross " + FAF() + " at or above " + altitude() + ", cleared the " +
                approach() + " approach ";
    }

    private String message3() {
        return callSign + " you are " + distFromRef() + " miles " + directionFromRef() +
                " from " +locationReference() + ", turn " + vector() + ", cross " + FAF() + " at or above " + altitude() + ", cleared the " +
                approach() + " approach, report when established, please state your intentions upon completion of the approach";

    }

    private int distFromRef() {
        int random = (int )(Math.random() * 20 + 1);
        return random;
    }

    private String vector() {
        int random = (int )(Math.random() * 2 + 1);
        String dir = "left";
        if (random==1)
               dir = "right";

        return dir + " heading " + heading();


    }

    private int heading() {
        int random = (int )(Math.random() * 36 + 1);
        return random;
    }

    private String directionFromRef() {
        int random = (int )(Math.random() * 8 + 1);
        switch (random) {
            case 1:
                return "North";
            case 2:
                return "NorthEast";
            case 3:
                return "East";
            case 4:
                return "SouthEast";
            case 5:
                return "South";
            case 6:
                return "SouthWest";
            case 7:
                return "West";
            case 8:
                return "NorthWest";
        }
          return "North";
    }


    private String locationReference() {
        int random = (int )(Math.random() * 8 + 1);
        switch (random) {
            case 1:
                return "Manteca VOR";
            case 2:
                return "Sunol Intersection";
            case 3:
                return "San Jose VOR";
            case 4:
                return "Oakland VOR";
            case 5:
                return "Docal";
            case 6:
                return "Concord VOR";
            case 7:
                return "Tracy Intersection";
            case 8:
                return "Woodside VOR";
        }
        return "Macy Intersection";
    }


    private String FAF() {
        int random = (int )(Math.random() * 8 + 1);
        switch (random) {
            case 1:
                return "Brien";
            case 2:
                return "Jiban";
            case 3:
                return "Jorpa";
            case 4:
                return "Sunol";
            case 5:
                return "Blant";
            case 6:
                return "Altam";
            case 7:
                return "Jeneg";
            case 8:
                return "Sapid";
        }
        return "Pudby";
    }

    private String altitude() {
        int random = (int )(Math.random() * 8 + 3);
        int random2 = (int )(Math.random() * 10 + 1);

        if (random2==10) {
            return random + " thousand";
        }
        else {
            return random + " thousand " + random2 + "00";
        }

    }


    private String approach() {
        int random = (int )(Math.random() * 8 + 1);
        switch (random) {
            case 1:
                return "Palo Alto GPS Runway 31";
            case 2:
                return "Oakland ILS or Localizer Runway 12";
            case 3:
                return "Tracy VOR/DME Runway 26";
            case 4:
                return "San Jose ILS 29 Right";
            case 5:
                return "Hayward R-NAV GPS Runway 28 Left";
            case 6:
                return "Livermore ILS Runway 28 Right";
            case 7:
                return "Tracy R-NAV GPS Runway 12";
            case 8:
                return "Oakland ILS or Localizer DME Runway 28 Right";
        }
        return "Tracy R-NAV GPS Runway 12";
    }






}
