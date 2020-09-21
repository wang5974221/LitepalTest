package com.hengda.litpaltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.hengda.litpaltest.bean.Book
import kotlinx.android.synthetic.main.activity_main.*
import org.litepal.LitePal
import org.litepal.extension.delete
import org.litepal.extension.deleteAll
import org.litepal.extension.findAll

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUi()
    }
    private fun initUi(){
        btn_add.setOnClickListener {
          var book=Book("123456","万历十五年","历史",1)
            book.save()
        }
        btn_addall.setOnClickListener {
            LitePal.saveAll(listOf<Book>(Book("123456","万历十五年","历史",1),
                Book("123456","万历十五年","历史",1),
                Book("123456","万历十五年","历史",1),
                Book("12345678","万历十五年","历史",1)))

        }
        btn_delete.setOnClickListener {
            LitePal.deleteAll("Book","book_name=?","123456")
        }
        btn_query.setOnClickListener {
          var x=  LitePal.findAll<Book>()
             Log.e("size",x.size.toString())
        }
        btn_update.setOnClickListener {
          var book=Book()
            book.book_name="123456"
            book.updateAll("book_type=?","math")
        }
        btn_deleteall.setOnClickListener {
            LitePal.deleteAll<Book>()
        }

    }
}
