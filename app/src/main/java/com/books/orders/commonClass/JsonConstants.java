package com.books.orders.commonClass;

public class JsonConstants {

    private static JsonConstants soleInstance = null;

    private JsonConstants() {

    }

    public static JsonConstants getInstance() {
        if (soleInstance == null) {
            soleInstance = new JsonConstants();
        }
        return soleInstance;
    }

    public static final String INTERNET_CHECK_URL = "https://www.google.co.in/";

    public static final String BASE_URL = "https://esapi.justbooks.in/";/*UAT Server*/

    public static final String SubURAL = "getNewArrivalsMobile";
    //  public static final String DETAILS = "getTitleDetails?titleId=613735";
    public static final String DETAILS = "getTitleDetails";


}
