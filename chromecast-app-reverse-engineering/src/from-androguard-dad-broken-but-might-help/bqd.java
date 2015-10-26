	public static bqe A
	public static bqe B
	public static bqe C
	public static bqe D
	public static bqe E
	public static bqe a
	public static bqe b
	public static bqe c
	public static bqe d
	public static bqe e
	public static bqe f
	public static bqe g
	public static bqe h
	public static bqe i
	public static bqe j
	public static bqe k
	public static bqe l
	public static bqe m
	public static bqe n
	public static bqe o
	public static bqe p
	public static bqe q
	public static bqe r
	public static bqe s
	public static bqe t
	public static bqe u
	public static bqe v
	public static bqe w
	public static bqe x
	public static bqe y
	public static bqe z
	
	    static bqd()
	    {
	        bqe.a("analytics.service_enabled", 0);
	        bqd.a = bqe.a("analytics.service_client_enabled", 1);
	        bqd.b = bqe.a("analytics.log_tag", "GAv4", "GAv4-SVC");
	        bqe.a("analytics.max_tokens", 60, 60);
	        new bqe(cks.a("analytics.tokens_per_sec", Float.valueOf(1056964608)), Float.valueOf(1056964608));
	        bqd.c = bqe.a("analytics.max_stored_hits", 2000, 20000);
	        bqe.a("analytics.max_stored_hits_per_app", 2000, 2000);
	        bqd.d = bqe.a("analytics.max_stored_properties_per_app", 100, 100);
	        bqd.e = bqe.a("analytics.local_dispatch_millis", 1800000, 120000);
	        bqd.f = bqe.a("analytics.initial_local_dispatch_millis", 5000, 5000);
	        bqe.a("analytics.min_local_dispatch_millis", 120000, 120000);
	        bqe.a("analytics.max_local_dispatch_millis", 7200000, 7200000);
	        bqd.g = bqe.a("analytics.dispatch_alarm_millis", 7200000, 7200000);
	        bqd.h = bqe.a("analytics.max_dispatch_alarm_millis", 32400000, 32400000);
	        bqd.i = bqe.a("analytics.max_hits_per_dispatch", 20, 20);
	        bqd.j = bqe.a("analytics.max_hits_per_batch", 20, 20);
	        bqd.k = bqe.a("analytics.insecure_host", "http://www.google-analytics.com", "http://www.google-analytics.com");
	        bqd.l = bqe.a("analytics.secure_host", "https://ssl.google-analytics.com", "https://ssl.google-analytics.com");
	        bqd.m = bqe.a("analytics.simple_endpoint", "/collect", "/collect");
	        bqd.n = bqe.a("analytics.batching_endpoint", "/batch", "/batch");
	        bqd.o = bqe.a("analytics.max_get_length", 2036, 2036);
	        bqd.p = bqe.a("analytics.batching_strategy.k", brs.b.name(), brs.b.name());
	        bqd.q = bqe.a("analytics.compression_strategy.k", brw.a.name(), brw.a.name());
	        bqe.a("analytics.max_hits_per_request.k", 20, 20);
	        bqd.r = bqe.a("analytics.max_hit_length.k", 8192, 8192);
	        bqd.s = bqe.a("analytics.max_post_length.k", 8192, 8192);
	        bqd.t = bqe.a("analytics.max_batch_post_length", 8192, 8192);
	        bqd.u = bqe.a("analytics.fallback_responses.k", "404,502", "404,502");
	        bqd.v = bqe.a("analytics.batch_retry_interval.seconds.k", 3600, 3600);
	        bqe.a("analytics.service_monitor_interval", 86400000, 86400000);
	        bqd.w = bqe.a("analytics.http_connection.connect_timeout_millis", 60000, 60000);
	        bqd.x = bqe.a("analytics.http_connection.read_timeout_millis", 61000, 61000);
	        bqd.y = bqe.a("analytics.campaigns.time_limit", 86400000, 86400000);
	        bqe.a("analytics.first_party_experiment_id", "", "");
	        bqe.a("analytics.first_party_experiment_variant", 0, 0);
	        bqd.z = bqe.a("analytics.test.disable_receiver", 0);
	        bqd.A = bqe.a("analytics.service_client.idle_disconnect_millis", 10000, 10000);
	        bqd.B = bqe.a("analytics.service_client.connect_timeout_millis", 5000, 5000);
	        bqe.a("analytics.service_client.second_connect_delay_millis", 5000, 5000);
	        bqe.a("analytics.service_client.unexpected_reconnect_millis", 60000, 60000);
	        bqd.C = bqe.a("analytics.service_client.reconnect_throttle_millis", 1800000, 1800000);
	        bqd.D = bqe.a("analytics.monitoring.sample_period_millis", 86400000, 86400000);
	        bqd.E = bqe.a("analytics.initialization_warning_threshold", 5000, 5000);
	        return;
	    }
	
