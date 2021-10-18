package com.ivan.coin_converter

import android.app.Application
import android.app.Presentation
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import com.ivan.coin_converter.data.di.DataModules
import com.ivan.coin_converter.domain.di.DomainModule
import com.ivan.coin_converter.presentation.di.PresentationModule


class App : Application() {

	override fun onCreate() {
		super.onCreate()

		startKoin {
			androidContext(this@App)
		}

		DataModules.load()
		DomainModule.load()
		PresentationModule.load()
	}
}