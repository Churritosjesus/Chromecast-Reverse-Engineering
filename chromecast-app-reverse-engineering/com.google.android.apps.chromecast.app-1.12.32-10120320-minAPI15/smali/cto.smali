.class public final Lcto;
.super Lbvx;


# instance fields
.field final a:Lcac;

.field final f:Lctt;

.field final g:Landroid/os/Looper;

.field final h:I

.field final i:Landroid/content/Context;

.field final j:Lcuq;

.field final k:Ljava/lang/String;

.field l:Lctv;

.field volatile m:Lctn;

.field volatile n:Z

.field o:Lcjd;

.field p:J

.field q:Lctu;

.field r:Lctq;

.field private s:Lclw;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcuq;Landroid/os/Looper;Ljava/lang/String;ILctv;Lctu;Lclw;Lcac;Lcwq;)V
    .locals 1

    .prologue
    .line 0
    if-nez p3, :cond_2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lbvx;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcto;->i:Landroid/content/Context;

    iput-object p2, p0, Lcto;->j:Lcuq;

    if-nez p3, :cond_0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lcto;->g:Landroid/os/Looper;

    iput-object p4, p0, Lcto;->k:Ljava/lang/String;

    iput p5, p0, Lcto;->h:I

    iput-object p6, p0, Lcto;->l:Lctv;

    iput-object p7, p0, Lcto;->q:Lctu;

    iput-object p8, p0, Lcto;->s:Lclw;

    new-instance v0, Lctt;

    .line 1000
    invoke-direct {v0, p0}, Lctt;-><init>(Lcto;)V

    .line 0
    iput-object v0, p0, Lcto;->f:Lctt;

    new-instance v0, Lcjd;

    invoke-direct {v0}, Lcjd;-><init>()V

    iput-object v0, p0, Lcto;->o:Lcjd;

    iput-object p9, p0, Lcto;->a:Lcac;

    invoke-virtual {p0}, Lcto;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcuk;->a()Lcuk;

    move-result-object v0

    .line 2000
    iget-object v0, v0, Lcuk;->c:Ljava/lang/String;

    .line 0
    invoke-direct {p0, v0}, Lcto;->a(Ljava/lang/String;)V

    :cond_1
    return-void

    :cond_2
    move-object v0, p3

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Lcuq;Landroid/os/Looper;Ljava/lang/String;ILczb;)V
    .locals 14

    new-instance v13, Lctv;

    move-object/from16 v0, p4

    invoke-direct {v13, p1, v0}, Lctv;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v10, Lcxa;

    move-object/from16 v0, p4

    move-object/from16 v1, p6

    invoke-direct {v10, p1, v0, v1}, Lcxa;-><init>(Landroid/content/Context;Ljava/lang/String;Lczb;)V

    new-instance v11, Lclw;

    invoke-direct {v11, p1}, Lclw;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcad;->c()Lcac;

    move-result-object v12

    new-instance v2, Lcvz;

    const/16 v3, 0x1e

    const-wide/32 v4, 0xdbba0

    const-wide/16 v6, 0x1388

    const-string v8, "refreshing"

    invoke-static {}, Lcad;->c()Lcac;

    move-result-object v9

    invoke-direct/range {v2 .. v9}, Lcvz;-><init>(IJJLjava/lang/String;Lcac;)V

    move-object v3, p0

    move-object v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move/from16 v8, p5

    move-object v9, v13

    move-object v13, v2

    invoke-direct/range {v3 .. v13}, Lcto;-><init>(Landroid/content/Context;Lcuq;Landroid/os/Looper;Ljava/lang/String;ILctv;Lctu;Lclw;Lcac;Lcwq;)V

    return-void
.end method

