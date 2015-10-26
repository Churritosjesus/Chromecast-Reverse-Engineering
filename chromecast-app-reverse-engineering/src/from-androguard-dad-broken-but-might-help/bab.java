	final baa a
	final java.lang.Runnable b
	  c
	 android.net.NetworkInfo$DetailedState d
	  e
	  f
	final synthetic azv g
	private final android.content.BroadcastReceiver h
	
	    public bab(azv p5, String p6, boolean p7, baa p8)
	    {
	        this.g = p5;
	        this.e = 1;
	        this.f = 1;
	        this.a = p8;
	        this.h = new bad(this, p6, p7);
	        this.b = new bac(this, p5);
	        this.c = 1;
	        p5.a.registerReceiver(this.h, new android.content.IntentFilter("android.net.wifi.STATE_CHANGE"));
	        p5.b.postDelayed(this.b, p5.e);
	        return;
	    }
	
	
	    public final void a()
	    {
	        if (this.c) {
	            if (this.h != null) {
	                try {
	                    this.g.a.unregisterReceiver(this.h);
	                } catch (int v0) {
	                }
	            }
	            if (this.b != null) {
	                this.g.b.removeCallbacks(this.b);
	            }
	            this.c = 0;
	            azv v1_2 = this.g;
	            int v0_8 = v1_2.c.getConfiguredNetworks();
	            if (v0_8 != 0) {
	                java.util.Iterator v2 = v0_8.iterator();
	                while (v2.hasNext()) {
	                    v1_2.c.enableNetwork(((android.net.wifi.WifiConfiguration) v2.next()).networkId, 0);
	                }
	            }
	        }
	        return;
	    }
	
