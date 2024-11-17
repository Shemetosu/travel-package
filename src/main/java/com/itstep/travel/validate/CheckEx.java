//package com.itstep.travel.validate;
//
//import com.itstep.travel.validate.validator.CheckExValidator;
//import jakarta.validation.Constraint;
//import jakarta.validation.Payload;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//@Target({ElementType.FIELD, ElementType.TYPE})
//@Retention(RetentionPolicy.RUNTIME)
//@Constraint(validatedBy = CheckExValidator.class)
//public @interface CheckEx {
//
//    String message() default "Такая запись уже существует";
//
//    boolean active() default true;
//
//    Class<?> entityClass();
//
//    Class<?>[] groups() default {};
//
//    Class<? extends Payload>[] payload() default {};
//}
