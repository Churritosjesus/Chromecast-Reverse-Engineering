	private synthetic ann a
	
	    ano(ann p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final synthetic void a(Object p7)
	    {
	        if (!this.a.c.u) {
	            and.a(this.a.c, (android.os.SystemClock.elapsedRealtime() + ((long) and.h(this.a.c))));
	            and.a(this.a.c, ((bdf) p7), this.a.b, this.a.a);
	        } else {
	            ape.a().a(this.a.a.a(2));
	        }
	        return;
	    }
	
	
	    public final void b_(int p8)
	    {
	        if (p8 != -99) {
	            ape.a().a(this.a.a.a(0));
	            if (p8 != -8) {
	                android.os.Handler v0_3 = android.os.SystemClock.elapsedRealtime();
	                if ((com.google.android.apps.chromecast.app.SetupApplication.a(p8)) && ((v0_3 < this.a.b) && (v0_3 < and.i(this.a.c)))) {
	                    android.os.Handler v0_5 = new Object[1];
	                    v0_5[0] = Integer.valueOf(p8);
	                    and.l(this.a.c).postDelayed(and.j(this.a.c), ((long) and.k(this.a.c)));
	                } else {
	                    android.os.Handler v0_10 = this.a.c;
	                    Runnable v1_9 = this.a.c.getString(b.aB);
	                    long v2_13 = this.a.c;
	                    Object[] v4_1 = new Object[1];
	                    v4_1[0] = Integer.valueOf(p8);
	                    and.a(v0_10, v1_9, v2_13.getString(b.aW, v4_1));
	                }
	            } else {
	                android.os.Handler v0_11 = com.google.android.apps.chromecast.app.SetupApplication.a();
	                long v2_15 = new Object[1];
	                v2_15[0] = Integer.valueOf(p8);
	                v0_11.c(String.format("Lost hotspot connection during setup (%d)", v2_15));
	                and.a(this.a.c, 0);
	            }
	        } else {
	            ape.a().a(this.a.a.a(2));
	            this.a.c.w();
	        }
	        return;
	    }
	
