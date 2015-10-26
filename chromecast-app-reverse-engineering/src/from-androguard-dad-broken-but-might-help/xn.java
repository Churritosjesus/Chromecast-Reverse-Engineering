	public zr a
	public zr b
	public  c
	public  d
	public  e
	public  f
	
	    private xn(zr p1, zr p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    xn(zr p1, zr p2, int p3, int p4, int p5, int p6)
	    {
	        this(p1, p2);
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        this.f = p6;
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("ChangeInfo{oldHolder=").append(this.a).append(", newHolder=").append(this.b).append(", fromX=").append(this.c).append(", fromY=").append(this.d).append(", toX=").append(this.e).append(", toY=").append(this.f).append(125).toString();
	    }
	
