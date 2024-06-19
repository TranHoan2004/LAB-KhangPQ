
package DTO;


public class Product {
    private String productID;
    private String productNameString;
    private String locate;
    private Double price;
    private String dateOfManufacture,expirydate,receiptDate;
    private String category;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductNameString() {
        return productNameString;
    }

    public void setProductNameString(String productNameString) {
        this.productNameString = productNameString;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product() {
    }

    public Product(String productID, String productNameString, String locate, Double price, String dateOfManufacture, String expirydate, String receiptDate, String category) {
        this.productID = productID;
        this.productNameString = productNameString;
        this.locate = locate;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
        this.expirydate = expirydate;
        this.receiptDate = receiptDate; // ngay nhận
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("%s | %-8s | %-8s | %7.1f | %-8s | %-8s | %-8s |",productID,productNameString,locate,price,expirydate,dateOfManufacture,category );
    }
    
    
    
}
