	  a
	  b
	  c
	final synthetic xw d
	
	    xx(xw p1)
	    {
	        this.d = p1;
	        return;
	    }
	
	
	    final void a()
	    {
	        int v0_3;
	        if (!this.c) {
	            v0_3 = this.d.b.b();
	        } else {
	            v0_3 = this.d.b.c();
	        }
	        this.b = v0_3;
	        return;
	    }
	
	
	    public final void a(android.view.View p3)
	    {
	        if (!this.c) {
	            this.b = this.d.b.a(p3);
	        } else {
	            this.b = (this.d.b.b(p3) + this.d.b.a());
	        }
	        this.a = xw.a(p3);
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return new StringBuilder("AnchorInfo{mPosition=").append(this.a).append(", mCoordinate=").append(this.b).append(", mLayoutFromEnd=").append(this.c).append(125).toString();
	    }
	
