	private synthetic azm a
	
	    azt(azm p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    private varargs java.util.List a()
	    {
	        java.util.ArrayList v2_1 = new java.util.ArrayList();
	        try {
	            java.util.Enumeration v3 = java.net.NetworkInterface.getNetworkInterfaces();
	        } catch (java.net.NetworkInterface v0) {
	            azm.b(this.a);
	            return v2_1;
	        }
	        if (v3 == null) {
	            return v2_1;
	        }
	        while ((v3.hasMoreElements()) && (!this.isCancelled())) {
	            java.net.NetworkInterface v0_3 = ((java.net.NetworkInterface) v3.nextElement());
	            if ((v0_3.isUp()) && ((!v0_3.isLoopback()) && ((!v0_3.isPointToPoint()) && (v0_3.supportsMulticast())))) {
	                java.util.Iterator v4 = v0_3.getInterfaceAddresses().iterator();
	                while (v4.hasNext()) {
	                    if ((((java.net.InterfaceAddress) v4.next()).getAddress() instanceof java.net.Inet4Address)) {
	                        v2_1.add(v0_3);
	                    }
	                }
	            }
	        }
	        return v2_1;
	    }
	
	
	    protected final synthetic Object doInBackground(Object[] p2)
	    {
	        return this.a();
	    }
	
	
	    protected final synthetic void onCancelled(Object p3)
	    {
	        if (azm.c(this.a) == this) {
	            azm.a(this.a, 0);
	        }
	        return;
	    }
	
	
	    protected final synthetic void onPostExecute(Object p5)
	    {
	        if (azm.c(this.a) == this) {
	            if (((java.util.List) p5) != null) {
	                java.util.Iterator v1 = ((java.util.List) p5).iterator();
	                while (v1.hasNext()) {
	                    String v0_5 = ((java.net.NetworkInterface) v1.next());
	                    azm.b(this.a);
	                    Object[] v2_2 = new Object[1];
	                    v2_2[0] = v0_5.getDisplayName();
	                }
	            }
	            azm.a(this.a, ((java.util.List) p5));
	        }
	        return;
	    }
	
