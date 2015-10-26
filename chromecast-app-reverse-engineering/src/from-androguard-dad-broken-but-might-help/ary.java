	private synthetic dcj a
	private synthetic dcj b
	private synthetic art c
	
	    ary(art p1, dcj p2, dcj p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p8)
	    {
	        auq v1 = art.a(this.c).h().s();
	        dcj[] v2 = this.a.i;
	        int v3 = v2.length;
	        asb v0_4 = 0;
	        while (v0_4 < v3) {
	            Integer v4_0 = v2[v0_4];
	            v1.c(String.valueOf(v4_0.b.intValue())).a = Boolean.valueOf(v4_0.equals(this.b));
	            art.a(this.c, v4_0.b);
	            v0_4++;
	        }
	        this.c.notifyDataSetChanged();
	        art.a(this.c).h().d.a();
	        return;
	    }
	
