package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.BookInfo;
@Repository("bookDao")
public class BookInfoDaoImpl implements IBookInfoDAO {
    private static final String BOOK_INFO="SELECT * FROM BOOKS_INFO WHERE BOOKID=:id";
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	
	
	public BookInfo getBookById(int bookId) {
		MapSqlParameterSource source=new MapSqlParameterSource();
		source.addValue("id", bookId);
		BookInfo binfo1=npjt.queryForObject(BOOK_INFO,source,
				                                  (rs,rowNum)->{
				                                	  BookInfo binfo=new BookInfo();
				                                	   binfo.setBookId(rs.getInt(1));
                                                	   binfo.setBookName(rs.getString(2));
                                                	   binfo.setCategory(rs.getString(3));
                                                	   binfo.setAuthor(rs.getString(4));
                                                	   
                                                	   binfo.setPrice(rs.getString(5));
                                                	   binfo.setStatus(rs.getString(6));
                                                	   return binfo;
				                                  });
		return binfo1;
	}

}
