package com.books.orders.commonClass;
import com.books.orders.model.response.BooksDetailsResponse;
import com.books.orders.model.response.JustbookResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface JsonInterfaceClass {

    @GET(JsonConstants.SubURAL)
    @Headers({"Content-Type: application/json"})
    Call<JustbookResponse> justbook();

    /*@GET(JsonConstants.DETAILS)
    @Headers({"Content-Type: application/json"})
    Call<BooksDetailsResponse> booksDetails();*/

    @GET(JsonConstants.DETAILS)
    @Headers({"Content-Type: application/json"})
    Call<BooksDetailsResponse> booksDetails(@Query("titleId") String titleId);




}
