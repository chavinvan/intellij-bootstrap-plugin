package com.github.smunl.intellijbootstrapplugin.services

import com.intellij.openapi.project.Project
import com.github.smunl.intellijbootstrapplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
