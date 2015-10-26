	private synthetic apa a
	
	    apb(apa p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final android.view.View getVideoLoadingProgressView()
	    {
	        android.view.View v0_2 = this.a.b(0).inflate(a.gB, 0);
	        v0_2.findViewById(f.dd).setVisibility(8);
	        return v0_2;
	    }
	
	
	    public final void onHideCustomView()
	    {
	        if (apa.a(this.a) != null) {
	            apa.d(this.a);
	        }
	        return;
	    }
	
	
	    public final void onShowCustomView(android.view.View p4, android.webkit.WebChromeClient$CustomViewCallback p5)
	    {
	        apc v0_2 = ((android.view.ViewGroup) this.a.N);
	        if (apa.a(this.a) != null) {
	            v0_2.removeView(apa.a(this.a));
	            apa.b(this.a).onCustomViewHidden();
	        }
	        apa.c(this.a).setVisibility(8);
	        apa.a(this.a, p4);
	        apa.a(this.a, p5);
	        v0_2.addView(apa.a(this.a));
	        ((apc) this.a.y).c_();
	        return;
	    }
	
