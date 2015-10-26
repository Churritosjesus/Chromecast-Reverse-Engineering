	private synthetic aqu a
	
	    aqv(aqu p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        return;
	    }
	
	
	    public final void a(tz p7, uh p8)
	    {
	        aqu.b(this.a);
	        alm v0_2 = new Object[2];
	        v0_2[0] = Long.valueOf((android.os.SystemClock.elapsedRealtime() - aqu.a(this.a)));
	        v0_2[1] = p8.c;
	        aqu.c(this.a).a(p8);
	        return;
	    }
	
	
	    public final void a(uh p1)
	    {
	        return;
	    }
	
	
	    public final void b(tz p9, uh p10)
	    {
	        aqu.b(this.a);
	        Throwable v0_2 = new Object[2];
	        v0_2[0] = Long.valueOf((android.os.SystemClock.elapsedRealtime() - aqu.a(this.a)));
	        v0_2[1] = p10.c;
	        Throwable v0_4 = aqu.c(this.a);
	        try {
	            aow v2_5 = v0_4.e(com.google.android.gms.cast.CastDevice.a(p10.m).b);
	        } catch (Throwable v0_5) {
	            throw v0_5;
	        }
	        if (v2_5 != null) {
	            long[] v3_1 = new Object[1];
	            v3_1[0] = v2_5.g();
	            v0_4.c.b(v2_5);
	            v2_5.b = 0;
	            v2_5.g = 0;
	            v2_5.u[(aoz.d - 1)] = -1;
	            v0_4.c(v2_5);
	        }
	        return;
	    }
	
	
	    public final void c(tz p2, uh p3)
	    {
	        aqu.c(this.a).a(p3);
	        return;
	    }
	
