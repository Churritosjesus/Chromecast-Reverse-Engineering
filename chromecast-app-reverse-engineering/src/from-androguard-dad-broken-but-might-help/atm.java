	private synthetic aow a
	private synthetic atf b
	
	    atm(atf p1, aow p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final synthetic void a(Object p8)
	    {
	        int v0_3;
	        boolean v2_0 = 0;
	        int v1 = 1;
	        int v0_0 = new Object[1];
	        v0_0[0] = this.a.g();
	        aqi.a();
	        aow v4 = this.a;
	        atu v5 = v4.o();
	        if (android.text.TextUtils.equals(v5.h, ((dcu) p8).b)) {
	            v0_3 = 0;
	        } else {
	            v5.h = ((dcu) p8).b;
	            v5.i = ((dcu) p8).c;
	            v0_3 = 1;
	        }
	        int v3_3 = ((dcu) p8).a;
	        if (android.text.TextUtils.isEmpty(v3_3)) {
	            v3_3 = ((dcu) p8).g;
	        }
	        int v3_4;
	        if (android.text.TextUtils.equals(v5.f, v3_3)) {
	            v3_4 = v0_3;
	        } else {
	            v5.f = v3_3;
	            v3_4 = 1;
	        }
	        String[] v6_3 = new String[((dcu) p8).d.size()];
	        while (v2_0 < v6_3.length) {
	            v6_3[v2_0] = ((dcq) ((dcu) p8).d.get(v2_0)).a;
	            v2_0++;
	        }
	        int v0_10 = android.text.TextUtils.join("\n", v6_3);
	        if (!android.text.TextUtils.equals(v5.g, v0_10)) {
	            v5.g = v0_10;
	            v3_4 = 1;
	        }
	        v5.c = ((dcu) p8).e;
	        v5.e = ((dcu) p8).b();
	        v5.b = ((dcu) p8).f;
	        if (v5.d == null) {
	            v1 = v3_4;
	        } else {
	            v5.d = 0;
	        }
	        if (v1 != 0) {
	            v4.p();
	        }
	        return;
	    }
	
