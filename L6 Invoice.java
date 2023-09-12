/**
 * @author Jackson Coghill #041089141
 * @see Payme.java
 * @see Programmer.java
 * @see SalariedProgrammer.java
 * @see HourlyProgrammer.java
 * @see CommissionProgrammer.java
 * @see BasePlusCommissionProgrammer.java
 * @see PaymeInterfaceTest.java
 * @version 1.0
 * @since Java 1.8
 */

/**
 * Invoice class implements Payme interface. Unrelated to Programmer superclass/subclasses
 */
public class Invoice implements Payme {

private String partNumber; 
private String partDescription;
private int quantity;
private double pricePerItem;

/**
 * Constructor for Invoice class. If we could edit it, I would include an invoice number!
 * @param part invoice line item
 * @param description description of line item
 * @param count quantity of line item, cannot be negative
 * @param price of invoice item, cannot be < 0
 */
public Invoice(String part, String description, int count, 
 double price) {
 partNumber = part;
 partDescription = description;
 setQuantity(count); // validate and store quantity
 setPricePerItem(price); // validate and store price per item
}

/**
 * @param part number for invoice item
 */
public void setPartNumber(String part) {
 partNumber = part; 
}

/**
 * @return part number for invoice item
 */
public String getPartNumber() {
 return partNumber;
}

/**
 * @param description of invoice part/item
 */
public void setPartDescription(String description) {
 partDescription = description; 
}

/**
 * @return description of invoice part/item
 */
public String getPartDescription() {
 return partDescription;
}

/**
 * @param count sets quantity of invoice parts, cannot be negative
 */
public void setQuantity(int count) {
 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
}

/**
 * @return quantity of parts for invoice
 */
public int getQuantity() {
 return quantity;
}

/**
 * @param price per invoice item, cannot be less than 0
 */
public void setPricePerItem(double price) {
 pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
}

/**
 * @return price per invoice item
 */
public double getPricePerItem() {
 return pricePerItem;
}

/**
 * @return formatted toString for invoice
 */
@Override
public String toString() {
 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
    "invoice", "part number", getPartNumber(), getPartDescription(), 
    "quantity", getQuantity(), "price per item", getPricePerItem());
} 

/**
 * @return carries out contract with interface Payme
 */
@Override
public double getPaymentAmount() {
 return getQuantity() * getPricePerItem(); // calculate total cost
}
}


