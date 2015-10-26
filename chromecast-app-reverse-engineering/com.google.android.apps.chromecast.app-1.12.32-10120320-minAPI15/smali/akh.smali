.class final Lakh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field a:[Laky;

.field b:I

.field c:Lj;

.field d:Lakk;

.field e:Lakj;

.field f:Lakl;

.field private g:Z

.field private h:Ljava/util/Map;

.field private i:Lakt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 727
    new-instance v0, Laki;

    invoke-direct {v0}, Laki;-><init>()V

    sput-object v0, Lakh;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .prologue
    .line 702
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const/4 v0, -0x1

    iput v0, p0, Lakh;->b:I

    .line 703
    const-class v0, Laky;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object v2

    .line 704
    array-length v0, v2

    new-array v0, v0, [Laky;

    iput-object v0, p0, Lakh;->a:[Laky;

    .line 705
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v0, v2

    if-ge v1, v0, :cond_1

    .line 706
    iget-object v3, p0, Lakh;->a:[Laky;

    aget-object v0, v2, v1

    check-cast v0, Laky;

    aput-object v0, v3, v1

    .line 707
    iget-object v0, p0, Lakh;->a:[Laky;

    aget-object v0, v0, v1

    .line 11065
    iget-object v3, v0, Laky;->b:Lakh;

    if-eqz v3, :cond_0

    .line 11066
    new-instance v0, Lafq;

    const-string v1, "Can\'t set LoginClient if it is already set."

    invoke-direct {v0, v1}, Lafq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11068
    :cond_0
    iput-object p0, v0, Laky;->b:Lakh;

    .line 705
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 709
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lakh;->b:I

    .line 710
    const-class v0, Lakl;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lakl;

    iput-object v0, p0, Lakh;->f:Lakl;

    .line 711
    invoke-static {p1}, Laji;->a(Landroid/os/Parcel;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lakh;->h:Ljava/util/Map;

    .line 712
    return-void
.end method

.method public constructor <init>(Lj;)V
    .locals 1

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const/4 v0, -0x1

    iput v0, p0, Lakh;->b:I

    .line 79
    iput-object p1, p0, Lakh;->c:Lj;

    .line 80
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 4

    .prologue
    .line 405
    iget-object v0, p0, Lakh;->f:Lakl;

    if-nez v0, :cond_0

    .line 407
    invoke-direct {p0}, Lakh;->h()Lakt;

    move-result-object v0

    const-string v1, "fb_mobile_login_method_complete"

    const-string v2, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest."

    invoke-virtual {v0, v1, v2, p1}, Lakt;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    :goto_0
    return-void

    .line 413
    :cond_0
    invoke-direct {p0}, Lakh;->h()Lakt;

    move-result-object v0

    iget-object v1, p0, Lakh;->f:Lakl;

    .line 9470
    iget-object v1, v1, Lakl;->e:Ljava/lang/String;

    .line 10154
    invoke-static {v1}, Lakt;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 10155
    if-eqz p2, :cond_1

    .line 10156
    const-string v2, "2_result"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10158
    :cond_1
    if-eqz p3, :cond_2

    .line 10159
    const-string v2, "5_error_message"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10161
    :cond_2
    if-eqz p4, :cond_3

    .line 10162
    const-string v2, "4_error_code"

    invoke-virtual {v1, v2, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10164
    :cond_3
    if-eqz p5, :cond_4

    invoke-interface {p5}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 10165
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p5}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 10166
    const-string v3, "6_extras"

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10168
    :cond_4
    const-string v2, "3_method"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10170
    iget-object v0, v0, Lakt;->a:Lahe;

    const-string v2, "fb_mobile_login_method_complete"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lahe;->a(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .prologue
    .line 225
    iget-object v0, p0, Lakh;->h:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 226
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lakh;->h:Ljava/util/Map;

    .line 228
    :cond_0
    iget-object v0, p0, Lakh;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_1

    .line 229
    iget-object v0, p0, Lakh;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 231
    :cond_1
    iget-object v0, p0, Lakh;->h:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    return-void
.end method

.method public static b()I
    .locals 1

    .prologue
    .line 103
    sget-object v0, Laim;->a:Laim;

    invoke-virtual {v0}, Laim;->a()I

    move-result v0

    return v0
.end method

.method static g()Ljava/lang/String;
    .locals 4

    .prologue
    .line 419
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 421
    :try_start_0
    const-string v1, "init"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 424
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private h()Lakt;
    .locals 3

    .prologue
    .line 362
    iget-object v0, p0, Lakh;->i:Lakt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lakh;->i:Lakt;

    .line 8071
    iget-object v0, v0, Lakt;->b:Ljava/lang/String;

    .line 363
    iget-object v1, p0, Lakh;->f:Lakl;

    .line 8466
    iget-object v1, v1, Lakl;->d:Ljava/lang/String;

    .line 363
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 365
    :cond_0
    new-instance v0, Lakt;

    invoke-virtual {p0}, Lakh;->a()Lm;

    move-result-object v1

    iget-object v2, p0, Lakh;->f:Lakl;

    .line 9466
    iget-object v2, v2, Lakl;->d:Ljava/lang/String;

    .line 365
    invoke-direct {v0, v1, v2}, Lakt;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lakh;->i:Lakt;

    .line 367
    :cond_1
    iget-object v0, p0, Lakh;->i:Lakt;

    return-object v0
.end method


# virtual methods
.method final a()Lm;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lakh;->c:Lj;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 94
    return-object v0
.end method

.method final a(Lakn;)V
    .locals 3

    .prologue
    .line 264
    iget-object v0, p1, Lakn;->b:Lafb;

    if-eqz v0, :cond_2

    invoke-static {}, Lafb;->a()Lafb;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4318
    iget-object v0, p1, Lakn;->b:Lafb;

    if-nez v0, :cond_0

    .line 4319
    new-instance v0, Lafq;

    const-string v1, "Can\'t validate without a token"

    invoke-direct {v0, v1}, Lafq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4322
    :cond_0
    invoke-static {}, Lafb;->a()Lafb;

    move-result-object v0

    .line 4323
    iget-object v1, p1, Lakn;->b:Lafb;

    .line 4327
    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 5245
    :try_start_0
    iget-object v0, v0, Lafb;->h:Ljava/lang/String;

    .line 6245
    iget-object v1, v1, Lafb;->h:Ljava/lang/String;

    .line 4328
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4329
    iget-object v0, p0, Lakh;->f:Lakl;

    iget-object v1, p1, Lakn;->b:Lafb;

    invoke-static {v0, v1}, Lakn;->a(Lakl;Lafb;)Lakn;

    move-result-object v0

    .line 4337
    :goto_0
    invoke-virtual {p0, v0}, Lakh;->b(Lakn;)V

    .line 270
    :goto_1
    return-void

    .line 4331
    :cond_1
    iget-object v0, p0, Lakh;->f:Lakl;

    const-string v1, "User logged in as different Facebook user."

    const/4 v2, 0x0

    .line 4332
    invoke-static {v0, v1, v2}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;)Lakn;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 4338
    :catch_0
    move-exception v0

    .line 4339
    iget-object v1, p0, Lakh;->f:Lakl;

    const-string v2, "Caught exception"

    .line 4342
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 4339
    invoke-static {v1, v2, v0}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v0

    invoke-virtual {p0, v0}, Lakh;->b(Lakn;)V

    goto :goto_1

    .line 268
    :cond_2
    invoke-virtual {p0, p1}, Lakh;->b(Lakn;)V

    goto :goto_1
.end method

.method final b(Lakn;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 273
    invoke-virtual {p0}, Lakh;->c()Laky;

    move-result-object v0

    .line 277
    if-eqz v0, :cond_0

    .line 278
    invoke-virtual {v0}, Laky;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v5, v0, Laky;->a:Ljava/util/Map;

    .line 6392
    iget-object v0, p1, Lakn;->a:Lakp;

    .line 6546
    iget-object v2, v0, Lakp;->d:Ljava/lang/String;

    .line 6393
    iget-object v3, p1, Lakn;->c:Ljava/lang/String;

    iget-object v4, p1, Lakn;->d:Ljava/lang/String;

    move-object v0, p0

    .line 6392
    invoke-direct/range {v0 .. v5}, Lakh;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 282
    :cond_0
    iget-object v0, p0, Lakh;->h:Ljava/util/Map;

    if-eqz v0, :cond_1

    .line 284
    iget-object v0, p0, Lakh;->h:Ljava/util/Map;

    iput-object v0, p1, Lakn;->e:Ljava/util/Map;

    .line 287
    :cond_1
    iput-object v6, p0, Lakh;->a:[Laky;

    .line 288
    const/4 v0, -0x1

    iput v0, p0, Lakh;->b:I

    .line 289
    iput-object v6, p0, Lakh;->f:Lakl;

    .line 290
    iput-object v6, p0, Lakh;->h:Ljava/util/Map;

    .line 7371
    iget-object v0, p0, Lakh;->d:Lakk;

    if-eqz v0, :cond_2

    .line 7372
    iget-object v0, p0, Lakh;->d:Lakk;

    invoke-interface {v0, p1}, Lakk;->a(Lakn;)V

    .line 293
    :cond_2
    return-void
.end method

.method c()Laky;
    .locals 2

    .prologue
    .line 141
    iget v0, p0, Lakh;->b:I

    if-ltz v0, :cond_0

    .line 142
    iget-object v0, p0, Lakh;->a:[Laky;

    iget v1, p0, Lakh;->b:I

    aget-object v0, v0, v1

    .line 144
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final d()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 176
    iget-boolean v1, p0, Lakh;->g:Z

    if-eqz v1, :cond_0

    .line 191
    :goto_0
    return v0

    .line 180
    :cond_0
    const-string v1, "android.permission.INTERNET"

    .line 2314
    invoke-virtual {p0}, Lakh;->a()Lm;

    move-result-object v2

    invoke-virtual {v2, v1}, Lm;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v1

    .line 181
    if-eqz v1, :cond_1

    .line 182
    invoke-virtual {p0}, Lakh;->a()Lm;

    move-result-object v0

    .line 183
    sget v1, La;->db:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 184
    sget v2, La;->da:I

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 185
    iget-object v2, p0, Lakh;->f:Lakl;

    invoke-static {v2, v1, v0}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v0

    invoke-virtual {p0, v0}, Lakh;->b(Lakn;)V

    .line 187
    const/4 v0, 0x0

    goto :goto_0

    .line 190
    :cond_1
    iput-boolean v0, p0, Lakh;->g:Z

    goto :goto_0
.end method

.method public final describeContents()I
    .locals 1

    .prologue
    .line 716
    const/4 v0, 0x0

    return v0
.end method

.method final e()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v3, 0x0

    .line 195
    iget v0, p0, Lakh;->b:I

    if-ltz v0, :cond_0

    .line 197
    invoke-virtual {p0}, Lakh;->c()Laky;

    move-result-object v0

    invoke-virtual {v0}, Laky;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "skipped"

    .line 201
    invoke-virtual {p0}, Lakh;->c()Laky;

    move-result-object v0

    iget-object v5, v0, Laky;->a:Ljava/util/Map;

    move-object v0, p0

    move-object v4, v3

    .line 196
    invoke-direct/range {v0 .. v5}, Lakh;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 204
    :cond_0
    iget-object v0, p0, Lakh;->a:[Laky;

    if-eqz v0, :cond_4

    iget v0, p0, Lakh;->b:I

    iget-object v1, p0, Lakh;->a:[Laky;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_4

    .line 205
    iget v0, p0, Lakh;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lakh;->b:I

    .line 3235
    invoke-virtual {p0}, Lakh;->c()Laky;

    move-result-object v1

    .line 3236
    invoke-virtual {v1}, Laky;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lakh;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3237
    const-string v0, "no_internet_permission"

    const-string v1, "1"

    invoke-direct {p0, v0, v1, v6}, Lakh;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    move v0, v6

    .line 209
    :goto_0
    if-eqz v0, :cond_0

    .line 218
    :cond_1
    :goto_1
    return-void

    .line 3245
    :cond_2
    iget-object v0, p0, Lakh;->f:Lakl;

    invoke-virtual {v1, v0}, Laky;->a(Lakl;)Z

    move-result v0

    .line 3246
    if-eqz v0, :cond_3

    .line 3247
    invoke-direct {p0}, Lakh;->h()Lakt;

    move-result-object v2

    iget-object v4, p0, Lakh;->f:Lakl;

    .line 3470
    iget-object v4, v4, Lakl;->e:Ljava/lang/String;

    .line 3248
    invoke-virtual {v1}, Laky;->a()Ljava/lang/String;

    move-result-object v1

    .line 4144
    invoke-static {v4}, Lakt;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    .line 4145
    const-string v5, "3_method"

    invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4147
    iget-object v1, v2, Lakt;->a:Lahe;

    const-string v2, "fb_mobile_login_method_start"

    invoke-virtual {v1, v2, v3, v4}, Lahe;->a(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    goto :goto_0

    .line 3252
    :cond_3
    const-string v2, "not_tried"

    .line 3254
    invoke-virtual {v1}, Laky;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    .line 3252
    invoke-direct {p0, v2, v1, v4}, Lakh;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 214
    :cond_4
    iget-object v0, p0, Lakh;->f:Lakl;

    if-eqz v0, :cond_1

    .line 4221
    iget-object v0, p0, Lakh;->f:Lakl;

    const-string v1, "Login attempt failed."

    invoke-static {v0, v1, v3}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v0

    invoke-virtual {p0, v0}, Lakh;->b(Lakn;)V

    goto :goto_1
.end method

.method final f()V
    .locals 1

    .prologue
    .line 377
    iget-object v0, p0, Lakh;->e:Lakj;

    if-eqz v0, :cond_0

    .line 378
    iget-object v0, p0, Lakh;->e:Lakj;

    invoke-interface {v0}, Lakj;->a()V

    .line 380
    :cond_0
    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 721
    iget-object v0, p0, Lakh;->a:[Laky;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    .line 722
    iget v0, p0, Lakh;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 723
    iget-object v0, p0, Lakh;->f:Lakl;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 724
    iget-object v0, p0, Lakh;->h:Ljava/util/Map;

    invoke-static {p1, v0}, Laji;->a(Landroid/os/Parcel;Ljava/util/Map;)V

    .line 725
    return-void
.end method
