package test

import groovy.transform.ToString

@ToString(includes="id,title,createDate")
class Book {
    String title
    Date createDate
}