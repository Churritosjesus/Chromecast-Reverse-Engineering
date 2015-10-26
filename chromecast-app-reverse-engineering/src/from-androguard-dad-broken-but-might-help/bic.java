	final synthetic bhf a
	
	    bic(bhf p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        if ((bhf.a(this.a) != null) && (!bhf.a(this.a).u)) {
	            bdu v0_6 = bhf.a(this.a);
	            bid v7_1 = new bid(this);
	            bdu v0_7 = v0_6.p;
	            long v2 = v0_7.d();
	            bdp v4_1 = new bdp(v0_7.d);
	            v0_7.a("getConfiguredNetworks", v2, v4_1, v0_7.e, new bel(v0_7, v7_1, v4_1));
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        if (!bhf.a(this.a).u) {
	            bhf.a(this.a).finish();
	        } else {
	            bhf.a(this.a).y();
	        }
	        return;
	    }
	
