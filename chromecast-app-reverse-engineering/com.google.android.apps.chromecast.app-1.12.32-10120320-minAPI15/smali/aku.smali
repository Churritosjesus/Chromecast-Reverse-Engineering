.class public Laku;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final f:Ljava/util/Set;

.field private static volatile g:Laku;


# instance fields
.field public a:Lakg;

.field public b:Lajy;

.field public c:Lakl;

.field public d:Ljava/util/HashMap;

.field public e:Lakt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 10329
    new-instance v0, Lakw;

    invoke-direct {v0}, Lakw;-><init>()V

    .line 10334
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 58
    sput-object v0, Laku;->f:Ljava/util/Set;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    sget-object v0, Lakg;->a:Lakg;

    iput-object v0, p0, Laku;->a:Lakg;

    .line 63
    sget-object v0, Lajy;->a:Lajy;

    iput-object v0, p0, Laku;->b:Lajy;

    .line 69
    invoke-static {}, Lajp;->b()V

    .line 70
    return-void
.end method

.method public static a()Laku;
    .locals 2

    .prologue
    .line 77
    sget-object v0, Laku;->g:Laku;

    if-nez v0, :cond_1

    .line 78
    const-class v1, Laku;

    monitor-enter v1

    .line 79
    :try_start_0
    sget-object v0, Laku;->g:Laku;

    if-nez v0, :cond_0

    .line 80
    new-instance v0, Laku;

    invoke-direct {v0}, Laku;-><init>()V

    sput-object v0, Laku;->g:Laku;

    .line 82
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    :cond_1
    sget-object v0, Laku;->g:Laku;

    return-object v0

    .line 82
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 322
    if-eqz p0, :cond_1

    const-string v0, "publish"

    .line 323
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "manage"

    .line 324
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Laku;->f:Ljava/util/Set;

    .line 325
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 236
    invoke-static {v0}, Lafb;->a(Lafb;)V

    .line 237
    invoke-static {v0}, Lagt;->a(Lagt;)V

    .line 238
    return-void
.end method


