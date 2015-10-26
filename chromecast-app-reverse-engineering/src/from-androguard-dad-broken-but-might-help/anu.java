	private synthetic bdf a
	private synthetic and b
	
	    anu(and p1, bdf p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final synthetic void a(Object p4)
	    {
	        and.a(this.b).W = ((bdf) p4).W;
	        and.a(this.b).X = ((bdf) p4).X;
	        and v0_5 = this.b.B();
	        if (v0_5 != null) {
	            and.t(this.b).a("timezone", v0_5);
	        }
	        and v0_7 = this.b.C();
	        if (v0_7 != null) {
	            and.t(this.b).a("locale", v0_7);
	        }
	        and.c(this.b, this.a);
	        return;
	    }
	
	
	    public final void b_(int p3)
	    {
	        and.c(this.b, this.a);
	        return;
	    }
	
