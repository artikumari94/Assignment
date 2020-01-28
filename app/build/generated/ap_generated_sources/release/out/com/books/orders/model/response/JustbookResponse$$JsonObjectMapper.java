package com.books.orders.model.response;

import com.bluelinelabs.logansquare.JsonMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unsafe,unchecked")
public final class JustbookResponse$$JsonObjectMapper extends JsonMapper<JustbookResponse> {
  private static final JsonMapper<JustbookResponse.SuccessObjectBean> COM_BOOKS_ORDERS_MODEL_RESPONSE_JUSTBOOKRESPONSE_SUCCESSOBJECTBEAN__JSONOBJECTMAPPER = LoganSquare.mapperFor(JustbookResponse.SuccessObjectBean.class);

  private static final JsonMapper<Object> COM_BLUELINELABS_LOGANSQUARE_INTERNAL_OBJECTMAPPERS_OBJECTMAPPER = LoganSquare.mapperFor(Object.class);

  @Override
  public JustbookResponse parse(JsonParser jsonParser) throws IOException {
    JustbookResponse instance = new JustbookResponse();
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
  public void parseField(JustbookResponse instance, String fieldName, JsonParser jsonParser) throws IOException {
    if ("errorDescription".equals(fieldName)) {
      instance.setErrorDescription(COM_BLUELINELABS_LOGANSQUARE_INTERNAL_OBJECTMAPPERS_OBJECTMAPPER.parse(jsonParser));
    } else if ("nextPageIsAvailable".equals(fieldName)) {
      instance.setNextPageIsAvailable(jsonParser.getValueAsBoolean());
    } else if ("status".equals(fieldName)) {
      instance.setStatus(jsonParser.getValueAsBoolean());
    } else if ("statusMsg".equals(fieldName)) {
      instance.setStatusMsg(COM_BLUELINELABS_LOGANSQUARE_INTERNAL_OBJECTMAPPERS_OBJECTMAPPER.parse(jsonParser));
    } else if ("successObject".equals(fieldName)) {
      instance.setSuccessObject(COM_BOOKS_ORDERS_MODEL_RESPONSE_JUSTBOOKRESPONSE_SUCCESSOBJECTBEAN__JSONOBJECTMAPPER.parse(jsonParser));
    }
  }

  @Override
  public void serialize(JustbookResponse object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
    if (writeStartAndEnd) {
      jsonGenerator.writeStartObject();
    }
    if (object.getErrorDescription() != null) {
      COM_BLUELINELABS_LOGANSQUARE_INTERNAL_OBJECTMAPPERS_OBJECTMAPPER.serialize(object.getErrorDescription(), jsonGenerator, true);
    }
    jsonGenerator.writeBooleanField("nextPageIsAvailable", object.isNextPageIsAvailable());
    jsonGenerator.writeBooleanField("status", object.isStatus());
    if (object.getStatusMsg() != null) {
      COM_BLUELINELABS_LOGANSQUARE_INTERNAL_OBJECTMAPPERS_OBJECTMAPPER.serialize(object.getStatusMsg(), jsonGenerator, true);
    }
    if (object.getSuccessObject() != null) {
      jsonGenerator.writeFieldName("successObject");
      COM_BOOKS_ORDERS_MODEL_RESPONSE_JUSTBOOKRESPONSE_SUCCESSOBJECTBEAN__JSONOBJECTMAPPER.serialize(object.getSuccessObject(), jsonGenerator, true);
    }
    if (writeStartAndEnd) {
      jsonGenerator.writeEndObject();
    }
  }
}
