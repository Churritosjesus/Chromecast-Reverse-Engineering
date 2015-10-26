.class public final Lafb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;

.field private static final i:Ljava/util/Date;

.field private static final j:Ljava/util/Date;

.field private static final k:Ljava/util/Date;

.field private static final l:Lafl;


# instance fields
.field public final a:Ljava/util/Date;

.field public final b:Ljava/util/Set;

.field final c:Ljava/util/Set;

.field public final d:Ljava/lang/String;

.field final e:Lafl;

.field final f:Ljava/util/Date;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 54
    new-instance v0, Ljava/util/Date;

    const-wide v2, 0x7fffffffffffffffL

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 55
    sput-object v0, Lafb;->i:Ljava/util/Date;

    sput-object v0, Lafb;->j:Ljava/util/Date;

    .line 56
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    sput-object v0, Lafb;->k:Ljava/util/Date;

    .line 57
    sget-object v0, Lafl;->a:Lafl;

    sput-object v0, Lafb;->l:Lafl;

    .line 590
    new-instance v0, Lafc;

    invoke-direct {v0}, Lafc;-><init>()V

    sput-object v0, Lafb;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .prologue
    .line 557
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 558
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lafb;->a:Ljava/util/Date;

    .line 559
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 560
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 561
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, p0, Lafb;->b:Ljava/util/Set;

    .line 562
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 563
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 564
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lafb;->c:Ljava/util/Set;

    .line 566
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lafb;->d:Ljava/lang/String;

    .line 567
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lafl;->valueOf(Ljava/lang/String;)Lafl;

    move-result-object v0

    iput-object v0, p0, Lafb;->e:Lafl;

    .line 568
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lafb;->f:Ljava/util/Date;

    .line 569
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lafb;->g:Ljava/lang/String;

    .line 570
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lafb;->h:Ljava/lang/String;

    .line 571
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Lafl;Ljava/util/Date;Ljava/util/Date;)V
    .locals 1

    .prologue
    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    const-string v0, "accessToken"

    invoke-static {p1, v0}, Lajp;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    const-string v0, "applicationId"

    invoke-static {p2, v0}, Lajp;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const-string v0, "userId"

    invoke-static {p3, v0}, Lajp;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    if-eqz p7, :cond_0

    :goto_0
    iput-object p7, p0, Lafb;->a:Ljava/util/Date;

    .line 125
    if-eqz p4, :cond_1

    .line 126
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 125
    :goto_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lafb;->b:Ljava/util/Set;

    .line 127
    if-eqz p5, :cond_2

    .line 129
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 127
    :goto_2
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lafb;->c:Ljava/util/Set;

    .line 131
    iput-object p1, p0, Lafb;->d:Ljava/lang/String;

    .line 132
    if-eqz p6, :cond_3

    :goto_3
    iput-object p6, p0, Lafb;->e:Lafl;

    .line 133
    if-eqz p8, :cond_4

    :goto_4
    iput-object p8, p0, Lafb;->f:Ljava/util/Date;

    .line 134
    iput-object p2, p0, Lafb;->g:Ljava/lang/String;

    .line 135
    iput-object p3, p0, Lafb;->h:Ljava/lang/String;

    .line 136
    return-void

    .line 124
    :cond_0
    sget-object p7, Lafb;->j:Ljava/util/Date;

    goto :goto_0

    .line 126
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    goto :goto_1

    .line 130
    :cond_2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    goto :goto_2

    .line 132
    :cond_3
    sget-object p6, Lafb;->l:Lafl;

    goto :goto_3

    .line 133
    :cond_4
    sget-object p8, Lafb;->k:Ljava/util/Date;

    goto :goto_4
.end method

.method public static a()Lafb;
    .locals 1

    .prologue
    .line 144
    invoke-static {}, Laff;->a()Laff;

    move-result-object v0

    .line 1098
    iget-object v0, v0, Laff;->b:Lafb;

    .line 144
    return-object v0
.end method

