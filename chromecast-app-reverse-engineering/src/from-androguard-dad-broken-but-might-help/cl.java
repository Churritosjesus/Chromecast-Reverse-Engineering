	public static final android.os.Parcelable$Creator CREATOR
	private final  a
	private final  b
	
	    static cl()
	    {
	        cl.CREATOR = new cm();
	        return;
	    }
	
	
	    cl(int p1, float p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public static cl a(Object p5)
	    {
	        String v1_0 = 1065353216;
	        cl v3_0 = 0;
	        if ((p5 != null) && (android.os.Build$VERSION.SDK_INT >= 21)) {
	            int v4_1 = ((android.media.Rating) p5).getRatingStyle();
	            if (!((android.media.Rating) p5).isRated()) {
	                switch (v4_1) {
	                    case 1:
	                    case 2:
	                    case 3:
	                    case 4:
	                    case 5:
	                    case 6:
	                        v3_0 = new cl(v4_1, -1082130432);
	                        break;
	                    default:
	                }
	            } else {
	                switch (v4_1) {
	                    case 1:
	                        cl v0_17;
	                        if (!((android.media.Rating) p5).hasHeart()) {
	                            v0_17 = 0;
	                        } else {
	                            v0_17 = 1065353216;
	                        }
	                        v3_0 = new cl(1, v0_17);
	                        break;
	                    case 2:
	                        if (!((android.media.Rating) p5).isThumbUp()) {
	                            v1_0 = 0;
	                        }
	                        v3_0 = new cl(2, v1_0);
	                        break;
	                    case 3:
	                    case 4:
	                    case 5:
	                        cl v0_12;
	                        cl v0_9;
	                        String v1_6 = ((android.media.Rating) p5).getStarRating();
	                        switch (v4_1) {
	                            case 3:
	                                v0_9 = 1077936128;
	                                if ((v1_6 >= 0) && (v1_6 <= v0_9)) {
	                                    v0_12 = new cl(v4_1, v1_6);
	                                } else {
	                                    android.util.Log.e("Rating", "Trying to set out of range star-based rating");
	                                    v0_12 = 0;
	                                }
	                                break;
	                            case 4:
	                                v0_9 = 1082130432;
	                                break;
	                            case 5:
	                                v0_9 = 1084227584;
	                                break;
	                            default:
	                                android.util.Log.e("Rating", new StringBuilder("Invalid rating style (").append(v4_1).append(") for a star rating").toString());
	                                v0_12 = 0;
	                        }
	                        v3_0 = v0_12;
	                        break;
	                    case 6:
	                        cl v0_7 = ((android.media.Rating) p5).getPercentRating();
	                        if ((v0_7 >= 0) && (v0_7 <= 1120403456)) {
	                            v3_0 = new cl(6, v0_7);
	                        } else {
	                            android.util.Log.e("Rating", "Invalid percentage-based rating value");
	                        }
	                        break;
	                    default:
	                }
	            }
	        }
	        return v3_0;
	    }
	
	
	    public final int describeContents()
	    {
	        return this.a;
	    }
	
	
	    public final String toString()
	    {
	        String v0_6;
	        StringBuilder v1_3 = new StringBuilder("Rating:style=").append(this.a).append(" rating=");
	        if (this.b >= 0) {
	            v0_6 = String.valueOf(this.b);
	        } else {
	            v0_6 = "unrated";
	        }
	        return v1_3.append(v0_6).toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeInt(this.a);
	        p2.writeFloat(this.b);
	        return;
	    }
	
