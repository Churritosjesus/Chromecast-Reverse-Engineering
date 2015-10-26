	private synthetic java.lang.String a
	private synthetic azv b
	
	    azy(azv p1, String p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onAvailable(android.net.Network p5)
	    {
	        azv v0_2 = this.b.d.getNetworkInfo(p5);
	        String v1_0 = v0_2.getExtraInfo();
	        Object[] v2_1 = new Object[3];
	        v2_1[0] = v0_2.getTypeName();
	        v2_1[1] = v1_0;
	        v2_1[2] = this.a;
	        if ((this.b.g == null) && (blr.a(this.a, v1_0))) {
	            azv.a(this.b, p5, this.a);
	        }
	        return;
	    }
	
	
	    public final void onLost(android.net.Network p6)
	    {
	        azv v0_2 = this.b.d.getNetworkInfo(p6);
	        if (v0_2 == null) {
	            azv v0_3 = new Object[1];
	            v0_3[0] = p6;
	        } else {
	            if (!blr.a(v0_2.getExtraInfo(), this.a)) {
	                Object[] v1_2 = new Object[1];
	                v1_2[0] = v0_2;
	            } else {
	                azv v0_4 = new Object[1];
	                v0_4[0] = this.a;
	            }
	        }
	        if (this.b.g != null) {
	            this.b.d();
	        }
	        return;
	    }
	
