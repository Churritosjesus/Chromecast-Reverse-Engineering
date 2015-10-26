	 java.lang.String l
	 adz m
	
	    public atb(int p1, String p2, adz p3)
	    {
	        this(p1, p2, p3);
	        return;
	    }
	
	
	    public final java.util.Map a()
	    {
	        String v0_0 = 3;
	        String v1 = this.h();
	        if (this.l != null) {
	            v0_0 = 4;
	        }
	        if (v1 != null) {
	            v0_0++;
	        }
	        java.util.HashMap v2_2 = new java.util.HashMap(v0_0);
	        v2_2.put("Accept", this.c());
	        v2_2.put("IMAX_PROTOCOL_VERSION", "3");
	        v2_2.put("CAST_APP_TYPE", "ANDROID");
	        if (this.l != null) {
	            Object[] v5_1 = new Object[1];
	            v5_1[0] = this.l;
	            v2_2.put("Authorization", String.format(java.util.Locale.US, "Bearer %s", v5_1));
	        }
	        if (v1 != null) {
	            v2_2.put("CAST-APP-DEVICE-ID", v1);
	        }
	        return v2_2;
	    }
	
	
	    public final void b(aef p2)
	    {
	        super.b(p2);
	        if ((this.m != null) && ((p2 instanceof adf))) {
	            this.m.a(p2);
	        }
	        return;
	    }
	
