package com.github.madmacmad.darkunity3dtheme.services

import com.intellij.openapi.project.Project
import com.github.madmacmad.darkunity3dtheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
