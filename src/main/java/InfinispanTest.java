package test.infinispan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.manager.EmbeddedCacheManager;

public class InfinispanTest {
	private static EmbeddedCacheManager cacheManager = null;

	public static void main(String[] args) {
		try {
			cacheManager = new DefaultCacheManager(
					"D:\\workspaces\\rahul\\java\\Tests\\src\\test\\infinispan\\cacheConfig.xml");
			cacheManager.start();
		} catch (final IOException e) {
			e.printStackTrace();
		}
		Cache<String, String> cache = cacheManager.getCache("testCache");

		List<String> listKeys = new ArrayList<String>(cache.keySet());
		Collections.sort(listKeys);
		System.out.println(listKeys);

		List<String> listVals = new ArrayList<String>(cache.values());
		Collections.sort(listVals);
		System.out.println(listVals);
		
		System.out.println("Size beforclear : " + cache.size());
		cache.clear();
		System.out.println("Size afterclear : " + cache.size());
		
		cache.put("1", "One");
		cache.put("2", "Two");
		cache.put("3", "Three");
		cache.put("4", "Four");
		cache.put("5", "Five");
		cache.put("6", "Six");
		cache.put("7", "Seven");
		cache.put("8", "Eight");
		cache.put("9", "Nine");
		cache.put("10", "Ten");
		cache.put("11", "Eleven");
		cache.put("12", "Twelve");
		cache.put("13", "Thirteen");
		cache.put("14", "Fourteen");
		cache.put("15", "Fifteen");
		cache.put("16", "Sixteen");
		cache.put("17", "Seventeen");
		cache.put("18", "Eighteen");
		cache.put("19", "Nineteen");
		cache.put("20", "Twenty");

		cacheManager.stop();
	}
}
