package com.github.inoex135.evosuiteoptimizer.services

import com.intellij.openapi.project.Project
import com.github.inoex135.evosuiteoptimizer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
