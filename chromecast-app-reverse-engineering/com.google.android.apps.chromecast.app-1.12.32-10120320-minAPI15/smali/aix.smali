.class public final Laix;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final a:Lajb;

.field private static b:Ljava/util/List;

.field private static c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 313
    new-instance v0, Laiz;

    .line 5286
    invoke-direct {v0}, Laiz;-><init>()V

    .line 313
    sput-object v0, Laix;->a:Lajb;

    .line 5319
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5323
    sget-object v1, Laix;->a:Lajb;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5324
    new-instance v1, Lajc;

    .line 6304
    invoke-direct {v1}, Lajc;-><init>()V

    .line 5324
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 314
    sput-object v0, Laix;->b:Ljava/util/List;

    .line 6330
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6332
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6333
    new-instance v2, Laja;

    .line 7295
    invoke-direct {v2}, Laja;-><init>()V

    .line 6333
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6336
    const-string v2, "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"

    sget-object v3, Laix;->b:Ljava/util/List;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6337
    const-string v2, "com.facebook.platform.action.request.FEED_DIALOG"

    sget-object v3, Laix;->b:Ljava/util/List;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6338
    const-string v2, "com.facebook.platform.action.request.LIKE_DIALOG"

    sget-object v3, Laix;->b:Ljava/util/List;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6339
    const-string v2, "com.facebook.platform.action.request.APPINVITES_DIALOG"

    sget-object v3, Laix;->b:Ljava/util/List;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6340
    const-string v2, "com.facebook.platform.action.request.MESSAGE_DIALOG"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6341
    const-string v2, "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Laix;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 453
    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/Integer;

    const v1, 0x13354a2

    .line 455
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v4

    const/4 v1, 0x1

    const v2, 0x1335433

    .line 456
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const v2, 0x13353e4

    .line 457
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const v2, 0x13353c9

    .line 458
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const v2, 0x133529d

    .line 459
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const v2, 0x1335124

    .line 460
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const v2, 0x13350ac

    .line 461
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const v2, 0x1332d23

    .line 462
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const v2, 0x1332b3a

    .line 463
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const v2, 0x1332ac6

    .line 464
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const v2, 0x133060d

    .line 465
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 454
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Laix;->d:Ljava/util/List;

    .line 453
    return-void
.end method

