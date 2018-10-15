package io.coodoo.framework.jpa.control;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JPA Essentials configuration
 * 
 * @author coodoo GmbH (coodoo.io)
 */
@ApplicationScoped
public class JpaEssentialsConfig {

    private static Logger log = LoggerFactory.getLogger(JpaEssentialsConfig.class);

    /**
     * If set true, the revision fields <code>updated_at</code> and <code>updated_by</code> gets filled on creation (same values as <code>created_at</code> and
     * <code>created_by</code>)
     */
    public static boolean FILL_UPDATED_ON_CREATION = false;

    /**
     * ZoneId Object time zone for LocalDateTime instance creation.
     */
    public static String LOCAL_DATE_TIME_ZONE = "UTC";

    /**
     * Name of the (optional) JPA Essentials property file
     */
    private static final String jpaEssentialsPropertiesFilename = "coodoo.jpa-essentials.properties";

    static Properties properties = new Properties();

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        loadProperties();
    }

    private static void loadProperties() {
        InputStream inputStream = null;
        try {
            inputStream = JpaEssentialsConfig.class.getClassLoader().getResourceAsStream(jpaEssentialsPropertiesFilename);

            if (inputStream != null) {

                properties.load(inputStream);
                log.info("Reading {}", jpaEssentialsPropertiesFilename);

                FILL_UPDATED_ON_CREATION = loadProperty(FILL_UPDATED_ON_CREATION, "coodoo.jpa-essentials.fill.updated.on.creation");
                LOCAL_DATE_TIME_ZONE = loadProperty(LOCAL_DATE_TIME_ZONE, "coodoo.jpa-essentials.local.date.time.zone");
            }
        } catch (IOException e) {
            log.info("Couldn't read {}!", jpaEssentialsPropertiesFilename, e);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                log.warn("Couldn't close {}!", jpaEssentialsPropertiesFilename, e);
            }
        }
    }

    private static String loadProperty(String value, String key) {

        String property = properties.getProperty(key);
        if (property == null) {
            return value;
        }
        log.info("JPA Essentials Property {} loaded: {}", key, property);
        return property;
    }

    private static boolean loadProperty(boolean value, String key) {
        String property = properties.getProperty(key);
        if (property != null) {
            try {
                log.info("JPA Essentials Property {} loaded: {}", key, property);
                return Boolean.valueOf(property).booleanValue();
            } catch (NumberFormatException e) {
                log.warn("JPA Essentials Property {} value invalid: {}", key, property);
            }
        }
        return value;
    }

}
