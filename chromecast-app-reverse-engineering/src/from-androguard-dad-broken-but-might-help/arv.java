	final synthetic dcj a
	final synthetic art b
	private synthetic android.widget.CompoundButton c
	
	    arv(art p1, dcj p2, android.widget.CompoundButton p3)
	    {
	        this.b = p1;
	        this.a = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p8)
	    {
	        art v0_0 = 1;
	        if (android.text.TextUtils.isEmpty(this.a.o)) {
	            if (this.a.a.intValue() != 11) {
	                if (this.a.a.intValue() != 12) {
	                    if ((this.a.i == null) || ((this.a.i.length <= 0) || (this.a.j == null))) {
	                        if (art.a(this.b).h().s().a(this.a.j)) {
	                            v0_0 = 0;
	                        }
	                        this.c.setChecked(v0_0);
	                        art.a(this.b, this.a, v0_0);
	                    } else {
	                        art.a(this.b, this.a);
	                    }
	                } else {
	                    new android.app.AlertDialog$Builder(this.b.getContext()).setTitle(b.af).setMessage(this.a.g).setPositiveButton(b.ae, new arx(this)).setNegativeButton(b.H, 0).show();
	                }
	            } else {
	                dcj v2_25 = new android.app.AlertDialog$Builder(this.b.getContext());
	                String v3_7 = this.b.getContext();
	                art v0_8 = new Object[1];
	                v0_8[0] = art.a(this.b).D();
	                v2_25.setMessage(v3_7.getString(b.am, v0_8)).setPositiveButton(b.L, new arw(this)).setNegativeButton(b.H, 0).show();
	            }
	        } else {
	            art.a(this.b).a(this.a, "child");
	        }
	        return;
	    }
	
