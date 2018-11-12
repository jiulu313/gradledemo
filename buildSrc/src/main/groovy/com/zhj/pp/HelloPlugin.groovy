package com.zhj.pp

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 自定义的插件
 * HelloPlugin就是自定义的插件
 */
class HelloPlugin implements Plugin<Project>{

    /**
     * 插件被引入时要执行的方法
     * @param project 引入当前插件的Project
     */
    @Override
    void apply(Project project) {
        println 'hello plugin ... ' + project.name
    }
}