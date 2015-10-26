	private synthetic dbg a
	private synthetic java.lang.String b
	
	    axp(axo p1, dbg p2, String p3)
	    {
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p5)
	    {
	        axb v0_0 = p5.getContext();
	        if ((v0_0 == null) || (android.text.TextUtils.isEmpty(this.a.h))) {
	            if ((v0_0 != null) && ((v0_0 instanceof axb))) {
	                ((axb) v0_0).a(this.a.f, this.b, this.a.g);
	            }
	        } else {
	            blx.a(p5.getContext(), this.a.h);
	            axb v0_4 = apg.a(120);
	            v0_4.b = this.a.f;
	            v0_4.b();
	        }
	        return;
	    }
	
