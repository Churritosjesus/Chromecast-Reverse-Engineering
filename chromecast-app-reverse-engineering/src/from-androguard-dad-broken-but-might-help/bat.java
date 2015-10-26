	public static final enum bat a
	public static final enum bat b
	public static final enum bat c
	public static final enum bat d
	public static final enum bat e
	private static final synthetic Lbat h
	  f
	  g
	
	    static bat()
	    {
	        bat.a = new bat("DEVICES_DRAWER", 0, a.es, b.br);
	        bat.b = new bat("MIRROR_DRAWER", 1, a.eu, b.bp);
	        bat.c = new bat("LEARN_DRAWER", 2, a.et, b.bs);
	        bat.d = new bat("HELP_DRAWER", 3, a.er, b.bK);
	        bat.e = new bat("DEBUG_DRAWER", 4, 0, b.bq);
	        bat[] v0_11 = new bat[5];
	        v0_11[0] = bat.a;
	        v0_11[1] = bat.b;
	        v0_11[2] = bat.c;
	        v0_11[3] = bat.d;
	        v0_11[4] = bat.e;
	        bat.h = v0_11;
	        return;
	    }
	
	
	    private bat(String p1, int p2, int p3, int p4)
	    {
	        this(p1, p2);
	        this.f = p3;
	        this.g = p4;
	        return;
	    }
	
	
	    public static bat valueOf(String p1)
	    {
	        return ((bat) Enum.valueOf(bat, p1));
	    }
	
	
	    public static bat[] values()
	    {
	        return ((bat[]) bat.h.clone());
	    }
	
