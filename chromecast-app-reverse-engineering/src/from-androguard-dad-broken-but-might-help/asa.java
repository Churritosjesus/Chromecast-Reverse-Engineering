	final android.widget.TextView a
	final android.widget.TextView b
	final android.widget.ImageView c
	final android.widget.CheckBox d
	final android.widget.RadioButton e
	final android.widget.CompoundButton f
	final android.view.View g
	 aex h
	final android.widget.RadioGroup i
	final synthetic art j
	private final android.view.View k
	private final android.widget.TextView l
	private final android.widget.TextView m
	
	    public asa(art p2, android.view.View p3)
	    {
	        this.j = p2;
	        this.k = p3;
	        this.l = ((android.widget.TextView) p3.findViewById(f.C));
	        this.a = ((android.widget.TextView) p3.findViewById(f.z));
	        this.b = ((android.widget.TextView) p3.findViewById(f.A));
	        this.c = ((android.widget.ImageView) p3.findViewById(f.bz));
	        this.d = ((android.widget.CheckBox) p3.findViewById(f.y));
	        this.e = ((android.widget.RadioButton) p3.findViewById(f.B));
	        this.f = ((android.widget.CompoundButton) p3.findViewById(f.F));
	        this.g = p3.findViewById(f.bx);
	        this.i = ((android.widget.RadioGroup) p3.findViewById(f.di));
	        this.m = ((android.widget.TextView) p3.findViewById(f.dj));
	        return;
	    }
	
	
	    public final asa a()
	    {
	        this.l.setVisibility(8);
	        if (this.a != null) {
	            this.a.setVisibility(8);
	        }
	        this.b.setVisibility(8);
	        this.c.setVisibility(8);
	        this.d.setVisibility(8);
	        this.e.setVisibility(8);
	        this.f.setVisibility(8);
	        this.f.setOnCheckedChangeListener(0);
	        this.g.setVisibility(8);
	        this.m.setVisibility(8);
	        this.i.setVisibility(8);
	        this.i.removeAllViews();
	        if (this.h != null) {
	            this.c.setImageResource(17170445);
	            this.h.a();
	        }
	        return this;
	    }
	
	
	    public final asa a(android.view.View$OnClickListener p2)
	    {
	        this.k.setOnClickListener(p2);
	        return this;
	    }
	
	
	    public final asa a(String p4)
	    {
	        if (!android.text.TextUtils.isEmpty(p4)) {
	            if (this.i.getVisibility() != 8) {
	                this.m.setVisibility(0);
	                this.m.setText(p4);
	            } else {
	                this.l.setVisibility(0);
	                this.l.setText(p4);
	            }
	        }
	        return this;
	    }
	
