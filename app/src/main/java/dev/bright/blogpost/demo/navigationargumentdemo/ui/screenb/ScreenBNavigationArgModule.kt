package dev.bright.blogpost.demo.navigationargumentdemo.ui.screenb

import androidx.lifecycle.SavedStateHandle
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Qualifier

@Qualifier
annotation class GreetingNameNavArg

@Module
@InstallIn(ViewModelComponent::class)
object ScreenBNavigationArgModule {

    @Provides
    @GreetingNameNavArg
    @ViewModelScoped
    fun provideGreetingNameNavArg(savedStateHandle: SavedStateHandle): String {
        return savedStateHandle.get<String>("greetingName") ?: ""
    }
}