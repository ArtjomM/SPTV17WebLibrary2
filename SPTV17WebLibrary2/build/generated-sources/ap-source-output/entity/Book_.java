package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-06T15:08:13")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, String> cover;
    public static volatile SingularAttribute<Book, Date> date;
    public static volatile SingularAttribute<Book, String> author;
    public static volatile SingularAttribute<Book, String> caption;
    public static volatile SingularAttribute<Book, Boolean> active;
    public static volatile SingularAttribute<Book, Long> id;
    public static volatile SingularAttribute<Book, Integer> publishedYear;
    public static volatile SingularAttribute<Book, String> text;

}