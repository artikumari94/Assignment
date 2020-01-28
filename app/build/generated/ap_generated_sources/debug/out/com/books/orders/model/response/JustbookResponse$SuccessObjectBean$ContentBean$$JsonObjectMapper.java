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
public final class JustbookResponse$SuccessObjectBean$ContentBean$$JsonObjectMapper extends JsonMapper<JustbookResponse.SuccessObjectBean.ContentBean> {
  @Override
  public JustbookResponse.SuccessObjectBean.ContentBean parse(JsonParser jsonParser) throws IOException {
    JustbookResponse.SuccessObjectBean.ContentBean instance = new JustbookResponse.SuccessObjectBean.ContentBean();
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
  public void parseField(JustbookResponse.SuccessObjectBean.ContentBean instance, String fieldName, JsonParser jsonParser) throws IOException {
    if ("author".equals(fieldName)) {
      instance.setAuthor(jsonParser.getValueAsString(null));
    } else if ("image_url".equals(fieldName)) {
      instance.setImage_url(jsonParser.getValueAsString(null));
    } else if ("title".equals(fieldName)) {
      instance.setTitle(jsonParser.getValueAsString(null));
    } else if ("title_id".equals(fieldName)) {
      instance.setTitle_id(jsonParser.getValueAsString(null));
    }
  }

  @Override
  public void serialize(JustbookResponse.SuccessObjectBean.ContentBean object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
    if (writeStartAndEnd) {
      jsonGenerator.writeStartObject();
    }
    if (object.getAuthor() != null) {
      jsonGenerator.writeStringField("author", object.getAuthor());
    }
    if (object.getImage_url() != null) {
      jsonGenerator.writeStringField("image_url", object.getImage_url());
    }
    if (object.getTitle() != null) {
      jsonGenerator.writeStringField("title", object.getTitle());
    }
    if (object.getTitle_id() != null) {
      jsonGenerator.writeStringField("title_id", object.getTitle_id());
    }
    if (writeStartAndEnd) {
      jsonGenerator.writeEndObject();
    }
  }
}
