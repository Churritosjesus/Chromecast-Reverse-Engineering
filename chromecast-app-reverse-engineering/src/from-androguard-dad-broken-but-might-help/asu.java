	private static final java.lang.String b
	private static dcj c
	private aqw a
	
	    static asu()
	    {
	        asu.b = 0;
	        return;
	    }
	
	
	    public asu()
	    {
	        return;
	    }
	
	
	    public static asu a(dcj p4)
	    {
	        asu v0_1 = new asu();
	        asu.c = p4;
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("peoplePickerSettingDescription", p4.d);
	        v1_1.putString(0, p4.toString());
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic String a(asu p2, String p3)
	    {
	        java.util.regex.Matcher v0_2 = java.util.regex.Pattern.compile("<(.+?)>").matcher(p3);
	        if (v0_2.find()) {
	            p3 = v0_2.group(1);
	        }
	        return p3;
	    }
	
	
	    static synthetic boolean b(asu p1, String p2)
	    {
	        return android.util.Patterns.EMAIL_ADDRESS.matcher(p2).matches();
	    }
	
	
	    static synthetic dcj p()
	    {
	        return asu.c;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p5, android.view.ViewGroup p6, android.os.Bundle p7)
	    {
	        android.view.View v2 = p5.inflate(a.fy, p6, 0);
	        this.a.c(this.a(b.cI));
	        com.google.android.apps.chromecast.app.backdrop.PeoplePickerRecipientView v0_4 = ((com.google.android.apps.chromecast.app.backdrop.PeoplePickerRecipientView) v2.findViewById(f.bb));
	        v0_4.setTokenizer(new android.widget.MultiAutoCompleteTextView$CommaTokenizer());
	        v0_4.setAdapter(new aav(this.y));
	        ((android.widget.Button) v2.findViewById(f.bG)).setOnClickListener(new asv(this, v0_4));
	        return v2;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.a = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.a = ((aqw) p1);
	        return;
	    }
	
