.class public Lcuq;
.super Ljava/lang/Object;


# static fields
.field private static g:Lcuq;


# instance fields
.field public final a:Lctw;

.field final b:Lcxt;

.field final c:Ljava/util/concurrent/ConcurrentMap;

.field private final d:Lcut;

.field private final e:Landroid/content/Context;

.field private final f:Lczb;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcut;Lctw;Lcxt;)V
    .locals 3

    .prologue
    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "context cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcuq;->e:Landroid/content/Context;

    iput-object p4, p0, Lcuq;->b:Lcxt;

    iput-object p2, p0, Lcuq;->d:Lcut;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcuq;->c:Ljava/util/concurrent/ConcurrentMap;

    iput-object p3, p0, Lcuq;->a:Lctw;

    iget-object v0, p0, Lcuq;->a:Lctw;

    new-instance v1, Lcur;

    invoke-direct {v1, p0}, Lcur;-><init>(Lcuq;)V

    invoke-virtual {v0, v1}, Lctw;->a(Lcua;)V

    iget-object v0, p0, Lcuq;->a:Lctw;

    new-instance v1, Lcyk;

    iget-object v2, p0, Lcuq;->e:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcyk;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lctw;->a(Lcua;)V

    new-instance v0, Lczb;

    invoke-direct {v0}, Lczb;-><init>()V

    iput-object v0, p0, Lcuq;->f:Lczb;

    .line 1000
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcuq;->e:Landroid/content/Context;

    new-instance v1, Lcus;

    invoke-direct {v1, p0}, Lcus;-><init>(Lcuq;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 0
    :cond_1
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcuq;
    .locals 5

    const-class v1, Lcuq;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcuq;->g:Lcuq;

    if-nez v0, :cond_1

    if-nez p0, :cond_0

    const-string v0, "TagManager.getInstance requires non-null context."

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    new-instance v0, Lcut;

    invoke-direct {v0}, Lcut;-><init>()V

    new-instance v2, Lczg;

    invoke-direct {v2, p0}, Lczg;-><init>(Landroid/content/Context;)V

    new-instance v3, Lcuq;

    new-instance v4, Lctw;

    invoke-direct {v4, v2}, Lctw;-><init>(Lcub;)V

    invoke-static {}, Lcum;->a()Lcum;

    move-result-object v2

    invoke-direct {v3, p0, v0, v4, v2}, Lcuq;-><init>(Landroid/content/Context;Lcut;Lctw;Lcxt;)V

    sput-object v3, Lcuq;->g:Lcuq;

    :cond_1
    sget-object v0, Lcuq;->g:Lcuq;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0
.end method

.method static synthetic a(Lcuq;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 0
    .line 7000
    iget-object v0, p0, Lcuq;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lctn;

    invoke-virtual {v0, p1}, Lctn;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 0
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;I)Lbwj;
    .locals 11

    .prologue
    .line 0
    iget-object v0, p0, Lcuq;->d:Lcut;

    iget-object v1, p0, Lcuq;->e:Landroid/content/Context;

    const/4 v3, 0x0

    iget-object v6, p0, Lcuq;->f:Lczb;

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    invoke-virtual/range {v0 .. v6}, Lcut;->a(Landroid/content/Context;Lcuq;Landroid/os/Looper;Ljava/lang/String;ILczb;)Lcto;

    move-result-object v7

    .line 3000
    iget-object v0, v7, Lcto;->l:Lctv;

    new-instance v1, Lctr;

    .line 4000
    invoke-direct {v1, v7}, Lctr;-><init>(Lcto;)V

    .line 3000
    invoke-virtual {v0, v1}, Lctv;->a(Lcwb;)V

    iget-object v0, v7, Lcto;->q:Lctu;

    new-instance v1, Lcts;

    .line 5000
    invoke-direct {v1, v7}, Lcts;-><init>(Lcto;)V

    .line 3000
    invoke-interface {v0, v1}, Lctu;->a(Lcwb;)V

    iget-object v0, v7, Lcto;->l:Lctv;

    iget v1, v7, Lcto;->h:I

    invoke-virtual {v0, v1}, Lctv;->a(I)Lclz;

    move-result-object v6

    if-eqz v6, :cond_0

    new-instance v8, Lctn;

    iget-object v9, v7, Lcto;->j:Lcuq;

    iget-object v10, v7, Lcto;->g:Landroid/os/Looper;

    new-instance v0, Lctk;

    iget-object v1, v7, Lcto;->i:Landroid/content/Context;

    iget-object v2, v7, Lcto;->j:Lcuq;

    .line 6000
    iget-object v2, v2, Lcuq;->a:Lctw;

    .line 3000
    iget-object v3, v7, Lcto;->k:Ljava/lang/String;

    const-wide/16 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lctk;-><init>(Landroid/content/Context;Lctw;Ljava/lang/String;JLclz;)V

    iget-object v1, v7, Lcto;->f:Lctt;

    invoke-direct {v8, v9, v10, v0, v1}, Lctn;-><init>(Lcuq;Landroid/os/Looper;Lctk;Lbb;)V

    iput-object v8, v7, Lcto;->m:Lctn;

    :cond_0
    new-instance v0, Lctp;

    const/4 v1, 0x0

    invoke-direct {v0, v7, v1}, Lctp;-><init>(Lcto;Z)V

    iput-object v0, v7, Lcto;->r:Lctq;

    invoke-virtual {v7}, Lcto;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v7, Lcto;->q:Lctu;

    const-wide/16 v2, 0x0

    const-string v1, ""

    invoke-interface {v0, v2, v3, v1}, Lctu;->a(JLjava/lang/String;)V

    .line 0
    :goto_0
    return-object v7

    .line 3000
    :cond_1
    iget-object v0, v7, Lcto;->l:Lctv;

    invoke-virtual {v0}, Lctv;->b()V

    goto :goto_0
.end method
