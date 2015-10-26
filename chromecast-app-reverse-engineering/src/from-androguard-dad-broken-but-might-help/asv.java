	private synthetic com.google.android.apps.chromecast.app.backdrop.PeoplePickerRecipientView a
	private synthetic asu b
	
	    asv(asu p1, com.google.android.apps.chromecast.app.backdrop.PeoplePickerRecipientView p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p5)
	    {
	        android.widget.Toast v0_2 = this.b.x.a("sharedPhotosFragment");
	        if (v0_2 != null) {
	            android.widget.Toast v0_10 = this.b.x.a().b(f.bk, v0_2, "sharedPhotosFragment");
	            v0_10.a(4097);
	            v0_10.b();
	            ape.a().a(new apd(75).a(asu.p().b.intValue()));
	        } else {
	            android.widget.Toast v0_5 = asu.a(this.b, this.a.getText().toString()).trim();
	            if (!asu.b(this.b, v0_5)) {
	                android.widget.Toast.makeText(this.b.y.getApplicationContext(), b.bE, 0).show();
	            } else {
	                v0_2 = asx.a(asu.p(), v0_5);
	            }
	        }
	        return;
	    }
	
