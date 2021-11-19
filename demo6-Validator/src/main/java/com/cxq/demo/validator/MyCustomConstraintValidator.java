package com.cxq.demo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 自定义验证功能：自定义验证业务逻辑类
 */
//String 为校验类型
public class MyCustomConstraintValidator implements ConstraintValidator<MyCustomConstraint,String> {
    @Override
    public void initialize(MyCustomConstraint constraintAnnotation) {
        //在启动时执行
    }

    /**
     * 自定义校验逻辑
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (!(s.equals("北京") || s.equals("上海"))){
            return false;
        }
        return true;
    }
}
