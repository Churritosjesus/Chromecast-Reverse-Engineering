.class public Lahe;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final a:Ljava/lang/String;

.field private static d:Ljava/util/Map;

.field private static e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private static f:I

.field private static g:Z

.field private static h:Landroid/content/Context;

.field private static i:Ljava/lang/Object;

.field private static j:Ljava/lang/String;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Lahk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 167
    const-class v0, Lahe;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lahe;->a:Ljava/lang/String;

    .line 183
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lahe;->d:Ljava/util/Map;

    .line 186
    sget v0, Laho;->a:I

    sput v0, Lahe;->f:I

    .line 189
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lahe;->i:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Lafb;)V
    .locals 7

    .prologue
    const-wide/16 v2, 0x0

    .line 651
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 652
    const-string v0, "context"

    invoke-static {p1, v0}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 653
    invoke-static {p1}, Laji;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lahe;->b:Ljava/lang/String;

    .line 656
    invoke-static {}, Lafb;->a()Lafb;

    move-result-object v0

    .line 660
    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    .line 2236
    iget-object v1, v0, Lafb;->g:Ljava/lang/String;

    .line 661
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 663
    :cond_0
    new-instance v1, Lahk;

    invoke-direct {v1, v0}, Lahk;-><init>(Lafb;)V

    iput-object v1, p0, Lahe;->c:Lahk;

    .line 672
    :goto_0
    sget-object v1, Lahe;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 674
    :try_start_0
    sget-object v0, Lahe;->h:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 675
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lahe;->h:Landroid/content/Context;

    .line 677
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2683
    sget-object v1, Lahe;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 2684
    :try_start_1
    sget-object v0, Lahe;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz v0, :cond_4

    .line 2685
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    return-void

    .line 666
    :cond_2
    if-nez p2, :cond_3

    .line 667
    invoke-static {p1}, Laji;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    .line 669
    :cond_3
    new-instance v0, Lahk;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2}, Lahk;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lahe;->c:Lahk;

    goto :goto_0

    .line 677
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 2687
    :cond_4
    :try_start_3
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v4, 0x1

    invoke-direct {v0, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    sput-object v0, Lahe;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 2688
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 2690
    new-instance v1, Lahf;

    invoke-direct {v1}, Lahf;-><init>()V

    .line 2699
    sget-object v0, Lahe;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const-wide/16 v4, 0xf

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v0 .. v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 2706
    new-instance v1, Lahg;

    invoke-direct {v1}, Lahg;-><init>()V

    .line 2721
    sget-object v0, Lahe;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const-wide/32 v4, 0x15180

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v0 .. v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_1

    .line 2688
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public static a()I
    .locals 2

    .prologue
    .line 439
    sget-object v1, Lahe;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 440
    :try_start_0
    sget v0, Lahe;->f:I

    monitor-exit v1

    return v0

    .line 441
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static a(Landroid/content/Context;)Lahe;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 372
    new-instance v0, Lahe;

    invoke-direct {v0, p0, v1, v1}, Lahe;-><init>(Landroid/content/Context;Ljava/lang/String;Lafb;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Lahe;
    .locals 2

    .prologue
    .line 417
    new-instance v0, Lahe;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lahe;-><init>(Landroid/content/Context;Ljava/lang/String;Lafb;)V

    return-object v0
.end method

.method private static a(Lahp;Ljava/util/Set;)Lahr;
    .locals 14

    .prologue
    const/4 v13, 0x1

    const/4 v12, 0x0

    const/4 v3, 0x0

    .line 863
    new-instance v2, Lahr;

    .line 2900
    invoke-direct {v2}, Lahr;-><init>()V

    .line 865
    sget-object v0, Lahe;->h:Landroid/content/Context;

    invoke-static {v0}, Lafv;->b(Landroid/content/Context;)Z

    move-result v5

    .line 867
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 868
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lahk;

    .line 869
    invoke-static {v0}, Lahe;->a(Lahk;)Laht;

    move-result-object v8

    .line 870
    if-eqz v8, :cond_0

    .line 3215
    iget-object v1, v0, Lahk;->b:Ljava/lang/String;

    .line 2913
    invoke-static {v1, v12}, Laji;->a(Ljava/lang/String;Z)Lajn;

    move-result-object v9

    .line 2915
    const-string v4, "%s/activities"

    new-array v10, v13, [Ljava/lang/Object;

    aput-object v1, v10, v12

    .line 2917
    invoke-static {v4, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 2915
    invoke-static {v3, v1, v3, v3}, Laga;->a(Lafb;Ljava/lang/String;Lorg/json/JSONObject;Lagf;)Laga;

    move-result-object v4

    .line 3751
    iget-object v1, v4, Laga;->d:Landroid/os/Bundle;

    .line 2922
    if-nez v1, :cond_1

    .line 2923
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 2925
    :cond_1
    const-string v10, "access_token"

    .line 4211
    iget-object v11, v0, Lahk;->a:Ljava/lang/String;

    .line 2925
    invoke-virtual {v1, v10, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4760
    iput-object v1, v4, Laga;->d:Landroid/os/Bundle;

    .line 2928
    if-nez v9, :cond_2

    move-object v0, v3

    .line 879
    :goto_1
    if-eqz v0, :cond_0

    .line 880
    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5152
    :cond_2
    iget-boolean v1, v9, Lajn;->a:Z

    .line 2932
    invoke-virtual {v8, v4, v1, v5}, Laht;->a(Laga;ZZ)I

    move-result v1

    .line 2937
    if-nez v1, :cond_3

    move-object v0, v3

    .line 2938
    goto :goto_1

    .line 2941
    :cond_3
    iget v9, v2, Lahr;->a:I

    add-int/2addr v1, v9

    iput v1, v2, Lahr;->a:I

    .line 2943
    new-instance v1, Lahj;

    invoke-direct {v1, v0, v4, v8, v2}, Lahj;-><init>(Lahk;Laga;Laht;Lahr;)V

    invoke-virtual {v4, v1}, Laga;->a(Lagf;)V

    move-object v0, v4

    .line 2950
    goto :goto_1

    .line 884
    :cond_4
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 885
    sget-object v0, Lags;->e:Lags;

    sget-object v1, Lahe;->a:Ljava/lang/String;

    const-string v3, "Flushing %d events due to %s."

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, v2, Lahr;->a:I

    .line 886
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v12

    .line 887
    invoke-virtual {p0}, Lahp;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v13

    .line 885
    invoke-static {v0, v1, v3, v4}, Laiw;->a(Lags;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 889
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laga;

    .line 892
    invoke-virtual {v0}, Laga;->a()Lagp;

    goto :goto_2

    :cond_5
    move-object v0, v2

    .line 897
    :goto_3
    return-object v0

    :cond_6
    move-object v0, v3

    goto :goto_3
.end method

.method private static a(Lahk;)Laht;
    .locals 2

    .prologue
    .line 813
    sget-object v1, Lahe;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 814
    :try_start_0
    sget-object v0, Lahe;->d:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laht;

    monitor-exit v1

    return-object v0

    .line 815
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Landroid/content/Context;Lahk;)Laht;
    .locals 1

    .prologue
    .line 147
    invoke-static {p0, p1}, Lahe;->b(Landroid/content/Context;Lahk;)Laht;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lahk;Laga;Lagp;Laht;Lahr;)V
    .locals 10

    .prologue
    .line 147
    .line 7112
    iget-object v3, p2, Lagp;->b:Lafs;

    .line 6960
    const-string v1, "Success"

    .line 6962
    sget-object v0, Lahq;->a:Lahq;

    .line 6964
    if-eqz v3, :cond_5

    .line 7201
    iget v0, v3, Lafs;->b:I

    .line 6966
    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 6967
    const-string v1, "Failed: No Connectivity"

    .line 6968
    sget-object v0, Lahq;->c:Lahq;

    move-object v2, v1

    move-object v1, v0

    .line 6977
    :goto_0
    sget-object v0, Lags;->e:Lags;

    invoke-static {v0}, Lafv;->a(Lags;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7957
    iget-object v0, p1, Laga;->f:Ljava/lang/Object;

    .line 6978
    check-cast v0, Ljava/lang/String;

    .line 6982
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 6983
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->toString(I)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 6988
    :goto_1
    sget-object v4, Lags;->e:Lags;

    sget-object v5, Lahe;->a:Ljava/lang/String;

    const-string v6, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s"

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    .line 8666
    iget-object v9, p1, Laga;->c:Lorg/json/JSONObject;

    .line 6990
    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x1

    aput-object v2, v7, v8

    const/4 v2, 0x2

    aput-object v0, v7, v2

    .line 6988
    invoke-static {v4, v5, v6, v7}, Laiw;->a(Lags;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6995
    :cond_0
    if-eqz v3, :cond_4

    const/4 v0, 0x1

    :goto_2
    invoke-virtual {p3, v0}, Laht;->a(Z)V

    .line 6997
    sget-object v0, Lahq;->c:Lahq;

    if-ne v1, v0, :cond_1

    .line 7003
    sget-object v0, Lahe;->h:Landroid/content/Context;

    invoke-static {v0, p0, p3}, Lahs;->a(Landroid/content/Context;Lahk;Laht;)V

    .line 7006
    :cond_1
    sget-object v0, Lahq;->a:Lahq;

    if-eq v1, v0, :cond_2

    .line 7008
    iget-object v0, p4, Lahr;->b:Lahq;

    sget-object v2, Lahq;->c:Lahq;

    if-eq v0, v2, :cond_2

    .line 7009
    iput-object v1, p4, Lahr;->b:Lahq;

    .line 147
    :cond_2
    return-void

    .line 6970
    :cond_3
    const-string v0, "Failed:\n  Response: %s\n  Error %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 6971
    invoke-virtual {p2}, Lagp;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v2

    const/4 v2, 0x1

    .line 6972
    invoke-virtual {v3}, Lafs;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v2

    .line 6970
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 6973
    sget-object v0, Lahq;->b:Lahq;

    move-object v2, v1

    move-object v1, v0

    goto :goto_0

    .line 6985
    :catch_0
    move-exception v0

    const-string v0, "<Can\'t encode events for debug logging>"

    goto :goto_1

    .line 6995
    :cond_4
    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    move-object v2, v1

    move-object v1, v0

    goto :goto_0
.end method

.method static synthetic a(Lahp;)V
    .locals 4

    .prologue
    .line 147
    .line 5831
    sget-object v1, Lahe;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 5832
    :try_start_0
    sget-boolean v0, Lahe;->g:Z

    if-eqz v0, :cond_1

    .line 5833
    monitor-exit v1

    :cond_0
    :goto_0
    return-void

    .line 5835
    :cond_1
    const/4 v0, 0x1

    sput-boolean v0, Lahe;->g:Z

    .line 5836
    new-instance v2, Ljava/util/HashSet;

    sget-object v0, Lahe;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 5837
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5839
    invoke-static {}, Lahe;->h()I

    .line 5841
    const/4 v0, 0x0

    .line 5843
    :try_start_1
    invoke-static {p0, v2}, Lahe;->a(Lahp;Ljava/util/Set;)Lahr;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    .line 5848
    :goto_1
    sget-object v1, Lahe;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 5849
    const/4 v2, 0x0

    :try_start_2
    sput-boolean v2, Lahe;->g:Z

    .line 5850
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 5852
    if-eqz v0, :cond_0

    .line 5853
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.sdk.APP_EVENTS_FLUSHED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5854
    const-string v2, "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"

    iget v3, v0, Lahr;->a:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 5855
    const-string v2, "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"

    iget-object v0, v0, Lahr;->b:Lahq;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 5856
    sget-object v0, Lahe;->h:Landroid/content/Context;

    invoke-static {v0}, Lbk;->a(Landroid/content/Context;)Lbk;

    move-result-object v0

    invoke-virtual {v0, v1}, Lbk;->a(Landroid/content/Intent;)Z

    goto :goto_0

    .line 5837
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 5844
    :catch_0
    move-exception v1

    .line 5845
    sget-object v2, Lahe;->a:Ljava/lang/String;

    const-string v3, "Caught unexpected exception while flushing: "

    invoke-static {v2, v3, v1}, Laji;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 5850
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method private static b(Landroid/content/Context;Lahk;)Laht;
    .locals 5

    .prologue
    .line 790
    sget-object v0, Lahe;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laht;

    .line 791
    const/4 v1, 0x0

    .line 792
    if-nez v0, :cond_0

    .line 795
    invoke-static {p0}, Lahx;->a(Landroid/content/Context;)Lahx;

    move-result-object v0

    move-object v1, v0

    .line 798
    :cond_0
    sget-object v2, Lahe;->i:Ljava/lang/Object;

    monitor-enter v2

    .line 800
    :try_start_0
    sget-object v0, Lahe;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laht;

    .line 801
    if-nez v0, :cond_1

    .line 802
    new-instance v0, Laht;

    .line 804
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 805
    invoke-static {p0}, Lahe;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v3, v4}, Laht;-><init>(Lahx;Ljava/lang/String;Ljava/lang/String;)V

    .line 806
    sget-object v1, Lahe;->d:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 808
    :cond_1
    monitor-exit v2

    return-object v0

    .line 809
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 147
    sget-object v0, Lahe;->i:Ljava/lang/Object;

    return-object v0
.end method

.method private static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 1119
    sget-object v0, Lahe;->j:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 1120
    sget-object v1, Lahe;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 1121
    :try_start_0
    sget-object v0, Lahe;->j:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1123
    const-string v0, "com.facebook.sdk.appEventPreferences"

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1126
    const-string v2, "anonymousAppDeviceGUID"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1127
    sput-object v0, Lahe;->j:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1129
    const-string v2, "XZ"

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    sput-object v0, Lahe;->j:Ljava/lang/String;

    .line 1131
    const-string v0, "com.facebook.sdk.appEventPreferences"

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1132
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "anonymousAppDeviceGUID"

    sget-object v3, Lahe;->j:Ljava/lang/String;

    .line 1133
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1134
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1137
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1140
    :cond_1
    sget-object v0, Lahe;->j:Ljava/lang/String;

    return-object v0

    .line 1129
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 1137
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic c()Ljava/util/Map;
    .locals 1

    .prologue
    .line 147
    sget-object v0, Lahe;->d:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic d()V
    .locals 4

    .prologue
    .line 6763
    sget-object v1, Lahe;->i:Ljava/lang/Object;

    monitor-enter v1

    .line 6764
    :try_start_0
    invoke-static {}, Lahe;->a()I

    move-result v0

    sget v2, Laho;->b:I

    if-eq v0, v2, :cond_0

    .line 6765
    invoke-static {}, Lahe;->g()I

    move-result v0

    const/16 v2, 0x64

    if-le v0, v2, :cond_0

    .line 6766
    sget-object v0, Lahp;->b:Lahp;

    .line 6820
    invoke-static {}, Lafv;->d()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lahi;

    invoke-direct {v3, v0}, Lahi;-><init>(Lahp;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 6769
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic e()Landroid/content/Context;
    .locals 1

    .prologue
    .line 147
    sget-object v0, Lahe;->h:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 147
    sget-object v0, Lahe;->a:Ljava/lang/String;

    return-object v0
.end method

.method private static g()I
    .locals 4

    .prologue
    .line 773
    sget-object v2, Lahe;->i:Ljava/lang/Object;

    monitor-enter v2

    .line 775
    const/4 v0, 0x0

    .line 776
    :try_start_0
    sget-object v1, Lahe;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laht;

    .line 777
    invoke-virtual {v0}, Laht;->a()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 778
    goto :goto_0

    .line 779
    :cond_0
    monitor-exit v2

    return v1

    .line 780
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static h()I
    .locals 6

    .prologue
    .line 1015
    sget-object v0, Lahe;->h:Landroid/content/Context;

    invoke-static {v0}, Lahs;->a(Landroid/content/Context;)Lahs;

    move-result-object v2

    .line 1017
    const/4 v0, 0x0

    .line 5642
    iget-object v1, v2, Lahs;->a:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 1018
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lahk;

    .line 1019
    sget-object v4, Lahe;->h:Landroid/content/Context;

    .line 1020
    invoke-static {v4, v0}, Lahe;->b(Landroid/content/Context;Lahk;)Laht;

    move-result-object v4

    .line 5646
    iget-object v5, v2, Lahs;->a:Ljava/util/HashMap;

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 1023
    invoke-virtual {v4, v0}, Laht;->a(Ljava/util/List;)V

    .line 1024
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 1025
    goto :goto_0

    .line 1027
    :cond_0
    return v1
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 507
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, p2, v1}, Lahe;->a(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Z)V

    .line 508
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 614
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, p3, v1}, Lahe;->a(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Z)V

    .line 615
    return-void
.end method

.method a(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Z)V
    .locals 6

    .prologue
    .line 734
    new-instance v0, Lahm;

    iget-object v1, p0, Lahe;->b:Ljava/lang/String;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lahm;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Z)V

    .line 740
    sget-object v1, Lahe;->h:Landroid/content/Context;

    iget-object v2, p0, Lahe;->c:Lahk;

    .line 2746
    invoke-static {}, Lafv;->d()Ljava/util/concurrent/Executor;

    move-result-object v3

    new-instance v4, Lahh;

    invoke-direct {v4, v1, v2, v0}, Lahh;-><init>(Landroid/content/Context;Lahk;Lahm;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 741
    return-void
.end method