.method private declared-synchronized a(Lcjd;JZ)V
    .locals 8

    .prologue
    const-wide/32 v6, 0x2932e00

    .line 0
    monitor-enter p0

    if-eqz p4, :cond_0

    :try_start_0
    iget-boolean v0, p0, Lcto;->n:Z

    :cond_0
    invoke-virtual {p0}, Lcto;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcto;->m:Lctn;

    :cond_1
    iput-object p1, p0, Lcto;->o:Lcjd;

    iput-wide p2, p0, Lcto;->p:J

    const-wide/16 v0, 0x0

    const-wide/32 v2, 0x2932e00

    iget-wide v4, p0, Lcto;->p:J

    add-long/2addr v4, v6

    iget-object v6, p0, Lcto;->a:Lcac;

    invoke-interface {v6}, Lcac;->a()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcto;->a(J)V

    new-instance v0, Lctk;

    iget-object v1, p0, Lcto;->i:Landroid/content/Context;

    iget-object v2, p0, Lcto;->j:Lcuq;

    .line 3000
    iget-object v2, v2, Lcuq;->a:Lctw;

    .line 0
    iget-object v3, p0, Lcto;->k:Ljava/lang/String;

    move-wide v4, p2

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lctk;-><init>(Landroid/content/Context;Lctw;Ljava/lang/String;JLcjd;)V

    iget-object v1, p0, Lcto;->m:Lctn;

    if-nez v1, :cond_3

    new-instance v1, Lctn;

    iget-object v2, p0, Lcto;->j:Lcuq;

    iget-object v3, p0, Lcto;->g:Landroid/os/Looper;

    iget-object v4, p0, Lcto;->f:Lctt;

    invoke-direct {v1, v2, v3, v0, v4}, Lctn;-><init>(Lcuq;Landroid/os/Looper;Lctk;Lbb;)V

    iput-object v1, p0, Lcto;->m:Lctn;

    :goto_0
    invoke-virtual {p0}, Lcto;->a()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcto;->r:Lctq;

    invoke-interface {v1, v0}, Lctq;->a(Lctk;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcto;->m:Lctn;

    invoke-virtual {p0, v0}, Lcto;->a(Lbwm;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :cond_3
    :try_start_1
    iget-object v1, p0, Lcto;->m:Lctn;

    invoke-virtual {v1, v0}, Lctn;->a(Lctk;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic a(Lcto;Lcjd;JZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcto;->a(Lcjd;JZ)V

    return-void
.end method

.method private declared-synchronized a(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcto;->q:Lctu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcto;->q:Lctu;

    invoke-interface {v0, p1}, Lctu;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method protected final synthetic a(Lcom/google/android/gms/common/api/Status;)Lbwm;
    .locals 1

    invoke-virtual {p0, p1}, Lcto;->b(Lcom/google/android/gms/common/api/Status;)Lctn;

    move-result-object v0

    return-object v0
.end method

.method declared-synchronized a(J)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcto;->q:Lctu;

    if-nez v0, :cond_0

    const-string v0, "Refresh requested, but no network load scheduler."

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcto;->q:Lctu;

    iget-object v1, p0, Lcto;->o:Lcjd;

    iget-object v1, v1, Lcjd;->c:Ljava/lang/String;

    invoke-interface {v0, p1, p2, v1}, Lctu;->a(JLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcjd;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcto;->l:Lctv;

    if-eqz v0, :cond_0

    new-instance v0, Lclv;

    invoke-direct {v0}, Lclv;-><init>()V

    iget-wide v2, p0, Lcto;->p:J

    iput-wide v2, v0, Lclv;->a:J

    new-instance v1, Lciz;

    invoke-direct {v1}, Lciz;-><init>()V

    iput-object v1, v0, Lclv;->b:Lciz;

    iput-object p1, v0, Lclv;->c:Lcjd;

    iget-object v1, p0, Lcto;->l:Lctv;

    invoke-virtual {v1, v0}, Lctv;->a(Lclv;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected final b(Lcom/google/android/gms/common/api/Status;)Lctn;
    .locals 1

    iget-object v0, p0, Lcto;->m:Lctn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcto;->m:Lctn;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->c:Lcom/google/android/gms/common/api/Status;

    if-ne p1, v0, :cond_1

    const-string v0, "timer expired: setting result to failure"

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Lctn;

    invoke-direct {v0, p1}, Lctn;-><init>(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0
.end method

.method e()Z
    .locals 3

    .prologue
    .line 0
    invoke-static {}, Lcuk;->a()Lcuk;

    move-result-object v0

    .line 4000
    iget-object v1, v0, Lcuk;->a:Lcul;

    .line 0
    sget-object v2, Lcul;->b:Lcul;

    if-eq v1, v2, :cond_0

    .line 5000
    iget-object v1, v0, Lcuk;->a:Lcul;

    .line 0
    sget-object v2, Lcul;->c:Lcul;

    if-ne v1, v2, :cond_1

    :cond_0
    iget-object v1, p0, Lcto;->k:Ljava/lang/String;

    .line 6000
    iget-object v0, v0, Lcuk;->b:Ljava/lang/String;

    .line 0
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
