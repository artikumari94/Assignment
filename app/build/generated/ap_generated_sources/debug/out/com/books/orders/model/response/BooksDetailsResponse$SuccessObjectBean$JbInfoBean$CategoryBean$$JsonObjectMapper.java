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
public final class BooksDetailsResponse$SuccessObjectBean$JbInfoBean$CategoryBean$$JsonObjectMapper extends JsonMapper<BooksDetailsResponse.SuccessObjectBean.JbInfoBean.CategoryBean> {
  @Override
  public BooksDetailsResponse.SuccessObjectBean.JbInfoBean.CategoryBean parse(JsonParser jsonParser) throws IOException {
    BooksDetailsResponse.SuccessObjectBean.JbInfoBean.CategoryBean instance = new BooksDetailsResponse.SuccessObjectBean.JbInfoBean.CategoryBean();
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
  public void parseField(BooksDetailsResponse.SuccessObjectBean.JbInfoBean.CategoryBean instance, String fieldName, JsonParser jsonParser) throws IOException {
    if ("name".equals(fieldName)) {
      instance.setName(jsonParser.getValueAsString(null));
    }
  }

  @Override
  public void serialize(BooksDetailsResponse.SuccessObjectBean.JbInfoBean.CategoryBean object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
    if (writeStartAndEnd) {
      jsonGenerator.writeStartObject();
    }
    if (object.getName() != null) {
      jsonGenerator.writeStringField("name", object.getName());
    }
    if (writeStartAndEnd) {
      jsonGenerator.writeEndObject();
    }
  }
}
