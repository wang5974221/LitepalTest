package com.hengda.litpaltest.app

import android.app.Application
import org.litepal.LitePal

/**
 * author: wangjinbo
 * created on: 2020/9/18
 * email:1076104413@qq.com
 * description:
 */
class App:Application() {
    override fun onCreate() {
        super.onCreate()
        LitePal.initialize(this)
    }
}