.method static a(Landroid/os/Bundle;)Lafb;
    .locals 9

    .prologue
    .line 407
    const-string v0, "com.facebook.TokenCachingStrategy.Permissions"

    invoke-static {p0, v0}, Lafb;->a(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 410
    const-string v0, "com.facebook.TokenCachingStrategy.DeclinedPermissions"

    invoke-static {p0, v0}, Lafb;->a(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 414
    invoke-static {p0}, Lagr;->d(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v2

    .line 415
    invoke-static {v2}, Laji;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 416
    invoke-static {}, Lafv;->h()Ljava/lang/String;

    move-result-object v2

    .line 419
    :cond_0
    invoke-static {p0}, Lagr;->b(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v1

    .line 421
    invoke-static {v1}, Laji;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 423
    :try_start_0
    const-string v3, "id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 430
    new-instance v0, Lafb;

    .line 436
    invoke-static {p0}, Lagr;->c(Landroid/os/Bundle;)Lafl;

    move-result-object v6

    const-string v7, "com.facebook.TokenCachingStrategy.ExpirationDate"

    .line 437
    invoke-static {p0, v7}, Lagr;->a(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v7

    const-string v8, "com.facebook.TokenCachingStrategy.LastRefreshDate"

    .line 440
    invoke-static {p0, v8}, Lagr;->a(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lafb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Lafl;Ljava/util/Date;Ljava/util/Date;)V

    :goto_0
    return-object v0

    .line 427
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method static a(Lorg/json/JSONObject;)Lafb;
    .locals 9

    .prologue
    .line 486
    const-string v0, "version"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 487
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 488
    new-instance v0, Lafq;

    const-string v1, "Unknown AccessToken serialization format."

    invoke-direct {v0, v1}, Lafq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 491
    :cond_0
    const-string v0, "token"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 492
    new-instance v7, Ljava/util/Date;

    const-string v0, "expires_at"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-direct {v7, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 493
    const-string v0, "permissions"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 494
    const-string v0, "declined_permissions"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 495
    new-instance v8, Ljava/util/Date;

    const-string v0, "last_refresh"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-direct {v8, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 496
    const-string v0, "source"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lafl;->valueOf(Ljava/lang/String;)Lafl;

    move-result-object v6

    .line 497
    const-string v0, "application_id"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 498
    const-string v0, "user_id"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 500
    new-instance v0, Lafb;

    .line 504
    invoke-static {v4}, Laji;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v4

    .line 505
    invoke-static {v5}, Laji;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v0 .. v8}, Lafb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Lafl;Ljava/util/Date;Ljava/util/Date;)V

    return-object v0
.end method

.method private static a(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .prologue
    .line 448
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 450
    if-nez v0, :cond_0

    .line 451
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 455
    :goto_0
    return-object v0

    .line 453
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Lafb;)V
    .locals 2

    .prologue
    .line 153
    invoke-static {}, Laff;->a()Laff;

    move-result-object v0

    .line 1113
    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Laff;->a(Lafb;Z)V

    .line 154
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .prologue
    .line 575
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 341
    if-ne p0, p1, :cond_1

    .line 360
    :cond_0
    :goto_0
    return v0

    .line 345
    :cond_1
    instance-of v2, p1, Lafb;

    if-nez v2, :cond_2

    move v0, v1

    .line 346
    goto :goto_0

    .line 349
    :cond_2
    check-cast p1, Lafb;

    .line 351
    iget-object v2, p0, Lafb;->a:Ljava/util/Date;

    iget-object v3, p1, Lafb;->a:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lafb;->b:Ljava/util/Set;

    iget-object v3, p1, Lafb;->b:Ljava/util/Set;

    .line 352
    invoke-interface {v2, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lafb;->c:Ljava/util/Set;

    iget-object v3, p1, Lafb;->c:Ljava/util/Set;

    .line 353
    invoke-interface {v2, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lafb;->d:Ljava/lang/String;

    iget-object v3, p1, Lafb;->d:Ljava/lang/String;

    .line 354
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lafb;->e:Lafl;

    iget-object v3, p1, Lafb;->e:Lafl;

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lafb;->f:Ljava/util/Date;

    iget-object v3, p1, Lafb;->f:Ljava/util/Date;

    .line 356
    invoke-virtual {v2, v3}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lafb;->g:Ljava/lang/String;

    if-nez v2, :cond_4

    iget-object v2, p1, Lafb;->g:Ljava/lang/String;

    if-nez v2, :cond_3

    .line 359
    :goto_1
    iget-object v2, p0, Lafb;->h:Ljava/lang/String;

    iget-object v3, p1, Lafb;->h:Ljava/lang/String;

    .line 360
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0

    .line 356
    :cond_4
    iget-object v2, p0, Lafb;->g:Ljava/lang/String;

    iget-object v3, p1, Lafb;->g:Ljava/lang/String;

    .line 359
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 367
    iget-object v0, p0, Lafb;->a:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    .line 368
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lafb;->b:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 369
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lafb;->c:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 370
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lafb;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 371
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lafb;->e:Lafl;

    invoke-virtual {v1}, Lafl;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 372
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lafb;->f:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 373
    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lafb;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    .line 374
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lafb;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 376
    return v0

    .line 373
    :cond_0
    iget-object v0, p0, Lafb;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 329
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 331
    const-string v0, "{AccessToken"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    const-string v0, " token:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1537
    iget-object v0, p0, Lafb;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1538
    const-string v0, "null"

    .line 332
    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1547
    const-string v0, " permissions:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1548
    iget-object v0, p0, Lafb;->b:Ljava/util/Set;

    if-nez v0, :cond_2

    .line 1549
    const-string v0, "null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    :goto_1
    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1539
    :cond_0
    sget-object v0, Lags;->b:Lags;

    invoke-static {v0}, Lafv;->a(Lags;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1540
    iget-object v0, p0, Lafb;->d:Ljava/lang/String;

    goto :goto_0

    .line 1542
    :cond_1
    const-string v0, "ACCESS_TOKEN_REMOVED"

    goto :goto_0

    .line 1551
    :cond_2
    const-string v0, "["

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1552
    const-string v0, ", "

    iget-object v2, p0, Lafb;->b:Ljava/util/Set;

    invoke-static {v0, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1553
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 580
    iget-object v0, p0, Lafb;->a:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 581
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lafb;->b:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 582
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lafb;->c:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 583
    iget-object v0, p0, Lafb;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 584
    iget-object v0, p0, Lafb;->e:Lafl;

    invoke-virtual {v0}, Lafl;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 585
    iget-object v0, p0, Lafb;->f:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 586
    iget-object v0, p0, Lafb;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 587
    iget-object v0, p0, Lafb;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 588
    return-void
.end method
