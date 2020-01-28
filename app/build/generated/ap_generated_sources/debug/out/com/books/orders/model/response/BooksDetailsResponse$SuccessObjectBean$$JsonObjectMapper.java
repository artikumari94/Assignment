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
public final class BooksDetailsResponse$SuccessObjectBean$$JsonObjectMapper extends JsonMapper<BooksDetailsResponse.SuccessObjectBean> {
  private static final JsonMapper<BooksDetailsResponse.SuccessObjectBean.JbInfoBean> COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN_JBINFOBEAN__JSONOBJECTMAPPER = LoganSquare.mapperFor(BooksDetailsResponse.SuccessObjectBean.JbInfoBean.class);

  @Override
  public BooksDetailsResponse.SuccessObjectBean parse(JsonParser jsonParser) throws IOException {
    BooksDetailsResponse.SuccessObjectBean instance = new BooksDetailsResponse.SuccessObjectBean();
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
  public void parseField(BooksDetailsResponse.SuccessObjectBean instance, String fieldName, JsonParser jsonParser) throws IOException {
    if ("description".equals(fieldName)) {
      instance.setDescription(jsonParser.getValueAsString(null));
    } else if ("image_url".equals(fieldName)) {
      instance.setImage_url(jsonParser.getValueAsString(null));
    } else if ("jb_info".equals(fieldName)) {
      instance.setJb_info(COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN_JBINFOBEAN__JSONOBJECTMAPPER.parse(jsonParser));
    }
  }

  @Override
  public void serialize(BooksDetailsResponse.SuccessObjectBean object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
    if (writeStartAndEnd) {
      jsonGenerator.writeStartObject();
    }
    if (object.getDescription() != null) {
      jsonGenerator.writeStringField("description", object.getDescription());
    }
    if (object.getImage_url() != null) {
      jsonGenerator.writeStringField("image_url", object.getImage_url());
    }
    if (object.getJb_info() != null) {
      jsonGenerator.writeFieldName("jb_info");
      COM_BOOKS_ORDERS_MODEL_RESPONSE_BOOKSDETAILSRESPONSE_SUCCESSOBJECTBEAN_JBINFOBEAN__JSONOBJECTMAPPER.serialize(object.getJb_info(), jsonGenerator, true);
    }
    if (writeStartAndEnd) {
      jsonGenerator.writeEndObject();
    }
  }
}
