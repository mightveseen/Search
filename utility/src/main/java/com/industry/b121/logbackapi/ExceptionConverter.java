package com.industry.b121.logbackapi;

import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.classic.spi.IThrowableProxy;

public class ExceptionConverter extends ThrowableProxyConverter {

    @Override
    protected String throwableProxyToString(IThrowableProxy tp) {
        return "Exception: " + tp.getClassName() + ", Message: " + tp.getMessage();
    }
}
