.class public final Lctk;
.super Ljava/lang/Object;


# instance fields
.field a:Lcxi;

.field volatile b:J

.field private final c:Landroid/content/Context;

.field private final d:Ljava/lang/String;

.field private final e:Lctw;

.field private f:Ljava/util/Map;

.field private g:Ljava/util/Map;

.field private volatile h:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lctw;Ljava/lang/String;JLcjd;)V
    .locals 4

    .prologue
    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lctk;->f:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lctk;->g:Ljava/util/Map;

    const-string v0, ""

    iput-object v0, p0, Lctk;->h:Ljava/lang/String;

    iput-object p1, p0, Lctk;->c:Landroid/content/Context;

    iput-object p2, p0, Lctk;->e:Lctw;

    iput-object p3, p0, Lctk;->d:Ljava/lang/String;

    iput-wide p4, p0, Lctk;->b:J

    iget-object v0, p6, Lcjd;->b:Lciz;

    .line 1000
    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_0
    :try_start_0
    invoke-static {v0}, La;->a(Lciz;)Lclz;
    :try_end_0
    .catch Lcmd; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    invoke-direct {p0, v0}, Lctk;->a(Lclz;)V

    .line 0
    :goto_0
    iget-object v0, p6, Lcjd;->a:[Lcjc;

    if-eqz v0, :cond_1

    iget-object v0, p6, Lcjd;->a:[Lcjc;

    invoke-direct {p0, v0}, Lctk;->a([Lcjc;)V

    :cond_1
    return-void

    .line 1000
    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Not loading resource: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " because it is invalid: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Lcmd;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method constructor <init>(Landroid/content/Context;Lctw;Ljava/lang/String;JLclz;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lctk;->f:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lctk;->g:Ljava/util/Map;

    const-string v0, ""

    iput-object v0, p0, Lctk;->h:Ljava/lang/String;

    iput-object p1, p0, Lctk;->c:Landroid/content/Context;

    iput-object p2, p0, Lctk;->e:Lctw;

    iput-object p3, p0, Lctk;->d:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lctk;->b:J

    invoke-direct {p0, p6}, Lctk;->a(Lclz;)V

    return-void
.end method

.method private a(Lclz;)V
    .locals 7

    .prologue
    .line 0
    .line 4000
    iget-object v0, p1, Lclz;->c:Ljava/lang/String;

    .line 0
    iput-object v0, p0, Lctk;->h:Ljava/lang/String;

    iget-object v0, p0, Lctk;->h:Ljava/lang/String;

    .line 5000
    invoke-static {}, Lcuk;->a()Lcuk;

    move-result-object v0

    .line 6000
    iget-object v0, v0, Lcuk;->a:Lcul;

    .line 5000
    sget-object v1, Lcul;->c:Lcul;

    invoke-virtual {v0, v1}, Lcul;->equals(Ljava/lang/Object;)Z

    new-instance v6, Lcvd;

    invoke-direct {v6}, Lcvd;-><init>()V

    .line 0
    new-instance v0, Lcxi;

    iget-object v1, p0, Lctk;->c:Landroid/content/Context;

    iget-object v3, p0, Lctk;->e:Lctw;

    new-instance v4, Lctl;

    .line 7000
    invoke-direct {v4, p0}, Lctl;-><init>(Lctk;)V

    .line 0
    new-instance v5, Lctm;

    .line 8000
    invoke-direct {v5, p0}, Lctm;-><init>(Lctk;)V

    move-object v2, p1

    .line 0
    invoke-direct/range {v0 .. v6}, Lcxi;-><init>(Landroid/content/Context;Lclz;Lctw;Lczd;Lczd;Lcvd;)V

    invoke-direct {p0, v0}, Lctk;->a(Lcxi;)V

    const-string v0, "_gtm.loadEventEnabled"

    invoke-direct {p0, v0}, Lctk;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lctk;->e:Lctw;

    const-string v1, "gtm.load"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "gtm.id"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lctk;->d:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v2}, Lctw;->a([Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    .line 9000
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const-string v2, "event"

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v3}, Lctw;->a(Ljava/util/Map;)V

    .line 0
    :cond_0
    return-void
.end method

.method private declared-synchronized a(Lcxi;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lctk;->a:Lcxi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private a([Lcjc;)V
    .locals 4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p1, v0

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lctk;->a()Lcxi;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcxi;->a(Ljava/util/List;)V

    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 0
    invoke-virtual {p0}, Lctk;->a()Lcxi;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "getBoolean called for closed container."

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    invoke-static {}, Lcyh;->c()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    :try_start_0
    invoke-virtual {v0, p1}, Lcxi;->b(Ljava/lang/String;)Lcwj;

    move-result-object v0

    .line 2000
    iget-object v0, v0, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Lcje;

    invoke-static {v0}, Lcyh;->d(Lcje;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Calling getBoolean() threw an exception: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Returning default value."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    invoke-static {}, Lcyh;->c()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method declared-synchronized a()Lcxi;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lctk;->a:Lcxi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 0
    invoke-virtual {p0}, Lctk;->a()Lcxi;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "getString called for closed container."

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    invoke-static {}, Lcyh;->e()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {v0, p1}, Lcxi;->b(Ljava/lang/String;)Lcwj;

    move-result-object v0

    .line 3000
    iget-object v0, v0, Lcwj;->a:Ljava/lang/Object;

    .line 0
    check-cast v0, Lcje;

    invoke-static {v0}, Lcyh;->a(Lcje;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Calling getString() threw an exception: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Returning default value."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    invoke-static {}, Lcyh;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method final b(Ljava/lang/String;)Ls;
    .locals 2

    iget-object v1, p0, Lctk;->f:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lctk;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method final c(Ljava/lang/String;)Ls;
    .locals 2

    iget-object v1, p0, Lctk;->g:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lctk;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
