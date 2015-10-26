	private final com.google.android.gms.clearcut.LogEventParcelable a
	
	    cki(ckc p1, com.google.android.gms.clearcut.LogEventParcelable p2, com.google.android.gms.common.api.GoogleApiClient p3)
	    {
	        this(p3);
	        this.a = p2;
	        return;
	    }
	
	
	    protected final synthetic bwm a(com.google.android.gms.common.api.Status p1)
	    {
	        return p1;
	    }
	
	
	    protected final synthetic void a(bwc p5)
	    {
	        String v1_1 = new ckj(this);
	        try {
	            ckc.a(this.a);
	            ((ckp) ((ckl) p5).o()).a(v1_1, this.a);
	        } catch (String v0_3) {
	            android.util.Log.e("ClearcutLoggerApiImpl", new StringBuilder("MessageNanoProducer ").append(this.a.e.toString()).append(" threw: ").append(v0_3.toString()).toString());
	        }
	        return;
	    }
	
	
	    public final boolean equals(Object p3)
	    {
	        boolean v0_2;
	        if ((p3 instanceof cki)) {
	            v0_2 = this.a.equals(((cki) p3).a);
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("MethodImpl(").append(this.a).append(")").toString();
	    }
	
