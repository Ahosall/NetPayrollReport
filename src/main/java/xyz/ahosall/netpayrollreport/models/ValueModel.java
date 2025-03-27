package xyz.ahosall.netpayrollreport.models;

public class ValueModel {
  private String document;
  private String value;

  public ValueModel(String document, String value) {
    this.document = document;
    this.value = value;
  }

  public String getDocument() {
    return document;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
