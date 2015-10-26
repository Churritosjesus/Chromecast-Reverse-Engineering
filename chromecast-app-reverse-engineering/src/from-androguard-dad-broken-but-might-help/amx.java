	private synthetic com.google.android.apps.chromecast.app.MainActivity a
	
	    public amx(com.google.android.apps.chromecast.app.MainActivity p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onReceive(android.content.Context p7, android.content.Intent p8)
	    {
	        com.google.android.apps.chromecast.app.MainActivity v0_3 = ((android.net.NetworkInfo) p8.getParcelableExtra("networkInfo")).getState();
	        int[] v1_1 = blr.c(this.a);
	        bcn v2_1 = new Object[2];
	        v2_1[0] = v0_3.toString();
	        v2_1[1] = v1_1;
	        com.google.android.apps.chromecast.app.MainActivity.e(this.a).a(v1_1);
	        com.google.android.apps.chromecast.app.MainActivity.f(this.a).a(v1_1);
	        switch (amp.a[v0_3.ordinal()]) {
	            case 1:
	                if (!com.google.android.apps.chromecast.app.MainActivity.g(this.a)) {
	                    com.google.android.apps.chromecast.app.MainActivity v0_9 = com.google.android.apps.chromecast.app.MainActivity.h(this.a);
	                    v0_9.c = 0;
	                    v0_9.a(0);
	                    v0_9.b = 1;
	                    v0_9.p();
	                }
	                com.google.android.apps.chromecast.app.MainActivity.a(this.a, 1);
	                break;
	            default:
	                com.google.android.apps.chromecast.app.MainActivity.a(this.a, 0);
	        }
	        com.google.android.apps.chromecast.app.MainActivity.i(this.a);
	        return;
	    }
	
