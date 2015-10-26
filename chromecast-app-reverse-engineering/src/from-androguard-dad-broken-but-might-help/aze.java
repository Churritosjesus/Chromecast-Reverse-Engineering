	private synthetic bdq a
	private synthetic  b
	private synthetic aym c
	private synthetic ayz d
	
	    aze(ayz p1, bdq p2, int p3, aym p4)
	    {
	        this.d = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final void a()
	    {
	        ayz.c(this.d);
	        ape.a().a(7, Integer.valueOf(2), Long.valueOf(this.d.d));
	        String v1_1 = ayz.d(this.d);
	        bdf v2_2 = this.a.a;
	        if (v2_2.a <= 4) {
	            try {
	                android.content.SharedPreferences$Editor v0_6 = v1_1.a(v2_2.n, v2_2.u);
	            } catch (android.content.SharedPreferences$Editor v0_9) {
	                throw v0_9;
	            }
	            if (v0_6 == null) {
	                v0_6 = v1_1.d(v2_2.q);
	            }
	            if (v0_6 != null) {
	                if (v0_6.q()) {
	                    v1_1.b(v0_6);
	                }
	            } else {
	                v0_6 = v1_1.a(1);
	            }
	            v0_6.a(v2_2);
	            Object[] v4_4 = new Object[1];
	            v4_4[0] = v0_6.g();
	            if (!v2_2.h) {
	                v1_1.b.edit().putBoolean("hendrixDiscovered", 1).apply();
	            } else {
	                v1_1.b.edit().putBoolean("nonhendrixDiscovered", 1).apply();
	            }
	        } else {
	            android.content.SharedPreferences$Editor v0_18 = new Object[1];
	            v0_18[0] = v2_2.b;
	        }
	        return;
	    }
	
	
	    public final void a(int p7)
	    {
	        Object[] v0_1 = (this.b + 1);
	        if ((!com.google.android.apps.chromecast.app.SetupApplication.a(p7)) || (v0_1 >= 3)) {
	            ayz.c(this.d);
	            Object[] v0_3 = new Object[1];
	            v0_3[0] = Integer.valueOf(p7);
	        } else {
	            ayz.c(this.d);
	            ayz v1_3 = new Object[3];
	            v1_3[0] = Integer.valueOf(p7);
	            v1_3[1] = Integer.valueOf(v0_1);
	            v1_3[2] = Integer.valueOf(3);
	            ayz.a(this.d, this.c, v0_1);
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        ayz.c(this.d);
	        return;
	    }
	
