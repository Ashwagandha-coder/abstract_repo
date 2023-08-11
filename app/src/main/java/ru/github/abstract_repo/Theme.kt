package ru.github.abstract_repo

import android.app.Activity
import android.app.Application
import android.app.Service
import android.content.BroadcastReceiver
import android.content.ContentProvider
import android.support.v4.app.Fragment
import android.view.View
import kotlin.coroutines.CoroutineContext
import kotlin.jvm.internal.Intrinsics.Kotlin


/**
 * This class contains fields with theme
 */
class Theme {

    private val activity: Activity
    private val view: View
    private val recyclerView: RecyclerView


    private val coroutine: Coroutine
    private val annotation: Annotation

    private val gradle: Gradle
    private val kotlin: Kotlin

    private val arch: Arch


    // Inner

    private val activityTherad: ActivityThread
    private val psvm: Public Static Void Main
    private val application: Application
    // link - Application - Activity

    private val service: Service
    private val broadcastReceiver: BroadcastReceiver
    private val contentProvider: ContentProvider


    private val fragment: Fragment


}