package com.template;

import com.bobocode.svydovets.context.AnnotationConfigurationApplicationContext;
import com.bobocode.svydovets.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This is a simple factory that can provide default {@link ApplicationContext} or custom `by passed package.
 */
public final class AppContextFactory {

    private AppContextFactory() {
    }

    private static ApplicationContext defaultContext;
    private static Map<String, ApplicationContext> applicationContextsContainer;

    /**
     * Provides {@link AnnotationConfigurationApplicationContext} that created from the root path.
     *
     * @return {@link AnnotationConfigurationApplicationContext}
     */
    public static ApplicationContext getContext() {
        if (Objects.isNull(defaultContext)) {
            defaultContext = create("com.template");
        }
        return defaultContext;
    }

    /**
     * Provides {@link AnnotationConfigurationApplicationContext} that can be created by specified path.
     * If the {@link AnnotationConfigurationApplicationContext} is created already then it will be taken from
     * the {@param applicationContextsContainer} {@link Map}.
     *
     * @param packageName name of package where contains required beans
     * @return {@link AnnotationConfigurationApplicationContext}
     */
    public static ApplicationContext getContextWithSpecifiedPath(String packageName) {
        if (Objects.isNull(applicationContextsContainer)) {
            applicationContextsContainer = new HashMap<>();
        }

        if (applicationContextsContainer.containsKey(packageName)) {
            return applicationContextsContainer.get(packageName);
        } else {
            var context = create(packageName);
            applicationContextsContainer.put(packageName, context);
            return context;
        }
    }

    /**
     * Creates a new {@link AnnotationConfigurationApplicationContext} with specified {@param packageName}.
     *
     * @param packageName name of package where contains required beans
     * @return {@link AnnotationConfigurationApplicationContext}
     */
    public static ApplicationContext create(String packageName) {
        Objects.requireNonNull(packageName);
        return new AnnotationConfigurationApplicationContext(packageName);
    }
}
