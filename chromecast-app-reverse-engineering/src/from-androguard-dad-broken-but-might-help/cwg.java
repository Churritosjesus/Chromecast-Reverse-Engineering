	private static java.lang.String a
	private final cxt b
	
	    static cwg()
	    {
	        cwg.a = cwg.getName();
	        return;
	    }
	
	
	    cwg(cxt p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    public static void a(android.content.Context p3)
	    {
	        android.content.Intent v0_1 = new android.content.Intent("com.google.analytics.RADIO_POWERED");
	        v0_1.addCategory(p3.getPackageName());
	        v0_1.putExtra(cwg.a, 1);
	        p3.sendBroadcast(v0_1);
	        return;
	    }
	
	
	    public void onReceive(android.content.Context p3, android.content.Intent p4)
	    {
	        cxt v0_0 = p4.getAction();
	        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(v0_0)) {
	            if (("com.google.analytics.RADIO_POWERED".equals(v0_0)) && (!p4.hasExtra(cwg.a))) {
	                this.b.d();
	            }
	        } else {
	            cxt v0_5 = Boolean.FALSE;
	            if (p4.getExtras() != null) {
	                v0_5 = Boolean.valueOf(p4.getExtras().getBoolean("noConnectivity"));
	            }
	            cxt v0_9;
	            if (v0_5.booleanValue()) {
	                v0_9 = 0;
	            } else {
	                v0_9 = 1;
	            }
	            this.b.a(v0_9);
	        }
	        return;
	    }
	
