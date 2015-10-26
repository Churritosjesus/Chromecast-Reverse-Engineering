	private synthetic android.content.Intent a
	
	    bly(String p1, android.content.Intent p2)
	    {
	        this.a = p2;
	        this(p1);
	        return;
	    }
	
	
	    public final void onClick(android.view.View p3)
	    {
	        if (this.a == null) {
	            super.onClick(p3);
	        } else {
	            p3.getContext().startActivity(this.a);
	        }
	        return;
	    }
	
	
	    public final void updateDrawState(android.text.TextPaint p2)
	    {
	        super.updateDrawState(p2);
	        p2.setUnderlineText(0);
	        return;
	    }
	
