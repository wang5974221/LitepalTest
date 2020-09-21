package com.hengda.litpaltest.bean

import org.litepal.crud.LitePalSupport

/**
 * author: wangjinbo
 * created on: 2020/9/18
 * email:1076104413@qq.com
 * description:
 */
class Book():LitePalSupport() {
    var book_name: String? = null
    var book_id: String? = null
    var book_type: String? = null
    var book_no=0
    constructor(book_name: String,book_id: String,book_type: String, book_no:Int) : this() {
        this.book_name=book_name
        this.book_id=book_id
        this.book_type=book_type
        this.book_no=book_no
    }
}