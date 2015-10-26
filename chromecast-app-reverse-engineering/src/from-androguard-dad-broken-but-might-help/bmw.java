	private synthetic aow a
	private synthetic bmu b
	
	    bmw(bmu p1, aow p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p4)
	    {
	        bmu v0_0 = this.a;
	        if (v0_0.s()) {
	            v0_0.m = 1;
	            v0_0.n = (v0_0.l.size() - 1);
	            v0_0.p();
	        }
	        bmu v0_1 = this.a;
	        aow v1_6 = com.google.android.apps.chromecast.app.SetupApplication.a().j.a(v0_1);
	        if (v1_6 == null) {
	            aow v1_7 = new Object[1];
	            v1_7[0] = v0_1.g();
	        } else {
	            v1_6.g();
	        }
	        this.b.a(this.a);
	        return;
	    }
	
