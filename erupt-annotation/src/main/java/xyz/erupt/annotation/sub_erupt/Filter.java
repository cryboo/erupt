package xyz.erupt.annotation.sub_erupt;

import xyz.erupt.annotation.fun.ConditionHandler;

/**
 * Created by liyuepeng on 11/5/18.
 */
public @interface Filter {
    //写表达式时要使用双引号包裹
    String condition();

    Class<? extends ConditionHandler>[] conditionHandlers() default {};
}