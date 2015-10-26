	final synthetic bmu a
	
	    bnd(bmu p1, android.content.Context p2, int p3, java.util.List p4)
	    {
	        this.a = p1;
	        this(p2, p3, p4);
	        return;
	    }
	
	
	    public final android.view.View getView(int p11, android.view.View p12, android.view.ViewGroup p13)
	    {
	        ast v0_3 = ((ast) this.a.d.get(p11));
	        if (p12 == null) {
	            p12 = android.view.LayoutInflater.from(this.a.h).inflate(a.fx, 0);
	        }
	        ((android.widget.TextView) p12.findViewById(f.aE)).setText(v0_3.c);
	        bne v1_8 = ((android.widget.TextView) p12.findViewById(f.h));
	        String v2_3 = this.a.h;
	        Object[] v4_0 = new Object[1];
	        v4_0[0] = android.text.format.DateFormat.getDateFormat(this.a.h).format(Long.valueOf(v0_3.d));
	        v1_8.setText(v2_3.getString(b.O, v4_0));
	        bne v1_11 = ((android.widget.ImageView) p12.findViewById(f.er));
	        String v2_6 = this.a.h;
	        Object[] v4_1 = new Object[1];
	        v4_1[0] = v0_3.c;
	        v1_11.setContentDescription(v2_6.getString(b.ak, v4_1));
	        p12.setOnClickListener(new bne(this, v0_3));
	        return p12;
	    }
	
