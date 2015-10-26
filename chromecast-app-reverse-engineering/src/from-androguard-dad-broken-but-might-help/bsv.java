	private synthetic java.lang.String a
	private synthetic java.lang.String g
	
	    bsv(bsu p1, com.google.android.gms.common.api.GoogleApiClient p2, String p3, String p4)
	    {
	        this.a = p3;
	        this.g = p4;
	        this(p2);
	        return;
	    }
	
	
	    protected final synthetic void a(bwc p7)
	    {
	        try {
	            java.util.Map v1_0 = this.a;
	            Long v2_0 = this.g;
	        } catch (Throwable v0) {
	            this.a(2001);
	            return;
	        }
	        if (!android.text.TextUtils.isEmpty(v2_0)) {
	            if (v2_0.length() <= 65536) {
	                a.d(v1_0);
	                ((bue) p7).f();
	                long v4 = ((bue) p7).e.incrementAndGet();
	                try {
	                    ((bue) p7).f.put(Long.valueOf(v4), this);
	                    ((buo) ((bue) p7).o()).a(v1_0, v2_0, v4);
	                } catch (Throwable v0_6) {
	                    ((bue) p7).f.remove(Long.valueOf(v4));
	                    throw v0_6;
	                }
	                return;
	            } else {
	                throw new IllegalArgumentException("Message exceeds maximum size");
	            }
	        } else {
	            throw new IllegalArgumentException("The message payload cannot be null or empty");
	        }
	    }
	
