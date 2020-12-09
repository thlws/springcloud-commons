package com.thlws.commons.enums;

/**
 * @author HanleyTang 2019/10/6
 */
public enum StatusEnum {

    /**
     * 1-可用
     */
    ENABLE((byte) 1),
    /**
     * 0-不可用
     */
    DISABLE((byte) 0);

    private final int value;

    private StatusEnum(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}
