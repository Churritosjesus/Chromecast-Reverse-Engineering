	private synthetic Ljava.lang.String a
	private synthetic bae b
	
	    baf(bae p1, String[] p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onReceive(android.content.Context p8, android.content.Intent p9)
	    {
	        if (this.b.b != null) {
	            java.util.Iterator v2 = this.b.c.getScanResults().iterator();
	            while (v2.hasNext()) {
	                String v0_7 = ((android.net.wifi.ScanResult) v2.next());
	                if (v0_7 != null) {
	                    String v3 = v0_7.BSSID.toUpperCase();
	                    String[] v4 = this.a;
	                    bag v1_1 = 0;
	                    while (v1_1 < v4.length) {
	                        if (!v3.startsWith(v4[v1_1])) {
	                            v1_1++;
	                        } else {
	                            if (android.text.TextUtils.isEmpty(v0_7.SSID)) {
	                                break;
	                            }
	                            this.b.b.a(v0_7.SSID, v3);
	                            break;
	                        }
	                    }
	                }
	            }
	        }
	        try {
	            p8.unregisterReceiver(this);
	        } catch (String v0) {
	        }
	        return;
	    }
	
