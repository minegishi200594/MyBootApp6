package jp.te4a.spring.boot.mybootapp7;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookBean {
	Integer id;
	String title;
	String writter;
	String publisher;
	Integer price;
}
