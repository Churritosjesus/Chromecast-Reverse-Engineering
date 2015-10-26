	final synthetic java.lang.String a
	final synthetic bff b
	final synthetic  c
	final synthetic  d
	final synthetic bfp e
	final synthetic  f
	final synthetic  g
	final synthetic bdu h
	private synthetic  i
	
	    beh(bdu p1, String p2, long p3, bff p5, long p6, int p8, bfp p9, long p10, int p12)
	    {
	        this.h = p1;
	        this.a = p2;
	        this.i = p3;
	        this.b = p5;
	        this.c = p6;
	        this.d = p8;
	        this.e = p9;
	        this.f = p10;
	        this.g = p12;
	        return;
	    }
	
	
	    public final void a()
	    {
	        bff v0_1 = new Object[2];
	        v0_1[0] = this.a;
	        v0_1[1] = Long.valueOf((android.os.SystemClock.elapsedRealtime() - this.i));
	        this.b.a();
	        return;
	    }
	
	
	    public final void a(int p15)
	    {
	        if (!this.h.a(this.a, this.c)) {
	            String v3_2;
	            long v4_2 = (android.os.SystemClock.elapsedRealtime() - this.i);
	            android.os.Handler v0_3 = this.h.h;
	            if ((v0_3.i <= 0) || (android.os.SystemClock.elapsedRealtime() >= (v0_3.i + v0_3.h))) {
	                v3_2 = 0;
	            } else {
	                v3_2 = 1;
	            }
	            if ((p15 != -1) && ((p15 != -2) && ((p15 != -6) && (p15 != -8)))) {
	                android.os.Handler v0_9 = 0;
	            } else {
	                v0_9 = 1;
	            }
	            if ((v0_9 != null) && ((this.d <= this.e.h) || (v3_2 != null))) {
	                android.os.Handler v0_12 = new Object[5];
	                v0_12[0] = this.a;
	                v0_12[1] = Integer.valueOf(p15);
	                v0_12[2] = Integer.valueOf(this.d);
	                v0_12[3] = Integer.valueOf(this.e.h);
	                v0_12[4] = Long.valueOf(v4_2);
	                this.h.a.postDelayed(new bei(this), this.f);
	            } else {
	                android.os.Handler v0_15 = new Object[3];
	                v0_15[0] = this.a;
	                v0_15[1] = Integer.valueOf(p15);
	                v0_15[2] = Long.valueOf(v4_2);
	                this.b.a(p15);
	            }
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.b.b();
	        return;
	    }
	
