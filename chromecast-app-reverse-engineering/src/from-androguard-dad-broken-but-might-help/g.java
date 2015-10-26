	public static final android.os.Parcelable$Creator CREATOR
	private I a
	private  b
	private  c
	private java.lang.String d
	private  e
	private  f
	private java.lang.CharSequence g
	private  h
	private java.lang.CharSequence i
	private java.util.ArrayList j
	private java.util.ArrayList k
	
	    static g()
	    {
	        g.CREATOR = new h();
	        return;
	    }
	
	
	    public g(android.os.Parcel p2)
	    {
	        this.a = p2.createIntArray();
	        this.b = p2.readInt();
	        this.c = p2.readInt();
	        this.d = p2.readString();
	        this.e = p2.readInt();
	        this.f = p2.readInt();
	        this.g = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p2));
	        this.h = p2.readInt();
	        this.i = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p2));
	        this.j = p2.createStringArrayList();
	        this.k = p2.createStringArrayList();
	        return;
	    }
	
	
	    public g(c p9)
	    {
	        int v1_0 = p9.a;
	        int v0_1 = 0;
	        while (v1_0 != 0) {
	            if (v1_0.i != null) {
	                v0_1 += v1_0.i.size();
	            }
	            v1_0 = v1_0.a;
	        }
	        int v0_3 = new int[(v0_1 + (p9.b * 7))];
	        this.a = v0_3;
	        if (p9.e) {
	            b v5 = p9.a;
	            int v0_6 = 0;
	            while (v5 != null) {
	                int v0_18;
	                int v2_0 = (v0_6 + 1);
	                this.a[v0_6] = v5.c;
	                int v4_1 = (v2_0 + 1);
	                if (v5.d == null) {
	                    v0_18 = -1;
	                } else {
	                    v0_18 = v5.d.k;
	                }
	                this.a[v2_0] = v0_18;
	                int v1_5 = (v4_1 + 1);
	                this.a[v4_1] = v5.e;
	                int v2_2 = (v1_5 + 1);
	                this.a[v1_5] = v5.f;
	                int v1_6 = (v2_2 + 1);
	                this.a[v2_2] = v5.g;
	                int v2_3 = (v1_6 + 1);
	                this.a[v1_6] = v5.h;
	                if (v5.i == null) {
	                    v0_6 = (v2_3 + 1);
	                    this.a[v2_3] = 0;
	                } else {
	                    int v6 = v5.i.size();
	                    int v1_8 = (v2_3 + 1);
	                    this.a[v2_3] = v6;
	                    int v2_4 = 0;
	                    while (v2_4 < v6) {
	                        int v4_5 = (v1_8 + 1);
	                        this.a[v1_8] = ((j) v5.i.get(v2_4)).k;
	                        v2_4++;
	                        v1_8 = v4_5;
	                    }
	                    v0_6 = v1_8;
	                }
	                v5 = v5.a;
	            }
	            this.b = p9.c;
	            this.c = p9.d;
	            this.d = p9.f;
	            this.e = p9.g;
	            this.f = p9.h;
	            this.g = p9.i;
	            this.h = p9.j;
	            this.i = p9.k;
	            this.j = p9.l;
	            this.k = p9.m;
	            return;
	        } else {
	            throw new IllegalStateException("Not on back stack");
	        }
	    }
	
	
	    public final c a(t p11)
	    {
	        c v4_1 = new c(p11);
	        int v0_0 = 0;
	        while (v0_0 < this.a.length) {
	            b v5_1 = new b();
	            int v3_0 = (v0_0 + 1);
	            v5_1.c = this.a[v0_0];
	            int v2_3 = (v3_0 + 1);
	            int v0_13 = this.a[v3_0];
	            if (v0_13 < 0) {
	                v5_1.d = 0;
	            } else {
	                v5_1.d = ((j) p11.b.get(v0_13));
	            }
	            int v3_2 = (v2_3 + 1);
	            v5_1.e = this.a[v2_3];
	            int v2_4 = (v3_2 + 1);
	            v5_1.f = this.a[v3_2];
	            int v3_3 = (v2_4 + 1);
	            v5_1.g = this.a[v2_4];
	            int v2_5 = (v3_3 + 1);
	            v5_1.h = this.a[v3_3];
	            v0_0 = (v2_5 + 1);
	            int v6 = this.a[v2_5];
	            if (v6 > 0) {
	                v5_1.i = new java.util.ArrayList(v6);
	                int v2_8 = 0;
	                while (v2_8 < v6) {
	                    int v3_5 = (v0_0 + 1);
	                    v5_1.i.add(((j) p11.b.get(this.a[v0_0])));
	                    v2_8++;
	                    v0_0 = v3_5;
	                }
	            }
	            v4_1.a(v5_1);
	        }
	        v4_1.c = this.b;
	        v4_1.d = this.c;
	        v4_1.f = this.d;
	        v4_1.g = this.e;
	        v4_1.e = 1;
	        v4_1.h = this.f;
	        v4_1.i = this.g;
	        v4_1.j = this.h;
	        v4_1.k = this.i;
	        v4_1.l = this.j;
	        v4_1.m = this.k;
	        v4_1.b(1);
	        return v4_1;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p3, int p4)
	    {
	        p3.writeIntArray(this.a);
	        p3.writeInt(this.b);
	        p3.writeInt(this.c);
	        p3.writeString(this.d);
	        p3.writeInt(this.e);
	        p3.writeInt(this.f);
	        android.text.TextUtils.writeToParcel(this.g, p3, 0);
	        p3.writeInt(this.h);
	        android.text.TextUtils.writeToParcel(this.i, p3, 0);
	        p3.writeStringList(this.j);
	        p3.writeStringList(this.k);
	        return;
	    }
	
