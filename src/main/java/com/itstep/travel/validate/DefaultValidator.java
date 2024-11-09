package com.itstep.travel.validate;

public class DefaultValidator extends CustomValidator {

    @Override
    public boolean validate(String value) {
        return value != null && !value.isEmpty();
    }
}
