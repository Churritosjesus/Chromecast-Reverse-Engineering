.class public Lbuv;
.super Lbub;


# static fields
.field private static final g:Ljava/lang/String;


# instance fields
.field public e:Lbtj;

.field public final f:Ljava/util/List;

.field private final h:Lbuy;

.field private final i:Lbuy;

.field private final j:Lbuy;

.field private final k:Lbuy;

.field private final l:Lbuy;

.field private final m:Lbuy;

.field private final n:Lbuy;

.field private final o:Lbuy;

.field private final p:Lbuy;

.field private final q:Lbuy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "com.google.cast.media"

    invoke-static {v0}, La;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbuv;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 8

    const-wide/32 v6, 0x5265c00

    sget-object v1, Lbuv;->g:Ljava/lang/String;

    const-string v2, "MediaControlChannel"

    const-wide/16 v4, 0x3e8

    move-object v0, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lbub;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    new-instance v0, Lbuy;

    invoke-direct {v0, v6, v7}, Lbuy;-><init>(J)V

    iput-object v0, p0, Lbuv;->h:Lbuy;

    new-instance v0, Lbuy;

    invoke-direct {v0, v6, v7}, Lbuy;-><init>(J)V

    iput-object v0, p0, Lbuv;->i:Lbuy;

    new-instance v0, Lbuy;

    invoke-direct {v0, v6, v7}, Lbuy;-><init>(J)V

    iput-object v0, p0, Lbuv;->j:Lbuy;

    new-instance v0, Lbuy;

    invoke-direct {v0, v6, v7}, Lbuy;-><init>(J)V

    iput-object v0, p0, Lbuv;->k:Lbuy;

    new-instance v0, Lbuy;

    invoke-direct {v0, v6, v7}, Lbuy;-><init>(J)V

    iput-object v0, p0, Lbuv;->l:Lbuy;

    new-instance v0, Lbuy;

    invoke-direct {v0, v6, v7}, Lbuy;-><init>(J)V

    iput-object v0, p0, Lbuv;->m:Lbuy;

    new-instance v0, Lbuy;

    invoke-direct {v0, v6, v7}, Lbuy;-><init>(J)V

    iput-object v0, p0, Lbuv;->n:Lbuy;

    new-instance v0, Lbuy;

    invoke-direct {v0, v6, v7}, Lbuy;-><init>(J)V

    iput-object v0, p0, Lbuv;->o:Lbuy;

    new-instance v0, Lbuy;

    invoke-direct {v0, v6, v7}, Lbuy;-><init>(J)V

    iput-object v0, p0, Lbuv;->p:Lbuy;

    new-instance v0, Lbuy;

    invoke-direct {v0, v6, v7}, Lbuy;-><init>(J)V

    iput-object v0, p0, Lbuv;->q:Lbuy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbuv;->f:Ljava/util/List;

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    iget-object v1, p0, Lbuv;->h:Lbuy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    iget-object v1, p0, Lbuv;->i:Lbuy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    iget-object v1, p0, Lbuv;->j:Lbuy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    iget-object v1, p0, Lbuv;->k:Lbuy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    iget-object v1, p0, Lbuv;->l:Lbuy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    iget-object v1, p0, Lbuv;->m:Lbuy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    iget-object v1, p0, Lbuv;->n:Lbuy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    iget-object v1, p0, Lbuv;->o:Lbuy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    iget-object v1, p0, Lbuv;->p:Lbuy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    iget-object v1, p0, Lbuv;->q:Lbuy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lbuv;->f()V

    return-void
.end method

