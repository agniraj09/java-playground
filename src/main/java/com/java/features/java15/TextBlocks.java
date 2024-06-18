package com.java.features.java15;

public class TextBlocks {

    public static void main(String[] args) {
        String textBlock =
                """
                    SELECT taxiid, drivername, make, taxinumber, currentlocation, status
                    FROM public.taxi_details;
                """;
        System.out.println(textBlock);
    }
}
