package com.github.likhanovmaxim.intellijplatformplugintest.services

import com.intellij.openapi.project.Project
import com.github.likhanovmaxim.intellijplatformplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
