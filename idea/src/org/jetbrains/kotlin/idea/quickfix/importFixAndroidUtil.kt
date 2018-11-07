/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.quickfix

import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.idea.core.findAndroidResourceClasses
import org.jetbrains.kotlin.psi.KtExpression

internal fun findAndroidLightRClasses(expression: KtExpression, name: String): List<ClassDescriptor> {
    if (name != "R") return emptyList()
    return findAndroidResourceClasses(expression)
}