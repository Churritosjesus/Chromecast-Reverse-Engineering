	final blp a
	private java.util.Map b
	
	    public auq()
	    {
	        this.a = new blp("UserSettings");
	        this.b = new java.util.HashMap();
	        return;
	    }
	
	
	    public auq(dck p3)
	    {
	        this.a = new blp("UserSettings");
	        this.b = new java.util.HashMap();
	        this.a(p3);
	        return;
	    }
	
	
	    public final dck a()
	    {
	        dci[] v0_2 = new dci[this.b.size()];
	        dck v1_1 = new dck();
	        v1_1.a = ((dci[]) this.b.values().toArray(v0_2));
	        return v1_1;
	    }
	
	
	    public final void a(dck p7)
	    {
	        dci[] v1 = p7.a;
	        int v2 = v1.length;
	        int v0 = 0;
	        while (v0 < v2) {
	            dci v3 = v1[v0];
	            if ((v3 != null) && (v3.c != null)) {
	                this.b.put(v3.c, v3);
	            }
	            v0++;
	        }
	        return;
	    }
	
	
	    public final void a(String p3, boolean p4)
	    {
	        this.c(p3).a = Boolean.valueOf(p4);
	        return;
	    }
	
	
	    public final boolean a(int p3)
	    {
	        int v0_3;
	        if (this.c(String.valueOf(p3)).a != Boolean.TRUE) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final boolean a(String p3)
	    {
	        int v0_2;
	        if (this.c(p3).a != Boolean.TRUE) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final dca[] b(String p2)
	    {
	        return this.c(p2).b;
	    }
	
	
	    public dci c(String p4)
	    {
	        dci v0_2 = ((dci) this.b.get(p4));
	        if (v0_2 == null) {
	            v0_2 = new dci();
	            v0_2.c = p4;
	            this.b.put(v0_2.c, v0_2);
	        }
	        return v0_2;
	    }
	
