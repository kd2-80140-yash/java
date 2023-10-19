package assign11_5;



//import java.util.Objects;

	public class Book implements Comparable<Book>
	{
		private String isbn;
		private String authorName;
		private double price;
		private int quantity;

		public Book(String isbn, String authorName, double price, int quantity) {

			this.isbn = isbn;
			this.authorName = authorName;
			this.price = price;
			this.quantity = quantity;
		}
		
		

		public String getIsbn() {
			return isbn;
		}



		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}



		public String getAuthorName() {
			return authorName;
		}



		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}



		public double getPrice() {
			return price;
		}



		public void setPrice(double price) {
			this.price = price;
		}



		public int getQuantity() {
			return quantity;
		}



		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}



		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", authorName=" + authorName + ", price=" + price + ", quantity=" + quantity
					+ "]";
		}


		

//		@Override
//		public int hashCode() {
//			
//				int hash = Objects.hash(this.isbn);
//				return hash;
//			}
	//
	//
//		@Override
//		public boolean equals(Object obj) 
//		{
//			
//			if(obj == null)
//				return false;
//			if(this == obj)
//				return true;
//			if(obj instanceof Book) {
//				Book other = (Book) obj;
//				if(this.isbn == other.isbn)
//					return true;
//			}
//			return false;
//		}
	//

		@Override
		
		public int compareTo(Book b1)
		{
			
			int diff = this.isbn.compareTo(b1.isbn);
			return diff;
		}

	}


