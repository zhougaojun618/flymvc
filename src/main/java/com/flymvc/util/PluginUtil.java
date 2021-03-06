package com.flymvc.util;

import com.flymvc.exception.FlyException;
import com.flymvc.plugin.Plugin;
import com.flymvc.plugin.Plugins;

/**
 * 插件执行工具类
 * @author jameszhou
 *
 */
public class PluginUtil {

	
	public static void initPlugins(Plugins plugins) {
		// TODO Auto-generated method stub
		for(Plugin plugin : plugins.getPlugins()){
			initPlugin(plugin);
		}
	}
	
	public static void initPlugin(Plugin plugin) {
		// TODO Auto-generated method stub
		try {
			plugin.start();
		} catch (FlyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void stopPlugin(Plugin plugin) {
		// TODO Auto-generated method stub
		try {
			plugin.stop();
		} catch (FlyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void stopPlugins(Plugins plugins) {
		// TODO Auto-generated method stub
		for(Plugin plugin : plugins.getPlugins()){
			stopPlugin(plugin);
		}
	}

}
