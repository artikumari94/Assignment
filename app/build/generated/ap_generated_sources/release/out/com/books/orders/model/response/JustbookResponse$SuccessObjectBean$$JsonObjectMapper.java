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
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unsafe,unchecked")
public final class JustbookResponse$SuccessObjectBean$$JsonObjectMapper extends JsonMapper<JustbookResponse.SuccessObjectBean> {
  private static final JsonMapper<JustbookResponse.SuccessObjectBean.ContentBean> COM_BOOKS_ORDERS_MODEL_RESPONSE_JUSTBOOKRESPONSE_SUCCESSOBJECTBEAN_CONTENTBEAN__JSONOBJECTMAPPER = LoganSquare.mapperFor(JustbookResponse.SuccessObjectBean.ContentBean.class);

  @Override
  public JustbookResponse.SuccessObjectBean parse(JsonParser jsonParser) throws IOException {
    JustbookResponse.SuccessObjectBean instance = new JustbookResponse.SuccessObjectBean();
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
  public void parseField(JustbookResponse.SuccessObjectBean instance, String fieldName, JsonParser jsonParser) throws IOException {
    if ("content".equals(fieldName)) {
      if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
        ArrayList<JustbookResponse.SuccessObjectBean.ContentBean> collection1 = new ArrayList<JustbookResponse.SuccessObjectBean.ContentBean>();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
          JustbookResponse.SuccessObjectBean.ContentBean value1;
          value1 = COM_BOOKS_ORDERS_MODEL_RESPONSE_JUSTBOOKRESPONSE_SUCCESSOBJECTBEAN_CONTENTBEAN__JSONOBJECTMAPPER.parse(jsonParser);
          collection1.add(value1);
        }
        instance.setContent(collection1);
      } else {
        instance.setContent(null);
      }
    }
  }

  @Override
  public void serialize(JustbookResponse.SuccessObjectBean object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
    if (writeStartAndEnd) {
      jsonGenerator.writeStartObject();
    }
    final List<JustbookResponse.SuccessObjectBean.ContentBean> lslocalcontent = object.getContent();
    if (lslocalcontent != null) {
      jsonGenerator.writeFieldName("content");
      jsonGenerator.writeStartArray();
      for (JustbookResponse.SuccessObjectBean.ContentBean element1 : lslocalcontent) {
        if (element1 != null) {
          COM_BOOKS_ORDERS_MODEL_RESPONSE_JUSTBOOKRESPONSE_SUCCESSOBJECTBEAN_CONTENTBEAN__JSONOBJECTMAPPER.serialize(element1, jsonGenerator, true);
        }
      }
      jsonGenerator.writeEndArray();
    }
    if (writeStartAndEnd) {
      jsonGenerator.writeEndObject();
    }
  }
}
