	private synthetic vu g
	
	    public vv(vu p7, android.content.Context p8, qu p9)
	    {
	        int v4 = 0;
	        this.g = p7;
	        this(p8, p9, 0, 0, a.s);
	        if (!((qe) p9.getItem()).f()) {
	            int v0_5;
	            if (p7.f != null) {
	                v0_5 = p7.f;
	            } else {
	                v0_5 = ((android.view.View) p7.e);
	            }
	            this.b = v0_5;
	        }
	        this.d = p7.m;
	        int v1_1 = p9.size();
	        int v0_8 = 0;
	        while (v0_8 < v1_1) {
	            android.graphics.drawable.Drawable v2_1 = p9.getItem(v0_8);
	            if ((!v2_1.isVisible()) || (v2_1.getIcon() == null)) {
	                v0_8++;
	            } else {
	                v4 = 1;
	                break;
	            }
	        }
	        this.e = v4;
	        return;
	    }
	
	
	    public final void onDismiss()
	    {
	        super.onDismiss();
	        this.g.k = 0;
	        return;
	    }
	
