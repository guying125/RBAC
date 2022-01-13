/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.util;

import lombok.extern.slf4j.Slf4j;

import java.io.Closeable;
import java.io.IOException;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
public class IOUtils3 {
    private IOUtils3() {}

    public static void closeQuietly(final Closeable closeable) {
        if (null == closeable) {
            return;
        }
        try {
            closeable.close();
        } catch (final IOException ioe) {
            // ignore
        } catch (final Exception e) {
            log.error("Unable to close resource: [{}]", e.getMessage());
        }
    }
}
