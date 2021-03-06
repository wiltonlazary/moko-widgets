/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.widgets.screen

import dev.icerock.moko.resources.desc.StringDesc
import dev.icerock.moko.resources.desc.desc
import dev.icerock.moko.widgets.constraint
import dev.icerock.moko.widgets.core.Theme
import dev.icerock.moko.widgets.core.Widget
import dev.icerock.moko.widgets.screen.navigation.NavigationBar
import dev.icerock.moko.widgets.screen.navigation.NavigationItem
import dev.icerock.moko.widgets.style.view.SizeSpec
import dev.icerock.moko.widgets.style.view.WidgetSize
import dev.icerock.moko.widgets.text

class TemplateScreen (
    private val navTitle: StringDesc,
    private val labelText: StringDesc,
    private val theme: Theme
) : WidgetScreen<Args.Empty>(), NavigationItem {
    override val navigationBar = NavigationBar.Normal(title = navTitle)

    override fun createContentWidget() : Widget<WidgetSize.Const<SizeSpec.AsParent, SizeSpec.AsParent>> = with(theme) {
        constraint(size = WidgetSize.AsParent) {
            val label = +text(
                size = WidgetSize.WrapContent,
                text = const(labelText)
            )

            constraints {
                label centerXToCenterX root
                label centerYToCenterY root
            }
        }
    }
}
