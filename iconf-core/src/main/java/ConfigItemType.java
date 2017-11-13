import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bo.sun
 */
public enum ConfigItemType {

	STRING,
	INT,
	LONG,
	DOUBLE,
	DECIMAL,

	STRING_ARRAY,
	INT_ARRAY,
	LONG_ARRAY,
	DOUBLE_ARRAY,
	DECIMAL_ARRAY,

	JSON;

	public static Map<String, ConfigItemType> NAME_TYPE_MAP;

	public static Map<ConfigItemType, String> TYPE_NAME_MAP;

	static {
		NAME_TYPE_MAP = new HashMap<>(ConfigItemType.values().length, 1);
		TYPE_NAME_MAP = new EnumMap<>(ConfigItemType.class);

		for (ConfigItemType configItemType : ConfigItemType.values()) {
			String name = configItemType.name().replaceAll("_", " ").toLowerCase();
			NAME_TYPE_MAP.put(name, configItemType);
			TYPE_NAME_MAP.put(configItemType, name);
		}
	}

}
