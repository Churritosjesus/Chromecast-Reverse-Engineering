.class final Lcuv;
.super Ljava/lang/Object;


# static fields
.field private static j:Ljava/lang/Object;

.field private static k:Lcuv;


# instance fields
.field volatile a:Lbpb;

.field private volatile b:J

.field private volatile c:J

.field private volatile d:Z

.field private volatile e:J

.field private final f:Landroid/content/Context;

.field private final g:Lcac;

.field private final h:Ljava/lang/Thread;

.field private i:Lcuy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcuv;->j:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {}, Lcad;->c()Lcac;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcuv;-><init>(Landroid/content/Context;Lcuy;Lcac;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcuy;Lcac;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xdbba0

    iput-wide v0, p0, Lcuv;->b:J

    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcuv;->c:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcuv;->d:Z

    new-instance v0, Lcuw;

    invoke-direct {v0, p0}, Lcuw;-><init>(Lcuv;)V

    iput-object v0, p0, Lcuv;->i:Lcuy;

    iput-object p3, p0, Lcuv;->g:Lcac;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcuv;->f:Landroid/content/Context;

    :goto_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcux;

    invoke-direct {v1, p0}, Lcux;-><init>(Lcuv;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcuv;->h:Ljava/lang/Thread;

    return-void

    :cond_0
    iput-object p1, p0, Lcuv;->f:Landroid/content/Context;

    goto :goto_0
.end method

.method static synthetic a(Lcuv;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcuv;->f:Landroid/content/Context;

    return-object v0
.end method

.method static a(Landroid/content/Context;)Lcuv;
    .locals 2

    .prologue
    .line 0
    sget-object v0, Lcuv;->k:Lcuv;

    if-nez v0, :cond_1

    sget-object v1, Lcuv;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcuv;->k:Lcuv;

    if-nez v0, :cond_0

    new-instance v0, Lcuv;

    invoke-direct {v0, p0}, Lcuv;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcuv;->k:Lcuv;

    .line 1000
    iget-object v0, v0, Lcuv;->h:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 0
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcuv;->k:Lcuv;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic b(Lcuv;)V
    .locals 2

    .prologue
    .line 0
    .line 3000
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    :goto_0
    iget-boolean v0, p0, Lcuv;->d:Z

    :try_start_0
    iget-object v0, p0, Lcuv;->i:Lcuy;

    invoke-interface {v0}, Lcuy;->a()Lbpb;

    move-result-object v0

    iput-object v0, p0, Lcuv;->a:Lbpb;

    iget-wide v0, p0, Lcuv;->b:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "sleep interrupted in AdvertiserDataPoller thread; continuing"

    invoke-static {v0}, Lcuh;->c(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method a()V
    .locals 4

    .prologue
    .line 0
    iget-object v0, p0, Lcuv;->g:Lcac;

    invoke-interface {v0}, Lcac;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcuv;->e:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcuv;->c:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    :goto_0
    return-void

    .line 2000
    :cond_0
    iget-object v0, p0, Lcuv;->h:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 0
    iget-object v0, p0, Lcuv;->g:Lcac;

    invoke-interface {v0}, Lcac;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcuv;->e:J

    goto :goto_0
.end method
