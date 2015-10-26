import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

public final class blf
{
  private static final blg a = blg.a;
  private static final int b = blh.a;
  
  static
  {
    TimeUnit.SECONDS.toMillis(10L);
    TimeUnit.SECONDS.toMillis(20L);
  }
  
  public static String A(Context paramContext)
  {
    paramContext = String.valueOf(y(paramContext));
    String str = String.valueOf("/cast/discover");
    if (str.length() != 0) {}
    for (paramContext = paramContext.concat(str);; paramContext = new String(paramContext)) {
      return paramContext;
    }
  }
  
  public static String B(Context paramContext)
  {
    return null;
  }
  
  public static boolean C(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:ble_enabled", false);
  }
  
  public static boolean D(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "gms:cast:mirroring_enabled", false);
  }
  
  public static String E(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:cast_screen_tips", "https://support.google.com/chromecast/answer/6050397");
  }
  
  public static String F(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:cast_screen_no_devices", "https://support.google.com/chromecast/answer/6053262");
  }
  
  public static String G(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "gms:cast:mirroring_app_id", "674A0243");
  }
  
  public static String H(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "gms:cast:audio_mirroring_app_id", "8E6C866D");
  }
  
  public static String I(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "gms:cast:cast_nearby_device_scanner:device_id", "__cast_nearby__");
  }
  
  public static String J(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:crash_search_url", "http://go/crash/browse?stbtiq=%s");
  }
  
  public static boolean K(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "gms:cast:cast_nearby_device_scanner:is_enabled", false);
  }
  
  public static boolean L(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:analytics", true);
  }
  
  public static blg M(Context paramContext)
  {
    int i = czp.a(paramContext.getContentResolver(), "chromecast:opencast_set_during_setup", a.ordinal());
    return blg.values()[i];
  }
  
  public static int N(Context paramContext)
  {
    int i = czp.a(paramContext.getContentResolver(), "chromecast:stats_opt_in_override", b - 1);
    return blh.a()[i];
  }
  
  public static String O(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "cast_screen_help_url", "https://support.google.com/chromecast/answer/6059461");
  }
  
  public static String P(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:backdrop_help_url", "https://support.google.com/chromecast/answer/6080931");
  }
  
  public static String Q(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:empty_device_list_url", "https://support.google.com/chromecast/answer/2998456");
  }
  
  public static String R(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:hdr_learn_more_url", "https://support.google.com/chromecast/answer/6290498");
  }
  
  public static int S(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:min_update_version", -1);
  }
  
  public static String T(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:no_update_help_url", "https://support.google.com/chromecast/?p=honeycomb");
  }
  
  public static long U(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:network_scan_time_ms", 4000L);
  }
  
  public static long V(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:country_switch_delay_ms", 1000L);
  }
  
  public static String W(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:google_play_apps_link", "https://play.google.com/store/apps/collection/promotion_collections_google_cast");
  }
  
  public static int X(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:backdrop_timeout_ms", 10000);
  }
  
  public static int Y(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:network_switch_settle_time_ms", 10000);
  }
  
  public static int a(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:developer_mode", 0);
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    return String.format(czp.a(paramContext.getContentResolver(), "chromecast:learn_video_url", "https://www.google.%s/intl/%s/cast/about/audio/update-tutorial/learn.mp4"), new Object[] { paramString1, paramString2 });
  }
  
  public static void a(Bundle paramBundle, Context paramContext)
  {
    paramBundle.putString("gservices-imax-url", String.valueOf(z(paramContext)));
    paramBundle.putString("gservices-is-cast-screen-enabled", String.valueOf(a()));
    paramBundle.putString("gservices-is-cast-screen-approved", String.valueOf(D(paramContext)));
    paramBundle.putString("gservices-is-open-cast-enabled", String.valueOf(K(paramContext)));
    paramBundle.putString("gservices-is-open-cast-enabled-in-setup", String.valueOf(M(paramContext)));
    paramBundle.putString("gservices-is-offers-enabled", String.valueOf(b(paramContext)));
    paramBundle.putString("gservices-offers-app-id", String.valueOf(d(paramContext)));
  }
  
  public static boolean a()
  {
    boolean bool2 = false;
    int i = Build.VERSION.SDK_INT;
    String str = Build.VERSION.RELEASE;
    boolean bool1;
    if (i < 19) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      if (i == 19)
      {
        bool1 = bool2;
        if (!"4.4".equals(str))
        {
          bool1 = bool2;
          if ("4.4.1".equals(str)) {}
        }
      }
      else
      {
        bool1 = true;
      }
    }
  }
  
  public static boolean b()
  {
    return false;
  }
  
  public static boolean b(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:offers_enabled", true);
  }
  
  public static boolean c(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:previews_enabled", false);
  }
  
  public static String d(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:offers_app_id", "B03290DF");
  }
  
  public static String e(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:offers_url", "https://cast.google.com/chromecast/offers/#code/");
  }
  
  public static String f(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:offers_terms_url", "https://support.google.com/chromecast/answer/6008836");
  }
  
  public static int g(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:offer_batch_delay", 3000);
  }
  
  public static String h(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:learn_url", "http://chromecast.com/learn");
  }
  
  public static long i(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:check_ota_status_delay_ms", 1000L);
  }
  
  public static int j(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:ota_percent_done_threshold", 97);
  }
  
  public static int k(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:num_ota_errors_allowed", 5);
  }
  
  public static long l(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:ww_auto_scroll_delay_ms", 10000L);
  }
  
  public static long m(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:ota_device_scan_timeout_ms", 120000L);
  }
  
  public static int n(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:ota_download_slow_percent", 7);
  }
  
  public static long o(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:ota_check_download_scan_time", 120000L);
  }
  
  public static String p(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:ota_troubleshoot_display_help_url", "https://support.google.com/chromecast/answer/6284322");
  }
  
  public static String q(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:ota_troubleshoot_audio_help_url", "https://support.google.com/chromecast/answer/6284174");
  }
  
  public static boolean r(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:backdrop_history_enabled", false);
  }
  
  public static long s(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:backdrop_history_timeout_ms", 20000L);
  }
  
  public static long t(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:backdrop_update_setting_delay_ms", 500L);
  }
  
  public static long u(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:connection_teardown_delay_ms", 120000L);
  }
  
  public static long v(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:backdrop_refresh_ms", 30000L);
  }
  
  public static long w(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:content_discovery_refresh_ms", 600000L);
  }
  
  public static int x(Context paramContext)
  {
    return czp.a(paramContext.getContentResolver(), "chromecast:content_discovery_timeout_ms", 3000);
  }
  
  public static String y(Context paramContext)
  {
    Object localObject = null;
    if (0 != 0) {}
    for (paramContext = (Context)localObject;; paramContext = czp.a(paramContext.getContentResolver(), "chromecast:server_url", "https://clients3.google.com")) {
      return paramContext;
    }
  }
  
  public static String z(Context paramContext)
  {
    String str = String.valueOf(y(paramContext));
    paramContext = String.valueOf("/cast/chromecast/home");
    if (paramContext.length() != 0) {}
    for (paramContext = str.concat(paramContext);; paramContext = new String(str)) {
      return paramContext;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\blf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */