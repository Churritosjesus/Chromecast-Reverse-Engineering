	final synthetic ama a
	
	    amb(ama p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        ama.e(this.a).a((ama.d(this.a).a() - 1));
	        return;
	    }
	
	
	    public final void a(aow p6)
	    {
	        if (!p6.q()) {
	            Throwable v0_2 = ama.b(this.a);
	            int v2_1 = new Object[1];
	            v2_1[0] = p6.c.b;
	            v0_2.a("Tried to hide %s, but it\'s already set up.", v2_1);
	        } else {
	            Throwable v0_4 = ama.a(this.a);
	            v0_4.i.add(p6.c.q);
	            v0_4.b.edit().putString("hiddenDevices", android.text.TextUtils.join(",", v0_4.i.toArray())).commit();
	            v0_4.d(p6);
	            int v2_6 = v0_4.g.indexOf(p6);
	            if (v2_6 != -1) {
	                v0_4.a(v2_6, v0_4.g);
	                if (v0_4.d != null) {
	                    v0_4.d.g(v2_6);
	                }
	            }
	            v0_4.g();
	        }
	        return;
	    }
	
	
	    public final void a(aow p2, int p3)
	    {
	        ama.a(this.a, p2, p3);
	        return;
	    }
	
	
	    public final void a(String p5)
	    {
	        ash v0_1 = ama.c(this.a);
	        amc v1_1 = new amc(this);
	        dbt v2_1 = new dbt();
	        v2_1.a = p5;
	        v0_1.a(2, v2_1, v1_1);
	        return;
	    }
	
	
	    public final void b(aow p4)
	    {
	        bmn.a(p4.f()).a(this.a.x, 0);
	        return;
	    }
	
