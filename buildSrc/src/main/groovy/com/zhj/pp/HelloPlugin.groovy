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
        def extension = project.extensions.create('testExtension', TestPluginExtension)
        def extension2 = project.extensions.getByName('testExtension')

        project.tasks.create('taskPlugin'){
            doLast{
                println extension2.message
                println extension.address
            }
        }
    }
}