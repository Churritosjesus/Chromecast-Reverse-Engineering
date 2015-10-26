	private final android.view.LayoutInflater a
	
	    public bar(android.content.Context p2, java.util.List p3)
	    {
	        this(p2, a.fY, p3);
	        this.a = android.view.LayoutInflater.from(p2);
	        return;
	    }
	
	
	    public final android.view.View getView(int p5, android.view.View p6, android.view.ViewGroup p7)
	    {
	        android.widget.ImageView v1_0;
	        if (p6 != null) {
	            v1_0 = ((bas) p6.getTag());
	        } else {
	            p6 = this.a.inflate(a.fY, 0);
	            int v0_4 = new bas(p6);
	            p6.setTag(v0_4);
	            v1_0 = v0_4;
	        }
	        int v0_6 = ((bat) this.getItem(p5));
	        v1_0.a.setText(v0_6.g);
	        if (v0_6.f != 0) {
	            android.widget.ImageView v1_2 = v1_0.b;
	            v1_2.setVisibility(0);
	            v1_2.setImageResource(v0_6.f);
	        }
	        return p6;
	    }
	
