package com.example.dependencyinjection_crocodiccore.injection

import android.content.Context
import com.example.dependencyinjection_crocodiccore.data.SaveCounter2
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    @Provides
    fun provideSaveCounter(@ApplicationContext context: Context) = SaveCounter2(context)
}