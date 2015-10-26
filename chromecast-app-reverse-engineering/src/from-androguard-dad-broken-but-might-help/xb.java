	public final xd a
	public final xc b
	public final java.util.List c
	
	    public xb(xd p2)
	    {
	        this.a = p2;
	        this.b = new xc();
	        this.c = new java.util.ArrayList();
	        return;
	    }
	
	
	    public final int a()
	    {
	        return (this.a.a() - this.c.size());
	    }
	
	
	    int a(int p5)
	    {
	        int v0_1;
	        if (p5 >= 0) {
	            int v2 = this.a.a();
	            v0_1 = p5;
	            while (v0_1 < v2) {
	                int v3_3 = (p5 - (v0_1 - this.b.d(v0_1)));
	                if (v3_3 != 0) {
	                    v0_1 += v3_3;
	                }
	                while (this.b.b(v0_1)) {
	                    v0_1++;
	                }
	            }
	            v0_1 = -1;
	        } else {
	            v0_1 = -1;
	        }
	        return v0_1;
	    }
	
	
	    public final void a(android.view.View p3, int p4, android.view.ViewGroup$LayoutParams p5, boolean p6)
	    {
	        int v0_0;
	        if (p4 >= 0) {
	            v0_0 = this.a(p4);
	        } else {
	            v0_0 = this.a.a();
	        }
	        this.b.a(v0_0, p6);
	        if (p6) {
	            this.c.add(p3);
	        }
	        this.a.a(p3, v0_0, p5);
	        return;
	    }
	
	
	    public final void a(android.view.View p3, int p4, boolean p5)
	    {
	        int v0_0;
	        if (p4 >= 0) {
	            v0_0 = this.a(p4);
	        } else {
	            v0_0 = this.a.a();
	        }
	        this.b.a(v0_0, p5);
	        if (p5) {
	            this.c.add(p3);
	        }
	        this.a.a(p3, v0_0);
	        return;
	    }
	
	
	    final boolean a(android.view.View p2)
	    {
	        return this.c.contains(p2);
	    }
	
	
	    public final int b()
	    {
	        return this.a.a();
	    }
	
	
	    public final android.view.View b(int p3)
	    {
	        return this.a.b(this.a(p3));
	    }
	
	
	    public final android.view.View c(int p2)
	    {
	        return this.a.b(p2);
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder().append(this.b.toString()).append(", hidden list:").append(this.c.size()).toString();
	    }
	
