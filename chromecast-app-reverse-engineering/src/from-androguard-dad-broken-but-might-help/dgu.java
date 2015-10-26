	public static final dfa a
	
	    static dgu()
	    {
	        dgu.a = new dgu();
	        return;
	    }
	
	
	    public dgu()
	    {
	        return;
	    }
	
	
	    private static java.net.InetAddress a(java.net.Proxy p2, java.net.URL p3)
	    {
	        if ((p2 == null) || (p2.type() == java.net.Proxy$Type.DIRECT)) {
	            java.net.InetAddress v0_2 = java.net.InetAddress.getByName(p3.getHost());
	        } else {
	            v0_2 = ((java.net.InetSocketAddress) p2.address()).getAddress();
	        }
	        return v0_2;
	    }
	
	
	    public final dfy a(java.net.Proxy p13, dgc p14)
	    {
	        java.util.List v9 = p14.b();
	        dfy v10 = p14.a;
	        java.net.URL v6 = v10.a();
	        int v11 = v9.size();
	        int v8 = 0;
	        while (v8 < v11) {
	            String v5_1 = ((dff) v9.get(v8));
	            if ("Basic".equalsIgnoreCase(v5_1.a)) {
	                dfy v0_6 = java.net.Authenticator.requestPasswordAuthentication(v6.getHost(), dgu.a(p13, v6), dgs.a(v6), v6.getProtocol(), v5_1.b, v5_1.a, v6, java.net.Authenticator$RequestorType.SERVER);
	                if (v0_6 != null) {
	                    dfy v0_1 = v10.c().a("Authorization", a.a(v0_6.getUserName(), new String(v0_6.getPassword()))).a();
	                    return v0_1;
	                }
	            }
	            v8++;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public final dfy b(java.net.Proxy p13, dgc p14)
	    {
	        java.util.List v9 = p14.b();
	        dfy v10 = p14.a;
	        java.net.URL v6 = v10.a();
	        int v11 = v9.size();
	        int v8 = 0;
	        while (v8 < v11) {
	            String v5_1 = ((dff) v9.get(v8));
	            if ("Basic".equalsIgnoreCase(v5_1.a)) {
	                String v2_1 = ((java.net.InetSocketAddress) p13.address());
	                dfy v0_7 = java.net.Authenticator.requestPasswordAuthentication(v2_1.getHostName(), dgu.a(p13, v6), v2_1.getPort(), v6.getProtocol(), v5_1.b, v5_1.a, v6, java.net.Authenticator$RequestorType.PROXY);
	                if (v0_7 != null) {
	                    dfy v0_1 = v10.c().a("Proxy-Authorization", a.a(v0_7.getUserName(), new String(v0_7.getPassword()))).a();
	                    return v0_1;
	                }
	            }
	            v8++;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
