package com.example.dagger_2_example_3

import dagger.Component
import javax.inject.Singleton

@MyCustomScope
@Component
interface ApplicationGraph {
    fun repository(): UserRepository
}