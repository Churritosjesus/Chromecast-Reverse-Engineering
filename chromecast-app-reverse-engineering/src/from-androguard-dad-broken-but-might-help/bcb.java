	private synthetic bbx a
	
	    bcb(bbx p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final boolean shouldOverrideUrlLoading(android.webkit.WebView p3, String p4)
	    {
	        if ((android.text.TextUtils.isEmpty(bbx.d(this.a))) || (!p4.startsWith(bbx.d(this.a)))) {
	            p3.loadUrl(p4);
	            int v0_6 = 0;
	        } else {
	            bbx.e(this.a).stopLoading();
	            bbx.e(this.a).setVisibility(8);
	            bbx.a(this.a, p4);
	            v0_6 = 1;
	        }
	        return v0_6;
	    }
	
