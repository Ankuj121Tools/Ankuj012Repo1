package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookInfo {
      
	   private Integer bookId;
	   private String bookName;
	   private String category;
	   private String author;
	   private String price; 
	   private String status;
}
