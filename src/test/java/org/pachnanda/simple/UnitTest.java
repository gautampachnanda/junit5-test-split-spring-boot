package org.pachnanda.simple;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Retention(RetentionPolicy.RUNTIME)
@Tag("unit")
@Test
public @interface UnitTest {

}
