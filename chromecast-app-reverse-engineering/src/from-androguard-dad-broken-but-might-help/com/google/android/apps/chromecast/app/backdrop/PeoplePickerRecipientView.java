	private android.os.Handler d
	
	    public PeoplePickerRecipientView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3);
	        this.d = new android.os.Handler();
	        return;
	    }
	
	
	    public static synthetic void a(com.google.android.apps.chromecast.app.backdrop.PeoplePickerRecipientView p0, CharSequence p1, int p2, int p3, int p4)
	    {
	        super.onTextChanged(p1, p2, p3, p4);
	        return;
	    }
	
	
	    private void i()
	    {
	        acx v0_2 = ((ada[]) this.getText().getSpans(0, this.getText().length(), ada));
	        java.util.ArrayList v3_2 = new java.util.ArrayList();
	        if (v0_2 != null) {
	            int v4 = v0_2.length;
	            int v1_2 = 0;
	            while (v1_2 < v4) {
	                v3_2.add(v0_2[v1_2].g());
	                v1_2++;
	            }
	        }
	        if (v3_2.size() > 1) {
	            this.b(((acx) v3_2.get(0)));
	        }
	        return;
	    }
	
	
	    public boolean onEditorAction(android.widget.TextView p2, int p3, android.view.KeyEvent p4)
	    {
	        if (p3 == 6) {
	            this.i();
	        }
	        return super.onEditorAction(p2, p3, p4);
	    }
	
	
	    public void onItemClick(android.widget.AdapterView p1, android.view.View p2, int p3, long p4)
	    {
	        super.onItemClick(p1, p2, p3, p4).i();
	        return;
	    }
	
	
	    public void onTextChanged(CharSequence p8, int p9, int p10, int p11)
	    {
	        if (p8.length() > 1) {
	            this.d.removeMessages(0);
	            this.d.postDelayed(new asw(this, p8, p9, p10, p11), 500);
	        }
	        return;
	    }
	
