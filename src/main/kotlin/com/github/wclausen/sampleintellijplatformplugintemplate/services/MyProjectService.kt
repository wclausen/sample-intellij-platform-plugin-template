package com.github.wclausen.sampleintellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.wclausen.sampleintellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
