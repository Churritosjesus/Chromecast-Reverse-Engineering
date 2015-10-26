	private static final blg a
	private static final  b
	
	    static blf()
	    {
	        java.util.concurrent.TimeUnit.SECONDS.toMillis(10);
	        java.util.concurrent.TimeUnit.SECONDS.toMillis(20);
	        blf.a = blg.a;
	        blf.b = blh.a;
	        return;
	    }
	
	
	    public static String A(android.content.Context p3)
	    {
	        String v0_4;
	        String v1 = String.valueOf(blf.y(p3));
	        String v0_2 = String.valueOf("/cast/discover");
	        if (v0_2.length() == 0) {
	            v0_4 = new String(v1);
	        } else {
	            v0_4 = v1.concat(v0_2);
	        }
	        return v0_4;
	    }
	
	
	    public static String B(android.content.Context p1)
	    {
	        return 0;
	    }
	
	
	    public static boolean C(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:ble_enabled", 0);
	    }
	
	
	    public static boolean D(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "gms:cast:mirroring_enabled", 0);
	    }
	
	
	    public static String E(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:cast_screen_tips", "https://support.google.com/chromecast/answer/6050397");
	    }
	
	
	    public static String F(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:cast_screen_no_devices", "https://support.google.com/chromecast/answer/6053262");
	    }
	
	
	    public static String G(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "gms:cast:mirroring_app_id", "674A0243");
	    }
	
	
	    public static String H(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "gms:cast:audio_mirroring_app_id", "8E6C866D");
	    }
	
	
	    public static String I(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "gms:cast:cast_nearby_device_scanner:device_id", "__cast_nearby__");
	    }
	
	
	    public static String J(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:crash_search_url", "http://go/crash/browse?stbtiq=%s");
	    }
	
	
	    public static boolean K(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "gms:cast:cast_nearby_device_scanner:is_enabled", 0);
	    }
	
	
	    public static boolean L(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:analytics", 1);
	    }
	
	
	    public static blg M(android.content.Context p3)
	    {
	        return blg.values()[czp.a(p3.getContentResolver(), "chromecast:opencast_set_during_setup", blf.a.ordinal())];
	    }
	
	
	    public static int N(android.content.Context p3)
	    {
	        return blh.a()[czp.a(p3.getContentResolver(), "chromecast:stats_opt_in_override", (blf.b - 1))];
	    }
	
	
	    public static String O(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "cast_screen_help_url", "https://support.google.com/chromecast/answer/6059461");
	    }
	
	
	    public static String P(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:backdrop_help_url", "https://support.google.com/chromecast/answer/6080931");
	    }
	
	
	    public static String Q(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:empty_device_list_url", "https://support.google.com/chromecast/answer/2998456");
	    }
	
	
	    public static String R(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:hdr_learn_more_url", "https://support.google.com/chromecast/answer/6290498");
	    }
	
	
	    public static int S(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:min_update_version", -1);
	    }
	
	
	    public static String T(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:no_update_help_url", "https://support.google.com/chromecast/?p=honeycomb");
	    }
	
	
	    public static long U(android.content.Context p4)
	    {
	        return czp.a(p4.getContentResolver(), "chromecast:network_scan_time_ms", 4000);
	    }
	
	
	    public static long V(android.content.Context p4)
	    {
	        return czp.a(p4.getContentResolver(), "chromecast:country_switch_delay_ms", 1000);
	    }
	
	
	    public static String W(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:google_play_apps_link", "https://play.google.com/store/apps/collection/promotion_collections_google_cast");
	    }
	
	
	    public static int X(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:backdrop_timeout_ms", 10000);
	    }
	
	
	    public static int Y(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:network_switch_settle_time_ms", 10000);
	    }
	
	
	    public static int a(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:developer_mode", 0);
	    }
	
	
	    public static String a(android.content.Context p3, String p4, String p5)
	    {
	        String v0_1 = czp.a(p3.getContentResolver(), "chromecast:learn_video_url", "https://www.google.%s/intl/%s/cast/about/audio/update-tutorial/learn.mp4");
	        Object[] v1_2 = new Object[2];
	        v1_2[0] = p4;
	        v1_2[1] = p5;
	        return String.format(v0_1, v1_2);
	    }
	
	
	    public static void a(android.os.Bundle p2, android.content.Context p3)
	    {
	        p2.putString("gservices-imax-url", String.valueOf(blf.z(p3)));
	        p2.putString("gservices-is-cast-screen-enabled", String.valueOf(blf.a()));
	        p2.putString("gservices-is-cast-screen-approved", String.valueOf(blf.D(p3)));
	        p2.putString("gservices-is-open-cast-enabled", String.valueOf(blf.K(p3)));
	        p2.putString("gservices-is-open-cast-enabled-in-setup", String.valueOf(blf.M(p3)));
	        p2.putString("gservices-is-offers-enabled", String.valueOf(blf.b(p3)));
	        p2.putString("gservices-offers-app-id", String.valueOf(blf.d(p3)));
	        return;
	    }
	
	
	    public static boolean a()
	    {
	        int v0 = 0;
	        boolean v1_0 = android.os.Build$VERSION.SDK_INT;
	        String v2 = android.os.Build$VERSION.RELEASE;
	        if ((v1_0 >= 19) && ((v1_0 != 19) || ((!"4.4".equals(v2)) && (!"4.4.1".equals(v2))))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public static boolean b()
	    {
	        return 0;
	    }
	
	
	    public static boolean b(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:offers_enabled", 1);
	    }
	
	
	    public static boolean c(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:previews_enabled", 0);
	    }
	
	
	    public static String d(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:offers_app_id", "B03290DF");
	    }
	
	
	    public static String e(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:offers_url", "https://cast.google.com/chromecast/offers/#code/");
	    }
	
	
	    public static String f(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:offers_terms_url", "https://support.google.com/chromecast/answer/6008836");
	    }
	
	
	    public static int g(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:offer_batch_delay", 3000);
	    }
	
	
	    public static String h(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:learn_url", "http://chromecast.com/learn");
	    }
	
	
	    public static long i(android.content.Context p4)
	    {
	        return czp.a(p4.getContentResolver(), "chromecast:check_ota_status_delay_ms", 1000);
	    }
	
	
	    public static int j(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:ota_percent_done_threshold", 97);
	    }
	
	
	    public static int k(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:num_ota_errors_allowed", 5);
	    }
	
	
	    public static long l(android.content.Context p4)
	    {
	        return czp.a(p4.getContentResolver(), "chromecast:ww_auto_scroll_delay_ms", 10000);
	    }
	
	
	    public static long m(android.content.Context p4)
	    {
	        return czp.a(p4.getContentResolver(), "chromecast:ota_device_scan_timeout_ms", 120000);
	    }
	
	
	    public static int n(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:ota_download_slow_percent", 7);
	    }
	
	
	    public static long o(android.content.Context p4)
	    {
	        return czp.a(p4.getContentResolver(), "chromecast:ota_check_download_scan_time", 120000);
	    }
	
	
	    public static String p(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:ota_troubleshoot_display_help_url", "https://support.google.com/chromecast/answer/6284322");
	    }
	
	
	    public static String q(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:ota_troubleshoot_audio_help_url", "https://support.google.com/chromecast/answer/6284174");
	    }
	
	
	    public static boolean r(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:backdrop_history_enabled", 0);
	    }
	
	
	    public static long s(android.content.Context p4)
	    {
	        return czp.a(p4.getContentResolver(), "chromecast:backdrop_history_timeout_ms", 20000);
	    }
	
	
	    public static long t(android.content.Context p4)
	    {
	        return czp.a(p4.getContentResolver(), "chromecast:backdrop_update_setting_delay_ms", 500);
	    }
	
	
	    public static long u(android.content.Context p4)
	    {
	        return czp.a(p4.getContentResolver(), "chromecast:connection_teardown_delay_ms", 120000);
	    }
	
	
	    public static long v(android.content.Context p4)
	    {
	        return czp.a(p4.getContentResolver(), "chromecast:backdrop_refresh_ms", 30000);
	    }
	
	
	    public static long w(android.content.Context p4)
	    {
	        return czp.a(p4.getContentResolver(), "chromecast:content_discovery_refresh_ms", 600000);
	    }
	
	
	    public static int x(android.content.Context p3)
	    {
	        return czp.a(p3.getContentResolver(), "chromecast:content_discovery_timeout_ms", 3000);
	    }
	
	
	    public static String y(android.content.Context p3)
	    {
	        String v0_0 = 0;
	        if (0 == 0) {
	            v0_0 = czp.a(p3.getContentResolver(), "chromecast:server_url", "https://clients3.google.com");
	        }
	        return v0_0;
	    }
	
	
	    public static String z(android.content.Context p3)
	    {
	        String v0_4;
	        String v1 = String.valueOf(blf.y(p3));
	        String v0_2 = String.valueOf("/cast/chromecast/home");
	        if (v0_2.length() == 0) {
	            v0_4 = new String(v1);
	        } else {
	            v0_4 = v1.concat(v0_2);
	        }
	        return v0_4;
	    }
	
