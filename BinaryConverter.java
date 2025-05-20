package shape;

//Converts a binary string to its decimal equivalent.

//Throws BinaryFormatException if the string contains invalid characters.
//Custom checked exception
class BinaryFormatException extends Exception {
  public BinaryFormatException(String message) {
      super(message);
  }
}

public class BinaryConverter {

  // Method to convert binary string to decimal
  public static int bin2Dec(String binary) throws BinaryFormatException {
      // Validate if string contains only 0s and 1s
      if (!binary.matches("[01]+")) {
          throw new BinaryFormatException("Invalid binary string: " + binary);
      }

      // Convert to decimal
      return Integer.parseInt(binary, 2);
  }

  // Main method to test
  public static void main(String[] args) {
      try {
          String binaryString = "10101"; // valid
          int decimal = bin2Dec(binaryString);
          System.out.println("Decimal: " + decimal);

          String invalidBinary = "10210"; // invalid, should throw exception
          System.out.println("Decimal: " + bin2Dec(invalidBinary));
      } catch (BinaryFormatException e) {
          System.out.println("Error: " + e.getMessage());
      }
  }
}
