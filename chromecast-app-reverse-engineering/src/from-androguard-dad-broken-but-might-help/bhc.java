	private synthetic bhb a
	
	    bhc(bhb p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    private void b()
	    {
	        android.net.wifi.WifiManager v0_2 = bha.b(this.a.a);
	        int v1_2 = bha.c(this.a.a);
	        android.net.wifi.WifiConfiguration v2 = v0_2.a(v1_2);
	        if (v2 != null) {
	            Object[] v3_1 = new Object[1];
	            v3_1[0] = v1_2;
	            v0_2.c.removeNetwork(v2.networkId);
	        }
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.b();
	        return;
	    }
	
	
	    public final void a(boolean p1)
	    {
	        this.b();
	        return;
	    }
	
