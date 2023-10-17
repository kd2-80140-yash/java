
public class Q1_ans {

	public class Invoice 
	{
		private String partNumber;
		private String partDescription;
		private int quantity;
		private double pricePerItem;
		
	}
    public Invoice(String partNumber,String partDescription,int quantity,double pricePerItem)
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		setQuantity(quantity);
		setPriceperItem(pricePerItem);
		
	}
	public String getpartNumber()
	{
		return partNumber;
	}
	public void setPartNumber(String partNumber)
	{
		this.partNumber = partNumber;
	}
	public String getPartDescription()
	{ 
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
    	if(quantity>0)
    	{
    		this.quantity = quantity;
    	}
    	else
    	{
    		this.quantity = 0;
    	}
    }
    public double getPricePerItem()
    {
    	return PricePerItem;
    }
    public void setPricePerItem(double pricePerItem)
    {
    	if(pricePerItem>0.0)
    	{
    		this.pricePerItem = pricePerItem;
    	}
    	else
    	{
    		this.pricePerItem = 0.0;
    	}
    }
    public double getInvoiceAmount() 
    {
        return quantity * pricePerItem;
    }
    public class InvoiceTest
    {
    	public static void main(String[] args)
    	{
			Invoice invoice1 = new Invoice("12345","Widget",5,10.99);
			Invoice invoice2 = new Invoice("67890","Gadget",-3,-5.99);
			displayInvoice(invoice1);
	        displayInvoice(invoice2);
			
		}
    }
    public static void displayInvoice(Invoice invoice)
    {
    	System.out.println("Part Number: "+invoice.getPartNumber());
    	System.out.println("Part Description : "+invoice.getPartDescription());
    	System.out.println("Quantity :"+invoice.getQuantity());
    	System.out.println("Price Per Item: Rs."+invoice.getPricePerItem());
    	System.out.println("Invoice Amount : Rs."+invoice.getInvoiceAmount());
    	System.out.println();
    }

    
    
    
	
	

}