# virtual methods
.method public a(Lakp;Ljava/util/Map;Ljava/lang/Exception;)V
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 411
    iget-object v0, p0, Laku;->e:Lakt;

    if-nez v0, :cond_0

    .line 428
    :goto_0
    return-void

    .line 414
    :cond_0
    iget-object v0, p0, Laku;->c:Lakl;

    if-nez v0, :cond_1

    .line 416
    iget-object v0, p0, Laku;->e:Lakt;

    const-string v1, "fb_mobile_login_complete"

    const-string v2, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest."

    .line 5174
    const-string v3, ""

    invoke-virtual {v0, v1, v2, v3}, Lakt;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 421
    :cond_1
    iget-object v4, p0, Laku;->e:Lakt;

    iget-object v0, p0, Laku;->c:Lakl;

    .line 5470
    iget-object v0, v0, Lakl;->e:Ljava/lang/String;

    .line 422
    iget-object v1, p0, Laku;->d:Ljava/util/HashMap;

    .line 6112
    invoke-static {v0}, Lakt;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    .line 6113
    if-eqz p1, :cond_2

    .line 6114
    const-string v0, "2_result"

    .line 6546
    iget-object v2, p1, Lakp;->d:Ljava/lang/String;

    .line 6114
    invoke-virtual {v5, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6116
    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 6117
    const-string v0, "5_error_message"

    invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6122
    :cond_3
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 6123
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 6125
    :goto_1
    if-eqz p2, :cond_4

    .line 6126
    if-nez v0, :cond_7

    .line 6127
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 6130
    :goto_2
    :try_start_0
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 6131
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v0, v2

    .line 6136
    :cond_4
    :goto_4
    if-eqz v0, :cond_5

    .line 6137
    const-string v1, "6_extras"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6140
    :cond_5
    iget-object v0, v4, Lakt;->a:Lahe;

    const-string v1, "fb_mobile_login_complete"

    invoke-virtual {v0, v1, v3, v5}, Lahe;->a(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    goto/16 :goto_0

    :cond_6
    move-object v0, v2

    .line 6134
    goto :goto_4

    :cond_7
    move-object v2, v0

    goto :goto_2

    :cond_8
    move-object v0, v3

    goto :goto_1
.end method

.method final a(ILandroid/content/Intent;Lafo;)Z
    .locals 10

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 154
    iget-object v0, p0, Laku;->c:Lakl;

    if-nez v0, :cond_0

    .line 193
    :goto_0
    return v1

    .line 160
    :cond_0
    sget-object v3, Lakp;->c:Lakp;

    .line 164
    if-eqz p2, :cond_8

    .line 165
    const-string v0, "com.facebook.LoginFragment:Result"

    .line 166
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lakn;

    .line 167
    if-eqz v0, :cond_e

    .line 168
    iget-object v6, v0, Lakn;->a:Lakp;

    .line 169
    const/4 v3, -0x1

    if-ne p1, v3, :cond_7

    .line 170
    iget-object v3, v0, Lakn;->a:Lakp;

    sget-object v5, Lakp;->a:Lakp;

    if-ne v3, v5, :cond_6

    .line 171
    iget-object v3, v0, Lakn;->b:Lafb;

    move-object v5, v4

    .line 178
    :goto_1
    iget-object v0, v0, Lakn;->e:Ljava/util/Map;

    move-object v9, v6

    move-object v6, v5

    move-object v5, v3

    move-object v3, v9

    :goto_2
    move v9, v1

    move-object v1, v0

    move-object v0, v6

    move-object v6, v5

    move-object v5, v3

    move v3, v9

    .line 185
    :goto_3
    if-nez v0, :cond_1

    if-nez v6, :cond_1

    if-nez v3, :cond_1

    .line 186
    new-instance v0, Lafq;

    const-string v7, "Unexpected call to LoginManager.onActivityResult"

    invoke-direct {v0, v7}, Lafq;-><init>(Ljava/lang/String;)V

    .line 189
    :cond_1
    invoke-virtual {p0, v5, v1, v0}, Laku;->a(Lakp;Ljava/util/Map;Ljava/lang/Exception;)V

    .line 1496
    if-eqz v6, :cond_2

    .line 1497
    invoke-static {v6}, Lafb;->a(Lafb;)V

    .line 1498
    invoke-static {}, Lagt;->b()V

    .line 1501
    :cond_2
    if-eqz p3, :cond_5

    .line 1502
    if-eqz v6, :cond_9

    .line 1503
    iget-object v1, p0, Laku;->c:Lakl;

    .line 3449
    iget-object v5, v1, Lakl;->b:Ljava/util/Set;

    .line 2478
    new-instance v7, Ljava/util/HashSet;

    .line 4195
    iget-object v8, v6, Lafb;->b:Ljava/util/Set;

    .line 2478
    invoke-direct {v7, v8}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 4474
    iget-boolean v1, v1, Lakl;->f:Z

    .line 2482
    if-eqz v1, :cond_3

    .line 2483
    invoke-interface {v7, v5}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 2486
    :cond_3
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 2487
    invoke-interface {v8, v7}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 2488
    new-instance v1, Lakz;

    invoke-direct {v1, v6, v7, v8}, Lakz;-><init>(Lafb;Ljava/util/Set;Ljava/util/Set;)V

    .line 1506
    :goto_4
    if-nez v3, :cond_4

    if-eqz v1, :cond_a

    .line 5064
    iget-object v3, v1, Lakz;->b:Ljava/util/Set;

    .line 1508
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-nez v3, :cond_a

    .line 1509
    :cond_4
    invoke-interface {p3}, Lafo;->a()V

    .line 1517
    :cond_5
    :goto_5
    iput-object v4, p0, Laku;->c:Lakl;

    .line 1518
    iput-object v4, p0, Laku;->e:Lakt;

    move v1, v2

    .line 193
    goto :goto_0

    .line 173
    :cond_6
    new-instance v3, Lafn;

    iget-object v5, v0, Lakn;->c:Ljava/lang/String;

    invoke-direct {v3, v5}, Lafn;-><init>(Ljava/lang/String;)V

    move-object v5, v3

    move-object v3, v4

    goto :goto_1

    .line 175
    :cond_7
    if-nez p1, :cond_d

    move v1, v2

    move-object v3, v4

    move-object v5, v4

    .line 176
    goto :goto_1

    .line 180
    :cond_8
    if-nez p1, :cond_c

    .line 182
    sget-object v3, Lakp;->b:Lakp;

    move-object v1, v4

    move-object v5, v3

    move-object v6, v4

    move-object v0, v4

    move v3, v2

    goto :goto_3

    :cond_9
    move-object v1, v4

    .line 1504
    goto :goto_4

    .line 1510
    :cond_a
    if-eqz v0, :cond_b

    .line 1511
    invoke-interface {p3, v0}, Lafo;->a(Lafq;)V

    goto :goto_5

    .line 1512
    :cond_b
    if-eqz v6, :cond_5

    .line 1513
    invoke-interface {p3, v1}, Lafo;->a(Ljava/lang/Object;)V

    goto :goto_5

    :cond_c
    move-object v5, v3

    move-object v6, v4

    move-object v0, v4

    move v3, v1

    move-object v1, v4

    goto :goto_3

    :cond_d
    move-object v3, v4

    move-object v5, v4

    goto/16 :goto_1

    :cond_e
    move-object v0, v4

    move-object v5, v4

    move-object v6, v4

    goto/16 :goto_2
.end method

.method public a(Lala;Lakl;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 434
    .line 7461
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 7462
    invoke-static {}, Lafv;->f()Landroid/content/Context;

    move-result-object v2

    const-class v4, Lcom/facebook/FacebookActivity;

    invoke-virtual {v3, v2, v4}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 8458
    iget-object v2, p2, Lakl;->a:Lakg;

    .line 7463
    invoke-virtual {v2}, Lakg;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 7467
    invoke-static {p2}, Lakq;->a(Lakl;)Landroid/os/Bundle;

    move-result-object v2

    .line 7468
    invoke-virtual {v3, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 9452
    invoke-static {}, Lafv;->f()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 9453
    invoke-virtual {v2, v3, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v2

    .line 9454
    if-nez v2, :cond_0

    move v2, v0

    .line 436
    :goto_0
    if-nez v2, :cond_1

    .line 448
    :goto_1
    return v0

    :cond_0
    move v2, v1

    .line 9457
    goto :goto_0

    .line 443
    :cond_1
    :try_start_0
    invoke-static {}, Lakh;->b()I

    move-result v2

    .line 441
    invoke-virtual {p1, v3, v2}, Lala;->a(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    .line 448
    goto :goto_1

    .line 445
    :catch_0
    move-exception v1

    goto :goto_1
.end method
