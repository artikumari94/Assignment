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
public final class BooksDetailsResponse$SuccessObjectBean$JbInfoBean$$JsonObjectMapper extends JsonMapper<BooksDetailsResponse.SuccessObjectBean.JbInfoBean> {
  private static final JsonMapper<BooksDetailsResponse.SuccessObjectBean.JbInfoBean.AuthorBean> COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN_JBINFOBEAN_AUTHORBEAN__JSONOBJECTMAPPER = LoganSquare.mapperFor(BooksDetailsResponse.SuccessObjectBean.JbInfoBean.AuthorBean.class);

  private static final JsonMapper<BooksDetailsResponse.SuccessObjectBean.JbInfoBean.CategoryBean> COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN_JBINFOBEAN_CATEGORYBEAN__JSONOBJECTMAPPER = LoganSquare.mapperFor(BooksDetailsResponse.SuccessObjectBean.JbInfoBean.CategoryBean.class);

  @Override
  public BooksDetailsResponse.SuccessObjectBean.JbInfoBean parse(JsonParser jsonParser) throws IOException {
    BooksDetailsResponse.SuccessObjectBean.JbInfoBean instance = new BooksDetailsResponse.SuccessObjectBean.JbInfoBean();
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
  public void parseField(BooksDetailsResponse.SuccessObjectBean.JbInfoBean instance, String fieldName, JsonParser jsonParser) throws IOException {
    if ("author".equals(fieldName)) {
      instance.setAuthor(COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN_JBINFOBEAN_AUTHORBEAN__JSONOBJECTMAPPER.parse(jsonParser));
    } else if ("avg_reading_time".equals(fieldName)) {
      instance.setAvg_reading_time(jsonParser.getValueAsInt());
    } else if ("category".equals(fieldName)) {
      instance.setCategory(COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN_JBINFOBEAN_CATEGORYBEAN__JSONOBJECTMAPPER.parse(jsonParser));
    } else if ("times_rented".equals(fieldName)) {
      instance.setTimes_rented(jsonParser.getValueAsInt());
    } else if ("title".equals(fieldName)) {
      instance.setTitle(jsonParser.getValueAsString(null));
    } else if ("".equals(fieldName)) {
      instance.setTitleid(jsonParser.getValueAsInt());
    }
  }

  @Override
  public void serialize(BooksDetailsResponse.SuccessObjectBean.JbInfoBean object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
    if (writeStartAndEnd) {
      jsonGenerator.writeStartObject();
    }
    if (object.getAuthor() != null) {
      jsonGenerator.writeFieldName("author");
      COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN_JBINFOBEAN_AUTHORBEAN__JSONOBJECTMAPPER.serialize(object.getAuthor(), jsonGenerator, true);
    }
    jsonGenerator.writeNumberField("avg_reading_time", object.getAvg_reading_time());
    if (object.getCategory() != null) {
      jsonGenerator.writeFieldName("category");
      COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN_JBINFOBEAN_CATEGORYBEAN__JSONOBJECTMAPPER.serialize(object.getCategory(), jsonGenerator, true);
    }
    jsonGenerator.writeNumberField("times_rented", object.getTimes_rented());
    if (object.getTitle() != null) {
      jsonGenerator.writeStringField("title", object.getTitle());
    }
    jsonGenerator.writeNumberField("", object.getTitleid());
    if (writeStartAndEnd) {
      jsonGenerator.writeEndObject();
    }
  }
}
