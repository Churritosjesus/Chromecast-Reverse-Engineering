	  a
	
	    public sj(android.graphics.drawable.Drawable p2)
	    {
	        this(p2);
	        this.a = 1;
	        return;
	    }
	
	
	    public final void draw(android.graphics.Canvas p2)
	    {
	        if (this.a) {
	            super.draw(p2);
	        }
	        return;
	    }
	
	
	    public final void setHotspot(float p2, float p3)
	    {
	        if (this.a) {
	            super.setHotspot(p2, p3);
	        }
	        return;
	    }
	
	
	    public final void setHotspotBounds(int p2, int p3, int p4, int p5)
	    {
	        if (this.a) {
	            super.setHotspotBounds(p2, p3, p4, p5);
	        }
	        return;
	    }
	
	
	    public final boolean setState(int[] p2)
	    {
	        int v0_1;
	        if (!this.a) {
	            v0_1 = 0;
	        } else {
	            v0_1 = super.setState(p2);
	        }
	        return v0_1;
	    }
	
	
	    public final boolean setVisible(boolean p2, boolean p3)
	    {
	        int v0_1;
	        if (!this.a) {
	            v0_1 = 0;
	        } else {
	            v0_1 = super.setVisible(p2, p3);
	        }
	        return v0_1;
	    }
	
