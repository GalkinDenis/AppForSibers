package com.denis.appForSibersTeam.app

import android.app.Application
import com.denis.appForSibersTeam.app.components.AppComponent
import com.denis.appForSibersTeam.app.components.DaggerAppComponent

open class App : Application() {
    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }
}