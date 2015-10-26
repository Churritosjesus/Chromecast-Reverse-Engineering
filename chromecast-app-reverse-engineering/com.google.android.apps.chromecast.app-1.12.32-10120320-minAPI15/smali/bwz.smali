.class final Lbwz;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient;


# instance fields
.field final a:Ljava/util/concurrent/locks/Lock;

.field final b:Ljava/util/concurrent/locks/Condition;

.field final c:Lbyx;

.field final d:Landroid/content/Context;

.field final e:Landroid/os/Looper;

.field final f:Ljava/util/Queue;

.field volatile g:Z

.field final h:Lbxe;

.field i:Landroid/content/BroadcastReceiver;

.field final j:Ljava/util/Map;

.field final k:Ljava/util/Map;

.field l:Ljava/util/Set;

.field final m:Lbyl;

.field final n:Ljava/util/Map;

.field final o:Lbwd;

.field volatile p:Lbxj;

.field final q:Ljava/util/Set;

.field private r:J

.field private s:J

.field private final t:Ljava/util/Set;

.field private final u:Lbxg;

.field private final v:Lbwg;

.field private final w:Lbyy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lbyl;Lbwd;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;II)V
    .locals 10

    .prologue
    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lbwz;->f:Ljava/util/Queue;

    const-wide/32 v0, 0x1d4c0

    iput-wide v0, p0, Lbwz;->r:J

    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lbwz;->s:J

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbwz;->j:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbwz;->k:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lbwz;->l:Ljava/util/Set;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lbwz;->t:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v1, 0x10

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lbwz;->q:Ljava/util/Set;

    new-instance v0, Lbxa;

    invoke-direct {v0, p0}, Lbxa;-><init>(Lbwz;)V

    iput-object v0, p0, Lbwz;->u:Lbxg;

    new-instance v0, Lbxb;

    invoke-direct {v0, p0}, Lbxb;-><init>(Lbwz;)V

    iput-object v0, p0, Lbwz;->v:Lbwg;

    new-instance v0, Lbxc;

    invoke-direct {v0, p0}, Lbxc;-><init>(Lbwz;)V

    iput-object v0, p0, Lbwz;->w:Lbyy;

    iput-object p1, p0, Lbwz;->d:Landroid/content/Context;

    new-instance v0, Lbyx;

    iget-object v1, p0, Lbwz;->w:Lbyy;

    invoke-direct {v0, p2, v1}, Lbyx;-><init>(Landroid/os/Looper;Lbyy;)V

    iput-object v0, p0, Lbwz;->c:Lbyx;

    iput-object p2, p0, Lbwz;->e:Landroid/os/Looper;

    new-instance v0, Lbxe;

    invoke-direct {v0, p0, p2}, Lbxe;-><init>(Lbwz;Landroid/os/Looper;)V

    iput-object v0, p0, Lbwz;->h:Lbxe;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbwz;->n:Ljava/util/Map;

    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lbwz;->b:Ljava/util/concurrent/locks/Condition;

    new-instance v0, Lbwy;

    invoke-direct {v0, p0}, Lbwy;-><init>(Lbwz;)V

    iput-object v0, p0, Lbwz;->p:Lbxj;

    invoke-interface/range {p6 .. p6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwg;

    iget-object v2, p0, Lbwz;->c:Lbyx;

    invoke-virtual {v2, v0}, Lbyx;->a(Lbwg;)V

    goto :goto_0

    :cond_0
    invoke-interface/range {p7 .. p7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwh;

    iget-object v2, p0, Lbwz;->c:Lbyx;

    invoke-virtual {v2, v0}, Lbyx;->a(Lbwh;)V

    goto :goto_1

    .line 1000
    :cond_1
    iget-object v8, p3, Lbyl;->d:Ljava/util/Map;

    .line 0
    invoke-interface {p5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lbvz;

    invoke-interface {p5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/4 v0, 0x0

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    move v1, v0

    :goto_3
    iget-object v0, p0, Lbwz;->n:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7}, Lbvz;->a()Lbwd;

    move-result-object v0

    iget-object v5, p0, Lbwz;->v:Lbwg;

    invoke-direct {p0, v7, v1}, Lbwz;->a(Lbvz;I)Lbwh;

    move-result-object v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 5000
    invoke-interface/range {v0 .. v6}, Lbwd;->a(Landroid/content/Context;Landroid/os/Looper;Lbyl;Ljava/lang/Object;Lbwg;Lbwh;)Lbwc;

    move-result-object v0

    .line 0
    iget-object v1, p0, Lbwz;->j:Ljava/util/Map;

    invoke-virtual {v7}, Lbvz;->b()Lbwe;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    iput-object p3, p0, Lbwz;->m:Lbyl;

    iput-object p4, p0, Lbwz;->o:Lbwd;

    return-void

    :cond_3
    move v1, v0

    goto :goto_3
.end method

.method private final a(Lbvz;I)Lbwh;
    .locals 1

    new-instance v0, Lbxd;

    invoke-direct {v0, p0, p1, p2}, Lbxd;-><init>(Lbwz;Lbvz;I)V

    return-object v0
.end method

.method static synthetic a(Lbwz;)Lbxj;
    .locals 1

    iget-object v0, p0, Lbwz;->p:Lbxj;

    return-object v0
.end method

.method private a(I)V
    .locals 2

    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lbwz;->p:Lbxj;

    invoke-interface {v0, p1}, Lbxj;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method static synthetic a(Lbwz;I)V
    .locals 0

    invoke-direct {p0, p1}, Lbwz;->a(I)V

    return-void
.end method

.method static synthetic a(Lbwz;Z)Z
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbwz;->g:Z

    return v0
.end method

.method static synthetic b(Lbwz;)Ljava/util/concurrent/locks/Lock;
    .locals 1

    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    return-object v0
.end method

.method static synthetic c(Lbwz;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lbwz;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lbwz;)J
    .locals 2

    iget-wide v0, p0, Lbwz;->r:J

    return-wide v0
.end method

.method static synthetic e(Lbwz;)J
    .locals 2

    iget-wide v0, p0, Lbwz;->s:J

    return-wide v0
.end method

.method static synthetic f(Lbwz;)V
    .locals 2

    .prologue
    .line 0
    .line 13000
    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 14000
    :try_start_0
    iget-boolean v0, p0, Lbwz;->g:Z

    .line 13000
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbwz;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method static synthetic g(Lbwz;)V
    .locals 2

    .prologue
    .line 0
    .line 15000
    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, Lbwz;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbwz;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method


# virtual methods
.method public final a()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lbwz;->e:Landroid/os/Looper;

    return-object v0
.end method

.method public final a(Lbwe;)Lbwc;
    .locals 2

    iget-object v0, p0, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwc;

    const-string v1, "Appropriate Api was not requested."

    invoke-static {v0, v1}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final a(Lbwp;)Lbwp;
    .locals 2

    .prologue
    .line 0
    .line 6000
    iget-object v0, p1, Lbwp;->f:Lbwe;

    .line 0
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "This task can not be enqueued (it\'s probably a Batch or malformed)"

    invoke-static {v0, v1}, La;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lbwz;->j:Ljava/util/Map;

    .line 7000
    iget-object v1, p1, Lbwp;->f:Lbwe;

    .line 0
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "GoogleApiClient is not configured to use the API required for this call."

    invoke-static {v0, v1}, La;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lbwz;->p:Lbxj;

    invoke-interface {v0, p1}, Lbxj;->a(Lbwp;)Lbwp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    iget-object v1, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final a(Lbwg;)V
    .locals 1

    iget-object v0, p0, Lbwz;->c:Lbyx;

    invoke-virtual {v0, p1}, Lbyx;->a(Lbwg;)V

    return-void
.end method

.method public final a(Lbwh;)V
    .locals 1

    iget-object v0, p0, Lbwz;->c:Lbyx;

    invoke-virtual {v0, p1}, Lbyx;->a(Lbwh;)V

    return-void
.end method

.method final a(Lbxi;)V
    .locals 1

    iget-object v0, p0, Lbwz;->q:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lbwz;->u:Lbxg;

    invoke-interface {p1, v0}, Lbxi;->a(Lbxg;)V

    return-void
.end method

.method final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    new-instance v0, Lbwy;

    invoke-direct {v0, p0}, Lbwy;-><init>(Lbwz;)V

    iput-object v0, p0, Lbwz;->p:Lbxj;

    iget-object v0, p0, Lbwz;->p:Lbxj;

    invoke-interface {v0}, Lbxj;->a()V

    iget-object v0, p0, Lbwz;->b:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    const-string v1, "GoogleApiClient:"

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    const-string v2, "mState="

    invoke-virtual {v0, v2}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    iget-object v2, p0, Lbwz;->p:Lbxj;

    invoke-interface {v2}, Lbxj;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    const-string v0, " mResuming="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    iget-boolean v2, p0, Lbwz;->g:Z

    invoke-virtual {v0, v2}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mWorkQueue.size()="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    iget-object v2, p0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mUnconsumedRunners.size()="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    iget-object v2, p0, Lbwz;->q:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/io/PrintWriter;->println(I)V

    iget-object v0, p0, Lbwz;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbwc;

    invoke-interface {v0, v1, p3}, Lbwc;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Lbwp;)Lbwp;
    .locals 2

    .prologue
    .line 0
    .line 8000
    iget-object v0, p1, Lbwp;->f:Lbwe;

    .line 0
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "This task can not be executed (it\'s probably a Batch or malformed)"

    invoke-static {v0, v1}, La;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 9000
    :try_start_0
    iget-boolean v0, p0, Lbwz;->g:Z

    .line 0
    if-eqz v0, :cond_2

    iget-object v0, p0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lbwz;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbxi;

    invoke-virtual {p0, v0}, Lbwz;->a(Lbxi;)V

    sget-object v1, Lcom/google/android/gms/common/api/Status;->b:Lcom/google/android/gms/common/api/Status;

    invoke-interface {v0, v1}, Lbxi;->d(Lcom/google/android/gms/common/api/Status;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_2
    return-object p1

    :cond_2
    :try_start_1
    iget-object v0, p0, Lbwz;->p:Lbxj;

    invoke-interface {v0, p1}, Lbxj;->b(Lbwp;)Lbwp;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object p1

    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_2
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lbwz;->p:Lbxj;

    invoke-interface {v0}, Lbxj;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final b(Lbwg;)V
    .locals 4

    .prologue
    .line 0
    iget-object v0, p0, Lbwz;->c:Lbyx;

    .line 11000
    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lbyx;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Lbyx;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v0, "GmsClientEvents"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unregisterConnectionCallbacks(): listener "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " not found"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    iget-boolean v2, v0, Lbyx;->f:Z

    if-eqz v2, :cond_0

    iget-object v0, v0, Lbyx;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b(Lbwh;)V
    .locals 4

    .prologue
    .line 0
    iget-object v0, p0, Lbwz;->c:Lbyx;

    .line 12000
    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lbyx;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Lbyx;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GmsClientEvents"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unregisterConnectionFailedListener(): listener "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " not found"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

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

.method public final c()V
    .locals 1

    invoke-virtual {p0}, Lbwz;->g()Z

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lbwz;->a(I)V

    return-void
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lbwz;->p:Lbxj;

    instance-of v0, v0, Lbwr;

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lbwz;->p:Lbxj;

    instance-of v0, v0, Lbws;

    return v0
.end method

.method final f()V
    .locals 3

    iget-object v0, p0, Lbwz;->q:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbxi;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Lbxi;->a(Lbxg;)V

    invoke-interface {v0}, Lbxi;->b()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbwz;->q:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v0, p0, Lbwz;->t:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldh;

    invoke-virtual {v0}, Ldh;->f()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lbwz;->t:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v0, p0, Lbwz;->l:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method final g()Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 0
    iget-object v2, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 10000
    :try_start_0
    iget-boolean v2, p0, Lbwz;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 0
    if-nez v2, :cond_0

    iget-object v1, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lbwz;->g:Z

    iget-object v0, p0, Lbwz;->h:Lbxe;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lbxe;->removeMessages(I)V

    iget-object v0, p0, Lbwz;->h:Lbxe;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lbxe;->removeMessages(I)V

    iget-object v0, p0, Lbwz;->i:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbwz;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lbwz;->i:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lbwz;->i:Landroid/content/BroadcastReceiver;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    iget-object v0, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    move v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lbwz;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
