package com.books.orders.model.response;

import com.bluelinelabs.logansquare.JsonMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unsafe,unchecked")
public final class BooksDetailsResponse$$JsonObjectMapper extends JsonMapper<BooksDetailsResponse> {
  private static final JsonMapper<BooksDetailsResponse.SuccessObjectBean> COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN__JSONOBJECTMAPPER = LoganSquare.mapperFor(BooksDetailsResponse.SuccessObjectBean.class);

  @Override
  public BooksDetailsResponse parse(JsonParser jsonParser) throws IOException {
    BooksDetailsResponse instance = new BooksDetailsResponse();
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
  public void parseField(BooksDetailsResponse instance, String fieldName, JsonParser jsonParser) throws IOException {
    if ("successObject".equals(fieldName)) {
      instance.setSuccessObject(COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN__JSONOBJECTMAPPER.parse(jsonParser));
    }
  }

  @Override
  public void serialize(BooksDetailsResponse object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
    if (writeStartAndEnd) {
      jsonGenerator.writeStartObject();
    }
    if (object.getSuccessObject() != null) {
      jsonGenerator.writeFieldName("successObject");
      COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN__JSONOBJECTMAPPER.serialize(object.getSuccessObject(), jsonGenerator, true);
    }
    if (writeStartAndEnd) {
      jsonGenerator.writeEndObject();
    }
  }
}
