	private synthetic azm a
	
	    azq(azm p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onReceive(android.content.Context p6, android.content.Intent p7)
	    {
	        azm v0_4;
	        azm v0_2 = azm.f(this.a).getActiveNetworkInfo();
	        if ((v0_2 == null) || (!v0_2.isConnected())) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        azm.b(this.a);
	        Object[] v3_2 = new Object[2];
	        v3_2[0] = Boolean.valueOf(v0_4);
	        v3_2[1] = Boolean.valueOf(azm.g(this.a));
	        if (v0_4 == null) {
	            azm.a(this.a, 0);
	        }
	        azm.h(this.a);
	        if (v0_4 == null) {
	            if (!azm.g(this.a)) {
	                azm.b(this.a);
	                azm.i(this.a);
	            }
	        } else {
	            azm.b(this.a);
	            this.a.a();
	        }
	        return;
	    }
	
