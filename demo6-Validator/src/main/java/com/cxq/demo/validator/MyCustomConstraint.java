package com.cxq.demo.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义验证功能：自定义注解
 */
//限定使用范围--只能在字段上使用
@Target({ElementType.FIELD})
//表明注解的生命周期，它在代码运行时可以通过反射获取到注解
@Retention(RetentionPolicy.RUNTIME)
//@Constraint 注解，里面传入了一个 validateBy 字段，以指定该注解的校验逻辑
@Constraint(validatedBy = MyCustomConstraintValidator.class)
public @interface MyCustomConstraint {
    //错误提示
    String message() default "请输入中国政治或经济中心的城市名";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