.method private a(JLorg/json/JSONObject;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 0
    iget-object v0, p0, Lbuv;->h:Lbuy;

    invoke-virtual {v0, p1, p2}, Lbuy;->a(J)Z

    move-result v3

    iget-object v0, p0, Lbuv;->l:Lbuy;

    invoke-virtual {v0}, Lbuy;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lbuv;->l:Lbuy;

    invoke-virtual {v0, p1, p2}, Lbuy;->a(J)Z

    move-result v0

    if-nez v0, :cond_7

    move v0, v1

    :goto_0
    iget-object v4, p0, Lbuv;->m:Lbuy;

    invoke-virtual {v4}, Lbuy;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lbuv;->m:Lbuy;

    invoke-virtual {v4, p1, p2}, Lbuy;->a(J)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    iget-object v4, p0, Lbuv;->n:Lbuy;

    invoke-virtual {v4}, Lbuy;->b()Z

    move-result v4

    if-eqz v4, :cond_8

    iget-object v4, p0, Lbuv;->n:Lbuy;

    invoke-virtual {v4, p1, p2}, Lbuy;->a(J)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_1
    :goto_1
    if-eqz v0, :cond_b

    const/4 v0, 0x2

    :goto_2
    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x1

    :cond_2
    if-nez v3, :cond_3

    iget-object v1, p0, Lbuv;->e:Lbtj;

    if-nez v1, :cond_9

    :cond_3
    new-instance v0, Lbtj;

    invoke-direct {v0, p3}, Lbtj;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lbuv;->e:Lbtj;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    const/4 v0, 0x7

    :goto_3
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    invoke-virtual {p0}, Lbuv;->a()V

    :cond_4
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    invoke-virtual {p0}, Lbuv;->a()V

    :cond_5
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lbuv;->b()V

    :cond_6
    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbuy;

    .line 3000
    const/4 v3, 0x0

    invoke-virtual {v0, p1, p2, v2, v3}, Lbuy;->a(JILjava/lang/Object;)Z

    goto :goto_4

    :cond_7
    move v0, v2

    .line 0
    goto :goto_0

    :cond_8
    move v1, v2

    goto :goto_1

    :cond_9
    iget-object v1, p0, Lbuv;->e:Lbtj;

    invoke-virtual {v1, p3, v0}, Lbtj;->a(Lorg/json/JSONObject;I)I

    move-result v0

    goto :goto_3

    :cond_a
    return-void

    :cond_b
    move v0, v2

    goto :goto_2
.end method

.method private e()J
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbuv;->e:Lbtj;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No current media session"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lbuv;->e:Lbtj;

    .line 4000
    iget-wide v0, v0, Lbtj;->a:J

    .line 0
    return-wide v0
.end method

.method private f()V
    .locals 8

    .prologue
    .line 0
    const/4 v0, 0x0

    iput-object v0, p0, Lbuv;->e:Lbtj;

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbuy;

    .line 5000
    sget-object v2, Lbuy;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-wide v4, v0, Lbuy;->a:J

    const-wide/16 v6, -0x1

    cmp-long v3, v4, v6

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lbuy;->a()V

    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 0
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lbux;)J
    .locals 6

    .prologue
    .line 0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lbuv;->d()J

    move-result-wide v2

    iget-object v1, p0, Lbuv;->o:Lbuy;

    invoke-virtual {v1, v2, v3, p1}, Lbuy;->a(JLbux;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lbuv;->a(Z)V

    :try_start_0
    const-string v1, "requestId"

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v4, "GET_STATUS"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lbuv;->e:Lbtj;

    if-eqz v1, :cond_0

    const-string v1, "mediaSessionId"

    iget-object v4, p0, Lbuv;->e:Lbtj;

    .line 1000
    iget-wide v4, v4, Lbtj;->a:J

    .line 0
    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lbuv;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public final a(Lbux;Lorg/json/JSONObject;)J
    .locals 6

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lbuv;->d()J

    move-result-wide v2

    iget-object v1, p0, Lbuv;->i:Lbuy;

    invoke-virtual {v1, v2, v3, p1}, Lbuy;->a(JLbux;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lbuv;->a(Z)V

    :try_start_0
    const-string v1, "requestId"

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v4, "PAUSE"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mediaSessionId"

    invoke-direct {p0}, Lbuv;->e()J

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string v1, "customData"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lbuv;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 0
    iget-object v0, p0, Lbuv;->b:Lbuu;

    const-string v1, "message received: %s"

    new-array v2, v7, [Ljava/lang/Object;

    aput-object p1, v2, v6

    invoke-virtual {v0, v1, v2}, Lbuu;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "type"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "requestId"

    const-wide/16 v4, -0x1

    invoke-virtual {v0, v2, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    const-string v4, "MEDIA_STATUS"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v1, "status"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, v2, v3, v0}, Lbuv;->a(JLorg/json/JSONObject;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lbuv;->e:Lbtj;

    invoke-virtual {p0}, Lbuv;->a()V

    invoke-virtual {p0}, Lbuv;->b()V

    iget-object v0, p0, Lbuv;->o:Lbuy;

    const/4 v1, 0x0

    .line 2000
    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Lbuy;->a(JILjava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 0
    :catch_0
    move-exception v0

    iget-object v1, p0, Lbuv;->b:Lbuu;

    const-string v2, "Message is malformed (%s); ignoring: %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v6

    aput-object p1, v3, v7

    invoke-virtual {v1, v2, v3}, Lbuu;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    :try_start_1
    const-string v4, "INVALID_PLAYER_STATE"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v1, p0, Lbuv;->b:Lbuu;

    const-string v4, "received unexpected error: Invalid Player State."

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v5}, Lbuu;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbuy;

    const/16 v5, 0x834

    invoke-virtual {v0, v2, v3, v5, v1}, Lbuy;->a(JILjava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const-string v4, "LOAD_FAILED"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lbuv;->h:Lbuy;

    const/16 v4, 0x834

    invoke-virtual {v1, v2, v3, v4, v0}, Lbuy;->a(JILjava/lang/Object;)Z

    goto :goto_0

    :cond_4
    const-string v4, "LOAD_CANCELLED"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lbuv;->h:Lbuy;

    const/16 v4, 0x835

    invoke-virtual {v1, v2, v3, v4, v0}, Lbuy;->a(JILjava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    const-string v4, "INVALID_REQUEST"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lbuv;->b:Lbuu;

    const-string v4, "received unexpected error: Invalid Request."

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v5}, Lbuu;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "customData"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbuy;

    const/16 v5, 0x834

    invoke-virtual {v0, v2, v3, v5, v1}, Lbuy;->a(JILjava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2
.end method

.method protected final a(J)Z
    .locals 5

    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbuy;

    const/16 v2, 0x836

    invoke-virtual {v0, p1, p2, v2}, Lbuy;->a(JI)Z

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    sget-object v2, Lbuy;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lbuv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbuy;

    invoke-virtual {v0}, Lbuy;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    monitor-exit v2

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method public final b(Lbux;Lorg/json/JSONObject;)J
    .locals 6

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0}, Lbuv;->d()J

    move-result-wide v2

    iget-object v1, p0, Lbuv;->j:Lbuy;

    invoke-virtual {v1, v2, v3, p1}, Lbuy;->a(JLbux;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lbuv;->a(Z)V

    :try_start_0
    const-string v1, "requestId"

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v4, "PLAY"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mediaSessionId"

    invoke-direct {p0}, Lbuv;->e()J

    move-result-wide v4

    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    const-string v1, "customData"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lbuv;->a(Ljava/lang/String;JLjava/lang/String;)V

    return-wide v2

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 0

    invoke-super {p0}, Lbub;->c()V

    invoke-direct {p0}, Lbuv;->f()V

    return-void
.end method
