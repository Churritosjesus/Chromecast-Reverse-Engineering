	public static final enum dbw a
	private static enum dbw c
	private static enum dbw d
	private static enum dbw e
	private static enum dbw f
	private static enum dbw g
	private static enum dbw h
	private static enum dbw i
	private static enum dbw j
	private static enum dbw k
	private static enum dbw l
	private static enum dbw m
	private static enum dbw n
	private static enum dbw o
	private static enum dbw p
	private static enum dbw q
	private static enum dbw r
	private static enum dbw s
	private static enum dbw t
	private static final synthetic Ldbw u
	public final  b
	
	    static dbw()
	    {
	        dbw.a = new dbw("CURATED", 0, 1);
	        dbw.c = new dbw("DEPRECATED_CURRENT_LOCAL_WEATHER", 1, 2);
	        dbw.d = new dbw("DEPRECATED_TODAY_LOCAL_WEATHER", 2, 3);
	        dbw.e = new dbw("DEPRECATED_TOMORROW_LOCAL_WEATHER", 3, 4);
	        dbw.f = new dbw("PERSONAL_PHOTO", 4, 5);
	        dbw.g = new dbw("NEWSSTAND", 5, 6);
	        dbw.h = new dbw("PLAY_NEWSSTAND", 6, 17);
	        dbw.i = new dbw("FEATURED_PHOTO", 7, 7);
	        dbw.j = new dbw("GEO_PHOTO", 8, 8);
	        dbw.k = new dbw("CULTURAL_INSTITUTE", 9, 9);
	        dbw.l = new dbw("PROMO", 10, 10);
	        dbw.m = new dbw("RSS_TOPIC", 11, 11);
	        dbw.n = new dbw("ON_DEVICE_IMAGE", 12, 12);
	        dbw.o = new dbw("READY_TO_CAST", 13, 13);
	        dbw.p = new dbw("SIMPLE", 14, 14);
	        dbw.q = new dbw("INSTAGRAM_FEED", 15, 15);
	        dbw.r = new dbw("GPLUS_STREAM", 16, 16);
	        dbw.s = new dbw("FACEBOOK_PERSONAL_PHOTO", 17, 18);
	        dbw.t = new dbw("FLICKR_PERSONAL_PHOTO", 18, 19);
	        dbx v0_39 = new dbw[19];
	        v0_39[0] = dbw.a;
	        v0_39[1] = dbw.c;
	        v0_39[2] = dbw.d;
	        v0_39[3] = dbw.e;
	        v0_39[4] = dbw.f;
	        v0_39[5] = dbw.g;
	        v0_39[6] = dbw.h;
	        v0_39[7] = dbw.i;
	        v0_39[8] = dbw.j;
	        v0_39[9] = dbw.k;
	        v0_39[10] = dbw.l;
	        v0_39[11] = dbw.m;
	        v0_39[12] = dbw.n;
	        v0_39[13] = dbw.o;
	        v0_39[14] = dbw.p;
	        v0_39[15] = dbw.q;
	        v0_39[16] = dbw.r;
	        v0_39[17] = dbw.s;
	        v0_39[18] = dbw.t;
	        dbw.u = v0_39;
	        new dbx();
	        return;
	    }
	
	
	    private dbw(String p1, int p2, int p3)
	    {
	        this(p1, p2);
	        this.b = p3;
	        return;
	    }
	
	
	    public static dbw a(int p1)
	    {
	        dbw v0;
	        switch (p1) {
	            case 1:
	                v0 = dbw.a;
	                break;
	            case 2:
	                v0 = dbw.c;
	                break;
	            case 3:
	                v0 = dbw.d;
	                break;
	            case 4:
	                v0 = dbw.e;
	                break;
	            case 5:
	                v0 = dbw.f;
	                break;
	            case 6:
	                v0 = dbw.g;
	                break;
	            case 7:
	                v0 = dbw.i;
	                break;
	            case 8:
	                v0 = dbw.j;
	                break;
	            case 9:
	                v0 = dbw.k;
	                break;
	            case 10:
	                v0 = dbw.l;
	                break;
	            case 11:
	                v0 = dbw.m;
	                break;
	            case 12:
	                v0 = dbw.n;
	                break;
	            case 13:
	                v0 = dbw.o;
	                break;
	            case 14:
	                v0 = dbw.p;
	                break;
	            case 15:
	                v0 = dbw.q;
	                break;
	            case 16:
	                v0 = dbw.r;
	                break;
	            case 17:
	                v0 = dbw.h;
	                break;
	            case 18:
	                v0 = dbw.s;
	                break;
	            case 19:
	                v0 = dbw.t;
	                break;
	            default:
	                v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public static dbw valueOf(String p1)
	    {
	        return ((dbw) Enum.valueOf(dbw, p1));
	    }
	
	
	    public static dbw[] values()
	    {
	        return ((dbw[]) dbw.u.clone());
	    }
	
