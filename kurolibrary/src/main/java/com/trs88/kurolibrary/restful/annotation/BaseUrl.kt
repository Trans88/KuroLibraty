package com.trs88.kurolibrary.restful.annotation

import java.lang.annotation.RetentionPolicy

/**
 * @BaseUrl("https://xxxx/xxxx")
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class BaseUrl (val value:String)