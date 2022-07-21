package com.example.dagger_2_example_3

import javax.inject.Inject
import javax.inject.Singleton

@MyCustomScope
class UserRepository @Inject constructor(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
) {

}

