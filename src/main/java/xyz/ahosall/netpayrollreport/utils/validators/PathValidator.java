package xyz.ahosall.netpayrollreport.utils.validators;

public class PathValidator {
  public static void validate(String path) {
    if (path == null || path.isEmpty()) {
      throw new IllegalArgumentException("The path is missing");
    }
  }
}
