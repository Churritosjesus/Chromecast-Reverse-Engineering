	
	    bs()
	    {
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p1, float p2, float p3)
	    {
	        p1.setHotspot(p2, p3);
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p2, int p3)
	    {
	        if (!(p2 instanceof by)) {
	            p2.setTint(p3);
	        } else {
	            b.a(p2, p3);
	        }
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p1, int p2, int p3, int p4, int p5)
	    {
	        p1.setHotspotBounds(p2, p3, p4, p5);
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p2, android.content.res.ColorStateList p3)
	    {
	        if (!(p2 instanceof by)) {
	            p2.setTintList(p3);
	        } else {
	            b.a(p2, p3);
	        }
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p2, android.graphics.PorterDuff$Mode p3)
	    {
	        if (!(p2 instanceof by)) {
	            p2.setTintMode(p3);
	        } else {
	            b.a(p2, p3);
	        }
	        return;
	    }
	
	
	    public android.graphics.drawable.Drawable c(android.graphics.drawable.Drawable p2)
	    {
	        if ((p2 instanceof android.graphics.drawable.GradientDrawable)) {
	            p2 = new by(p2);
	        }
	        return p2;
	    }
	
