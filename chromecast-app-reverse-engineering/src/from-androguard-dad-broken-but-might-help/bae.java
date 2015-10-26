	final android.content.Context a
	 bag b
	final android.net.wifi.WifiManager c
	final android.content.BroadcastReceiver d
	
	    public bae(android.content.Context p3)
	    {
	        this.a = p3;
	        this.c = ((android.net.wifi.WifiManager) this.a.getSystemService("wifi"));
	        this.d = new baf(this, this.a.getResources().getStringArray(a.dh));
	        return;
	    }
	
