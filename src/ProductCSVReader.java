import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductCSVReader {

    public static void main(String[] args) {
        String line;
        String csvSplitBy = ",";
        List<Product> productList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                ProductCSVReader.class.getResourceAsStream("/productMockData.csv")))) {

            br.readLine();
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] productData = line.split(csvSplitBy);

                if (productData.length != 5) {
                    System.out.println("Invalid CSV line: " + line);
                    continue;
                }
                String category = productData[0];
                String name = productData[1];
                double price = Double.parseDouble(productData[2]);
                double sale_price = Double.parseDouble(productData[3]);
                String subcategory = productData[4];

                Product product = new Product(category, name, price, sale_price, subcategory);
                productList.add(product);

            }
            Product[] productArray = productList.toArray(new Product[0]);
            for (Product product : productArray) {
                System.out.println(product);
            }
        }
         catch (IOException e) {
            e.printStackTrace();
        }

        }
    }
