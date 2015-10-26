public final class bqd
{
  public static bqe A;
  public static bqe B;
  public static bqe C = bqe.a("analytics.service_client.reconnect_throttle_millis", 1800000L, 1800000L);
  public static bqe D = bqe.a("analytics.monitoring.sample_period_millis", 86400000L, 86400000L);
  public static bqe E = bqe.a("analytics.initialization_warning_threshold", 5000L, 5000L);
  public static bqe a;
  public static bqe b;
  public static bqe c;
  public static bqe d;
  public static bqe e;
  public static bqe f;
  public static bqe g;
  public static bqe h;
  public static bqe i;
  public static bqe j;
  public static bqe k;
  public static bqe l;
  public static bqe m;
  public static bqe n;
  public static bqe o;
  public static bqe p;
  public static bqe q;
  public static bqe r;
  public static bqe s;
  public static bqe t;
  public static bqe u;
  public static bqe v;
  public static bqe w;
  public static bqe x;
  public static bqe y;
  public static bqe z;
  
  static
  {
    bqe.a("analytics.service_enabled", false);
    a = bqe.a("analytics.service_client_enabled", true);
    b = bqe.a("analytics.log_tag", "GAv4", "GAv4-SVC");
    bqe.a("analytics.max_tokens", 60L, 60L);
    new bqe(cks.a("analytics.tokens_per_sec", Float.valueOf(0.5F)), Float.valueOf(0.5F));
    c = bqe.a("analytics.max_stored_hits", 2000, 20000);
    bqe.a("analytics.max_stored_hits_per_app", 2000, 2000);
    d = bqe.a("analytics.max_stored_properties_per_app", 100, 100);
    e = bqe.a("analytics.local_dispatch_millis", 1800000L, 120000L);
    f = bqe.a("analytics.initial_local_dispatch_millis", 5000L, 5000L);
    bqe.a("analytics.min_local_dispatch_millis", 120000L, 120000L);
    bqe.a("analytics.max_local_dispatch_millis", 7200000L, 7200000L);
    g = bqe.a("analytics.dispatch_alarm_millis", 7200000L, 7200000L);
    h = bqe.a("analytics.max_dispatch_alarm_millis", 32400000L, 32400000L);
    i = bqe.a("analytics.max_hits_per_dispatch", 20, 20);
    j = bqe.a("analytics.max_hits_per_batch", 20, 20);
    k = bqe.a("analytics.insecure_host", "http://www.google-analytics.com", "http://www.google-analytics.com");
    l = bqe.a("analytics.secure_host", "https://ssl.google-analytics.com", "https://ssl.google-analytics.com");
    m = bqe.a("analytics.simple_endpoint", "/collect", "/collect");
    n = bqe.a("analytics.batching_endpoint", "/batch", "/batch");
    o = bqe.a("analytics.max_get_length", 2036, 2036);
    p = bqe.a("analytics.batching_strategy.k", brs.b.name(), brs.b.name());
    String str = brw.a.name();
    q = bqe.a("analytics.compression_strategy.k", str, str);
    bqe.a("analytics.max_hits_per_request.k", 20, 20);
    r = bqe.a("analytics.max_hit_length.k", 8192, 8192);
    s = bqe.a("analytics.max_post_length.k", 8192, 8192);
    t = bqe.a("analytics.max_batch_post_length", 8192, 8192);
    u = bqe.a("analytics.fallback_responses.k", "404,502", "404,502");
    v = bqe.a("analytics.batch_retry_interval.seconds.k", 3600, 3600);
    bqe.a("analytics.service_monitor_interval", 86400000L, 86400000L);
    w = bqe.a("analytics.http_connection.connect_timeout_millis", 60000, 60000);
    x = bqe.a("analytics.http_connection.read_timeout_millis", 61000, 61000);
    y = bqe.a("analytics.campaigns.time_limit", 86400000L, 86400000L);
    bqe.a("analytics.first_party_experiment_id", "", "");
    bqe.a("analytics.first_party_experiment_variant", 0, 0);
    z = bqe.a("analytics.test.disable_receiver", false);
    A = bqe.a("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
    B = bqe.a("analytics.service_client.connect_timeout_millis", 5000L, 5000L);
    bqe.a("analytics.service_client.second_connect_delay_millis", 5000L, 5000L);
    bqe.a("analytics.service_client.unexpected_reconnect_millis", 60000L, 60000L);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */