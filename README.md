# Product CSV-Reader
This project is a simple Java aplication that reads product data from a CSV file ('productMockData.csv'), parses the data into 'Product' objects, and prints the details of each product to the console.

## Project Structure 
/src
Product.java 
ProductCSVReader.java 
productMockData.csv 

-**'Product.java'**: This class represents a product with attributes such as 'category','name','price','sale_price'and'subcategory'.

-**'ProductCSVReader.java'**: This class contains the 'main' method that reads the CSV file, parse it into 'Product' objects, and prints the products. 

-**'productMockData.csv'**: The CSV file containing the product data to be read and processed. 
- *ProductCSVReader.java*: This class contains the main method that reads the CSV file, parses it into Product objects, and prints the products.
- *productMockData.csv*: The CSV file containing the product data to be read and processed.

## Getting Started

### Prerequisites

To run this project, you need to have the following installed on your machine:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (version 8 or higher)
- An IDE such as [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org/), or [NetBeans](https://netbeans.apache.org/)

### Setup Instructions

1. *Clone the Repository*:



2. *Navigate to the Project Directory*:
src/ProductCSVReader.java

3. *Open the Project in Your IDE*:
- If using IntelliJ IDEA, you can simply open the project folder.

### Running the Application

1. *Compile the Project*:
- Most IDEs will automatically compile the project when you build it.

2. *Run the Application*:
- In your IDE, right-click on ProductCSVReader.java and select Run or Debug.
- Alternatively, you can run the application from the command line:
  ```

3. *View the Output*:
- The application will read the productMockData.csv file from the resources folder, parse it, and print the details of each product to the console.

### CSV File Format

The productMockData.csv file should have the following structure:


category,name,price,sale_price,subcategory


- *category*: The category of the product.
- *name*: The name of the product.
- *price*: The regular price of the product.
- *sale_price*: The sale price of the product.
- *subcategory*: The subcategory to which the product belongs.

### Error Handling

The application includes basic error handling:
- If the CSV file cannot be found or read, an IOException will be caught, and the stack trace will be printed to the console.
- If a line in the CSV file does not contain exactly 5 columns, it will be skipped, and a warning will be printed.


## Contact

For any questions or feedback, please contact at [raghadzamil11@gmail.com].


