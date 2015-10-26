	bridge  a
	private final java.util.concurrent.BlockingQueue b
	private final adm c
	private final adg d
	private final aeb e
	
	    public adn(java.util.concurrent.BlockingQueue p2, adm p3, adg p4, aeb p5)
	    {
	        this.a = 0;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        return;
	    }
	
	
	    public final void run()
	    {
	        android.os.Process.setThreadPriority(10);
	        do {
	            android.os.SystemClock.elapsedRealtime();
	            boolean v0_3 = ((ads) this.b.take());
	            try {
	                v0_3.a("network-queue-take");
	            } catch (String v1_7) {
	                String v3_1 = new Object[1];
	                v3_1[0] = v1_7.toString();
	                aeg.a(v1_7, "Unhandled exception %s", v3_1);
	                String v2_11 = new aef(v1_7);
	                android.os.SystemClock.elapsedRealtime();
	                this.e.a(v0_3, v2_11);
	            } catch (String v1_9) {
	                android.os.SystemClock.elapsedRealtime();
	                this.e.a(v0_3, ads.a(v1_9));
	            }
	            if (!v0_3.g) {
	                if (android.os.Build$VERSION.SDK_INT >= 14) {
	                    android.net.TrafficStats.setThreadStatsTag(v0_3.c);
	                }
	                String v1_5 = this.c.a(v0_3);
	                v0_3.a("network-http-complete");
	                if ((!v1_5.d) || (!v0_3.h)) {
	                    String v1_6 = v0_3.a(v1_5);
	                    v0_3.a("network-parse-complete");
	                    if ((v0_3.f) && (v1_6.b != null)) {
	                        this.d.a(v0_3.b, v1_6.b);
	                        v0_3.a("network-cache-written");
	                    }
	                    v0_3.h = 1;
	                    this.e.a(v0_3, v1_6);
	                } else {
	                    v0_3.b("not-modified");
	                }
	            } else {
	                v0_3.b("network-discard-cancelled");
	            }
	        } while(!this.a);
	        return;
	    }
	
