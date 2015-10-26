.class final Lcum;
.super Lcxt;


# static fields
.field private static final a:Ljava/lang/Object;

.field private static n:Lcum;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcvo;

.field private volatile d:Lcvl;

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Lcvp;

.field private k:Landroid/os/Handler;

.field private l:Lcwg;

.field private m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcum;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Lcxt;-><init>()V

    const v0, 0x1b7740

    iput v0, p0, Lcum;->e:I

    iput-boolean v1, p0, Lcum;->f:Z

    iput-boolean v2, p0, Lcum;->g:Z

    iput-boolean v1, p0, Lcum;->h:Z

    iput-boolean v1, p0, Lcum;->i:Z

    new-instance v0, Lcun;

    invoke-direct {v0, p0}, Lcun;-><init>(Lcum;)V

    iput-object v0, p0, Lcum;->j:Lcvp;

    iput-boolean v2, p0, Lcum;->m:Z

    return-void
.end method

.method public static a()Lcum;
    .locals 1

    sget-object v0, Lcum;->n:Lcum;

    if-nez v0, :cond_0

    new-instance v0, Lcum;

    invoke-direct {v0}, Lcum;-><init>()V

    sput-object v0, Lcum;->n:Lcum;

    :cond_0
    sget-object v0, Lcum;->n:Lcum;

    return-object v0
.end method

.method static synthetic a(Lcum;)Z
    .locals 1

    iget-boolean v0, p0, Lcum;->h:Z

    return v0
.end method

.method static synthetic b(Lcum;)I
    .locals 1

    iget v0, p0, Lcum;->e:I

    return v0
.end method

.method static synthetic c(Lcum;)Z
    .locals 1

    iget-boolean v0, p0, Lcum;->m:Z

    return v0
.end method

.method static synthetic d(Lcum;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcum;->k:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lcum;)Lcvo;
    .locals 1

    iget-object v0, p0, Lcum;->c:Lcvo;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcum;->a:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method final declared-synchronized a(Landroid/content/Context;Lcvl;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcum;->b:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcum;->b:Landroid/content/Context;

    iget-object v0, p0, Lcum;->d:Lcvl;

    if-nez v0, :cond_0

    iput-object p2, p0, Lcum;->d:Lcvl;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final declared-synchronized a(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcum;->m:Z

    invoke-virtual {p0, v0, p1}, Lcum;->a(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final declared-synchronized a(ZZ)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcum;->m:Z

    if-ne v0, p1, :cond_0

    iget-boolean v0, p0, Lcum;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, p2, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    if-nez p1, :cond_1

    if-nez p2, :cond_2

    :cond_1
    :try_start_1
    iget v0, p0, Lcum;->e:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcum;->k:Landroid/os/Handler;

    const/4 v1, 0x1

    sget-object v2, Lcum;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    :cond_2
    if-nez p1, :cond_3

    if-eqz p2, :cond_3

    iget v0, p0, Lcum;->e:I

    if-lez v0, :cond_3

    iget-object v0, p0, Lcum;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcum;->k:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcum;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget v2, p0, Lcum;->e:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "PowerSaveMode "

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez p1, :cond_4

    if-nez p2, :cond_5

    :cond_4
    const-string v0, "initiated."

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->e(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcum;->m:Z

    iput-boolean p2, p0, Lcum;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_5
    :try_start_2
    const-string v0, "terminated."
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method final declared-synchronized b()Lcvo;
    .locals 4

    .prologue
    .line 0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcum;->c:Lcvo;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcum;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cant get a store unless we have a context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    new-instance v0, Lcwl;

    iget-object v1, p0, Lcum;->j:Lcvp;

    iget-object v2, p0, Lcum;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcwl;-><init>(Lcvp;Landroid/content/Context;)V

    iput-object v0, p0, Lcum;->c:Lcvo;

    :cond_1
    iget-object v0, p0, Lcum;->k:Landroid/os/Handler;

    if-nez v0, :cond_2

    .line 1000
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcum;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcuo;

    invoke-direct {v2, p0}, Lcuo;-><init>(Lcum;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcum;->k:Landroid/os/Handler;

    iget v0, p0, Lcum;->e:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcum;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcum;->k:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcum;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget v2, p0, Lcum;->e:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 0
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcum;->g:Z

    iget-boolean v0, p0, Lcum;->f:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcum;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcum;->f:Z

    :cond_3
    iget-object v0, p0, Lcum;->l:Lcwg;

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcum;->i:Z

    if-eqz v0, :cond_4

    .line 2000
    new-instance v0, Lcwg;

    invoke-direct {v0, p0}, Lcwg;-><init>(Lcxt;)V

    iput-object v0, p0, Lcum;->l:Lcwg;

    iget-object v0, p0, Lcum;->l:Lcwg;

    iget-object v1, p0, Lcum;->b:Landroid/content/Context;

    .line 3000
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    const-string v3, "com.google.analytics.RADIO_POWERED"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 0
    :cond_4
    iget-object v0, p0, Lcum;->c:Lcvo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0
.end method

.method public final declared-synchronized c()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcum;->g:Z

    if-nez v0, :cond_0

    const-string v0, "Dispatch call queued. Dispatch will run once initialization is complete."

    invoke-static {v0}, Lcuh;->e(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcum;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcum;->d:Lcvl;

    new-instance v1, Lcup;

    invoke-direct {v1, p0}, Lcup;-><init>(Lcum;)V

    invoke-interface {v0, v1}, Lcvl;->a(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final declared-synchronized d()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcum;->m:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcum;->h:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcum;->e:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcum;->k:Landroid/os/Handler;

    const/4 v1, 0x1

    sget-object v2, Lcum;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcum;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcum;->k:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcum;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
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
