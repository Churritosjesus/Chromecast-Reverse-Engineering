	final android.support.v7.internal.widget.ActionBarContainer a
	
	    public rc(android.support.v7.internal.widget.ActionBarContainer p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public void draw(android.graphics.Canvas p2)
	    {
	        if (!this.a.e) {
	            if (this.a.b != null) {
	                this.a.b.draw(p2);
	            }
	            if ((this.a.c != null) && (this.a.f)) {
	                this.a.c.draw(p2);
	            }
	        } else {
	            if (this.a.d != null) {
	                this.a.d.draw(p2);
	            }
	        }
	        return;
	    }
	
	
	    public int getOpacity()
	    {
	        return 0;
	    }
	
	
	    public void setAlpha(int p1)
	    {
	        return;
	    }
	
	
	    public void setColorFilter(android.graphics.ColorFilter p1)
	    {
	        return;
	    }
	
