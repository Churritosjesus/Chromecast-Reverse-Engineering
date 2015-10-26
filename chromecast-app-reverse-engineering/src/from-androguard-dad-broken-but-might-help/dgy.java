	public  a
	private dkh b
	private synthetic dgx c
	
	    private dgy(dgx p3)
	    {
	        this.c = p3;
	        this.b = new dkh(this.c.c.a());
	        return;
	    }
	
	
	    synthetic dgy(dgx p1, byte p2)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public final dkw a()
	    {
	        return this.b;
	    }
	
	
	    protected final void a(boolean p4)
	    {
	        if (this.c.e == 5) {
	            dgx.a(this.c, this.b);
	            this.c.e = 0;
	            if ((!p4) || (this.c.f != 1)) {
	                if (this.c.f == 2) {
	                    this.c.e = 6;
	                    this.c.b.c.close();
	                }
	            } else {
	                this.c.f = 0;
	                dgi.b.a(this.c.a, this.c.b);
	            }
	            return;
	        } else {
	            throw new IllegalStateException(new StringBuilder("state: ").append(this.c.e).toString());
	        }
	    }
	
	
	    protected final void b()
	    {
	        dgs.a(this.c.b.c);
	        this.c.e = 6;
	        return;
	    }
	
