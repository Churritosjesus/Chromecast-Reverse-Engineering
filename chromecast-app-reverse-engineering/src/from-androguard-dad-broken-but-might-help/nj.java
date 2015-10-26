	private synthetic ni a
	
	    nj(ni p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final android.graphics.drawable.Drawable a()
	    {
	        android.content.res.TypedArray v0_1 = this.a.k();
	        int[] v2_1 = new int[1];
	        v2_1[0] = a.I;
	        android.content.res.TypedArray v0_2 = th.a(v0_1, 0, v2_1);
	        android.graphics.drawable.Drawable v1_1 = v0_2.a(0);
	        v0_2.a.recycle();
	        return v1_1;
	    }
	
	
	    public final void a(int p2)
	    {
	        mj v0_1 = this.a.a();
	        if (v0_1 != null) {
	            v0_1.b(p2);
	        }
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p2, int p3)
	    {
	        mj v0_1 = this.a.a();
	        if (v0_1 != null) {
	            v0_1.a(p2);
	            v0_1.b(p3);
	        }
	        return;
	    }
	
	
	    public final android.content.Context b()
	    {
	        return this.a.k();
	    }
	
	
	    public final boolean c()
	    {
	        int v0_4;
	        int v0_1 = this.a.a();
	        if ((v0_1 == 0) || ((v0_1.b() & 4) == 0)) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
