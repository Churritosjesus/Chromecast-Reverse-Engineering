	private synthetic android.widget.ImageView a
	private synthetic bhd b
	
	    bhe(bhd p1, android.widget.ImageView p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final boolean onPreDraw()
	    {
	        bhd.a(this.b).setPadding(0, 0, (this.a.getMeasuredWidth() / 8), (this.a.getMeasuredHeight() / 4));
	        return 1;
	    }
	