.method public static final a()I
    .locals 2

    .prologue
    .line 449
    sget-object v0, Laix;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public static a(I)I
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/4 v2, -0x1

    .line 714
    sget-object v0, Laix;->b:Ljava/util/List;

    const/4 v1, 0x1

    new-array v4, v1, [I

    aput p0, v4, v9

    .line 3729
    invoke-static {}, Laix;->b()V

    .line 3731
    if-eqz v0, :cond_3

    .line 3736
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lajb;

    .line 4273
    iget-object v1, v0, Lajb;->a:Ljava/util/TreeSet;

    if-nez v1, :cond_1

    .line 4274
    invoke-virtual {v0, v9}, Lajb;->a(Z)V

    .line 4276
    :cond_1
    iget-object v1, v0, Lajb;->a:Ljava/util/TreeSet;

    .line 3740
    invoke-static {}, Laix;->a()I

    move-result v6

    .line 4812
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    .line 4814
    invoke-virtual {v1}, Ljava/util/TreeSet;->descendingIterator()Ljava/util/Iterator;

    move-result-object v7

    move v1, v2

    move v3, v0

    .line 4817
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 4818
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 4821
    invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v1, v3

    .line 4824
    :goto_1
    if-ltz v1, :cond_2

    aget v3, v4, v1

    if-le v3, v8, :cond_2

    .line 4825
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 4828
    :cond_2
    if-ltz v1, :cond_6

    .line 4837
    aget v3, v4, v1

    if-ne v3, v8, :cond_5

    .line 4839
    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_4

    .line 4841
    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 3743
    :goto_2
    if-eq v0, v2, :cond_0

    move v2, v0

    .line 3744
    :cond_3
    return v2

    :cond_4
    move v0, v2

    .line 4842
    goto :goto_2

    :cond_5
    move v3, v1

    move v1, v0

    .line 4845
    goto :goto_0

    :cond_6
    move v0, v2

    .line 4847
    goto :goto_2
.end method

.method public static a(Landroid/os/Bundle;)Lafq;
    .locals 3

    .prologue
    .line 676
    if-nez p0, :cond_0

    .line 677
    const/4 v0, 0x0

    .line 695
    :goto_0
    return-object v0

    .line 680
    :cond_0
    const-string v0, "error_type"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 681
    if-nez v0, :cond_1

    .line 682
    const-string v0, "com.facebook.platform.status.ERROR_TYPE"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 685
    :cond_1
    const-string v1, "error_description"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 686
    if-nez v1, :cond_2

    .line 687
    const-string v1, "com.facebook.platform.status.ERROR_DESCRIPTION"

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 690
    :cond_2
    if-eqz v0, :cond_3

    const-string v2, "UserCanceled"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 691
    new-instance v0, Lafr;

    invoke-direct {v0, v1}, Lafr;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 695
    :cond_3
    new-instance v0, Lafq;

    invoke-direct {v0, v1}, Lafq;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Landroid/content/Intent;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 584
    sget-object v0, Laix;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lajb;

    .line 585
    new-instance v3, Landroid/content/Intent;

    const-string v4, "com.facebook.platform.PLATFORM_SERVICE"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 586
    invoke-virtual {v0}, Lajb;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v3, "android.intent.category.DEFAULT"

    .line 587
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 2364
    if-nez v0, :cond_2

    move-object v0, v1

    .line 589
    :cond_1
    :goto_0
    if-eqz v0, :cond_0

    .line 593
    :goto_1
    return-object v0

    .line 2368
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v3

    .line 2369
    if-nez v3, :cond_3

    move-object v0, v1

    .line 2370
    goto :goto_0

    .line 2373
    :cond_3
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v3, v3, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-static {p0, v3}, Lajb;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    move-object v0, v1

    .line 2374
    goto :goto_0

    :cond_4
    move-object v0, v1

    .line 593
    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;ZZLajy;)Landroid/content/Intent;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 388
    sget-object v0, Laix;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lajb;

    .line 389
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 390
    invoke-virtual {v0}, Lajb;->a()Ljava/lang/String;

    move-result-object v0

    const-string v4, "com.facebook.katana.ProxyAuth"

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v3, "client_id"

    .line 391
    invoke-virtual {v0, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 393
    invoke-static {p2}, Laji;->a(Ljava/util/Collection;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 394
    const-string v3, "scope"

    const-string v4, ","

    .line 395
    invoke-static {v4, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    .line 394
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 397
    :cond_1
    invoke-static {p3}, Laji;->a(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 398
    const-string v3, "e2e"

    invoke-virtual {v0, v3, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 401
    :cond_2
    const-string v3, "response_type"

    const-string v4, "token,signed_request"

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 404
    const-string v3, "return_scopes"

    const-string v4, "true"

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 407
    if-eqz p5, :cond_3

    .line 408
    const-string v3, "default_audience"

    .line 1059
    iget-object v4, p6, Lajy;->b:Ljava/lang/String;

    .line 408
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 414
    :cond_3
    const-string v3, "legacy_override"

    const-string v4, "v2.4"

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 419
    if-eqz p4, :cond_4

    .line 420
    const-string v3, "auth_type"

    const-string v4, "rerequest"

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1347
    :cond_4
    if-nez v0, :cond_6

    move-object v0, v1

    .line 427
    :cond_5
    :goto_0
    if-eqz v0, :cond_0

    .line 431
    :goto_1
    return-object v0

    .line 1351
    :cond_6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v3

    .line 1352
    if-nez v3, :cond_7

    move-object v0, v1

    .line 1353
    goto :goto_0

    .line 1356
    :cond_7
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-static {p0, v3}, Lajb;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    move-object v0, v1

    .line 1357
    goto :goto_0

    :cond_8
    move-object v0, v1

    .line 431
    goto :goto_1
.end method

.method public static a(Landroid/content/Intent;Landroid/os/Bundle;Lafq;)Landroid/content/Intent;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 560
    invoke-static {p0}, Laix;->b(Landroid/content/Intent;)Ljava/util/UUID;

    move-result-object v2

    .line 561
    if-nez v2, :cond_0

    .line 580
    :goto_0
    return-object v0

    .line 565
    :cond_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 566
    const-string v3, "com.facebook.platform.protocol.PROTOCOL_VERSION"

    .line 1597
    const-string v4, "com.facebook.platform.protocol.PROTOCOL_VERSION"

    const/4 v5, 0x0

    invoke-virtual {p0, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 566
    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 568
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 569
    const-string v4, "action_id"

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    if-eqz p2, :cond_2

    .line 571
    const-string v2, "error"

    .line 1699
    if-nez p2, :cond_4

    .line 571
    :cond_1
    :goto_1
    invoke-virtual {v3, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 574
    :cond_2
    const-string v0, "com.facebook.platform.protocol.BRIDGE_ARGS"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 576
    if-eqz p1, :cond_3

    .line 577
    const-string v0, "com.facebook.platform.protocol.RESULT_ARGS"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_3
    move-object v0, v1

    .line 580
    goto :goto_0

    .line 1703
    :cond_4
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1704
    const-string v4, "error_description"

    invoke-virtual {p2}, Lafq;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1705
    instance-of v4, p2, Lafr;

    if-eqz v4, :cond_1

    .line 1706
    const-string v4, "error_type"

    const-string v5, "UserCanceled"

    invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public static a(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 635
    .line 3597
    const-string v0, "com.facebook.platform.protocol.PROTOCOL_VERSION"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 636
    invoke-static {v0}, Laix;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 637
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 640
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.facebook.platform.protocol.METHOD_ARGS"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lajb;)Ljava/util/TreeSet;
    .locals 1

    .prologue
    .line 49
    invoke-static {p0}, Laix;->b(Lajb;)Ljava/util/TreeSet;

    move-result-object v0

    return-object v0
.end method

.method private static b(Lajb;)Ljava/util/TreeSet;
    .locals 10

    .prologue
    const/4 v3, 0x0

    const/4 v6, 0x0

    .line 772
    new-instance v7, Ljava/util/TreeSet;

    invoke-direct {v7}, Ljava/util/TreeSet;-><init>()V

    .line 774
    invoke-static {}, Lafv;->f()Landroid/content/Context;

    move-result-object v0

    .line 775
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 777
    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/String;

    const-string v1, "version"

    aput-object v1, v2, v3

    .line 4851
    const-string v1, "content://"

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lajb;->a()Ljava/lang/String;

    move-result-object v3

    const-string v4, ".provider.PlatformProvider/versions"

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    add-int/2addr v8, v9

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    add-int/2addr v8, v9

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 784
    :try_start_0
    invoke-static {}, Lafv;->f()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 785
    invoke-virtual {p0}, Lajb;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v3, ".provider.PlatformProvider"

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 786
    :goto_0
    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v3

    .line 787
    if-eqz v3, :cond_2

    .line 788
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v0

    .line 789
    if-eqz v0, :cond_3

    .line 790
    :goto_1
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 791
    const-string v1, "version"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 792
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 799
    :catchall_0
    move-exception v1

    move-object v6, v0

    move-object v0, v1

    :goto_2
    if-eqz v6, :cond_0

    .line 800
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_0
    throw v0

    .line 785
    :cond_1
    :try_start_2
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 799
    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_2
    move-object v0, v6

    :cond_3
    if-eqz v0, :cond_4

    .line 800
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_4
    return-object v7
.end method

.method private static b(Landroid/content/Intent;)Ljava/util/UUID;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 601
    if-nez p0, :cond_1

    .line 622
    :cond_0
    :goto_0
    return-object v1

    .line 2597
    :cond_1
    const-string v0, "com.facebook.platform.protocol.PROTOCOL_VERSION"

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 606
    invoke-static {v0}, Laix;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 607
    const-string v0, "com.facebook.platform.protocol.BRIDGE_ARGS"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 608
    if-eqz v0, :cond_3

    .line 609
    const-string v2, "action_id"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 616
    :goto_1
    if-eqz v0, :cond_0

    .line 618
    :try_start_0
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 612
    :cond_2
    const-string v0, "com.facebook.platform.protocol.CALL_ID"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_1
.end method

.method public static b()V
    .locals 3

    .prologue
    .line 752
    sget-object v0, Laix;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 768
    :goto_0
    return-void

    .line 756
    :cond_0
    invoke-static {}, Lafv;->d()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Laiy;

    invoke-direct {v1}, Laiy;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method private static b(I)Z
    .locals 2

    .prologue
    .line 493
    sget-object v0, Laix;->d:Ljava/util/List;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x133529d

    if-lt p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c()Ljava/util/List;
    .locals 1

    .prologue
    .line 49
    sget-object v0, Laix;->b:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 49
    sget-object v0, Laix;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method
