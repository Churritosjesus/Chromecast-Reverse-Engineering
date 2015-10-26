	final synthetic aqj a
	
	    aqm(aqj p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void run()
	    {
	        aqj.h();
	        btl v0_0 = new Object[1];
	        v0_0[0] = aqj.b(this.a).g();
	        try {
	            bsr.b.a(this.a.a, aqj.c(this.a).c(), aqj.c(this.a));
	        } catch (btl v0_2) {
	            com.google.android.gms.common.api.GoogleApiClient v1_5 = aqj.h();
	            Object[] v3_3 = new Object[2];
	            v3_3[0] = aqj.b(this.a).g();
	            v3_3[1] = v0_2;
	            v1_5.a("Exception while creating media channel for %s: %s", v3_3);
	        }
	        aqj.c(this.a).d = new aqn(this);
	        aqj.c(this.a).e = new aqo(this);
	        com.google.android.gms.common.api.GoogleApiClient v1_11 = this.a.a;
	        v1_11.b(new btn(aqj.c(this.a), v1_11, v1_11));
	        return;
	    }
	
