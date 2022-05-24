package com.lambda

import com.lambda.client.gui.clickgui.LambdaClickGui
import com.lambda.client.gui.clickgui.component.DownloadMusicButton
import com.lambda.client.gui.clickgui.component.PlayMusicButton
import com.lambda.client.gui.clickgui.component.PluginWindow
import com.lambda.client.gui.rgui.windows.ListWindow
import com.lambda.client.plugin.api.Plugin

internal object ExamplePlugin : Plugin() {

    override fun onLoad() {
        var posX = 0.0f
        var posY = 0.0f
        val windows_ = ArrayList<ListWindow>()
        var musicWindow = PluginWindow("Music", posX, posY) //need to find a hacky way to use that
        musicWindow.add(PlayMusicButton)
        musicWindow.add(DownloadMusicButton)
        windows_.add(musicWindow)
        LambdaClickGui.windowList.addAll(windows_)
    }

    override fun onUnload() {
        // Here you can unregister threads etc...
    }
}