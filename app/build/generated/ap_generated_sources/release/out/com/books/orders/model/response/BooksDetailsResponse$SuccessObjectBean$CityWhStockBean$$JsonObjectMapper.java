package com.books.orders.model.response;

import com.bluelinelabs.logansquare.JsonMapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unsafe,unchecked")
public final class BooksDetailsResponse$SuccessObjectBean$CityWhStockBean$$JsonObjectMapper extends JsonMapper<BooksDetailsResponse.SuccessObjectBean.CityWhStockBean> {
  @Override
  public BooksDetailsResponse.SuccessObjectBean.CityWhStockBean parse(JsonParser jsonParser) throws IOException {
    BooksDetailsResponse.SuccessObjectBean.CityWhStockBean instance = new BooksDetailsResponse.SuccessObjectBean.CityWhStockBean();
    if (jsonParser.getCurrentToken() == null) {
      jsonParser.nextToken();
    }
    if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
      jsonParser.skipChildren();
      return null;
    }
    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
      String fieldName = jsonParser.getCurrentName();
      jsonParser.nextToken();
      parseField(instance, fieldName, jsonParser);
      jsonParser.skipChildren();
    }
    return instance;
  }

  @Override
  public void parseField(BooksDetailsResponse.SuccessObjectBean.CityWhStockBean instance, String fieldName, JsonParser jsonParser) throws IOException {
  }

  @Override
  public void serialize(BooksDetailsResponse.SuccessObjectBean.CityWhStockBean object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
    if (writeStartAndEnd) {
      jsonGenerator.writeStartObject();
    }
    if (writeStartAndEnd) {
      jsonGenerator.writeEndObject();
    }
  }
}
