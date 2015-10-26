	private synthetic aow a
	private synthetic ama b
	
	    amd(ama p1, aow p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void run()
	    {
	        alm v0_1 = ama.a(this.b);
	        bmu v1_0 = this.a;
	        if (v0_1.i.remove(v1_0.c.q)) {
	            v0_1.b.edit().putString("hiddenDevices", android.text.TextUtils.join(",", v0_1.i.toArray())).commit();
	        }
	        if (v0_1.h.remove(v1_0)) {
	            boolean v2_9 = new Object[1];
	            v2_9[0] = Integer.valueOf(v0_1.h.size());
	            boolean v2_10 = v0_1.e();
	            v0_1.a(v2_10, v1_0);
	            if (v0_1.d != null) {
	                v0_1.d.f(v2_10);
	                v0_1.d.a(v0_1.h.isEmpty());
	            }
	            v0_1.g();
	        }
	        return;
	    }
	
