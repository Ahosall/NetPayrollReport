package xyz.ahosall.netpayrollreport.models;

public class CollaboratorModel {
  private String code;
  private String document;

  public CollaboratorModel(String code, String document) {
    this.code = code;
    this.document = document;
  }

  public String getCode() {
    return code;
  }

  public String getDocument() {
    return document;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
