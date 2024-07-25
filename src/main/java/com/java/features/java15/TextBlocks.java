package com.java.features.java15;

public class TextBlocks {

    public static void main(String[] args) {

        String queryWithoutTextBlock = "SELECT \n" + "\ttaxiid,\n"
                + "\tdrivername,\n"
                + "\tmake,\n"
                + "\ttaxinumber,\n"
                + "\tcurrentlocation,\n"
                + "\tstatus\n"
                + "FROM\n"
                + "\tpublic.taxi_details;";

        String queryWithTextBlock =
                """
                    SELECT
                        taxiid,
                        drivername,
                        make,
                        taxinumber,
                        currentlocation,
                        status
                    FROM
                    public.taxi_details;
                """;

        System.out.println(queryWithTextBlock);
    }
}
